package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfxh extends zzfxf implements List {
    final /* synthetic */ zzfxi zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxh(zzfxi zzfxi, Object obj, List list, zzfxf zzfxf) {
        super(zzfxi, obj, list, zzfxf);
        Objects.requireNonNull(zzfxi);
        this.zzf = zzfxi;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfxi zzfxi = this.zzf;
        zzfxi.zzb = zzfxi.zzb + 1;
        if (isEmpty) {
            zza();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfxi zzfxi = this.zzf;
        zzfxi.zzb = zzfxi.zzb + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new zzfxg(this);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfxi zzfxi = this.zzf;
        zzfxi.zzb = zzfxi.zzb - 1;
        zzc();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.zzb).subList(i, i2);
        zzfxf zzfxf = this.zzc;
        if (zzfxf == null) {
            zzfxf = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfxf);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfxg(this, i);
    }
}
