package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzciy implements zzeyp {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    final zzhha zze;
    final zzhha zzf;
    private final Context zzg;
    private final zzr zzh;
    private final String zzi;
    private final zzcio zzj;

    zzciy(zzcio zzcio, Context context, String str, zzr zzr) {
        this.zzj = zzcio;
        this.zzg = context;
        this.zzh = zzr;
        this.zzi = str;
        zzhgr zza2 = zzhgs.zza(context);
        this.zza = zza2;
        zzhgr zza3 = zzhgs.zza(zzr);
        this.zzb = zza3;
        zzhha zzc2 = zzhgq.zzc(zzekz.zza(zzcio.zzl));
        this.zzc = zzc2;
        zzhha zzc3 = zzhgq.zzc(zzele.zza());
        this.zzd = zzc3;
        zzhha zzc4 = zzhgq.zzc(zzdbd.zza());
        this.zze = zzc4;
        this.zzf = zzhgq.zzc(zzeyn.zza(zza2, zzcio.zza, zza3, zzcio.zzS, zzc2, zzc3, zzfcy.zza(), zzc4));
    }

    public final zzeke zza() {
        zzcio zzcio = this.zzj;
        return new zzeke(this.zzg, this.zzh, this.zzi, (zzeym) this.zzf.zzb(), (zzeky) this.zzc.zzb(), zzchz.zzc(zzcio.zzbp), (zzdsj) zzcio.zzl.zzb());
    }
}
