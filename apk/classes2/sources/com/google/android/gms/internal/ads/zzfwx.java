package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfwx implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfwy zzc;

    zzfwx(zzfwy zzfwy, Iterator it) {
        this.zzb = it;
        Objects.requireNonNull(zzfwy);
        this.zzc = zzfwy;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    public final void remove() {
        zzfvp.zzm(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfxi zzfxi = this.zzc.zza;
        zzfxi.zzb = zzfxi.zzb - collection.size();
        collection.clear();
        this.zza = null;
    }
}
