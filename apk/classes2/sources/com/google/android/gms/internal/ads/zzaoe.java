package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaoe implements zzadf {
    private final zzeu zza;
    private final zzen zzb = new zzen();
    private final int zzc;

    public zzaoe(int i, zzeu zzeu, int i2) {
        this.zzc = i;
        this.zza = zzeu;
    }

    public final zzade zza(zzadw zzadw, long j) throws IOException {
        int zza2;
        int i;
        long zzf = zzadw.zzf();
        int min = (int) Math.min(112800, zzadw.zzd() - zzf);
        zzen zzen = this.zzb;
        zzen.zzI(min);
        zzadw.zzh(zzen.zzN(), 0, min);
        int zzd = zzen.zzd();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzen.zza() >= 188 && (i = zza2 + 188) <= zzd) {
            long zzb2 = zzaop.zzb(zzen, (zza2 = zzaop.zza(zzen.zzN(), zzen.zzc(), zzd)), this.zzc);
            if (zzb2 != -9223372036854775807L) {
                long zzb3 = this.zza.zzb(zzb2);
                if (zzb3 <= j) {
                    j4 = (long) zza2;
                    if (100000 + zzb3 <= j) {
                        j3 = zzb3;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzade.zzd(zzb3, zzf);
                }
                return zzade.zze(zzf + j4);
            }
            zzen.zzL(i);
            j2 = (long) i;
        }
        return j3 != -9223372036854775807L ? zzade.zzf(j3, zzf + j2) : zzade.zza;
    }

    public final void zzb() {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
