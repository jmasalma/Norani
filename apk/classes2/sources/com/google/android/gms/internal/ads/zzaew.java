package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaew implements zzadv {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzady zzf;
    private zzafb zzg;

    public zzaew(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        int i = this.zze;
        if (i == 1) {
            zzafb zzafb = this.zzg;
            zzafb.getClass();
            zzafb zzafb2 = zzafb;
            int zzf2 = zzafb.zzf(zzadw, 1024, true);
            if (zzf2 == -1) {
                this.zze = 2;
                this.zzg.zzt(0, 1, this.zzd, 0, (zzafa) null);
                this.zzd = 0;
            } else {
                this.zzd += zzf2;
            }
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzf = zzady;
        zzafb zzw = zzady.zzw(1024, 4);
        this.zzg = zzw;
        zzx zzx = new zzx();
        String str = this.zzc;
        zzx.zzG(str);
        zzx.zzah(str);
        zzw.zzm(zzx.zzan());
        this.zzf.zzG();
        this.zzf.zzP(new zzaex(-9223372036854775807L));
        this.zze = 1;
    }

    public final void zzf(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        int i = this.zza;
        zzdd.zzf((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        zzen zzen = new zzen(i2);
        ((zzadl) zzadw).zzm(zzen.zzN(), 0, i2, false);
        return zzen.zzq() == i;
    }
}
