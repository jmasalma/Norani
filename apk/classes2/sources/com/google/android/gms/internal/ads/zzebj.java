package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzebj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzebj(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzebj zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzebj(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzebi zzb() {
        zzeba zza2 = ((zzebb) this.zzb).zzb();
        zzeba zzeba = zza2;
        return new zzebi((zzeaw) this.zza.zzb(), zza2);
    }
}
