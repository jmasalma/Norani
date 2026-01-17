package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdod {
    private final zzcvw zza;
    private final zzcxf zzb;
    private final zzcxs zzc;
    private final zzcye zzd;
    private final zzdaz zze;
    private final zzdeb zzf;
    private final zzdsj zzg;
    private final zzfjy zzh;
    private final zzeca zzi;
    private final zzcmq zzj;

    zzdod(zzcvw zzcvw, zzcxf zzcxf, zzcxs zzcxs, zzcye zzcye, zzdaz zzdaz, zzdeb zzdeb, zzdsj zzdsj, zzfjy zzfjy, zzeca zzeca, zzcmq zzcmq) {
        this.zza = zzcvw;
        this.zzb = zzcxf;
        this.zzc = zzcxs;
        this.zzd = zzcye;
        this.zze = zzdaz;
        this.zzf = zzdeb;
        this.zzg = zzdsj;
        this.zzh = zzfjy;
        this.zzi = zzeca;
        this.zzj = zzcmq;
    }

    public final void zza(zzdoe zzdoe, zzcfg zzcfg) {
        zzdob zza2 = zzdoe.zza;
        zzcxf zzcxf = this.zzb;
        Objects.requireNonNull(zzcxf);
        zza2.zzi(this.zza, this.zzc, this.zzd, this.zze, new zzdoc(zzcxf), this.zzf);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkD)).booleanValue() && zzcfg != null && zzcfg.zzN() != null) {
            zzcgy zzN = zzcfg.zzN();
            zzcmq zzcmq = this.zzj;
            zzeca zzeca = this.zzi;
            zzN.zzM(zzcmq, zzeca, this.zzh);
            zzN.zzO(zzcmq, zzeca, this.zzg);
        }
    }
}
