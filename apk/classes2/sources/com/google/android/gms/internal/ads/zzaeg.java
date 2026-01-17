package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaeg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaef zzk;
    private final zzav zzl;

    private zzaeg(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzaef zzaef, zzav zzav) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzaef;
        this.zzl = zzav;
    }

    public zzaeg(byte[] bArr, int i) {
        zzem zzem = new zzem(bArr, bArr.length);
        zzem.zzl(i * 8);
        this.zza = zzem.zzd(16);
        this.zzb = zzem.zzd(16);
        this.zzc = zzem.zzd(24);
        this.zzd = zzem.zzd(24);
        int zzd2 = zzem.zzd(20);
        this.zze = zzd2;
        this.zzf = zzi(zzd2);
        this.zzg = zzem.zzd(3) + 1;
        int zzd3 = zzem.zzd(5) + 1;
        this.zzh = zzd3;
        this.zzi = zzh(zzd3);
        this.zzj = zzem.zze(36);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        String str = zzex.zza;
        return Math.max(0, Math.min((j * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzz zzc(byte[] bArr, zzav zzav) {
        bArr[4] = Byte.MIN_VALUE;
        zzav zzd2 = zzd(zzav);
        zzx zzx = new zzx();
        zzx.zzah("audio/flac");
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzx.zzX(i);
        zzx.zzD(this.zzg);
        zzx.zzai(this.zze);
        zzx.zzab(zzex.zzn(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zzx.zzT(Collections.singletonList(bArr));
        zzx.zzaa(zzd2);
        return zzx.zzan();
    }

    public final zzav zzd(zzav zzav) {
        zzav zzav2 = this.zzl;
        return zzav2 == null ? zzav : zzav2.zzd(zzav);
    }

    public final zzaeg zze(List list) {
        return new zzaeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzav(list)));
    }

    public final zzaeg zzf(zzaef zzaef) {
        return new zzaeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaef, this.zzl);
    }

    public final zzaeg zzg(List list) {
        return new zzaeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzafh.zzb(list)));
    }
}
