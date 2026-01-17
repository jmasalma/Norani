package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeat implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeat(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeat zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeat(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeas zzb() {
        zzeao zza2 = ((zzeap) this.zza).zzb();
        zzeao zzeao = zza2;
        return new zzeas(zza2, (zzgdy) this.zzb.zzb());
    }
}
