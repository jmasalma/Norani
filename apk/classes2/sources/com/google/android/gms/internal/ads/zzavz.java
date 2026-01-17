package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzavz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzawa zza;

    zzavz(zzawa zzawa) {
        this.zza = zzawa;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzawa.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzawa.class) {
            this.zza.zza = null;
        }
    }
}
