package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcit implements zzexb {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    final zzhha zze;
    final zzhha zzf;
    private final zzcio zzg;

    zzcit(zzcio zzcio, Context context, String str) {
        this.zzg = zzcio;
        zzhgr zza2 = zzhgs.zza(context);
        this.zza = zza2;
        zzhgr zza3 = zzhgs.zza(str);
        this.zzb = zza3;
        zzhha zzhha = zzcio.zzbh;
        zzezt zzc2 = zzezt.zzc(zza2, zzhha, zzcio.zzbi);
        this.zzc = zzc2;
        zzhha zzc3 = zzhgq.zzc(zzexz.zza(zzhha));
        this.zzd = zzc3;
        zzhha zzhha2 = zzcio.zza;
        zzhha zzhha3 = zzcio.zzS;
        zzfcy zza4 = zzfcy.zza();
        zzhha zzhha4 = zzcio.zzi;
        zzhha zzhha5 = zzc3;
        zzhha zzc4 = zzhgq.zzc(zzeyb.zza(zza2, zzhha2, zzhha3, zzc2, zzhha5, zza4, zzhha4));
        this.zze = zzc4;
        this.zzf = zzhgq.zzc(zzeyh.zza(zzhha3, zza2, zza3, zzc4, zzhha5, zzhha4, zzcio.zzl));
    }

    public final zzeyg zza() {
        return (zzeyg) this.zzf.zzb();
    }
}
