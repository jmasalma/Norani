package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamv implements zzamz {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzem zzc = new zzem(new byte[7], 7);
    private final zzen zzd = new zzen(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzafb zzi;
    private zzafb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp = -1;
    private int zzq = -1;
    private int zzr;
    private boolean zzs;
    private long zzt = -9223372036854775807L;
    private int zzu;
    private long zzv = -9223372036854775807L;
    private zzafb zzw;
    private long zzx;

    public zzamv(boolean z, String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzh();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzh();
    }

    private final void zzh() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzi() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private final void zzj(zzafb zzafb, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzafb;
        this.zzx = j;
        this.zzu = i2;
    }

    private final boolean zzk(zzen zzen, byte[] bArr, int i) {
        int min = Math.min(zzen.zza(), i - this.zzl);
        zzen.zzH(bArr, this.zzl, min);
        int i2 = this.zzl + min;
        this.zzl = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzen zzen, byte[] bArr, int i) {
        if (zzen.zza() < i) {
            return false;
        }
        zzen.zzH(bArr, 0, i);
        return true;
    }

    public final void zza(zzen zzen) throws zzaz {
        int i;
        byte b;
        char c;
        boolean z;
        char c2;
        int i2;
        int i3;
        zzen zzen2 = zzen;
        this.zzi.getClass();
        String str = zzex.zza;
        while (zzen.zza() > 0) {
            int i4 = this.zzk;
            char c3 = 7;
            boolean z2 = false;
            int i5 = 2;
            if (i4 == 0) {
                byte[] zzN = zzen.zzN();
                int zzc2 = zzen.zzc();
                int zzd2 = zzen.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzen2.zzL(zzc2);
                        break;
                    }
                    i = zzc2 + 1;
                    b = zzN[zzc2];
                    byte b2 = b & 255;
                    if (this.zzm == 512 && zzl((byte) -1, (byte) b2)) {
                        if (this.zzo) {
                            break;
                        }
                        int i6 = zzc2 - 1;
                        zzen2.zzL(zzc2);
                        zzem zzem = this.zzc;
                        if (zzm(zzen2, zzem.zza, 1)) {
                            zzem.zzl(4);
                            int zzd3 = zzem.zzd(1);
                            int i7 = this.zzp;
                            if (i7 == -1 || zzd3 == i7) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzen2, zzem.zza, 1)) {
                                        break;
                                    }
                                    zzem.zzl(i5);
                                    if (zzem.zzd(4) == this.zzq) {
                                        zzen2.zzL(zzc2 + 1);
                                    }
                                }
                                if (!zzm(zzen2, zzem.zza, 4)) {
                                    break;
                                }
                                zzem.zzl(14);
                                int zzd4 = zzem.zzd(13);
                                c = 7;
                                if (zzd4 >= 7) {
                                    byte[] zzN2 = zzen.zzN();
                                    int zzd5 = zzen.zzd();
                                    int i8 = i6 + zzd4;
                                    if (i8 < zzd5) {
                                        byte b3 = zzN2[i8];
                                        if (b3 != -1) {
                                            if (b3 == 73) {
                                                int i9 = i8 + 1;
                                                if (i9 != zzd5) {
                                                    if (zzN2[i9] == 68) {
                                                        int i10 = i8 + 2;
                                                        if (i10 != zzd5) {
                                                            if (zzN2[i10] == 51) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            int i11 = i8 + 1;
                                            if (i11 == zzd5) {
                                                break;
                                            }
                                            byte b4 = zzN2[i11];
                                            if (zzl((byte) -1, b4) && ((b4 & 8) >> 3) == zzd3) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c = 7;
                    } else {
                        c = c3;
                    }
                    int i12 = this.zzm;
                    byte b5 = i12 | b2;
                    if (b5 == 329) {
                        i2 = 2;
                        c2 = 3;
                        z = false;
                        i3 = 768;
                    } else if (b5 == 511) {
                        i2 = 2;
                        c2 = 3;
                        z = false;
                        i3 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                    } else if (b5 != 836) {
                        if (b5 == 1075) {
                            this.zzk = 2;
                            this.zzl = 3;
                            this.zzu = 0;
                            this.zzd.zzL(0);
                            zzen2.zzL(i);
                            break;
                        } else if (i12 != 256) {
                            this.zzm = 256;
                            c3 = c;
                            i5 = 2;
                        } else {
                            i2 = 2;
                            c2 = 3;
                            z = false;
                            boolean z3 = z;
                            zzc2 = i;
                            char c4 = c2;
                            c3 = c;
                            i5 = i2;
                        }
                    } else {
                        i2 = 2;
                        c2 = 3;
                        z = false;
                        i3 = 1024;
                    }
                    this.zzm = i3;
                    boolean z32 = z;
                    zzc2 = i;
                    char c42 = c2;
                    c3 = c;
                    i5 = i2;
                }
                this.zzr = (b & 8) >> 3;
                this.zzn = 1 == ((b & 1) ^ 1);
                if (!this.zzo) {
                    this.zzk = 1;
                    this.zzl = 0;
                } else {
                    zzi();
                }
                zzen2.zzL(i);
            } else if (i4 != 1) {
                if (i4 == 2) {
                    zzen zzen3 = this.zzd;
                    if (zzk(zzen2, zzen3.zzN(), 10)) {
                        this.zzj.zzr(zzen3, 10);
                        zzen3.zzL(6);
                        zzj(this.zzj, 0, 10, zzen3.zzl() + 10);
                    }
                } else if (i4 != 3) {
                    int min = Math.min(zzen.zza(), this.zzu - this.zzl);
                    this.zzw.zzr(zzen2, min);
                    int i13 = this.zzl + min;
                    this.zzl = i13;
                    if (i13 == this.zzu) {
                        if (this.zzv != -9223372036854775807L) {
                            z2 = true;
                        }
                        zzdd.zzf(z2);
                        this.zzw.zzt(this.zzv, 1, this.zzu, 0, (zzafa) null);
                        this.zzv += this.zzx;
                        zzh();
                    }
                } else {
                    int i14 = true != this.zzn ? 5 : 7;
                    zzem zzem2 = this.zzc;
                    if (zzk(zzen2, zzem2.zza, i14)) {
                        zzem2.zzl(0);
                        if (!this.zzs) {
                            int zzd6 = zzem2.zzd(2) + 1;
                            if (zzd6 != 2) {
                                zzea.zzf("AdtsReader", "Detected audio object type: " + zzd6 + ", but assuming AAC LC.");
                            }
                            zzem2.zzn(5);
                            int zzd7 = zzem2.zzd(3);
                            int i15 = this.zzq;
                            int i16 = zzacr.zza;
                            byte[] bArr = {(byte) (((i15 >> 1) & 7) | 16), (byte) (((zzd7 << 3) & 120) | ((i15 << 7) & 128))};
                            zzacp zza2 = zzacr.zza(bArr);
                            zzx zzx2 = new zzx();
                            zzx2.zzS(this.zzh);
                            zzx2.zzG(this.zzg);
                            zzx2.zzah("audio/mp4a-latm");
                            zzx2.zzE(zza2.zzc);
                            zzx2.zzD(zza2.zzb);
                            zzx2.zzai(zza2.zza);
                            zzx2.zzT(Collections.singletonList(bArr));
                            zzx2.zzW(this.zze);
                            zzx2.zzaf(this.zzf);
                            zzz zzan = zzx2.zzan();
                            this.zzt = 1024000000 / ((long) zzan.zzH);
                            this.zzi.zzm(zzan);
                            this.zzs = true;
                        } else {
                            zzem2.zzn(10);
                        }
                        zzem2.zzn(4);
                        int zzd8 = zzem2.zzd(13);
                        zzj(this.zzi, this.zzt, 0, this.zzn ? zzd8 - 9 : zzd8 - 7);
                    }
                }
            } else if (zzen.zza() != 0) {
                zzem zzem3 = this.zzc;
                zzem3.zza[0] = zzen.zzN()[zzen.zzc()];
                zzem3.zzl(2);
                int zzd9 = zzem3.zzd(4);
                int i17 = this.zzq;
                if (i17 == -1 || zzd9 == i17) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzd9;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzh = zzaon.zzb();
        zzafb zzw2 = zzady.zzw(zzaon.zza(), 1);
        this.zzi = zzw2;
        this.zzw = zzw2;
        if (this.zzb) {
            zzaon.zzc();
            zzafb zzw3 = zzady.zzw(zzaon.zza(), 5);
            this.zzj = zzw3;
            zzx zzx2 = new zzx();
            zzx2.zzS(zzaon.zzb());
            zzx2.zzG(this.zzg);
            zzx2.zzah("application/id3");
            zzw3.zzm(zzx2.zzan());
            return;
        }
        this.zzj = new zzadr();
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzv = j;
    }

    public final void zze() {
        this.zzv = -9223372036854775807L;
        zzg();
    }
}
