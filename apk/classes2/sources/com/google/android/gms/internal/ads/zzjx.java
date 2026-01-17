package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzjx implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzkh zzc;
    public final /* synthetic */ zzph zzd;

    public /* synthetic */ zzjx(Context context, boolean z, zzkh zzkh, zzph zzph) {
        this.zza = context;
        this.zzb = z;
        this.zzc = zzkh;
        this.zzd = zzph;
    }

    public final void run() {
        zzpd zzb2 = zzpd.zzb(this.zza);
        if (zzb2 == null) {
            zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return;
        }
        if (this.zzb) {
            this.zzc.zzz(zzb2);
        }
        this.zzd.zzb(zzb2.zza());
    }
}
