package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzanu implements zzadf {
    private final zzeu zza;
    private final zzen zzb = new zzen();

    /* synthetic */ zzanu(zzeu zzeu, zzanv zzanv) {
        this.zza = zzeu;
    }

    public final zzade zza(zzadw zzadw, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzadw.zzf();
        int min = (int) Math.min(20000, zzadw.zzd() - zzf);
        zzen zzen = this.zzb;
        zzen.zzI(min);
        zzadw.zzh(zzen.zzN(), 0, min);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (zzen.zza() >= 4) {
            if (zzanw.zzh(zzen.zzN(), zzen.zzc()) != 442) {
                zzen.zzM(1);
            } else {
                zzen.zzM(4);
                long zzc = zzanx.zzc(zzen);
                if (zzc != -9223372036854775807L) {
                    long zzb2 = this.zza.zzb(zzc);
                    if (zzb2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzade.zzd(zzb2, zzf);
                        }
                        j2 = (long) i2;
                    } else if (100000 + zzb2 > j) {
                        j2 = (long) zzen.zzc();
                    } else {
                        i2 = zzen.zzc();
                        j3 = zzb2;
                    }
                    return zzade.zze(zzf + j2);
                }
                int zzd = zzen.zzd();
                if (zzen.zza() >= 10) {
                    zzen.zzM(9);
                    int zzm = zzen.zzm() & 7;
                    if (zzen.zza() >= zzm) {
                        zzen.zzM(zzm);
                        if (zzen.zza() >= 4) {
                            if (zzanw.zzh(zzen.zzN(), zzen.zzc()) == 443) {
                                zzen.zzM(4);
                                int zzq = zzen.zzq();
                                if (zzen.zza() < zzq) {
                                    zzen.zzL(zzd);
                                } else {
                                    zzen.zzM(zzq);
                                }
                            }
                            while (true) {
                                if (zzen.zza() < 4 || (zzh = zzanw.zzh(zzen.zzN(), zzen.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzen.zzM(4);
                                if (zzen.zza() < 2) {
                                    zzen.zzL(zzd);
                                    break;
                                }
                                zzen.zzL(Math.min(zzen.zzd(), zzen.zzc() + zzen.zzq()));
                            }
                        } else {
                            zzen.zzL(zzd);
                        }
                    } else {
                        zzen.zzL(zzd);
                    }
                } else {
                    zzen.zzL(zzd);
                }
                i = zzen.zzc();
            }
        }
        return j3 != -9223372036854775807L ? zzade.zzf(j3, zzf + ((long) i)) : zzade.zza;
    }

    public final void zzb() {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
