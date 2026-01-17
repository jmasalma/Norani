package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/work/WorkManager$UpdateResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkerUpdater.kt */
final class WorkerUpdater$updateWorkImpl$3 extends Lambda implements Function0<WorkManager.UpdateResult> {
    final /* synthetic */ WorkManagerImpl $this_updateWorkImpl;
    final /* synthetic */ WorkRequest $workRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkerUpdater$updateWorkImpl$3(WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
        super(0);
        this.$this_updateWorkImpl = workManagerImpl;
        this.$workRequest = workRequest;
    }

    public final WorkManager.UpdateResult invoke() {
        Processor processor = this.$this_updateWorkImpl.getProcessor();
        Intrinsics.checkNotNullExpressionValue(processor, "processor");
        WorkDatabase workDatabase = this.$this_updateWorkImpl.getWorkDatabase();
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
        Configuration configuration = this.$this_updateWorkImpl.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        List<Scheduler> schedulers = this.$this_updateWorkImpl.getSchedulers();
        Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
        return WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, this.$workRequest.getWorkSpec(), this.$workRequest.getTags());
    }
}
