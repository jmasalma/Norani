package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zza {
    public final long zza;
    public final int zzb;
    @Deprecated
    public final Uri[] zzc;
    public final zzap[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final String[] zzg;
    public final long zzh;
    public final boolean zzi;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
    }

    public zza(long j) {
        this(0, -1, -1, new int[0], new zzap[0], new long[0], 0, false, new String[0], false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zza zza2 = (zza) obj;
            return this.zzb == zza2.zzb && Arrays.equals(this.zzd, zza2.zzd) && Arrays.equals(this.zze, zza2.zze) && Arrays.equals(this.zzf, zza2.zzf) && Arrays.equals(this.zzg, zza2.zzg);
        }
    }

    public final int hashCode() {
        return ((((((((((this.zzb * 31) - 1) * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze)) * 31) + Arrays.hashCode(this.zzf)) * 29791) + Arrays.hashCode(this.zzg)) * 31;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    public final zza zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zza(0, 0, -1, copyOf, (zzap[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0, false, (String[]) Arrays.copyOf(this.zzg, 0), false);
    }

    private zza(long j, int i, int i2, int[] iArr, zzap[] zzapArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzapArr.length;
        int i3 = 0;
        zzdd.zzd(length == length2);
        this.zza = 0;
        this.zzb = i;
        this.zze = iArr;
        this.zzd = zzapArr;
        this.zzf = jArr;
        this.zzh = 0;
        this.zzi = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i3 < uriArr.length) {
                zzap zzap = zzapArr[i3];
                if (zzap == null) {
                    uri = null;
                } else {
                    zzak zzak = zzap.zzb;
                    zzak.getClass();
                    zzak zzak2 = zzak;
                    uri = zzak.zza;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.zzg = strArr;
                return;
            }
        }
    }
}
