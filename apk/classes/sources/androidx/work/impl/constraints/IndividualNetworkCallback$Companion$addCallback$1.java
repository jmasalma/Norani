package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkConstraintsTracker.kt */
final class IndividualNetworkCallback$Companion$addCallback$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.BooleanRef $callbackRegistered;
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ IndividualNetworkCallback $networkCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IndividualNetworkCallback$Companion$addCallback$1(Ref.BooleanRef booleanRef, ConnectivityManager connectivityManager, IndividualNetworkCallback individualNetworkCallback) {
        super(0);
        this.$callbackRegistered = booleanRef;
        this.$connManager = connectivityManager;
        this.$networkCallback = individualNetworkCallback;
    }

    public final void invoke() {
        if (this.$callbackRegistered.element) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
            this.$connManager.unregisterNetworkCallback(this.$networkCallback);
        }
    }
}
