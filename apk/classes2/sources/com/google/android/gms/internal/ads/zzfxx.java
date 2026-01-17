package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxx extends AbstractCollection {
    final /* synthetic */ zzfxz zza;

    zzfxx(zzfxz zzfxz) {
        Objects.requireNonNull(zzfxz);
        this.zza = zzfxz;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfxs(zzfxz);
    }

    public final int size() {
        return this.zza.size();
    }
}
