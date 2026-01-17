package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfxf extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfxf zzc;
    final Collection zzd;
    final /* synthetic */ zzfxi zze;

    zzfxf(zzfxi zzfxi, Object obj, Collection collection, zzfxf zzfxf) {
        Objects.requireNonNull(zzfxi);
        this.zze = zzfxi;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfxf;
        this.zzd = zzfxf == null ? null : zzfxf.zzb;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfxi zzfxi = this.zze;
            zzfxi.zzb = zzfxi.zzb + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfxi zzfxi = this.zze;
        zzfxi.zzb = zzfxi.zzb + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.zzb.clear();
            zzfxi zzfxi = this.zze;
            zzfxi.zzb = zzfxi.zzb - size;
            zzc();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new zzfxe(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfxi zzfxi = this.zze;
            zzfxi.zzb = zzfxi.zzb - 1;
            zzc();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfxi zzfxi = this.zze;
            zzfxi.zzb = zzfxi.zzb + (size2 - size);
            zzc();
        }
        return removeAll;
    }

    public final int size() {
        zzb();
        return this.zzb.size();
    }

    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        zzfxf zzfxf = this.zzc;
        if (zzfxf != null) {
            zzfxf.zza();
            return;
        }
        zzfxi zzfxi = this.zze;
        zzfxi.zza.put(this.zza, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        zzfxf zzfxf = this.zzc;
        if (zzfxf != null) {
            zzfxf.zzb();
            if (zzfxf.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty()) {
            zzfxi zzfxi = this.zze;
            Collection collection = (Collection) zzfxi.zza.get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzfxf zzfxf = this.zzc;
        if (zzfxf != null) {
            zzfxf.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfxi zzfxi = this.zze;
            zzfxi.zza.remove(this.zza);
        }
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfxi zzfxi = this.zze;
            zzfxi.zzb = zzfxi.zzb + (size2 - size);
            zzc();
        }
        return retainAll;
    }
}
