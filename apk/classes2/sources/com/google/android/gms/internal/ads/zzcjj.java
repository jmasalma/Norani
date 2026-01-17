package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjj implements zzfag {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    final zzhha zze;
    final zzhha zzf;
    final zzhha zzg;
    private final zzcio zzh;

    zzcjj(zzcio zzcio, Context context, String str, zzr zzr) {
        this.zzh = zzcio;
        zzhgr zza2 = zzhgs.zza(context);
        this.zza = zza2;
        zzhgr zza3 = zzhgs.zza(zzr);
        this.zzb = zza3;
        zzhgr zza4 = zzhgs.zza(str);
        this.zzc = zza4;
        zzhha zzhha = zzcio.zzl;
        zzhha zzc2 = zzhgq.zzc(zzekz.zza(zzhha));
        this.zzd = zzc2;
        zzhha zzc3 = zzhgq.zzc(zzfbe.zza(zzcio.zzbh));
        this.zze = zzc3;
        zzhha zzc4 = zzhgq.zzc(zzfae.zza(zza2, zzcio.zza, zzcio.zzS, zzc2, zzc3, zzfcy.zza()));
        this.zzf = zzc4;
        this.zzg = zzhgq.zzc(zzelh.zza(zza2, zza3, zza4, zzc4, zzc2, zzc3, zzcio.zzi, zzcio.zzU, zzhha));
    }

    public final zzelg zza() {
        return (zzelg) this.zzg.zzb();
    }
}
