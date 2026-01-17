package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzadj {
    private final Map zza = new LinkedHashMap();

    public final zzadi zza() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzadi zzadi : this.zza.values()) {
            arrayList.add(zzadi.zzb);
            arrayList2.add(zzadi.zzc);
            arrayList3.add(zzadi.zzd);
            arrayList4.add(zzadi.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] length : iArr) {
            j += (long) length.length;
        }
        int i = (int) j;
        zzfvp.zzh(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        int[] iArr2 = new int[i];
        int i2 = 0;
        for (int[] iArr3 : iArr) {
            int length2 = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2, i2, length2);
            i2 += length2;
        }
        return new zzadi(iArr2, zzgbw.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgbw.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgbw.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public final void zzb(zzadi zzadi) {
        long[] jArr = zzadi.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (!map.containsKey(Long.valueOf(jArr[0]))) {
                map.put(Long.valueOf(jArr[0]), zzadi);
            }
        }
    }
}
