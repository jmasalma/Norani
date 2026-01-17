package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzedw implements zzfve {
    public final /* synthetic */ zzcfg zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzcod zzc;

    public /* synthetic */ zzedw(zzedx zzedx, zzcfg zzcfg, zzfca zzfca, zzcod zzcod) {
        this.zza = zzcfg;
        this.zzb = zzfca;
        this.zzc = zzcod;
    }

    public final Object apply(Object obj) {
        zzcfg zzcfg = this.zza;
        if (this.zzb.zzM) {
            zzcfg.zzah();
        }
        zzcod zzcod = this.zzc;
        zzcfg.zzab();
        zzcfg.onPause();
        return zzcod.zza();
    }
}
