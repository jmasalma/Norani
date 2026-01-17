package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgxf {
    private final zzgxe zza;

    private zzgxf(zzgxe zzgxe) {
        this.zza = zzgxe;
    }

    public static zzgxf zzb(byte[] bArr, zzgfn zzgfn) {
        return new zzgxf(zzgxe.zzb(bArr));
    }

    public static zzgxf zzc(int i) {
        return new zzgxf(zzgxe.zzb(zzgpa.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgfn zzgfn) {
        return this.zza.zzd();
    }
}
