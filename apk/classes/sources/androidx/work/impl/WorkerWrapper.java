package androidx.work.impl;

import android.content.Context;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002>?B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010(\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007J\u0010\u00101\u001a\u00020.2\u0006\u0010#\u001a\u00020\u0015H\u0002J\f\u00102\u001a\b\u0012\u0004\u0012\u00020*03J\u0010\u00104\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u00105\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0002J\b\u00106\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0002J\u000e\u00108\u001a\u000209H@¢\u0006\u0002\u0010:J\u0010\u0010;\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010<\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010=\u001a\u00020*H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "builder", "Landroidx/work/impl/WorkerWrapper$Builder;", "(Landroidx/work/impl/WorkerWrapper$Builder;)V", "appContext", "Landroid/content/Context;", "builderWorker", "Landroidx/work/ListenableWorker;", "clock", "Landroidx/work/Clock;", "configuration", "Landroidx/work/Configuration;", "dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "foregroundProcessor", "Landroidx/work/impl/foreground/ForegroundProcessor;", "runtimeExtras", "Landroidx/work/WorkerParameters$RuntimeExtras;", "tags", "", "", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "workDescription", "workGenerationalId", "Landroidx/work/impl/model/WorkGenerationalId;", "getWorkGenerationalId", "()Landroidx/work/impl/model/WorkGenerationalId;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "workSpecDao", "Landroidx/work/impl/model/WorkSpecDao;", "workSpecId", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workerJob", "Lkotlinx/coroutines/CompletableJob;", "createWorkDescription", "handleResult", "", "result", "Landroidx/work/ListenableWorker$Result;", "interrupt", "", "stopReason", "", "iterativelyFailWorkAndDependents", "launch", "Lcom/google/common/util/concurrent/ListenableFuture;", "onWorkFinished", "reschedule", "resetPeriodic", "resetWorkerStatus", "runWorker", "Landroidx/work/impl/WorkerWrapper$Resolution;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFailed", "setSucceeded", "trySetRunning", "Builder", "Resolution", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkerWrapper.kt */
public final class WorkerWrapper {
    /* access modifiers changed from: private */
    public final Context appContext;
    private final ListenableWorker builderWorker;
    private final Clock clock;
    /* access modifiers changed from: private */
    public final Configuration configuration;
    private final DependencyDao dependencyDao;
    private final ForegroundProcessor foregroundProcessor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private final List<String> tags;
    /* access modifiers changed from: private */
    public final WorkDatabase workDatabase;
    private final String workDescription;
    private final WorkSpec workSpec;
    private final WorkSpecDao workSpecDao;
    private final String workSpecId;
    /* access modifiers changed from: private */
    public final TaskExecutor workTaskExecutor;
    /* access modifiers changed from: private */
    public final CompletableJob workerJob = JobKt.Job$default((Job) null, 1, (Object) null);

    public WorkerWrapper(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        WorkSpec workSpec2 = builder.getWorkSpec();
        this.workSpec = workSpec2;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec2.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration2 = builder.getConfiguration();
        this.configuration = configuration2;
        this.clock = configuration2.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase2 = builder.getWorkDatabase();
        this.workDatabase = workDatabase2;
        this.workSpecDao = workDatabase2.workSpecDao();
        this.dependencyDao = workDatabase2.dependencyDao();
        List<String> tags2 = builder.getTags();
        this.tags = tags2;
        this.workDescription = createWorkDescription(tags2);
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    public final ListenableFuture<Boolean> launch() {
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.getTaskCoroutineDispatcher().plus(JobKt.Job$default((Job) null, 1, (Object) null)), (CoroutineStart) null, new WorkerWrapper$launch$1(this, (Continuation<? super WorkerWrapper$launch$1>) null), 2, (Object) null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution;", "", "()V", "Failed", "Finished", "ResetWorkerStatus", "Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkerWrapper.kt */
    private static abstract class Resolution {
        public /* synthetic */ Resolution(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "reason", "", "(I)V", "getReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: WorkerWrapper.kt */
        public static final class ResetWorkerStatus extends Resolution {
            private final int reason;

            public ResetWorkerStatus() {
                this(0, 1, (DefaultConstructorMarker) null);
            }

            public ResetWorkerStatus(int i) {
                super((DefaultConstructorMarker) null);
                this.reason = i;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ResetWorkerStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -256 : i);
            }

            public final int getReason() {
                return this.reason;
            }
        }

        private Resolution() {
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "result", "Landroidx/work/ListenableWorker$Result;", "(Landroidx/work/ListenableWorker$Result;)V", "getResult", "()Landroidx/work/ListenableWorker$Result;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: WorkerWrapper.kt */
        public static final class Failed extends Resolution {
            private final ListenableWorker.Result result;

            public Failed() {
                this((ListenableWorker.Result) null, 1, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Failed(ListenableWorker.Result result2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(result2, "result");
                this.result = result2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Failed(ListenableWorker.Result result2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new ListenableWorker.Result.Failure() : result2);
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "result", "Landroidx/work/ListenableWorker$Result;", "(Landroidx/work/ListenableWorker$Result;)V", "getResult", "()Landroidx/work/ListenableWorker$Result;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: WorkerWrapper.kt */
        public static final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(result2, "result");
                this.result = result2;
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object runWorker(kotlin.coroutines.Continuation<? super androidx.work.impl.WorkerWrapper.Resolution> r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            boolean r2 = r0 instanceof androidx.work.impl.WorkerWrapper$runWorker$1
            if (r2 == 0) goto L_0x0018
            r2 = r0
            androidx.work.impl.WorkerWrapper$runWorker$1 r2 = (androidx.work.impl.WorkerWrapper$runWorker$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0018
            int r0 = r2.label
            int r0 = r0 - r4
            r2.label = r0
            goto L_0x001d
        L_0x0018:
            androidx.work.impl.WorkerWrapper$runWorker$1 r2 = new androidx.work.impl.WorkerWrapper$runWorker$1
            r2.<init>(r1, r0)
        L_0x001d:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0046
            if (r4 != r5) goto L_0x003e
            java.lang.Object r3 = r2.L$1
            androidx.work.WorkerParameters r3 = (androidx.work.WorkerParameters) r3
            java.lang.Object r2 = r2.L$0
            androidx.work.impl.WorkerWrapper r2 = (androidx.work.impl.WorkerWrapper) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0038 }
            goto L_0x01fd
        L_0x0038:
            r0 = move-exception
            goto L_0x020d
        L_0x003b:
            r0 = move-exception
            goto L_0x024f
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r0)
            androidx.work.Configuration r0 = r1.configuration
            androidx.work.Tracer r0 = r0.getTracer()
            boolean r0 = r0.isEnabled()
            androidx.work.impl.model.WorkSpec r4 = r1.workSpec
            java.lang.String r4 = r4.getTraceTag()
            if (r0 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x006c
            androidx.work.Configuration r7 = r1.configuration
            androidx.work.Tracer r7 = r7.getTracer()
            androidx.work.impl.model.WorkSpec r8 = r1.workSpec
            int r8 = r8.hashCode()
            r7.beginAsyncSection(r4, r8)
        L_0x006c:
            androidx.work.impl.WorkDatabase r7 = r1.workDatabase
            androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0 r8 = new androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
            r8.<init>(r1)
            java.lang.Object r7 = r7.runInTransaction(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.String r8 = "shouldExit"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            boolean r7 = r7.booleanValue()
            r8 = 0
            if (r7 == 0) goto L_0x008b
            androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus r0 = new androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus
            r0.<init>(r8, r5, r6)
            return r0
        L_0x008b:
            androidx.work.impl.model.WorkSpec r7 = r1.workSpec
            boolean r7 = r7.isPeriodic()
            if (r7 == 0) goto L_0x0099
            androidx.work.impl.model.WorkSpec r7 = r1.workSpec
            androidx.work.Data r7 = r7.input
        L_0x0097:
            r11 = r7
            goto L_0x00ea
        L_0x0099:
            androidx.work.Configuration r7 = r1.configuration
            androidx.work.InputMergerFactory r7 = r7.getInputMergerFactory()
            androidx.work.impl.model.WorkSpec r9 = r1.workSpec
            java.lang.String r9 = r9.inputMergerClassName
            androidx.work.InputMerger r7 = r7.createInputMergerWithDefaultFallback(r9)
            if (r7 != 0) goto L_0x00cd
            java.lang.String r0 = androidx.work.impl.WorkerWrapperKt.TAG
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Could not create Input Merger "
            r3.<init>(r4)
            androidx.work.impl.model.WorkSpec r4 = r1.workSpec
            java.lang.String r4 = r4.inputMergerClassName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.error(r0, r3)
            androidx.work.impl.WorkerWrapper$Resolution$Failed r0 = new androidx.work.impl.WorkerWrapper$Resolution$Failed
            r0.<init>(r6, r5, r6)
            return r0
        L_0x00cd:
            androidx.work.impl.model.WorkSpec r9 = r1.workSpec
            androidx.work.Data r9 = r9.input
            java.util.List r9 = kotlin.collections.CollectionsKt.listOf(r9)
            java.util.Collection r9 = (java.util.Collection) r9
            androidx.work.impl.model.WorkSpecDao r10 = r1.workSpecDao
            java.lang.String r11 = r1.workSpecId
            java.util.List r10 = r10.getInputsFromPrerequisites(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r9 = kotlin.collections.CollectionsKt.plus(r9, r10)
            androidx.work.Data r7 = r7.merge(r9)
            goto L_0x0097
        L_0x00ea:
            androidx.work.WorkerParameters r7 = new androidx.work.WorkerParameters
            java.lang.String r9 = r1.workSpecId
            java.util.UUID r10 = java.util.UUID.fromString(r9)
            java.util.List<java.lang.String> r9 = r1.tags
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12
            androidx.work.WorkerParameters$RuntimeExtras r13 = r1.runtimeExtras
            androidx.work.impl.model.WorkSpec r9 = r1.workSpec
            int r14 = r9.runAttemptCount
            androidx.work.impl.model.WorkSpec r9 = r1.workSpec
            int r15 = r9.getGeneration()
            androidx.work.Configuration r9 = r1.configuration
            java.util.concurrent.Executor r16 = r9.getExecutor()
            androidx.work.Configuration r9 = r1.configuration
            kotlin.coroutines.CoroutineContext r17 = r9.getWorkerCoroutineContext()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r9 = r1.workTaskExecutor
            androidx.work.Configuration r8 = r1.configuration
            androidx.work.WorkerFactory r19 = r8.getWorkerFactory()
            androidx.work.impl.utils.WorkProgressUpdater r8 = new androidx.work.impl.utils.WorkProgressUpdater
            androidx.work.impl.WorkDatabase r5 = r1.workDatabase
            androidx.work.impl.utils.taskexecutor.TaskExecutor r6 = r1.workTaskExecutor
            r8.<init>(r5, r6)
            r20 = r8
            androidx.work.ProgressUpdater r20 = (androidx.work.ProgressUpdater) r20
            androidx.work.impl.utils.WorkForegroundUpdater r5 = new androidx.work.impl.utils.WorkForegroundUpdater
            androidx.work.impl.WorkDatabase r6 = r1.workDatabase
            androidx.work.impl.foreground.ForegroundProcessor r8 = r1.foregroundProcessor
            r18 = r9
            androidx.work.impl.utils.taskexecutor.TaskExecutor r9 = r1.workTaskExecutor
            r5.<init>(r6, r8, r9)
            r21 = r5
            androidx.work.ForegroundUpdater r21 = (androidx.work.ForegroundUpdater) r21
            r5 = r18
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.work.ListenableWorker r5 = r1.builderWorker
            if (r5 != 0) goto L_0x018f
            androidx.work.Configuration r5 = r1.configuration     // Catch:{ all -> 0x0150 }
            androidx.work.WorkerFactory r5 = r5.getWorkerFactory()     // Catch:{ all -> 0x0150 }
            android.content.Context r6 = r1.appContext     // Catch:{ all -> 0x0150 }
            androidx.work.impl.model.WorkSpec r8 = r1.workSpec     // Catch:{ all -> 0x0150 }
            java.lang.String r8 = r8.workerClassName     // Catch:{ all -> 0x0150 }
            androidx.work.ListenableWorker r5 = r5.createWorkerWithDefaultFallback(r6, r8, r7)     // Catch:{ all -> 0x0150 }
            goto L_0x018f
        L_0x0150:
            r0 = move-exception
            java.lang.String r2 = androidx.work.impl.WorkerWrapperKt.TAG
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Could not create Worker "
            r4.<init>(r5)
            androidx.work.impl.model.WorkSpec r5 = r1.workSpec
            java.lang.String r5 = r5.workerClassName
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.error(r2, r4)
            androidx.work.Configuration r2 = r1.configuration
            androidx.core.util.Consumer r2 = r2.getWorkerInitializationExceptionHandler()
            if (r2 == 0) goto L_0x0187
            androidx.work.WorkerExceptionInfo r3 = new androidx.work.WorkerExceptionInfo
            androidx.work.impl.model.WorkSpec r4 = r1.workSpec
            java.lang.String r4 = r4.workerClassName
            r3.<init>(r4, r7, r0)
            java.lang.String r0 = androidx.work.impl.WorkerWrapperKt.TAG
            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(r2, r3, r0)
        L_0x0187:
            androidx.work.impl.WorkerWrapper$Resolution$Failed r0 = new androidx.work.impl.WorkerWrapper$Resolution$Failed
            r2 = 1
            r3 = 0
            r0.<init>(r3, r2, r3)
            return r0
        L_0x018f:
            r5.setUsed()
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()
            kotlinx.coroutines.Job$Key r8 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r8 = (kotlin.coroutines.CoroutineContext.Key) r8
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            androidx.work.impl.WorkerWrapper$runWorker$2 r8 = new androidx.work.impl.WorkerWrapper$runWorker$2
            r8.<init>(r5, r0, r4, r1)
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r6.invokeOnCompletion(r8)
            boolean r0 = r22.trySetRunning()
            if (r0 != 0) goto L_0x01bc
            androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus r0 = new androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus
            r4 = 0
            r8 = 1
            r9 = 0
            r0.<init>(r4, r8, r9)
            return r0
        L_0x01bc:
            r4 = 0
            r8 = 1
            r9 = 0
            boolean r0 = r6.isCancelled()
            if (r0 == 0) goto L_0x01cb
            androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus r0 = new androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus
            r0.<init>(r4, r8, r9)
            return r0
        L_0x01cb:
            androidx.work.ForegroundUpdater r0 = r7.getForegroundUpdater()
            java.lang.String r4 = "params.foregroundUpdater"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r4 = r1.workTaskExecutor
            java.util.concurrent.Executor r4 = r4.getMainThreadExecutor()
            java.lang.String r6 = "workTaskExecutor.getMainThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.ExecutorsKt.from(r4)
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            androidx.work.impl.WorkerWrapper$runWorker$result$1 r6 = new androidx.work.impl.WorkerWrapper$runWorker$result$1     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            r8 = 0
            r6.<init>(r1, r5, r0, r8)     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            r2.L$0 = r1     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            r2.L$1 = r7     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            r5 = 1
            r2.label = r5     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r4, r6, r2)     // Catch:{ CancellationException -> 0x024d, all -> 0x020a }
            if (r0 != r3) goto L_0x01fb
            return r3
        L_0x01fb:
            r2 = r1
            r3 = r7
        L_0x01fd:
            androidx.work.ListenableWorker$Result r0 = (androidx.work.ListenableWorker.Result) r0     // Catch:{ CancellationException -> 0x003b, all -> 0x0038 }
            androidx.work.impl.WorkerWrapper$Resolution$Finished r4 = new androidx.work.impl.WorkerWrapper$Resolution$Finished     // Catch:{ CancellationException -> 0x003b, all -> 0x0038 }
            java.lang.String r5 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ CancellationException -> 0x003b, all -> 0x0038 }
            r4.<init>(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0038 }
            return r4
        L_0x020a:
            r0 = move-exception
            r2 = r1
            r3 = r7
        L_0x020d:
            java.lang.String r4 = androidx.work.impl.WorkerWrapperKt.TAG
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.workDescription
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " failed because it threw an exception/error"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.error(r4, r6, r0)
            androidx.work.Configuration r4 = r2.configuration
            androidx.core.util.Consumer r4 = r4.getWorkerExecutionExceptionHandler()
            if (r4 == 0) goto L_0x0245
            androidx.work.WorkerExceptionInfo r5 = new androidx.work.WorkerExceptionInfo
            androidx.work.impl.model.WorkSpec r2 = r2.workSpec
            java.lang.String r2 = r2.workerClassName
            r5.<init>(r2, r3, r0)
            java.lang.String r0 = androidx.work.impl.WorkerWrapperKt.TAG
            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(r4, r5, r0)
        L_0x0245:
            androidx.work.impl.WorkerWrapper$Resolution$Failed r0 = new androidx.work.impl.WorkerWrapper$Resolution$Failed
            r2 = 1
            r3 = 0
            r0.<init>(r3, r2, r3)
            return r0
        L_0x024d:
            r0 = move-exception
            r2 = r1
        L_0x024f:
            java.lang.String r3 = androidx.work.impl.WorkerWrapperKt.TAG
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.workDescription
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r5 = " was cancelled"
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = r0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r4.info(r3, r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.runWorker(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Boolean runWorker$lambda$1(WorkerWrapper workerWrapper) {
        if (workerWrapper.workSpec.state != WorkInfo.State.ENQUEUED) {
            Logger.get().debug(WorkerWrapperKt.TAG, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return true;
        } else if ((!workerWrapper.workSpec.isPeriodic() && !workerWrapper.workSpec.isBackedOff()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.calculateNextRunTime()) {
            return false;
        } else {
            Logger.get().debug(WorkerWrapperKt.TAG, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final boolean onWorkFinished(ListenableWorker.Result result) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(result);
        }
        if (!state.isFinished()) {
            return reschedule(WorkInfo.STOP_REASON_UNKNOWN);
        }
        return false;
    }

    public final void interrupt(int i) {
        this.workerJob.cancel(new WorkerStoppedException(i));
    }

    /* access modifiers changed from: private */
    public final boolean resetWorkerStatus(int i) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            Logger.get().debug(WorkerWrapperKt.TAG, "Status for " + this.workSpecId + " is " + state + " ; not doing any work");
            return false;
        }
        Logger.get().debug(WorkerWrapperKt.TAG, "Status for " + this.workSpecId + " is " + state + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, i);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1);
        return true;
    }

    private final boolean handleResult(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            Logger.get().info(WorkerWrapperKt.TAG, "Worker result SUCCESS for " + this.workDescription);
            if (this.workSpec.isPeriodic()) {
                return resetPeriodic();
            }
            return setSucceeded(result);
        } else if (result instanceof ListenableWorker.Result.Retry) {
            Logger.get().info(WorkerWrapperKt.TAG, "Worker result RETRY for " + this.workDescription);
            return reschedule(-256);
        } else {
            Logger.get().info(WorkerWrapperKt.TAG, "Worker result FAILURE for " + this.workDescription);
            if (this.workSpec.isPeriodic()) {
                return resetPeriodic();
            }
            if (result == null) {
                result = new ListenableWorker.Result.Failure();
            }
            return setFailed(result);
        }
    }

    private final boolean trySetRunning() {
        Object runInTransaction = this.workDatabase.runInTransaction(new WorkerWrapper$$ExternalSyntheticLambda1(this));
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) runInTransaction).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Boolean trySetRunning$lambda$11(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean setFailed(ListenableWorker.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
        Intrinsics.checkNotNullExpressionValue(outputData, "failure.outputData");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }

    private final void iterativelyFailWorkAndDependents(String str) {
        List mutableListOf = CollectionsKt.mutableListOf(new String[]{str});
        while (!mutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(mutableListOf);
            if (this.workSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str2);
            }
            mutableListOf.addAll(this.dependencyDao.getDependentWorkIds(str2));
        }
    }

    private final boolean reschedule(int i) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1);
        this.workSpecDao.setStopReason(this.workSpecId, i);
        return true;
    }

    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1);
        return false;
    }

    private final boolean setSucceeded(ListenableWorker.Result result) {
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data outputData = ((ListenableWorker.Result.Success) result).getOutputData();
        Intrinsics.checkNotNullExpressionValue(outputData, "success.outputData");
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        long currentTimeMillis = this.clock.currentTimeMillis();
        for (String next : this.dependencyDao.getDependentWorkIds(this.workSpecId)) {
            if (this.workSpecDao.getState(next) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(next)) {
                Logger.get().info(WorkerWrapperKt.TAG, "Setting status to enqueued for " + next);
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, next);
                this.workSpecDao.setLastEnqueueTime(next, currentTimeMillis);
            }
        }
        return false;
    }

    private final String createWorkDescription(List<String> list) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + " } ]";
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u00100\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0007R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Builder;", "", "context", "Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "foregroundProcessor", "Landroidx/work/impl/foreground/ForegroundProcessor;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "tags", "", "", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/foreground/ForegroundProcessor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/model/WorkSpec;Ljava/util/List;)V", "appContext", "getAppContext", "()Landroid/content/Context;", "getConfiguration", "()Landroidx/work/Configuration;", "getForegroundProcessor", "()Landroidx/work/impl/foreground/ForegroundProcessor;", "runtimeExtras", "Landroidx/work/WorkerParameters$RuntimeExtras;", "getRuntimeExtras", "()Landroidx/work/WorkerParameters$RuntimeExtras;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$RuntimeExtras;)V", "getTags", "()Ljava/util/List;", "getWorkDatabase", "()Landroidx/work/impl/WorkDatabase;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "getWorkTaskExecutor", "()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "worker", "Landroidx/work/ListenableWorker;", "getWorker", "()Landroidx/work/ListenableWorker;", "setWorker", "(Landroidx/work/ListenableWorker;)V", "build", "Landroidx/work/impl/WorkerWrapper;", "withRuntimeExtras", "withWorker", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkerWrapper.kt */
    public static final class Builder {
        private final Context appContext;
        private final Configuration configuration;
        private final ForegroundProcessor foregroundProcessor;
        private WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
        private final List<String> tags;
        private final WorkDatabase workDatabase;
        private final WorkSpec workSpec;
        private final TaskExecutor workTaskExecutor;
        private ListenableWorker worker;

        public Builder(Context context, Configuration configuration2, TaskExecutor taskExecutor, ForegroundProcessor foregroundProcessor2, WorkDatabase workDatabase2, WorkSpec workSpec2, List<String> list) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration2, "configuration");
            Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
            Intrinsics.checkNotNullParameter(foregroundProcessor2, "foregroundProcessor");
            Intrinsics.checkNotNullParameter(workDatabase2, "workDatabase");
            Intrinsics.checkNotNullParameter(workSpec2, "workSpec");
            Intrinsics.checkNotNullParameter(list, "tags");
            this.configuration = configuration2;
            this.workTaskExecutor = taskExecutor;
            this.foregroundProcessor = foregroundProcessor2;
            this.workDatabase = workDatabase2;
            this.workSpec = workSpec2;
            this.tags = list;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.appContext = applicationContext;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final TaskExecutor getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        public final ForegroundProcessor getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final ListenableWorker getWorker() {
            return this.worker;
        }

        public final void setWorker(ListenableWorker listenableWorker) {
            this.worker = listenableWorker;
        }

        public final WorkerParameters.RuntimeExtras getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final void setRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras2) {
            Intrinsics.checkNotNullParameter(runtimeExtras2, "<set-?>");
            this.runtimeExtras = runtimeExtras2;
        }

        public final Builder withRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras2) {
            if (runtimeExtras2 != null) {
                this.runtimeExtras = runtimeExtras2;
            }
            return this;
        }

        public final Builder withWorker(ListenableWorker listenableWorker) {
            Intrinsics.checkNotNullParameter(listenableWorker, "worker");
            this.worker = listenableWorker;
            return this;
        }

        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }
    }
}
