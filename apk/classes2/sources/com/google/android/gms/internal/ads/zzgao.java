package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgao extends zzgan implements SortedSet {
    zzgao(SortedSet sortedSet, zzfvq zzfvq) {
        super(sortedSet, zzfvq);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfvq zzfvq = this.zzb;
        zzfvq.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfvq.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new zzgao(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            zzfvq zzfvq = this.zzb;
            Object last = sortedSet.last();
            if (zzfvq.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzgao(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzgao(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
