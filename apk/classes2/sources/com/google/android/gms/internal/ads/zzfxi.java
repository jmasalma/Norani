package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzfxi extends zzfxl implements Serializable {
    /* access modifiers changed from: private */
    public final transient Map zza;
    /* access modifiers changed from: private */
    public transient int zzb;

    protected zzfxi(Map map) {
        zzfvp.zze(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzo(zzfxi zzfxi, Object obj) {
        Object obj2;
        try {
            obj2 = zzfxi.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfxi.zzb -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection zza();

    /* access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    public final int zze() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Collection zzf() {
        return new zzfxk(this);
    }

    /* access modifiers changed from: package-private */
    public final Iterator zzg() {
        return new zzfws(this);
    }

    /* access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, zzfxf zzfxf) {
        if (list instanceof RandomAccess) {
            return new zzfxb(this, obj, list, zzfxf);
        }
        return new zzfxh(this, obj, list, zzfxf);
    }

    /* access modifiers changed from: package-private */
    public Map zzj() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfwz(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfxc(this, (SortedMap) map);
        }
        return new zzfwv(this, map);
    }

    /* access modifiers changed from: package-private */
    public Set zzl() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfxa(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfxd(this, (SortedMap) map);
        }
        return new zzfwy(this, map);
    }

    public final void zzp() {
        Map map = this.zza;
        for (Collection clear : map.values()) {
            clear.clear();
        }
        map.clear();
        this.zzb = 0;
    }

    public final boolean zzq(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection zza2 = zza();
            if (zza2.add(obj2)) {
                this.zzb++;
                map.put(obj, zza2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.zzb++;
            return true;
        }
    }
}
