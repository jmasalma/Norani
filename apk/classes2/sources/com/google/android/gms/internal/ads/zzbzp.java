package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbzp extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbzs zza;

    zzbzp(zzbzs zzbzs) {
        Objects.requireNonNull(zzbzs);
        this.zza = zzbzs;
    }

    public final void onAvailable(Network network) {
        this.zza.zzo.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzo.set(false);
    }
}
