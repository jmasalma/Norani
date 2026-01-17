package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamt implements zzamz {
    private final zzem zza;
    private final zzen zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzafb zzg;
    private int zzh = 0;
    private int zzi = 0;
    private boolean zzj = false;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn = -9223372036854775807L;

    public zzamt(String str, int i, String str2) {
        zzem zzem = new zzem(new byte[16], 16);
        this.zza = zzem;
        this.zzb = new zzen(zzem.zza);
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    public final void zza(zzen zzen) {
        int zzm2;
        byte b;
        zzdd.zzb(this.zzg);
        while (zzen.zza() > 0) {
            int i = this.zzh;
            boolean z = true;
            if (i == 0) {
                while (true) {
                    if (zzen.zza() <= 0) {
                        break;
                    } else if (!this.zzj) {
                        this.zzj = zzen.zzm() == 172;
                    } else {
                        zzm2 = zzen.zzm();
                        this.zzj = zzm2 == 172;
                        b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzm2 == 64) {
                            break;
                        } else if (zzm2 == 65) {
                            zzm2 = 65;
                            break;
                        }
                    }
                }
                this.zzh = 1;
                zzen zzen2 = this.zzb;
                zzen2.zzN()[0] = -84;
                if (zzm2 == 65) {
                    b = 65;
                }
                zzen2.zzN()[1] = b;
                this.zzi = 2;
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
                int min2 = Math.min(zzen.zza(), 16 - this.zzi);
                zzen.zzH(zzN, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzem zzem = this.zza;
                    zzem.zzl(0);
                    zzacw zzb2 = zzacy.zzb(zzem);
                    zzz zzz = this.zzl;
                    if (zzz == null || zzz.zzG != 2 || zzb2.zza != zzz.zzH || !"audio/ac4".equals(zzz.zzo)) {
                        zzx zzx = new zzx();
                        zzx.zzS(this.zzf);
                        zzx.zzG(this.zze);
                        zzx.zzah("audio/ac4");
                        zzx.zzD(2);
                        zzx.zzai(zzb2.zza);
                        zzx.zzW(this.zzc);
                        zzx.zzaf(this.zzd);
                        zzz zzan = zzx.zzan();
                        this.zzl = zzan;
                        this.zzg.zzm(zzan);
                    }
                    this.zzm = zzb2.zzb;
                    this.zzk = (((long) zzb2.zzc) * 1000000) / ((long) this.zzl.zzH);
                    zzen3.zzL(0);
                    this.zzg.zzr(zzen3, 16);
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
