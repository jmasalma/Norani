package androidx.work.impl.constraints;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.Constraints;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: WorkConstraintsTracker.kt */
final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Constraints $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkRequestConstraintController$track$1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, Continuation<? super NetworkRequestConstraintController$track$1> continuation) {
        super(2, continuation);
        this.$constraints = constraints;
        this.this$0 = networkRequestConstraintController;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.$constraints, this.this$0, continuation);
        networkRequestConstraintController$track$1.L$0 = obj;
        return (Continuation) networkRequestConstraintController$track$1;
    }

    public final Object invoke(ProducerScope<? super ConstraintsState> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        final Function0<Unit> function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (ProducerScope) this.L$0;
            NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
            if (requiredNetworkRequest == null) {
                SendChannel.DefaultImpls.close$default(coroutineScope.getChannel(), (Throwable) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
            Function1 networkRequestConstraintController$track$1$onConstraintState$1 = new NetworkRequestConstraintController$track$1$onConstraintState$1(BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, coroutineScope, (Continuation<? super NetworkRequestConstraintController$track$1$timeoutJob$1>) null), 3, (Object) null), coroutineScope);
            if (Build.VERSION.SDK_INT >= 30) {
                function0 = SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, networkRequestConstraintController$track$1$onConstraintState$1);
            } else {
                function0 = IndividualNetworkCallback.Companion.addCallback(this.this$0.connManager, requiredNetworkRequest, networkRequestConstraintController$track$1$onConstraintState$1);
            }
            this.label = 1;
            if (ProduceKt.awaitClose(coroutineScope, new Function0<Unit>() {
                public final void invoke() {
                    function0.invoke();
                }
            }, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
