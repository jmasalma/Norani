package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfxo extends AbstractCollection {
    final Collection zza;
    final zzfvq zzb;

    zzfxo(Collection collection, zzfvq zzfvq) {
        this.zza = collection;
        this.zzb = zzfvq;
    }

    public final boolean add(Object obj) {
        zzfvp.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object zza2 : collection) {
            zzfvp.zze(this.zzb.zza(zza2));
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        zzfyw.zzb(this.zza, this.zzb);
    }

    public final boolean contains(Object obj) {
        if (zzfxp.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        zzfvq zzfvq = this.zzb;
        zzfvp.zzc(zzfvq, "predicate");
        int i = 0;
        for (Object zza2 : this.zza) {
            if (!zzfvq.zza(zza2)) {
                i++;
            } else if (i != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfvq zzfvq = this.zzb;
        zzfvq.getClass();
        return new zzfyx(it, zzfvq);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object zza2 : this.zza) {
            if (this.zzb.zza(zza2)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        return zzfzg.zza(iterator()).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return zzfzg.zza(iterator()).toArray(objArr);
    }
}
