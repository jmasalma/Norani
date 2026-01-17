package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public class WorkProgressUpdater implements ProgressUpdater {
    static final String TAG = Logger.tagWithPrefix("WorkProgressUpdater");
    final TaskExecutor mTaskExecutor;
    final WorkDatabase mWorkDatabase;

    public WorkProgressUpdater(WorkDatabase workDatabase, TaskExecutor taskExecutor) {
        this.mWorkDatabase = workDatabase;
        this.mTaskExecutor = taskExecutor;
    }

    public ListenableFuture<Void> updateProgress(Context context, UUID uuid, Data data) {
        return ListenableFutureKt.executeAsync(this.mTaskExecutor.getSerialTaskExecutor(), "updateProgress", new WorkProgressUpdater$$ExternalSyntheticLambda0(this, uuid, data));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$updateProgress$0$androidx-work-impl-utils-WorkProgressUpdater  reason: not valid java name */
    public /* synthetic */ Void m66lambda$updateProgress$0$androidxworkimplutilsWorkProgressUpdater(UUID uuid, Data data) {
        String uuid2 = uuid.toString();
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Updating progress for " + uuid + " (" + data + ")");
        this.mWorkDatabase.beginTransaction();
        try {
            WorkSpec workSpec = this.mWorkDatabase.workSpecDao().getWorkSpec(uuid2);
            if (workSpec != null) {
                if (workSpec.state == WorkInfo.State.RUNNING) {
                    this.mWorkDatabase.workProgressDao().insert(new WorkProgress(uuid2, data));
                } else {
                    Logger.get().warning(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                this.mWorkDatabase.setTransactionSuccessful();
                this.mWorkDatabase.endTransaction();
                return null;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }
}
