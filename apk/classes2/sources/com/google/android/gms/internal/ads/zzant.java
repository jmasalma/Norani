package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzant implements zzaoo {
    private final zzamz zza;
    private final zzem zzb = new zzem(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzeu zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzant(zzamz zzamz) {
        this.zza = zzamz;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzen zzen, byte[] bArr, int i) {
        int min = Math.min(zzen.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzen.zzM(min);
        } else {
            zzen.zzH(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public final void zza(zzen zzen, int i) throws zzaz {
        int i2;
        int i3;
        int i4;
        zzen zzen2;
        boolean z;
        int i5;
        int i6;
        int i7;
        long j;
        zzen zzen3 = zzen;
        zzdd.zzb(this.zze);
        int i8 = -1;
        int i9 = 2;
        boolean z2 = false;
        int i10 = 1;
        if ((i & 1) != 0) {
            int i11 = this.zzc;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 != 2) {
                    int i12 = this.zzj;
                    if (i12 != -1) {
                        zzea.zzf("PesReader", "Unexpected start indicator: expected " + i12 + " more bytes");
                    }
                    this.zza.zzc(zzen.zzd() == 0);
                } else {
                    zzea.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i13 = i;
        while (zzen.zza() > 0) {
            int i14 = this.zzc;
            if (i14 == 0) {
                i2 = i13;
                i3 = i9;
                z = z2;
                i4 = i10;
                zzen2 = zzen3;
                i5 = i8;
                zzen2.zzM(zzen.zza());
            } else if (i14 == i10) {
                i2 = i13;
                zzem zzem = this.zzb;
                zzen2 = zzen;
                if (zzf(zzen2, zzem.zza, 9)) {
                    z = false;
                    zzem.zzl(0);
                    int zzd2 = zzem.zzd(24);
                    i4 = 1;
                    if (zzd2 != 1) {
                        zzea.zzf("PesReader", "Unexpected start code prefix: " + zzd2);
                        i5 = -1;
                        this.zzj = -1;
                        i6 = 0;
                        i3 = 2;
                    } else {
                        zzem.zzn(8);
                        int zzd3 = zzem.zzd(16);
                        zzem.zzn(5);
                        this.zzk = zzem.zzp();
                        i3 = 2;
                        zzem.zzn(2);
                        this.zzf = zzem.zzp();
                        this.zzg = zzem.zzp();
                        zzem.zzn(6);
                        int zzd4 = zzem.zzd(8);
                        this.zzi = zzd4;
                        if (zzd3 == 0) {
                            this.zzj = -1;
                            i5 = -1;
                        } else {
                            int i15 = (zzd3 - 3) - zzd4;
                            this.zzj = i15;
                            if (i15 < 0) {
                                zzea.zzf("PesReader", "Found negative packet payload size: " + i15);
                                i5 = -1;
                                this.zzj = -1;
                            } else {
                                i5 = -1;
                            }
                        }
                        i6 = 2;
                    }
                    zze(i6);
                } else {
                    i5 = -1;
                    z = false;
                    i4 = 1;
                    i3 = 2;
                }
            } else if (i14 != i9) {
                int zza2 = zzen.zza();
                int i16 = this.zzj;
                int i17 = i16 == i8 ? z2 : zza2 - i16;
                if (i17 > 0) {
                    zza2 -= i17;
                    zzen3.zzK(zzen.zzc() + zza2);
                }
                zzamz zzamz = this.zza;
                zzamz.zza(zzen3);
                int i18 = this.zzj;
                if (i18 != i8) {
                    int i19 = i18 - zza2;
                    this.zzj = i19;
                    if (i19 == 0) {
                        zzamz.zzc(z2);
                        zze(i10);
                    }
                }
                i2 = i13;
                i3 = i9;
                z = z2;
                i4 = i10;
                zzen2 = zzen3;
                i5 = i8;
            } else {
                int min = Math.min(10, this.zzi);
                zzem zzem2 = this.zzb;
                if (!zzf(zzen3, zzem2.zza, min) || !zzf(zzen3, (byte[]) null, this.zzi)) {
                    i2 = i13;
                    i5 = i8;
                    i3 = i9;
                    z = z2;
                    i4 = i10;
                    zzen2 = zzen;
                } else {
                    zzem2.zzl(z2 ? 1 : 0);
                    if (this.zzf) {
                        zzem2.zzn(4);
                        long zzd5 = (long) zzem2.zzd(3);
                        zzem2.zzn(i10);
                        int zzd6 = zzem2.zzd(15) << 15;
                        zzem2.zzn(i10);
                        long zzd7 = (long) zzem2.zzd(15);
                        zzem2.zzn(i10);
                        if (this.zzh || !this.zzg) {
                            i7 = i13;
                        } else {
                            zzem2.zzn(4);
                            zzem2.zzn(i10);
                            zzem2.zzn(i10);
                            i7 = i13;
                            long zzd8 = (long) zzem2.zzd(15);
                            zzem2.zzn(i10);
                            this.zze.zzb(zzd8 | ((long) (zzem2.zzd(15) << 15)) | (((long) zzem2.zzd(3)) << 30));
                            this.zzh = true;
                        }
                        j = this.zze.zzb((zzd5 << 30) | ((long) zzd6) | zzd7);
                    } else {
                        i7 = i13;
                        j = -9223372036854775807L;
                    }
                    int i20 = i7 | (true != this.zzk ? 0 : 4);
                    this.zza.zzd(j, i20);
                    zze(3);
                    zzen3 = zzen;
                    i13 = i20;
                    i8 = -1;
                    i9 = 2;
                    z2 = false;
                    i10 = 1;
                }
            }
            i8 = i5;
            zzen3 = zzen2;
            i10 = i4;
            i9 = i3;
            z2 = z;
            i13 = i2;
        }
    }

    public final void zzb(zzeu zzeu, zzady zzady, zzaon zzaon) {
        this.zze = zzeu;
        this.zza.zzb(zzady, zzaon);
    }

    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
