package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzemj(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzemj zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzemj(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzemh zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zza).zzc();
        zzfcw zzfcw = zzc3;
        return new zzemh(zzc2, zzc3, (zzfdl) this.zzb.zzb(), ((Integer) this.zzc.zzb()).intValue());
    }
}
