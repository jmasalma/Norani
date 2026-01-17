package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzanx {
    private final zzeu zza = new zzeu(0);
    private final zzen zzb = new zzen();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzanx() {
    }

    public static long zzc(zzen zzen) {
        zzen zzen2 = zzen;
        int zzc2 = zzen.zzc();
        if (zzen.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzen2.zzH(bArr, 0, 9);
        zzen2.zzL(zzc2);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) b;
        long j2 = (long) bArr[1];
        long j3 = (long) b2;
        long j4 = (j2 & 255) << 20;
        long j5 = (j3 & 3) << 13;
        long j6 = j5 | j4 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (((248 & j3) >> 3) << 15);
        return j6 | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    private final int zzf(zzadw zzadw) {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzadw.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzadw zzadw, zzaer zzaer) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzadw.zzd();
            int min = (int) Math.min(20000, zzd2);
            long j2 = zzd2 - ((long) min);
            if (zzadw.zzf() != j2) {
                zzaer.zza = j2;
                return 1;
            }
            zzen zzen = this.zzb;
            zzen.zzI(min);
            zzadw.zzj();
            zzadw.zzh(zzen.zzN(), 0, min);
            int zzc2 = zzen.zzc();
            int zzd3 = zzen.zzd() - 4;
            while (true) {
                if (zzd3 < zzc2) {
                    break;
                }
                if (zzg(zzen.zzN(), zzd3) == 442) {
                    zzen.zzL(zzd3 + 4);
                    long zzc3 = zzc(zzen);
                    if (zzc3 != -9223372036854775807L) {
                        j = zzc3;
                        break;
                    }
                }
                zzd3--;
            }
            this.zzg = j;
            this.zze = true;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzadw);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000, zzadw.zzd());
            if (zzadw.zzf() != 0) {
                zzaer.zza = 0;
                return 1;
            }
            zzen zzen2 = this.zzb;
            zzen2.zzI(min2);
            zzadw.zzj();
            zzadw.zzh(zzen2.zzN(), 0, min2);
            int zzc4 = zzen2.zzc();
            int zzd4 = zzen2.zzd();
            while (true) {
                if (zzc4 >= zzd4 - 3) {
                    break;
                }
                if (zzg(zzen2.zzN(), zzc4) == 442) {
                    zzen2.zzL(zzc4 + 4);
                    long zzc5 = zzc(zzen2);
                    if (zzc5 != -9223372036854775807L) {
                        j = zzc5;
                        break;
                    }
                }
                zzc4++;
            }
            this.zzf = j;
            this.zzd = true;
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzadw);
                return 0;
            }
            zzeu zzeu = this.zza;
            this.zzh = zzeu.zzc(this.zzg) - zzeu.zzb(j3);
            zzf(zzadw);
            return 0;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
