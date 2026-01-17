package androidx.work;

import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u0001:\u0003EFGB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u00020\u001f8GX\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"R\u0013\u0010#\u001a\u00020\u001f8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\fR\u0013\u0010&\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\fR\u0011\u0010(\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\fR\u0013\u0010*\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\fR\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\u0011\u00102\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0014R\u0013\u00104\u001a\u0002058G¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0019R\u0011\u0010?\u001a\u00020@¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0019\u0010C\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0019¨\u0006H"}, d2 = {"Landroidx/work/Configuration;", "", "builder", "Landroidx/work/Configuration$Builder;", "(Landroidx/work/Configuration$Builder;)V", "clock", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "contentUriTriggerWorkersLimit", "", "getContentUriTriggerWorkersLimit", "()I", "defaultProcessName", "", "getDefaultProcessName", "()Ljava/lang/String;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "isMarkingJobsAsImportantWhileForeground", "", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "()Z", "isUsingDefaultTaskExecutor", "maxJobSchedulerId", "getMaxJobSchedulerId", "maxSchedulerLimit", "getMaxSchedulerLimit", "minJobSchedulerId", "getMinJobSchedulerId", "minimumLoggingLevel", "getMinimumLoggingLevel", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler", "()Landroidx/work/RunnableScheduler;", "schedulingExceptionHandler", "getSchedulingExceptionHandler", "taskExecutor", "getTaskExecutor", "tracer", "Landroidx/work/Tracer;", "getTracer", "()Landroidx/work/Tracer;", "workerCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "workerExecutionExceptionHandler", "Landroidx/work/WorkerExceptionInfo;", "getWorkerExecutionExceptionHandler", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler", "Builder", "Companion", "Provider", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Configuration.kt */
public final class Configuration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final Clock clock;
    private final int contentUriTriggerWorkersLimit;
    private final String defaultProcessName;
    private final Executor executor;
    private final Consumer<Throwable> initializationExceptionHandler;
    private final InputMergerFactory inputMergerFactory;
    private final boolean isMarkingJobsAsImportantWhileForeground;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;
    private final RunnableScheduler runnableScheduler;
    private final Consumer<Throwable> schedulingExceptionHandler;
    private final Executor taskExecutor;
    private final Tracer tracer;
    private final CoroutineContext workerCoroutineContext;
    private final Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
    private final WorkerFactory workerFactory;
    private final Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Configuration.kt */
    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public static /* synthetic */ void isMarkingJobsAsImportantWhileForeground$annotations() {
    }

    public Configuration(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CoroutineContext workerContext$work_runtime_release = builder.getWorkerContext$work_runtime_release();
        Executor executor$work_runtime_release = builder.getExecutor$work_runtime_release();
        boolean z = false;
        if (executor$work_runtime_release == null) {
            executor$work_runtime_release = workerContext$work_runtime_release != null ? ConfigurationKt.asExecutor(workerContext$work_runtime_release) : null;
            if (executor$work_runtime_release == null) {
                executor$work_runtime_release = ConfigurationKt.createDefaultExecutor(false);
            }
        }
        this.executor = executor$work_runtime_release;
        if (workerContext$work_runtime_release == null) {
            if (builder.getExecutor$work_runtime_release() != null) {
                workerContext$work_runtime_release = (CoroutineContext) ExecutorsKt.from(executor$work_runtime_release);
            } else {
                workerContext$work_runtime_release = (CoroutineContext) Dispatchers.getDefault();
            }
        }
        this.workerCoroutineContext = workerContext$work_runtime_release;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor$work_runtime_release() == null ? true : z;
        Executor taskExecutor$work_runtime_release = builder.getTaskExecutor$work_runtime_release();
        this.taskExecutor = taskExecutor$work_runtime_release == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor$work_runtime_release;
        Clock clock$work_runtime_release = builder.getClock$work_runtime_release();
        this.clock = clock$work_runtime_release == null ? new SystemClock() : clock$work_runtime_release;
        WorkerFactory workerFactory$work_runtime_release = builder.getWorkerFactory$work_runtime_release();
        this.workerFactory = workerFactory$work_runtime_release == null ? DefaultWorkerFactory.INSTANCE : workerFactory$work_runtime_release;
        InputMergerFactory inputMergerFactory$work_runtime_release = builder.getInputMergerFactory$work_runtime_release();
        this.inputMergerFactory = inputMergerFactory$work_runtime_release == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory$work_runtime_release;
        RunnableScheduler runnableScheduler$work_runtime_release = builder.getRunnableScheduler$work_runtime_release();
        this.runnableScheduler = runnableScheduler$work_runtime_release == null ? new DefaultRunnableScheduler() : runnableScheduler$work_runtime_release;
        this.minimumLoggingLevel = builder.getLoggingLevel$work_runtime_release();
        this.minJobSchedulerId = builder.getMinJobSchedulerId$work_runtime_release();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId$work_runtime_release();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit$work_runtime_release();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.workerInitializationExceptionHandler = builder.getWorkerInitializationExceptionHandler$work_runtime_release();
        this.workerExecutionExceptionHandler = builder.getWorkerExecutionExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName$work_runtime_release();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit$work_runtime_release();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground$work_runtime_release();
        Tracer tracer$work_runtime_release = builder.getTracer$work_runtime_release();
        this.tracer = tracer$work_runtime_release == null ? ConfigurationKt.createDefaultTracer() : tracer$work_runtime_release;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler() {
        return this.workerInitializationExceptionHandler;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler() {
        return this.workerExecutionExceptionHandler;
    }

    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    public final boolean isUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    public final boolean isMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }

    public final Tracer getTracer() {
        return this.tracer;
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010b\u001a\u00020\u0004J\u000e\u0010c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010d\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010e\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u0013J\u000e\u0010g\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010h\u001a\u00020\u00002\f\u0010i\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u000e\u0010j\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0016\u0010k\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\r2\u0006\u00104\u001a\u00020\rJ\u0010\u0010l\u001a\u00020\u00002\u0006\u0010m\u001a\u00020/H\u0007J\u000e\u0010n\u001a\u00020\u00002\u0006\u00107\u001a\u00020\rJ\u000e\u0010o\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\rJ\u000e\u0010p\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>J\u0014\u0010q\u001a\u00020\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u000e\u0010r\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0019J\u0010\u0010s\u001a\u00020\u00002\u0006\u0010I\u001a\u00020JH\u0007J\u000e\u0010t\u001a\u00020\u00002\u0006\u0010u\u001a\u00020PJ\u0014\u0010v\u001a\u00020\u00002\f\u0010w\u001a\b\u0012\u0004\u0012\u00020V0\u001fJ\u000e\u0010x\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020ZJ\u0014\u0010y\u001a\u00020\u00002\f\u0010w\u001a\b\u0012\u0004\u0012\u00020V0\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R\u001a\u00107\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0011R\u001a\u0010:\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R\u001c\u0010F\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001dR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\"\"\u0004\bX\u0010$R\u001c\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010_\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\"\"\u0004\ba\u0010$¨\u0006z"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "()V", "configuration", "Landroidx/work/Configuration;", "(Landroidx/work/Configuration;)V", "clock", "Landroidx/work/Clock;", "getClock$work_runtime_release", "()Landroidx/work/Clock;", "setClock$work_runtime_release", "(Landroidx/work/Clock;)V", "contentUriTriggerWorkersLimit", "", "getContentUriTriggerWorkersLimit$work_runtime_release", "()I", "setContentUriTriggerWorkersLimit$work_runtime_release", "(I)V", "defaultProcessName", "", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "loggingLevel", "getLoggingLevel$work_runtime_release", "setLoggingLevel$work_runtime_release", "markJobsAsImportantWhileForeground", "", "getMarkJobsAsImportantWhileForeground$work_runtime_release", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "maxJobSchedulerId", "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", "maxSchedulerLimit", "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", "minJobSchedulerId", "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler$work_runtime_release", "()Landroidx/work/RunnableScheduler;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/RunnableScheduler;)V", "schedulingExceptionHandler", "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "taskExecutor", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "tracer", "Landroidx/work/Tracer;", "getTracer$work_runtime_release", "()Landroidx/work/Tracer;", "setTracer$work_runtime_release", "(Landroidx/work/Tracer;)V", "workerContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerContext$work_runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerExecutionExceptionHandler", "Landroidx/work/WorkerExceptionInfo;", "getWorkerExecutionExceptionHandler$work_runtime_release", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler$work_runtime_release", "setWorkerInitializationExceptionHandler$work_runtime_release", "build", "setClock", "setContentUriTriggerWorkersLimit", "setDefaultProcessName", "processName", "setExecutor", "setInitializationExceptionHandler", "exceptionHandler", "setInputMergerFactory", "setJobSchedulerJobIdRange", "setMarkingJobsAsImportantWhileForeground", "markAsImportant", "setMaxSchedulerLimit", "setMinimumLoggingLevel", "setRunnableScheduler", "setSchedulingExceptionHandler", "setTaskExecutor", "setTracer", "setWorkerCoroutineContext", "context", "setWorkerExecutionExceptionHandler", "workerExceptionHandler", "setWorkerFactory", "setWorkerInitializationExceptionHandler", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Configuration.kt */
    public static final class Builder {
        private Clock clock;
        private int contentUriTriggerWorkersLimit = 8;
        private String defaultProcessName;
        private Executor executor;
        private Consumer<Throwable> initializationExceptionHandler;
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel = 4;
        private boolean markJobsAsImportantWhileForeground = true;
        private int maxJobSchedulerId = Integer.MAX_VALUE;
        private int maxSchedulerLimit = 20;
        private int minJobSchedulerId;
        private RunnableScheduler runnableScheduler;
        private Consumer<Throwable> schedulingExceptionHandler;
        private Executor taskExecutor;
        private Tracer tracer;
        private CoroutineContext workerContext;
        private Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        private WorkerFactory workerFactory;
        private Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

        public final Executor getExecutor$work_runtime_release() {
            return this.executor;
        }

        public final void setExecutor$work_runtime_release(Executor executor2) {
            this.executor = executor2;
        }

        public final CoroutineContext getWorkerContext$work_runtime_release() {
            return this.workerContext;
        }

        public final void setWorkerContext$work_runtime_release(CoroutineContext coroutineContext) {
            this.workerContext = coroutineContext;
        }

        public final WorkerFactory getWorkerFactory$work_runtime_release() {
            return this.workerFactory;
        }

        public final void setWorkerFactory$work_runtime_release(WorkerFactory workerFactory2) {
            this.workerFactory = workerFactory2;
        }

        public final InputMergerFactory getInputMergerFactory$work_runtime_release() {
            return this.inputMergerFactory;
        }

        public final void setInputMergerFactory$work_runtime_release(InputMergerFactory inputMergerFactory2) {
            this.inputMergerFactory = inputMergerFactory2;
        }

        public final Executor getTaskExecutor$work_runtime_release() {
            return this.taskExecutor;
        }

        public final void setTaskExecutor$work_runtime_release(Executor executor2) {
            this.taskExecutor = executor2;
        }

        public final Clock getClock$work_runtime_release() {
            return this.clock;
        }

        public final void setClock$work_runtime_release(Clock clock2) {
            this.clock = clock2;
        }

        public final RunnableScheduler getRunnableScheduler$work_runtime_release() {
            return this.runnableScheduler;
        }

        public final void setRunnableScheduler$work_runtime_release(RunnableScheduler runnableScheduler2) {
            this.runnableScheduler = runnableScheduler2;
        }

        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler$work_runtime_release() {
            return this.workerInitializationExceptionHandler;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime_release(Consumer<WorkerExceptionInfo> consumer) {
            this.workerInitializationExceptionHandler = consumer;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler$work_runtime_release() {
            return this.workerExecutionExceptionHandler;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime_release(Consumer<WorkerExceptionInfo> consumer) {
            this.workerExecutionExceptionHandler = consumer;
        }

        public final String getDefaultProcessName$work_runtime_release() {
            return this.defaultProcessName;
        }

        public final void setDefaultProcessName$work_runtime_release(String str) {
            this.defaultProcessName = str;
        }

        public final int getLoggingLevel$work_runtime_release() {
            return this.loggingLevel;
        }

        public final void setLoggingLevel$work_runtime_release(int i) {
            this.loggingLevel = i;
        }

        public final int getMinJobSchedulerId$work_runtime_release() {
            return this.minJobSchedulerId;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i) {
            this.minJobSchedulerId = i;
        }

        public final int getMaxJobSchedulerId$work_runtime_release() {
            return this.maxJobSchedulerId;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i) {
            this.maxJobSchedulerId = i;
        }

        public final int getMaxSchedulerLimit$work_runtime_release() {
            return this.maxSchedulerLimit;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i) {
            this.maxSchedulerLimit = i;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime_release() {
            return this.contentUriTriggerWorkersLimit;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i) {
            this.contentUriTriggerWorkersLimit = i;
        }

        public final boolean getMarkJobsAsImportantWhileForeground$work_runtime_release() {
            return this.markJobsAsImportantWhileForeground;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime_release(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
        }

        public final Tracer getTracer$work_runtime_release() {
            return this.tracer;
        }

        public final void setTracer$work_runtime_release(Tracer tracer2) {
            this.tracer = tracer2;
        }

        public Builder() {
        }

        public Builder(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.workerInitializationExceptionHandler = configuration.getWorkerInitializationExceptionHandler();
            this.workerExecutionExceptionHandler = configuration.getWorkerExecutionExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
            this.contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            this.markJobsAsImportantWhileForeground = configuration.isMarkingJobsAsImportantWhileForeground();
            this.tracer = configuration.getTracer();
        }

        public final Builder setWorkerFactory(WorkerFactory workerFactory2) {
            Intrinsics.checkNotNullParameter(workerFactory2, "workerFactory");
            this.workerFactory = workerFactory2;
            return this;
        }

        public final Builder setInputMergerFactory(InputMergerFactory inputMergerFactory2) {
            Intrinsics.checkNotNullParameter(inputMergerFactory2, "inputMergerFactory");
            this.inputMergerFactory = inputMergerFactory2;
            return this;
        }

        public final Builder setExecutor(Executor executor2) {
            Intrinsics.checkNotNullParameter(executor2, "executor");
            this.executor = executor2;
            return this;
        }

        public final Builder setWorkerCoroutineContext(CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, "context");
            this.workerContext = coroutineContext;
            return this;
        }

        public final Builder setTaskExecutor(Executor executor2) {
            Intrinsics.checkNotNullParameter(executor2, "taskExecutor");
            this.taskExecutor = executor2;
            return this;
        }

        public final Builder setClock(Clock clock2) {
            Intrinsics.checkNotNullParameter(clock2, "clock");
            this.clock = clock2;
            return this;
        }

        public final Builder setJobSchedulerJobIdRange(int i, int i2) {
            if (i2 - i >= 1000) {
                this.minJobSchedulerId = i;
                this.maxJobSchedulerId = i2;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.".toString());
        }

        public final Builder setMaxSchedulerLimit(int i) {
            if (i >= 20) {
                this.maxSchedulerLimit = Math.min(i, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.".toString());
        }

        public final Builder setContentUriTriggerWorkersLimit(int i) {
            this.contentUriTriggerWorkersLimit = Math.max(i, 0);
            return this;
        }

        public final Builder setMinimumLoggingLevel(int i) {
            this.loggingLevel = i;
            return this;
        }

        public final Builder setRunnableScheduler(RunnableScheduler runnableScheduler2) {
            Intrinsics.checkNotNullParameter(runnableScheduler2, "runnableScheduler");
            this.runnableScheduler = runnableScheduler2;
            return this;
        }

        public final Builder setInitializationExceptionHandler(Consumer<Throwable> consumer) {
            Intrinsics.checkNotNullParameter(consumer, "exceptionHandler");
            this.initializationExceptionHandler = consumer;
            return this;
        }

        public final Builder setSchedulingExceptionHandler(Consumer<Throwable> consumer) {
            Intrinsics.checkNotNullParameter(consumer, "schedulingExceptionHandler");
            this.schedulingExceptionHandler = consumer;
            return this;
        }

        public final Builder setWorkerInitializationExceptionHandler(Consumer<WorkerExceptionInfo> consumer) {
            Intrinsics.checkNotNullParameter(consumer, "workerExceptionHandler");
            this.workerInitializationExceptionHandler = consumer;
            return this;
        }

        public final Builder setWorkerExecutionExceptionHandler(Consumer<WorkerExceptionInfo> consumer) {
            Intrinsics.checkNotNullParameter(consumer, "workerExceptionHandler");
            this.workerExecutionExceptionHandler = consumer;
            return this;
        }

        public final Builder setDefaultProcessName(String str) {
            Intrinsics.checkNotNullParameter(str, "processName");
            this.defaultProcessName = str;
            return this;
        }

        public final Builder setMarkingJobsAsImportantWhileForeground(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
            return this;
        }

        public final Builder setTracer(Tracer tracer2) {
            Intrinsics.checkNotNullParameter(tracer2, "tracer");
            this.tracer = tracer2;
            return this;
        }

        public final Configuration build() {
            return new Configuration(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/work/Configuration$Companion;", "", "()V", "MIN_SCHEDULER_LIMIT", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Configuration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
