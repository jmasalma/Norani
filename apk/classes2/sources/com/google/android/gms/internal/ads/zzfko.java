package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfko extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfkp zza;

    zzfko(zzfkp zzfkp) {
        Objects.requireNonNull(zzfkp);
        this.zza = zzfkp;
    }

    public final void onAvailable(Network network) {
        this.zza.zzr(true);
    }

    public final void onLost(Network network) {
        this.zza.zzr(false);
    }
}
