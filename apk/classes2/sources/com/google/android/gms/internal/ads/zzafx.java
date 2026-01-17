package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzafx implements zzadf {
    private final zzaeg zza;
    private final int zzb;
    private final zzaeb zzc = new zzaeb();

    /* synthetic */ zzafx(zzaeg zzaeg, int i, zzafy zzafy) {
        this.zza = zzaeg;
        this.zzb = i;
    }

    private final long zzc(zzadw zzadw) throws IOException {
        while (zzadw.zze() < zzadw.zzd() - 6) {
            zzaeg zzaeg = this.zza;
            int i = this.zzb;
            zzaeb zzaeb = this.zzc;
            long zze = zzadw.zze();
            byte[] bArr = new byte[2];
            zzadw.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzadw.zzj();
                zzadw.zzg((int) (zze - zzadw.zzf()));
            } else {
                zzen zzen = new zzen(16);
                System.arraycopy(bArr, 0, zzen.zzN(), 0, 2);
                zzen.zzK(zzadz.zzb(zzadw, zzen.zzN(), 2, 14));
                zzadw.zzj();
                zzadw.zzg((int) (zze - zzadw.zzf()));
                if (zzaec.zzc(zzen, zzaeg, i, zzaeb)) {
                    break;
                }
            }
            zzadw.zzg(1);
        }
        if (zzadw.zze() < zzadw.zzd() - 6) {
            return this.zzc.zza;
        }
        zzadw.zzg((int) (zzadw.zzd() - zzadw.zze()));
        return this.zza.zzj;
    }

    public final zzade zza(zzadw zzadw, long j) throws IOException {
        long zzf = zzadw.zzf();
        long zzc2 = zzc(zzadw);
        long zze = zzadw.zze();
        zzadw.zzg(Math.max(6, this.zza.zzc));
        int i = (zzc2 > j ? 1 : (zzc2 == j ? 0 : -1));
        long zzc3 = zzc(zzadw);
        long zze2 = zzadw.zze();
        if (i > 0 || zzc3 <= j) {
            return zzc3 <= j ? zzade.zzf(zzc3, zze2) : zzade.zzd(zzc2, zzf);
        }
        return zzade.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}
