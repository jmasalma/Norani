package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaou implements zzaot {
    private final zzady zza;
    private final zzafb zzb;
    private final zzaow zzc;
    private final zzz zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaou(zzady zzady, zzafb zzafb, zzaow zzaow, String str, int i) throws zzaz {
        this.zza = zzady;
        this.zzb = zzafb;
        this.zzc = zzaow;
        int i2 = zzaow.zzb * zzaow.zze;
        int i3 = zzaow.zzd;
        int i4 = i2 / 8;
        if (i3 == i4) {
            int i5 = zzaow.zzc * i4;
            int i6 = i5 * 8;
            int max = Math.max(i4, i5 / 10);
            this.zze = max;
            zzx zzx = new zzx();
            zzx.zzG("audio/wav");
            zzx.zzah(str);
            zzx.zzC(i6);
            zzx.zzac(i6);
            zzx.zzX(max);
            zzx.zzD(zzaow.zzb);
            zzx.zzai(zzaow.zzc);
            zzx.zzab(i);
            this.zzd = zzx.zzan();
            return;
        }
        throw zzaz.zza("Expected block size: " + i4 + "; got: " + i3, (Throwable) null);
    }

    public final void zza(int i, long j) {
        zzaoz zzaoz = new zzaoz(this.zzc, 1, (long) i, j);
        this.zza.zzP(zzaoz);
        zzafb zzafb = this.zzb;
        zzafb.zzm(this.zzd);
        zzafb.zzl(zzaoz.zza());
    }

    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0;
    }

    public final boolean zzc(zzadw zzadw, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                zzaow zzaow = this.zzc;
                int i4 = this.zzg;
                int i5 = zzaow.zzd;
                int i6 = i4 / i5;
            } else {
                int zzf2 = this.zzb.zzf(zzadw, (int) Math.min((long) (i3 - i2), j2), true);
                if (zzf2 == -1) {
                    j2 = 0;
                } else {
                    this.zzg += zzf2;
                    j2 -= (long) zzf2;
                }
            }
        }
        zzaow zzaow2 = this.zzc;
        int i42 = this.zzg;
        int i52 = zzaow2.zzd;
        int i62 = i42 / i52;
        if (i62 > 0) {
            int i7 = i62 * i52;
            int i8 = this.zzg - i7;
            this.zzb.zzt(this.zzf + zzex.zzu(this.zzh, 1000000, (long) zzaow2.zzc, RoundingMode.DOWN), 1, i7, i8, (zzafa) null);
            this.zzh += (long) i62;
            this.zzg = i8;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
