package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgas {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static zzgaq zzb(Set set, Set set2) {
        zzfvp.zzc(set, "set1");
        zzfvp.zzc(set2, "set2");
        return new zzgam(set, set2);
    }

    public static Set zzc(Set set, zzfvq zzfvq) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzgan) {
                zzgan zzgan = (zzgan) sortedSet;
                return new zzgao((SortedSet) zzgan.zza, zzfvt.zza(zzgan.zzb, zzfvq));
            }
            sortedSet.getClass();
            SortedSet sortedSet2 = sortedSet;
            zzfvq zzfvq2 = zzfvq;
            return new zzgao(sortedSet, zzfvq);
        } else if (set instanceof zzgan) {
            zzgan zzgan2 = (zzgan) set;
            return new zzgan((Set) zzgan2.zza, zzfvt.zza(zzgan2.zzb, zzfvq));
        } else {
            set.getClass();
            Set set2 = set;
            zzfvq zzfvq3 = zzfvq;
            return new zzgan(set, zzfvq);
        }
    }

    static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean zzf(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfzy) {
            collection = ((zzfzy) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
