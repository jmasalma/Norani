package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepc implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzepc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzepc zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzepc(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzepa zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc3;
        return new zzepa(zzc2, (zzdqe) this.zza.zzb(), zzc3, (String) this.zzc.zzb());
    }
}
