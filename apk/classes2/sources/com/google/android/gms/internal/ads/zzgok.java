package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgok implements Iterator {
    private final Iterator zza;
    private final Iterator zzb;

    /* synthetic */ zzgok(Iterator it, Iterator it2, zzgol zzgol) {
        this.zza = it;
        this.zzb = it2;
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    public final Object next() {
        Iterator it = this.zza;
        if (it.hasNext()) {
            return it.next();
        }
        return this.zzb.next();
    }
}
