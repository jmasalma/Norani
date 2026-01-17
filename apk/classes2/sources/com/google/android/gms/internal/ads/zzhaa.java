package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhaa implements Iterator {
    private final Iterator zza;

    public zzhaa(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzhac ? new zzgzz(entry, (zzhab) null) : entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
