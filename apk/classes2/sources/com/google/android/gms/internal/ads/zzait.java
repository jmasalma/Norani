package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzait implements zzaiq {
    private final int zza;
    private final int zzb;
    private final zzen zzc;

    public zzait(zzfd zzfd, zzz zzz) {
        zzen zzen = zzfd.zza;
        this.zzc = zzen;
        zzen.zzL(12);
        int zzp = zzen.zzp();
        if ("audio/raw".equals(zzz.zzo)) {
            int zzk = zzex.zzk(zzz.zzI) * zzz.zzG;
            if (zzp == 0 || zzp % zzk != 0) {
                zzea.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzp);
                zzp = zzk;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzen.zzp();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
