package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzems implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzems(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzems zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzems(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzemq zzb() {
        zzfcw zzc2 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc2;
        Context zza2 = ((zzchl) this.zzc).zza();
        Context context = zza2;
        return new zzemq((zzeou) this.zza.zzb(), zzc2, zza2, (zzbzs) this.zzd.zzb());
    }
}
