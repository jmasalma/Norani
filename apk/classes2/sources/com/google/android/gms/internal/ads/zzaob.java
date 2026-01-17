package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaob implements zzaoo {
    private final zzaoa zza;
    private final zzen zzb = new zzen(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaob(zzaoa zzaoa) {
        this.zza = zzaoa;
    }

    public final void zza(zzen zzen, int i) {
        int i2 = i & 1;
        int zzc2 = i2 != 0 ? zzen.zzc() + zzen.zzm() : -1;
        if (this.zzf) {
            if (i2 != 0) {
                this.zzf = false;
                zzen.zzL(zzc2);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzen.zza() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzm = zzen.zzm();
                    zzen.zzL(zzen.zzc() - 1);
                    if (zzm == 255) {
                    }
                }
                int min = Math.min(zzen.zza(), 3 - this.zzd);
                zzen zzen2 = this.zzb;
                zzen.zzH(zzen2.zzN(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    zzen2.zzL(0);
                    zzen2.zzK(3);
                    zzen2.zzM(1);
                    int zzm2 = zzen2.zzm();
                    boolean z = (zzm2 & 128) != 0;
                    int zzm3 = zzen2.zzm();
                    this.zze = z;
                    this.zzc = (((zzm2 & 15) << 8) | zzm3) + 3;
                    int zzb2 = zzen2.zzb();
                    int i5 = this.zzc;
                    if (zzb2 < i5) {
                        int zzb3 = zzen2.zzb();
                        zzen2.zzF(Math.min(4098, Math.max(i5, zzb3 + zzb3)));
                    }
                }
            } else {
                int min2 = Math.min(zzen.zza(), this.zzc - this.zzd);
                zzen zzen3 = this.zzb;
                zzen.zzH(zzen3.zzN(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzen3.zzK(i7);
                    } else if (zzex.zzf(zzen3.zzN(), 0, i7, -1) == 0) {
                        zzen3.zzK(this.zzc - 4);
                    }
                    zzen3.zzL(0);
                    this.zza.zza(zzen3);
                    this.zzd = 0;
                }
            }
            this.zzf = true;
            return;
        }
    }

    public final void zzb(zzeu zzeu, zzady zzady, zzaon zzaon) {
        this.zza.zzb(zzeu, zzady, zzaon);
        this.zzf = true;
    }

    public final void zzc() {
        this.zzf = true;
    }
}
