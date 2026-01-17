package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfwv extends zzfzm {
    final transient Map zza;
    final /* synthetic */ zzfxi zzb;

    zzfwv(zzfxi zzfxi, Map map) {
        Objects.requireNonNull(zzfxi);
        this.zzb = zzfxi;
        this.zza = map;
    }

    public final void clear() {
        zzfxi zzfxi = this.zzb;
        if (this.zza == zzfxi.zza) {
            zzfxi.zzp();
        } else {
            zzfza.zzb(new zzfwu(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfzn.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public Set keySet() {
        return this.zzb.zzt();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        zzfxi zzfxi = this.zzb;
        Collection zza2 = zzfxi.zza();
        zza2.addAll(collection);
        zzfxi.zzb = zzfxi.zzb - collection.size();
        collection.clear();
        return zza2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    /* access modifiers changed from: package-private */
    public final Map.Entry zza(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfym(key, this.zzb.zzc(key, (Collection) entry.getValue()));
    }

    /* access modifiers changed from: protected */
    public final Set zzb() {
        return new zzfwt(this);
    }
}
