package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaog {
    private final zzeu zza = new zzeu(0);
    private final zzen zzb = new zzen();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzaog(int i) {
    }

    private final int zze(zzadw zzadw) {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzadw.zzj();
        return 0;
    }

    public final int zza(zzadw zzadw, zzaer zzaer, int i) throws IOException {
        if (i <= 0) {
            zze(zzadw);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzadw.zzd();
            int min = (int) Math.min(112800, zzd2);
            long j2 = zzd2 - ((long) min);
            if (zzadw.zzf() != j2) {
                zzaer.zza = j2;
            } else {
                zzen zzen = this.zzb;
                zzen.zzI(min);
                zzadw.zzj();
                zzadw.zzh(zzen.zzN(), 0, min);
                int zzc2 = zzen.zzc();
                int zzd3 = zzen.zzd();
                int i2 = zzd3 - 188;
                while (true) {
                    if (i2 < zzc2) {
                        break;
                    }
                    byte[] zzN = zzen.zzN();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzc2 || i5 >= zzd3 || zzN[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb2 = zzaop.zzb(zzen, i2, i);
                                if (zzb2 != -9223372036854775807L) {
                                    j = zzb2;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzadw);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800, zzadw.zzd());
            if (zzadw.zzf() != 0) {
                zzaer.zza = 0;
            } else {
                zzen zzen2 = this.zzb;
                zzen2.zzI(min2);
                zzadw.zzj();
                zzadw.zzh(zzen2.zzN(), 0, min2);
                int zzc3 = zzen2.zzc();
                int zzd4 = zzen2.zzd();
                while (true) {
                    if (zzc3 >= zzd4) {
                        break;
                    }
                    if (zzen2.zzN()[zzc3] == 71) {
                        long zzb3 = zzaop.zzb(zzen2, zzc3, i);
                        if (zzb3 != -9223372036854775807L) {
                            j = zzb3;
                            break;
                        }
                    }
                    zzc3++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzadw);
                return 0;
            }
            zzeu zzeu = this.zza;
            this.zzh = zzeu.zzc(this.zzg) - zzeu.zzb(j3);
            zze(zzadw);
            return 0;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
