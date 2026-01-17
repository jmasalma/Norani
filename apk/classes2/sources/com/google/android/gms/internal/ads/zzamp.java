package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzamp implements zzako {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamp(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[(size + size)];
        for (int i = 0; i < list.size(); i++) {
            zzame zzame = (zzame) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzame.zzb;
            jArr[i2 + 1] = zzame.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    public final int zza() {
        return this.zzc.length;
    }

    public final long zzb(int i) {
        boolean z = true;
        zzdd.zzd(i >= 0);
        long[] jArr = this.zzc;
        if (i >= jArr.length) {
            z = false;
        }
        zzdd.zzd(z);
        return jArr[i];
    }

    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzame zzame = (zzame) list.get(i);
                zzcu zzcu = zzame.zza;
                if (zzcu.zze == -3.4028235E38f) {
                    arrayList2.add(zzame);
                } else {
                    arrayList.add(zzcu);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new zzamo());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcs zzb2 = ((zzame) arrayList2.get(i3)).zza.zzb();
            zzb2.zze((float) (-1 - i3), 1);
            arrayList.add(zzb2.zzq());
        }
        return arrayList;
    }
}
