package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkConstraintsTracker.kt */
final class SharedNetworkCallback$addCallback$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ Function1<ConstraintsState, Unit> $onConstraintState;
    final /* synthetic */ SharedNetworkCallback this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedNetworkCallback$addCallback$2(Function1<? super ConstraintsState, Unit> function1, ConnectivityManager connectivityManager, SharedNetworkCallback sharedNetworkCallback) {
        super(0);
        this.$onConstraintState = function1;
        this.$connManager = connectivityManager;
        this.this$0 = sharedNetworkCallback;
    }

    public final void invoke() {
        Object access$getRequestsLock$p = SharedNetworkCallback.requestsLock;
        Function1<ConstraintsState, Unit> function1 = this.$onConstraintState;
        ConnectivityManager connectivityManager = this.$connManager;
        SharedNetworkCallback sharedNetworkCallback = this.this$0;
        synchronized (access$getRequestsLock$p) {
            SharedNetworkCallback.requests.remove(function1);
            if (SharedNetworkCallback.requests.isEmpty()) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(sharedNetworkCallback);
                SharedNetworkCallback.INSTANCE.setCachedCapabilities((NetworkCapabilities) null);
                SharedNetworkCallback.INSTANCE.setCapabilitiesInitialized(false);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
