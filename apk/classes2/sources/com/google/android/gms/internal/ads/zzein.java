package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzein implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzein(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzein zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzein(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeim zzb() {
        return new zzeim((zzejq) this.zza.zzb(), (zzdpz) this.zzb.zzb());
    }
}
