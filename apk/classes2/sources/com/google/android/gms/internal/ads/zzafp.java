package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzafp implements zzafj {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzafp(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
    }

    public static zzafp zzd(zzen zzen) {
        int zzi = zzen.zzi();
        zzen.zzM(12);
        int zzi2 = zzen.zzi();
        int zzi3 = zzen.zzi();
        int zzi4 = zzen.zzi();
        zzen.zzM(4);
        int zzi5 = zzen.zzi();
        int zzi6 = zzen.zzi();
        zzen.zzM(4);
        return new zzafp(zzi, zzi2, zzi3, zzi4, zzi5, zzi6, zzen.zzi());
    }

    public final int zza() {
        return 1752331379;
    }

    public final int zzb() {
        int i = this.zza;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        zzea.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    public final long zzc() {
        RoundingMode roundingMode = RoundingMode.DOWN;
        return zzex.zzu((long) this.zzd, ((long) this.zzb) * 1000000, (long) this.zzc, roundingMode);
    }
}
