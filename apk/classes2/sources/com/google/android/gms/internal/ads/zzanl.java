package com.google.android.gms.internal.ads;

import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzanl implements zzamz {
    private final zzen zza;
    private final zzaen zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzafb zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanl(String str, int i, String str2) {
        zzen zzen = new zzen(4);
        this.zza = zzen;
        zzen.zzN()[0] = -1;
        this.zzb = new zzaen();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    public final void zza(zzen zzen) {
        zzdd.zzb(this.zzf);
        while (zzen.zza() > 0) {
            int i = this.zzh;
            boolean z = true;
            if (i == 0) {
                byte[] zzN = zzen.zzN();
                int zzc2 = zzen.zzc();
                int zzd2 = zzen.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzen.zzL(zzd2);
                        break;
                    }
                    int i2 = zzc2 + 1;
                    byte b = zzN[zzc2];
                    boolean z2 = (b & 255) == 255;
                    boolean z3 = this.zzk && (b & 224) == 224;
                    this.zzk = z2;
                    if (z3) {
                        zzen.zzL(i2);
                        this.zzk = false;
                        this.zza.zzN()[1] = zzN[zzc2];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    zzc2 = i2;
                }
            } else if (i != 1) {
                int min = Math.min(zzen.zza(), this.zzm - this.zzi);
                this.zzf.zzr(zzen, min);
                int i3 = this.zzi + min;
                this.zzi = i3;
                if (i3 >= this.zzm) {
                    if (this.zzn == -9223372036854775807L) {
                        z = false;
                    }
                    zzdd.zzf(z);
                    this.zzf.zzt(this.zzn, 1, this.zzm, 0, (zzafa) null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int min2 = Math.min(zzen.zza(), 4 - this.zzi);
                zzen zzen2 = this.zza;
                zzen.zzH(zzen2.zzN(), this.zzi, min2);
                int i4 = this.zzi + min2;
                this.zzi = i4;
                if (i4 >= 4) {
                    zzen2.zzL(0);
                    zzaen zzaen = this.zzb;
                    if (!zzaen.zza(zzen2.zzg())) {
                        this.zzi = 0;
                        this.zzh = 1;
                    } else {
                        this.zzm = zzaen.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzaen.zzg) * 1000000) / ((long) zzaen.zzd);
                            zzx zzx = new zzx();
                            zzx.zzS(this.zzg);
                            zzx.zzG(this.zze);
                            zzx.zzah(zzaen.zzb);
                            zzx.zzX(ConstantsKt.DEFAULT_BLOCK_SIZE);
                            zzx.zzD(zzaen.zze);
                            zzx.zzai(zzaen.zzd);
                            zzx.zzW(this.zzc);
                            zzx.zzaf(this.zzd);
                            this.zzf.zzm(zzx.zzan());
                            this.zzj = true;
                        }
                        zzen2.zzL(0);
                        this.zzf.zzr(zzen2, 4);
                        this.zzh = 2;
                    }
                }
            }
        }
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzg = zzaon.zzb();
        this.zzf = zzady.zzw(zzaon.zza(), 1);
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzn = j;
    }

    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }
}
