package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgbw {
    public static long[] zza(long[]... jArr) {
        long j = 0;
        for (long[] length : jArr) {
            j += (long) length.length;
        }
        int i = (int) j;
        zzfvp.zzh(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        long[] jArr2 = new long[i];
        int i2 = 0;
        for (long[] jArr3 : jArr) {
            int length2 = jArr3.length;
            System.arraycopy(jArr3, 0, jArr2, i2, length2);
            i2 += length2;
        }
        return jArr2;
    }
}
