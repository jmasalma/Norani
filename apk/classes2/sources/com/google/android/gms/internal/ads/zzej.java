package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzej extends BroadcastReceiver {
    final /* synthetic */ zzel zza;

    /* synthetic */ zzej(zzel zzel, zzek zzek) {
        Objects.requireNonNull(zzel);
        this.zza = zzel;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzb.execute(new zzei(this, context));
    }
}
