package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzazb extends BroadcastReceiver {
    final /* synthetic */ zzaze zza;

    zzazb(zzaze zzaze) {
        Objects.requireNonNull(zzaze);
        this.zza = zzaze;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
