package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: CancelWorkRunnable.kt */
final class CancelWorkRunnable$forAll$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ WorkManagerImpl $workManagerImpl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CancelWorkRunnable$forAll$1(WorkManagerImpl workManagerImpl) {
        super(0);
        this.$workManagerImpl = workManagerImpl;
    }

    public final void invoke() {
        WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        workDatabase.runInTransaction((Runnable) new CancelWorkRunnable$forAll$1$$ExternalSyntheticLambda0(workDatabase, this.$workManagerImpl));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
        for (String access$cancel : workDatabase.workSpecDao().getAllUnfinishedWork()) {
            CancelWorkRunnable.cancel(workManagerImpl, access$cancel);
        }
        new PreferenceUtils(workDatabase).setLastCancelAllTimeMillis(workManagerImpl.getConfiguration().getClock().currentTimeMillis());
    }
}
