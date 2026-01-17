package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzanm implements zzamz {
    private final String zza = "video/mp2t";
    private final zzen zzb = new zzen(new byte[15], 2);
    private final zzem zzc = new zzem();
    private final zzen zzd = new zzen();
    private int zze = 0;
    private String zzf;
    private zzafb zzg;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;
    private boolean zzj;
    private boolean zzk = true;
    private int zzl;
    private int zzm;
    private boolean zzn = true;
    private int zzo;
    private int zzp;
    private final zzann zzq = new zzann();
    private int zzr = -2147483647;
    private int zzs = -1;
    private int zzt;
    private long zzu = -1;
    private boolean zzv;

    public zzanm(String str) {
    }

    private static final void zzf(zzen zzen, zzen zzen2, boolean z) {
        int zzc2 = zzen.zzc();
        int min = Math.min(zzen.zza(), zzen2.zza());
        zzen.zzH(zzen2.zzN(), zzen2.zzc(), min);
        zzen2.zzM(min);
        if (z) {
            zzen.zzL(zzc2);
        }
    }

    public final void zza(zzen zzen) throws zzaz {
        int i;
        zzdd.zzb(this.zzg);
        while (zzen.zza() > 0) {
            int i2 = this.zze;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) == 0) {
                    zzen.zzL(zzen.zzd());
                } else {
                    if ((i4 & 4) == 0) {
                        while (true) {
                            if (zzen.zza() <= 0) {
                                break;
                            }
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int zzm2 = i5 | zzen.zzm();
                            this.zzm = zzm2;
                            if ((zzm2 & 16777215) == 12583333) {
                                zzen.zzL(zzen.zzc() - 3);
                                this.zzm = 0;
                                break;
                            }
                        }
                    }
                    this.zze = 1;
                }
            } else if (i2 != 1) {
                zzann zzann = this.zzq;
                int i6 = zzann.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzen, this.zzd, true);
                }
                int min = Math.min(zzen.zza(), zzann.zzc - this.zzo);
                this.zzg.zzr(zzen, min);
                int i7 = this.zzo + min;
                this.zzo = i7;
                if (i7 == zzann.zzc) {
                    int i8 = zzann.zza;
                    if (i8 == 1) {
                        byte[] zzN = this.zzd.zzN();
                        zzano zza2 = zzanq.zza(new zzem(zzN, zzN.length));
                        this.zzr = zza2.zzb;
                        this.zzs = zza2.zzc;
                        long j = this.zzu;
                        long j2 = zzann.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zza2.zza;
                            String str = "mhm1";
                            if (i9 != -1) {
                                str = str.concat(String.valueOf(String.format(".%02X", new Object[]{Integer.valueOf(i9)})));
                            }
                            byte[] bArr = zza2.zzd;
                            zzfyq zzfyq = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfyq = zzfyq.zzp(zzex.zzb, bArr);
                            }
                            zzx zzx = new zzx();
                            zzx.zzS(this.zzf);
                            zzx.zzG(this.zza);
                            zzx.zzah("audio/mhm1");
                            zzx.zzai(this.zzr);
                            zzx.zzE(str);
                            zzx.zzT(zzfyq);
                            this.zzg.zzm(zzx.zzan());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] zzN2 = this.zzd.zzN();
                        zzem zzem = new zzem(zzN2, zzN2.length);
                        if (zzem.zzp()) {
                            zzem.zzn(2);
                            i3 = zzem.zzd(13);
                        }
                        this.zzt = i3;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = (double) this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (((double) i10) * 1000000.0d) / d;
                        }
                        this.zzg.zzt(round, i, this.zzp, 0, (zzafa) null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzen zzen2 = this.zzb;
                zzf(zzen, zzen2, false);
                if (zzen2.zza() == 0) {
                    zzem zzem2 = this.zzc;
                    int zzd2 = zzen2.zzd();
                    zzem2.zzk(zzen2.zzN(), zzd2);
                    zzann zzann2 = this.zzq;
                    if (zzanq.zzb(zzem2, zzann2)) {
                        this.zzo = 0;
                        this.zzp += zzann2.zzc + zzd2;
                        zzen2.zzL(0);
                        this.zzg.zzr(zzen2, zzen2.zzd());
                        zzen2.zzI(2);
                        this.zzd.zzI(zzann2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzen2.zzd() < 15) {
                        zzen2.zzK(zzen2.zzd() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzf = zzaon.zzb();
        this.zzg = zzady.zzw(zzaon.zza(), 1);
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = (double) j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    public final void zze() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zzI(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }
}
