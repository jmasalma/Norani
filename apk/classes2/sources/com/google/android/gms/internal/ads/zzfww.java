package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfww implements Iterator {
    final Iterator zza;
    Collection zzb = null;
    Iterator zzc = zzfyy.INSTANCE;
    final /* synthetic */ zzfxi zzd;

    zzfww(zzfxi zzfxi) {
        Objects.requireNonNull(zzfxi);
        this.zzd = zzfxi;
        this.zza = zzfxi.zza.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    public final void remove() {
        this.zzc.remove();
        if (((Collection) Objects.requireNonNull(this.zzb)).isEmpty()) {
            this.zza.remove();
        }
        zzfxi zzfxi = this.zzd;
        zzfxi.zzb = zzfxi.zzb - 1;
    }
}
