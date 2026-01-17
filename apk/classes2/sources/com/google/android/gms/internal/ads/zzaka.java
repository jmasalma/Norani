package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaka {
    private final zzakb zza = new zzakb();
    private final zzen zzb = new zzen(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzaka() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzakb zzakb = this.zza;
            if (i5 >= zzakb.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzakb.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzen zza() {
        return this.zzb;
    }

    public final zzakb zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzen zzen = this.zzb;
        if (zzen.zzN().length != 65025) {
            zzen.zzJ(Arrays.copyOf(zzen.zzN(), Math.max(65025, zzen.zzd())), zzen.zzd());
        }
    }

    public final boolean zze(zzadw zzadw) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while (true) {
            boolean z = true;
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                zzakb zzakb = this.zza;
                if (!zzakb.zzc(zzadw, -1) || !zzakb.zzb(zzadw, true)) {
                    return false;
                }
                int i2 = zzakb.zzd;
                if ((zzakb.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzadz.zzf(zzadw, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzen zzen = this.zzb;
                zzen.zzF(zzen.zzd() + zzf);
                if (!zzadz.zze(zzadw, zzen.zzN(), zzen.zzd(), zzf)) {
                    return false;
                }
                zzen.zzK(zzen.zzd() + zzf);
                if (this.zza.zzf[i3 - 1] == 255) {
                    z = false;
                }
                this.zze = z;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
        return false;
    }
}
