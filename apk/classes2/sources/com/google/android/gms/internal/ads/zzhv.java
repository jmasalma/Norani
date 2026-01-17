package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzhv extends BroadcastReceiver {
    private final zzdt zza;

    public zzhv(zzhx zzhx, zzdt zzdt, zzhw zzhw) {
        Objects.requireNonNull(zzhx);
        this.zza = zzdt;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzi(new zzhu(this));
        }
    }
}
