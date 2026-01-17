package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzefi implements zzfve {
    public final /* synthetic */ zzcfg zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzdfc zzc;

    public /* synthetic */ zzefi(zzefk zzefk, zzcfg zzcfg, zzfca zzfca, zzdfc zzdfc) {
        this.zza = zzcfg;
        this.zzb = zzfca;
        this.zzc = zzdfc;
    }

    public final Object apply(Object obj) {
        zzcfg zzcfg = this.zza;
        if (this.zzb.zzM) {
            zzcfg.zzah();
        }
        zzdfc zzdfc = this.zzc;
        zzcfg.zzab();
        zzcfg.onPause();
        return zzdfc.zzg();
    }
}
