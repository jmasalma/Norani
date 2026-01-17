package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemc implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzemc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzemc zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzemc(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzema zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfcw zzc3 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc3;
        ViewGroup zza3 = ((zzcoq) this.zzc).zza();
        ViewGroup viewGroup = zza3;
        return new zzema(zzc2, zza2, zzc3, zza3);
    }
}
