package androidx.work.impl.utils;

import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0000\u001a(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0000\u001a$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0000\u001a(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u0014*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00140\u0016H\u0002¨\u0006\u0017"}, d2 = {"forStringIds", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "Landroidx/work/WorkInfo;", "Landroidx/work/impl/WorkDatabase;", "executor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "ids", "", "forTag", "tag", "forUUID", "id", "Ljava/util/UUID;", "forUniqueWork", "name", "forWorkQuerySpec", "querySpec", "Landroidx/work/WorkQuery;", "loadStatusFuture", "T", "block", "Lkotlin/Function1;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: StatusRunnable.kt */
public final class StatusRunnable {
    public static final ListenableFuture<List<WorkInfo>> forStringIds(WorkDatabase workDatabase, TaskExecutor taskExecutor, List<String> list) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(taskExecutor, "executor");
        Intrinsics.checkNotNullParameter(list, "ids");
        return loadStatusFuture(workDatabase, taskExecutor, new StatusRunnable$forStringIds$1(list));
    }

    public static final ListenableFuture<WorkInfo> forUUID(WorkDatabase workDatabase, TaskExecutor taskExecutor, UUID uuid) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(taskExecutor, "executor");
        Intrinsics.checkNotNullParameter(uuid, "id");
        return loadStatusFuture(workDatabase, taskExecutor, new StatusRunnable$forUUID$1(uuid));
    }

    public static final ListenableFuture<List<WorkInfo>> forTag(WorkDatabase workDatabase, TaskExecutor taskExecutor, String str) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(taskExecutor, "executor");
        Intrinsics.checkNotNullParameter(str, "tag");
        return loadStatusFuture(workDatabase, taskExecutor, new StatusRunnable$forTag$1(str));
    }

    public static final ListenableFuture<List<WorkInfo>> forUniqueWork(WorkDatabase workDatabase, TaskExecutor taskExecutor, String str) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(taskExecutor, "executor");
        Intrinsics.checkNotNullParameter(str, "name");
        return loadStatusFuture(workDatabase, taskExecutor, new StatusRunnable$forUniqueWork$1(str));
    }

    public static final ListenableFuture<List<WorkInfo>> forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor taskExecutor, WorkQuery workQuery) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(taskExecutor, "executor");
        Intrinsics.checkNotNullParameter(workQuery, "querySpec");
        return loadStatusFuture(workDatabase, taskExecutor, new StatusRunnable$forWorkQuerySpec$1(workQuery));
    }

    private static final <T> ListenableFuture<T> loadStatusFuture(WorkDatabase workDatabase, TaskExecutor taskExecutor, Function1<? super WorkDatabase, ? extends T> function1) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "executor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new StatusRunnable$loadStatusFuture$1(function1, workDatabase));
    }
}
