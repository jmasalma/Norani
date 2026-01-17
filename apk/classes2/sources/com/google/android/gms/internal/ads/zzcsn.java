package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcsn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcsn(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcsn zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcsn(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzw zza2 = ((zzcic) this.zzb).zzb();
        zzbzw zzbzw = zza2;
        zzfcw zzc2 = ((zzcvp) this.zzc).zzc();
        zzfcw zzfcw = zzc2;
        zzbzl zzc3 = zza2.zzc((Clock) this.zza.zzb(), zzc2.zzf);
        zzbzl zzbzl = zzc3;
        return zzc3;
    }
}
