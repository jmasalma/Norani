package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\b\u001aß\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0001\b\u0002\u0010\u0010\u001a\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0011j\u0002`\u0016H\u0007¢\u0006\u0002\b\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u001b\u001a>\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a®\u0001\u0010\u001d\u001a\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0011j\u0002`\u00162\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001e\"\u00020\u0015¢\u0006\u0002\u0010\u001f\u001a\n\u0010 \u001a\u00020!*\u00020\u0001* \u0002\u0010\"\"\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00112\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0011¨\u0006#"}, d2 = {"TestWorkManagerImpl", "Landroidx/work/impl/WorkManagerImpl;", "context", "Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "createTestWorkManager", "WorkManagerImpl", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "trackers", "Landroidx/work/impl/constraints/trackers/Trackers;", "processor", "Landroidx/work/impl/Processor;", "schedulersCreator", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "", "Landroidx/work/impl/Scheduler;", "Landroidx/work/impl/SchedulersCreator;", "createWorkManager", "WorkManagerScope", "Lkotlinx/coroutines/CoroutineScope;", "taskExecutor", "createWorkManagerScope", "createSchedulers", "schedulers", "", "([Landroidx/work/impl/Scheduler;)Lkotlin/jvm/functions/Function6;", "close", "", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkManagerImplExt.kt */
public final class WorkManagerImplExtKt {
    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return createWorkManager$default(context, configuration, (TaskExecutor) null, (WorkDatabase) null, (Trackers) null, (Processor) null, (Function6) null, 124, (Object) null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, taskExecutor, (WorkDatabase) null, (Trackers) null, (Processor) null, (Function6) null, 120, (Object) null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, (Trackers) null, (Processor) null, (Function6) null, 112, (Object) null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, trackers, (Processor) null, (Function6) null, 96, (Object) null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, trackers, processor, (Function6) null, 64, (Object) null);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, Function6 function6, int i, Object obj) {
        WorkDatabase workDatabase2;
        Trackers trackers2;
        Processor processor2;
        TaskExecutor workManagerTaskExecutor = (i & 4) != 0 ? new WorkManagerTaskExecutor(configuration.getTaskExecutor()) : taskExecutor;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            SerialExecutor serialTaskExecutor = workManagerTaskExecutor.getSerialTaskExecutor();
            Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, workManagerTaskExecutor, (ConstraintTracker) null, (BatteryNotLowTracker) null, (ConstraintTracker) null, (ConstraintTracker) null, 60, (DefaultConstructorMarker) null);
        } else {
            trackers2 = trackers;
        }
        if ((i & 32) != 0) {
            Configuration configuration2 = configuration;
            processor2 = new Processor(context.getApplicationContext(), configuration, workManagerTaskExecutor, workDatabase2);
        } else {
            Configuration configuration3 = configuration;
            processor2 = processor;
        }
        return createWorkManager(context, configuration, workManagerTaskExecutor, workDatabase2, trackers2, processor2, (i & 64) != 0 ? (Function6) WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : function6);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, Function6<? super Context, ? super Configuration, ? super TaskExecutor, ? super WorkDatabase, ? super Trackers, ? super Processor, ? extends List<? extends Scheduler>> function6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(function6, "schedulersCreator");
        Configuration configuration2 = configuration;
        TaskExecutor taskExecutor2 = taskExecutor;
        WorkDatabase workDatabase2 = workDatabase;
        Processor processor2 = processor;
        return new WorkManagerImpl(context.getApplicationContext(), configuration2, taskExecutor2, workDatabase2, (List) function6.invoke(context, configuration2, taskExecutor2, workDatabase2, trackers, processor2), processor2, trackers);
    }

    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, taskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), (Trackers) null, (Processor) null, (Function6) null, 112, (Object) null);
    }

    public static final Function6<Context, Configuration, TaskExecutor, WorkDatabase, Trackers, Processor, List<Scheduler>> schedulers(Scheduler... schedulerArr) {
        Intrinsics.checkNotNullParameter(schedulerArr, "schedulers");
        return (Function6) new WorkManagerImplExtKt$schedulers$1(schedulerArr);
    }

    /* access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler createBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        Intrinsics.checkNotNullExpressionValue(createBestAvailableBackgroundScheduler, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt.listOf(new Scheduler[]{createBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor)});
    }

    public static final CoroutineScope createWorkManagerScope(TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        CoroutineContext taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        Intrinsics.checkNotNullExpressionValue(taskCoroutineDispatcher, "taskExecutor.taskCoroutineDispatcher");
        return CoroutineScopeKt.CoroutineScope(taskCoroutineDispatcher);
    }

    public static final void close(WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "<this>");
        BuildersKt.runBlocking$default((CoroutineContext) null, new WorkManagerImplExtKt$close$1(workManagerImpl, (Continuation<? super WorkManagerImplExtKt$close$1>) null), 1, (Object) null);
        workManagerImpl.getWorkDatabase().close();
    }
}
