package androidx.work.impl.workers;

import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", f = "ConstraintTrackingWorker.kt", i = {}, l = {160}, m = "awaitConstraintsNotMet", n = {}, s = {})
/* compiled from: ConstraintTrackingWorker.kt */
final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1(Continuation<? super ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConstraintTrackingWorkerKt.awaitConstraintsNotMet((WorkConstraintsTracker) null, (WorkSpec) null, (Continuation) this);
    }
}
