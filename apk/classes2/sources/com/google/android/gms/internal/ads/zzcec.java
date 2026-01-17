package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcec implements zzgj {
    private final zzgj zza;
    private final long zzb;
    private final zzgj zzc;
    private long zzd;
    private Uri zze;

    zzcec(zzgj zzgj, int i, zzgj zzgj2) {
        this.zza = zzgj;
        this.zzb = (long) i;
        this.zzc = zzgj2;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza2 = this.zza.zza(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.zzd + ((long) zza2);
            this.zzd = j3;
            long j4 = j3;
            i3 = zza2;
            j = j4;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int zza3 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + zza3;
        this.zzd += (long) zza3;
        return i4;
    }

    public final long zzb(zzgo zzgo) throws IOException {
        zzgo zzgo2;
        zzgo zzgo3 = zzgo;
        Uri uri = zzgo3.zza;
        this.zze = uri;
        long j = zzgo3.zze;
        long j2 = this.zzb;
        zzgo zzgo4 = null;
        if (j >= j2) {
            zzgo2 = null;
        } else {
            long j3 = zzgo3.zzf;
            long j4 = j2 - j;
            zzgo2 = new zzgo(uri, j, j3 != -1 ? Math.min(j3, j4) : j4, (String) null);
        }
        long j5 = zzgo3.zzf;
        int i = (j5 > -1 ? 1 : (j5 == -1 ? 0 : -1));
        if (i == 0 || j + j5 > j2) {
            zzgo4 = new zzgo(uri, Math.max(j2, j), i != 0 ? Math.min(j5, (j + j5) - j2) : -1, (String) null);
        }
        long j6 = 0;
        long zzb2 = zzgo2 != null ? this.zza.zzb(zzgo2) : 0;
        if (zzgo4 != null) {
            j6 = this.zzc.zzb(zzgo4);
        }
        this.zzd = j;
        if (zzb2 == -1 || j6 == -1) {
            return -1;
        }
        return zzb2 + j6;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzfyt.zzd();
    }

    public final void zzf(zzhj zzhj) {
    }
}
