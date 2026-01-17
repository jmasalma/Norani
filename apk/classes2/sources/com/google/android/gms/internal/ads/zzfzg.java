package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfzg {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i) {
        zzfxn.zza(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzc(List list, zzfve zzfve) {
        if (list instanceof RandomAccess) {
            return new zzfzd(list, zzfve);
        }
        return new zzfzf(list, zzfve);
    }
}
