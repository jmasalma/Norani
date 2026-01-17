package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzafo implements zzafj {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzafo(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzafo zzb(zzen zzen) {
        int zzi = zzen.zzi();
        zzen.zzM(8);
        int zzi2 = zzen.zzi();
        int zzi3 = zzen.zzi();
        zzen.zzM(4);
        int zzi4 = zzen.zzi();
        zzen.zzM(12);
        return new zzafo(zzi, zzi2, zzi3, zzi4);
    }

    public final int zza() {
        return 1751742049;
    }
}
