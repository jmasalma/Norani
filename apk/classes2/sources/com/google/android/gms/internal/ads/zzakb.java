package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzakb {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[KotlinVersion.MAX_COMPONENT_VALUE];
    private final zzen zzg = new zzen((int) KotlinVersion.MAX_COMPONENT_VALUE);

    zzakb() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzadw zzadw, boolean z) throws IOException {
        zza();
        zzen zzen = this.zzg;
        zzen.zzI(27);
        if (zzadz.zzd(zzadw, zzen.zzN(), 0, 27, z) && zzen.zzu() == 1332176723) {
            if (zzen.zzm() == 0) {
                this.zza = zzen.zzm();
                this.zzb = zzen.zzr();
                zzen.zzs();
                zzen.zzs();
                zzen.zzs();
                int zzm = zzen.zzm();
                this.zzc = zzm;
                this.zzd = zzm + 27;
                zzen.zzI(zzm);
                if (zzadz.zzd(zzadw, zzen.zzN(), 0, this.zzc, z)) {
                    for (int i = 0; i < this.zzc; i++) {
                        int[] iArr = this.zzf;
                        int zzm2 = zzen.zzm();
                        iArr[i] = zzm2;
                        this.zze += zzm2;
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw zzaz.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean zzc(zzadw zzadw, long j) throws IOException {
        int i;
        zzdd.zzd(zzadw.zzf() == zzadw.zze());
        zzen zzen = this.zzg;
        zzen.zzI(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || zzadw.zzf() + 4 < j) && zzadz.zzd(zzadw, zzen.zzN(), 0, 4, true)) {
                zzen.zzL(0);
                if (zzen.zzu() == 1332176723) {
                    zzadw.zzj();
                    return true;
                }
                zzadw.zzk(1);
            }
        }
        do {
            if ((i != 0 && zzadw.zzf() >= j) || zzadw.zzc(1) == -1) {
                return false;
            }
            break;
        } while (zzadw.zzc(1) == -1);
        return false;
    }
}
