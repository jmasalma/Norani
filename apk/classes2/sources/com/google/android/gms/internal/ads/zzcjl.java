package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjl implements zzfbu {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    final zzhha zze;
    final zzhha zzf;
    final zzhha zzg;
    final zzhha zzh;
    private final zzcio zzi;

    zzcjl(zzcio zzcio, Context context, String str) {
        this.zzi = zzcio;
        zzhgr zza2 = zzhgs.zza(context);
        this.zza = zza2;
        zzhha zzhha = zzcio.zzbh;
        zzezu zzc2 = zzezu.zzc(zza2, zzhha, zzcio.zzbi);
        this.zzb = zzc2;
        zzhha zzc3 = zzhgq.zzc(zzfbe.zza(zzhha));
        this.zzc = zzc3;
        zzhha zzc4 = zzhgq.zzc(zzfct.zza());
        this.zzd = zzc4;
        zzhha zzc5 = zzhgq.zzc(zzfbo.zza(zza2, zzcio.zza, zzcio.zzS, zzc2, zzc3, zzfcy.zza(), zzc4));
        this.zze = zzc5;
        this.zzf = zzhgq.zzc(zzfby.zza(zzc5, zzc3, zzc4));
        zzhgr zzc6 = zzhgs.zzc(str);
        this.zzg = zzc6;
        this.zzh = zzhgq.zzc(zzfbs.zza(zzc6, zzc5, zza2, zzc3, zzc4, zzcio.zzi, zzcio.zzU, zzcio.zzl));
    }

    public final zzfbr zza() {
        return (zzfbr) this.zzh.zzb();
    }

    public final zzfbx zzb() {
        return (zzfbx) this.zzf.zzb();
    }
}
