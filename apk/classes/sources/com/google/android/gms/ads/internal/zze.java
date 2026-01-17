package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdsj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ zzdsj zzb;
    public final /* synthetic */ Long zzc;

    public /* synthetic */ zze(zzf zzf, zzdsj zzdsj, Long l) {
        this.zza = zzf;
        this.zzb = zzdsj;
        this.zzc = l;
    }

    public final void run() {
        zzf.zzf(this.zzb, "cld_r", zzv.zzD().elapsedRealtime() - this.zzc.longValue());
    }
}
