package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamy implements zzamz {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzafb[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public zzamy(List list, String str) {
        this.zza = list;
        this.zzc = new zzafb[list.size()];
        this.zzg = -9223372036854775807L;
    }

    private final boolean zzf(zzen zzen, int i) {
        if (zzen.zza() == 0) {
            return false;
        }
        if (zzen.zzm() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    public final void zza(zzen zzen) {
        if (!this.zzd) {
            return;
        }
        if (this.zze != 2 || zzf(zzen, 32)) {
            if (this.zze != 1 || zzf(zzen, 0)) {
                int zzc2 = zzen.zzc();
                int zza2 = zzen.zza();
                zzafb[] zzafbArr = this.zzc;
                for (zzafb zzr : zzafbArr) {
                    zzen.zzL(zzc2);
                    zzr.zzr(zzen, zza2);
                }
                this.zzf += zza2;
            }
        }
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        int i = 0;
        while (true) {
            zzafb[] zzafbArr = this.zzc;
            if (i < zzafbArr.length) {
                zzaok zzaok = (zzaok) this.zza.get(i);
                zzaon.zzc();
                zzafb zzw = zzady.zzw(zzaon.zza(), 3);
                zzx zzx = new zzx();
                zzx.zzS(zzaon.zzb());
                zzx.zzG(this.zzb);
                zzx.zzah("application/dvbsubs");
                zzx.zzT(Collections.singletonList(zzaok.zzb));
                zzx.zzW(zzaok.zza);
                zzw.zzm(zzx.zzan());
                zzafbArr[i] = zzw;
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzc(boolean z) {
        if (this.zzd) {
            zzdd.zzf(this.zzg != -9223372036854775807L);
            zzafb[] zzafbArr = this.zzc;
            for (zzafb zzt : zzafbArr) {
                zzt.zzt(this.zzg, 1, this.zzf, 0, (zzafa) null);
            }
            this.zzd = false;
        }
    }

    public final void zzd(long j, int i) {
        if ((i & 4) != 0) {
            this.zzd = true;
            this.zzg = j;
            this.zzf = 0;
            this.zze = 2;
        }
    }

    public final void zze() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }
}
