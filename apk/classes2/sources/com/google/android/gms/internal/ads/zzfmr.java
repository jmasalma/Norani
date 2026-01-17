package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfmr extends BroadcastReceiver {
    final /* synthetic */ zzfms zza;

    zzfmr(zzfms zzfms) {
        Objects.requireNonNull(zzfms);
        this.zza = zzfms;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfms zzfms = this.zza;
            zzfms.zzd(true, zzfms.zzd);
            zzfms.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfms zzfms2 = this.zza;
            zzfms2.zzd(false, zzfms2.zzd);
            zzfms2.zzc = false;
        }
    }
}
