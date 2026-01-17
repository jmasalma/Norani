package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdnu {
    private final zzcvw zza;
    private final zzcxf zzb;
    private final zzcxs zzc;
    private final zzcye zzd;
    private final zzdaz zze;
    private final zzfca zzf;
    private final zzfcd zzg;
    private final zzcmq zzh;

    public zzdnu(zzcvw zzcvw, zzcxf zzcxf, zzcxs zzcxs, zzcye zzcye, zzdaz zzdaz, zzfca zzfca, zzfcd zzfcd, zzcmq zzcmq) {
        this.zza = zzcvw;
        this.zzb = zzcxf;
        this.zzc = zzcxs;
        this.zzd = zzcye;
        this.zze = zzdaz;
        this.zzf = zzfca;
        this.zzg = zzfcd;
        this.zzh = zzcmq;
    }

    public final void zza(zzdny zzdny) {
        zzcxf zzcxf = this.zzb;
        zzdnl zzb2 = zzdny.zza;
        Objects.requireNonNull(zzcxf);
        zzb2.zzh(this.zza, this.zzc, this.zzd, this.zze, new zzdnt(zzcxf));
        zzdny.zzh(this.zzf, this.zzg, this.zzh);
    }
}
