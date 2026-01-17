package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaga implements zzadv {
    private final byte[] zza;
    private final zzen zzb;
    private final zzaeb zzc;
    private zzady zzd;
    private zzafb zze;
    private int zzf;
    private zzav zzg;
    private zzaeg zzh;
    private int zzi;
    private int zzj;
    private zzafz zzk;
    private int zzl;
    private long zzm;

    public zzaga() {
        throw null;
    }

    public zzaga(int i) {
        this.zza = new byte[42];
        this.zzb = new zzen(new byte[32768], 0);
        this.zzc = new zzaeb();
        this.zzf = 0;
    }

    private final long zza(zzen zzen, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzc2 = zzen.zzc();
        while (zzc2 <= zzen.zzd() - 16) {
            zzen.zzL(zzc2);
            zzaeg zzaeg = this.zzh;
            int i = this.zzj;
            zzaeb zzaeb = this.zzc;
            if (zzaec.zzc(zzen, zzaeg, i, zzaeb)) {
                zzen.zzL(zzc2);
                return zzaeb.zza;
            }
            zzc2++;
        }
        if (z) {
            while (zzc2 <= zzen.zzd() - this.zzi) {
                zzen.zzL(zzc2);
                try {
                    z2 = zzaec.zzc(zzen, this.zzh, this.zzj, this.zzc);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzen.zzc() <= zzen.zzd() && z2) {
                    zzen.zzL(zzc2);
                    return this.zzc.zza;
                }
                zzc2++;
            }
            zzen.zzL(zzen.zzd());
            return -1;
        }
        zzen.zzL(zzc2);
        return -1;
    }

    private final void zzg() {
        zzaeg zzaeg = this.zzh;
        String str = zzex.zza;
        zzaeg zzaeg2 = zzaeg;
        long j = (this.zzm * 1000000) / ((long) zzaeg.zze);
        zzafb zzafb = this.zze;
        zzafb zzafb2 = zzafb;
        zzafb.zzt(j, 1, this.zzl, 0, (zzafa) null);
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzd = zzady;
        this.zze = zzady.zzw(0, 1);
        zzady.zzG();
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzaed.zza(zzadw, false);
        zzen zzen = new zzen(4);
        ((zzadl) zzadw).zzm(zzen.zzN(), 0, 4, false);
        if (zzen.zzu() == 1716281667) {
            return true;
        }
        return false;
    }

    public final void zzf(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzafz zzafz = this.zzk;
            if (zzafz != null) {
                zzafz.zzd(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.zzm = j3;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        boolean zzp;
        zzaeu zzaeu;
        zzadw zzadw2 = zzadw;
        int i = this.zzf;
        boolean z = true;
        if (i == 0) {
            zzadw.zzj();
            long zze2 = zzadw.zze();
            zzav zza2 = zzaed.zza(zzadw2, true);
            zzadw2.zzk((int) (zzadw.zze() - zze2));
            this.zzg = zza2;
            this.zzf = 1;
            return 0;
        } else if (i == 1) {
            zzadw2.zzh(this.zza, 0, 42);
            zzadw.zzj();
            this.zzf = 2;
            return 0;
        } else if (i == 2) {
            zzen zzen = new zzen(4);
            zzadw2.zzi(zzen.zzN(), 0, 4);
            if (zzen.zzu() == 1716281667) {
                this.zzf = 3;
                return 0;
            }
            throw zzaz.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            zzaeg zzaeg = this.zzh;
            do {
                zzadw.zzj();
                zzem zzem = new zzem(new byte[4], 4);
                zzadw2.zzh(zzem.zza, 0, 4);
                zzp = zzem.zzp();
                int zzd2 = zzem.zzd(7);
                int zzd3 = zzem.zzd(24) + 4;
                if (zzd2 == 0) {
                    byte[] bArr = new byte[38];
                    zzadw2.zzi(bArr, 0, 38);
                    zzaeg = new zzaeg(bArr, 4);
                } else if (zzaeg == null) {
                    throw new IllegalArgumentException();
                } else if (zzd2 == 3) {
                    zzen zzen2 = new zzen(zzd3);
                    zzadw2.zzi(zzen2.zzN(), 0, zzd3);
                    zzaeg = zzaeg.zzf(zzaed.zzb(zzen2));
                } else if (zzd2 == 4) {
                    zzen zzen3 = new zzen(zzd3);
                    zzadw2.zzi(zzen3.zzN(), 0, zzd3);
                    zzen3.zzM(4);
                    zzaeg = zzaeg.zzg(Arrays.asList(zzafh.zzc(zzen3, false, false).zza));
                } else if (zzd2 == 6) {
                    zzen zzen4 = new zzen(zzd3);
                    zzadw2.zzi(zzen4.zzN(), 0, zzd3);
                    zzen4.zzM(4);
                    zzaeg = zzaeg.zze(zzfyq.zzo(zzagt.zzb(zzen4)));
                } else {
                    zzadw2.zzk(zzd3);
                }
                String str = zzex.zza;
                zzaeg zzaeg2 = zzaeg;
                this.zzh = zzaeg;
            } while (!zzp);
            zzaeg.getClass();
            this.zzi = Math.max(zzaeg.zzc, 6);
            zzz zzc2 = this.zzh.zzc(this.zza, this.zzg);
            zzafb zzafb = this.zze;
            zzafb zzafb2 = zzafb;
            zzx zzb2 = zzc2.zzb();
            zzb2.zzG("audio/flac");
            zzafb.zzm(zzb2.zzan());
            zzafb zzafb3 = this.zze;
            zzafb zzafb4 = zzafb3;
            zzafb3.zzl(this.zzh.zza());
            this.zzf = 4;
            return 0;
        } else if (i != 4) {
            this.zze.getClass();
            zzaeg zzaeg3 = this.zzh;
            zzaeg3.getClass();
            zzafz zzafz = this.zzk;
            if (zzafz != null && zzafz.zze()) {
                return zzafz.zza(zzadw2, zzaer);
            }
            if (this.zzm == -1) {
                this.zzm = zzaec.zzb(zzadw2, zzaeg3);
                return 0;
            }
            zzen zzen5 = this.zzb;
            int zzd4 = zzen5.zzd();
            if (zzd4 < 32768) {
                int zza3 = zzadw2.zza(zzen5.zzN(), zzd4, 32768 - zzd4);
                if (zza3 != -1) {
                    z = false;
                }
                if (!z) {
                    zzen5.zzK(zzd4 + zza3);
                } else if (zzen5.zza() == 0) {
                    zzg();
                    return -1;
                }
            } else {
                z = false;
            }
            int zzc3 = zzen5.zzc();
            int i2 = this.zzl;
            int i3 = this.zzi;
            if (i2 < i3) {
                zzen5.zzM(Math.min(i3 - i2, zzen5.zza()));
            }
            long zza4 = zza(zzen5, z);
            int zzc4 = zzen5.zzc() - zzc3;
            zzen5.zzL(zzc3);
            this.zze.zzr(zzen5, zzc4);
            this.zzl += zzc4;
            if (zza4 != -1) {
                zzg();
                this.zzl = 0;
                this.zzm = zza4;
            }
            int length = zzen5.zzN().length - zzen5.zzd();
            if (zzen5.zza() >= 16 || length >= 16) {
                return 0;
            }
            int zza5 = zzen5.zza();
            System.arraycopy(zzen5.zzN(), zzen5.zzc(), zzen5.zzN(), 0, zza5);
            zzen5.zzL(0);
            zzen5.zzK(zza5);
            return 0;
        } else {
            zzadw.zzj();
            zzen zzen6 = new zzen(2);
            zzadw2.zzh(zzen6.zzN(), 0, 2);
            int zzq = zzen6.zzq();
            if ((zzq >> 2) == 16382) {
                zzadw.zzj();
                this.zzj = zzq;
                zzady zzady = this.zzd;
                String str2 = zzex.zza;
                zzady zzady2 = zzady;
                long zzf2 = zzadw.zzf();
                long zzd5 = zzadw.zzd();
                zzaeg zzaeg4 = this.zzh;
                zzaeg4.getClass();
                zzaef zzaef = zzaeg4.zzk;
                if (zzaef != null && zzaef.zza.length > 0) {
                    zzaeu = new zzaee(zzaeg4, zzf2);
                } else if (zzd5 == -1 || zzaeg4.zzj <= 0) {
                    zzaeu = new zzaet(zzaeg4.zza(), 0);
                } else {
                    zzafz zzafz2 = new zzafz(zzaeg4, this.zzj, zzf2, zzd5);
                    this.zzk = zzafz2;
                    zzaeu = zzafz2.zzb();
                }
                zzady.zzP(zzaeu);
                this.zzf = 5;
                return 0;
            }
            zzadw.zzj();
            throw zzaz.zza("First frame does not start with sync code.", (Throwable) null);
        }
    }
}
