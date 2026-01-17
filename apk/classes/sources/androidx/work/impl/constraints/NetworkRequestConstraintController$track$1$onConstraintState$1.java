package androidx.work.impl.constraints;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/ConstraintsState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkConstraintsTracker.kt */
final class NetworkRequestConstraintController$track$1$onConstraintState$1 extends Lambda implements Function1<ConstraintsState, Unit> {
    final /* synthetic */ ProducerScope<ConstraintsState> $$this$callbackFlow;
    final /* synthetic */ Job $timeoutJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkRequestConstraintController$track$1$onConstraintState$1(Job job, ProducerScope<? super ConstraintsState> producerScope) {
        super(1);
        this.$timeoutJob = job;
        this.$$this$callbackFlow = producerScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConstraintsState) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ConstraintsState constraintsState) {
        Intrinsics.checkNotNullParameter(constraintsState, "it");
        Job.DefaultImpls.cancel$default(this.$timeoutJob, (CancellationException) null, 1, (Object) null);
        this.$$this$callbackFlow.m106trySendJP2dKIU(constraintsState);
    }
}
