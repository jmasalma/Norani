package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxv extends AbstractSet {
    final /* synthetic */ zzfxz zza;

    zzfxv(zzfxz zzfxz) {
        Objects.requireNonNull(zzfxz);
        this.zza = zzfxz;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfxq(zzfxz);
    }

    public final boolean remove(Object obj) {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        return zzfxz.zzy(obj) != zzfxz.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
