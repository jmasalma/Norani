package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamr implements zzamz {
    private final zzem zza;
    private final zzen zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzafb zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn = -9223372036854775807L;

    public zzamr(String str, int i, String str2) {
        zzem zzem = new zzem(new byte[128], 128);
        this.zza = zzem;
        this.zzb = new zzen(zzem.zza);
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    public final void zza(zzen zzen) {
        zzdd.zzb(this.zzg);
        while (zzen.zza() > 0) {
            int i = this.zzh;
            boolean z = true;
            if (i == 0) {
                while (true) {
                    if (zzen.zza() <= 0) {
                        break;
                    } else if (!this.zzj) {
                        this.zzj = zzen.zzm() == 11;
                    } else {
                        int zzm2 = zzen.zzm();
                        if (zzm2 == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzen zzen2 = this.zzb;
                            zzen2.zzN()[0] = Ascii.VT;
                            zzen2.zzN()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = zzm2 == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzen.zza(), this.zzm - this.zzi);
                this.zzg.zzr(zzen, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    if (this.zzn == -9223372036854775807L) {
                        z = false;
                    }
                    zzdd.zzf(z);
                    this.zzg.zzt(this.zzn, 1, this.zzm, 0, (zzafa) null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzen zzen3 = this.zzb;
                byte[] zzN = zzen3.zzN();
                int min2 = Math.min(zzen.zza(), 128 - this.zzi);
                zzen.zzH(zzN, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 128) {
                    zzem zzem = this.zza;
                    zzem.zzl(0);
                    zzacs zze2 = zzacu.zze(zzem);
                    zzz zzz = this.zzl;
                    if (zzz == null || zze2.zzc != zzz.zzG || zze2.zzb != zzz.zzH || !Objects.equals(zze2.zza, zzz.zzo)) {
                        zzx zzx = new zzx();
                        zzx.zzS(this.zzf);
                        zzx.zzG(this.zze);
                        String str = zze2.zza;
                        zzx.zzah(str);
                        zzx.zzD(zze2.zzc);
                        zzx.zzai(zze2.zzb);
                        zzx.zzW(this.zzc);
                        zzx.zzaf(this.zzd);
                        int i4 = zze2.zzf;
                        zzx.zzac(i4);
                        if ("audio/ac3".equals(str)) {
                            zzx.zzC(i4);
                        }
                        zzz zzan = zzx.zzan();
                        this.zzl = zzan;
                        this.zzg.zzm(zzan);
                    }
                    this.zzm = zze2.zzd;
                    this.zzk = (((long) zze2.zze) * 1000000) / ((long) this.zzl.zzH);
                    zzen3.zzL(0);
                    this.zzg.zzr(zzen3, 128);
                    this.zzh = 2;
                }
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
        this.zzn = j;
    }

    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }
}
