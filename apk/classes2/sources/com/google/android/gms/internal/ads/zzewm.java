package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewm implements zzhgr {
    private final zzewi zza;

    private zzewm(zzewi zzewi) {
        this.zza = zzewi;
    }

    public static zzewm zza(zzewi zzewi) {
        return new zzewm(zzewi);
    }

    public static boolean zzd(zzewi zzewi) {
        return zzewi.zzj();
    }

    /* renamed from: zzc */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzj());
    }
}
