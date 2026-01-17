package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzehy implements zzfve {
    public final /* synthetic */ zzcfg zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzdoo zzc;

    public /* synthetic */ zzehy(zzeie zzeie, zzcfg zzcfg, zzfca zzfca, zzdoo zzdoo) {
        this.zza = zzcfg;
        this.zzb = zzfca;
        this.zzc = zzdoo;
    }

    public final Object apply(Object obj) {
        zzcfg zzcfg = this.zza;
        if (this.zzb.zzM) {
            zzcfg.zzah();
        }
        zzdoo zzdoo = this.zzc;
        zzcfg.zzab();
        zzcfg.onPause();
        return zzdoo.zzi();
    }
}
