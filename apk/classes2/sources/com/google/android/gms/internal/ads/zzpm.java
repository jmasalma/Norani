package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzpm extends BroadcastReceiver {
    final /* synthetic */ zzpo zza;

    /* synthetic */ zzpm(zzpo zzpo, zzpn zzpn) {
        Objects.requireNonNull(zzpo);
        this.zza = zzpo;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            zzpo zzpo = this.zza;
            zzpo.zzk(zzpj.zzd(context, intent, zzpo.zzh, zzpo.zzg));
        }
    }
}
