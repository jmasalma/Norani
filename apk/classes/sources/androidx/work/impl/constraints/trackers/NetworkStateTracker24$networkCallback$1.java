package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"androidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onCapabilitiesChanged", "", "network", "Landroid/net/Network;", "capabilities", "Landroid/net/NetworkCapabilities;", "onLost", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NetworkStateTracker.kt */
public final class NetworkStateTracker24$networkCallback$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ NetworkStateTracker24 this$0;

    NetworkStateTracker24$networkCallback$1(NetworkStateTracker24 networkStateTracker24) {
        this.this$0 = networkStateTracker24;
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        NetworkState networkState;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "capabilities");
        Logger.get().debug(NetworkStateTrackerKt.TAG, "Network capabilities changed: " + networkCapabilities);
        NetworkStateTracker24 networkStateTracker24 = this.this$0;
        if (Build.VERSION.SDK_INT >= 28) {
            networkState = NetworkStateTrackerKt.getActiveNetworkState(networkCapabilities);
        } else {
            networkState = NetworkStateTrackerKt.getActiveNetworkState(this.this$0.connectivityManager);
        }
        networkStateTracker24.setState(networkState);
    }

    public void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        Logger.get().debug(NetworkStateTrackerKt.TAG, "Network connection lost");
        NetworkStateTracker24 networkStateTracker24 = this.this$0;
        networkStateTracker24.setState(NetworkStateTrackerKt.getActiveNetworkState(networkStateTracker24.connectivityManager));
    }
}
