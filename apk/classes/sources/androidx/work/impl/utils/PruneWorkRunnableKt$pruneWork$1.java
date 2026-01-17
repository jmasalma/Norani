package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: PruneWorkRunnable.kt */
final class PruneWorkRunnableKt$pruneWork$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ WorkDatabase $this_pruneWork;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PruneWorkRunnableKt$pruneWork$1(WorkDatabase workDatabase) {
        super(0);
        this.$this_pruneWork = workDatabase;
    }

    public final void invoke() {
        this.$this_pruneWork.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
    }
}
