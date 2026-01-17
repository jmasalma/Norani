package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzanj implements zzamz {
    private final String zza = "video/mp2t";
    private final zzen zzb = new zzen(10);
    private zzafb zzc;
    private boolean zzd;
    private long zze = -9223372036854775807L;
    private int zzf;
    private int zzg;

    public zzanj(String str) {
    }

    public final void zza(zzen zzen) {
        zzdd.zzb(this.zzc);
        if (this.zzd) {
            int zza2 = zzen.zza();
            int i = this.zzg;
            if (i < 10) {
                int min = Math.min(zza2, 10 - i);
                byte[] zzN = zzen.zzN();
                int zzc2 = zzen.zzc();
                zzen zzen2 = this.zzb;
                System.arraycopy(zzN, zzc2, zzen2.zzN(), this.zzg, min);
                if (this.zzg + min == 10) {
                    zzen2.zzL(0);
                    if (zzen2.zzm() == 73 && zzen2.zzm() == 68 && zzen2.zzm() == 51) {
                        zzen2.zzM(3);
                        this.zzf = zzen2.zzl() + 10;
                    } else {
                        zzea.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(zza2, this.zzf - this.zzg);
            this.zzc.zzr(zzen, min2);
            this.zzg += min2;
        }
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        zzafb zzw = zzady.zzw(zzaon.zza(), 5);
        this.zzc = zzw;
        zzx zzx = new zzx();
        zzx.zzS(zzaon.zzb());
        zzx.zzG(this.zza);
        zzx.zzah("application/id3");
        zzw.zzm(zzx.zzan());
    }

    public final void zzc(boolean z) {
        int i;
        zzdd.zzb(this.zzc);
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzdd.zzf(this.zze != -9223372036854775807L);
            this.zzc.zzt(this.zze, 1, this.zzf, 0, (zzafa) null);
            this.zzd = false;
        }
    }

    public final void zzd(long j, int i) {
        if ((i & 4) != 0) {
            this.zzd = true;
            this.zze = j;
            this.zzf = 0;
            this.zzg = 0;
        }
    }

    public final void zze() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }
}
