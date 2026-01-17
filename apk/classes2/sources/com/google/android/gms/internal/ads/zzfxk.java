package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxk extends AbstractCollection {
    final /* synthetic */ zzfxl zza;

    zzfxk(zzfxl zzfxl) {
        Objects.requireNonNull(zzfxl);
        this.zza = zzfxl;
    }

    public final void clear() {
        this.zza.zzp();
    }

    public final boolean contains(Object obj) {
        for (Collection contains : this.zza.zzs().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return this.zza.zzg();
    }

    public final int size() {
        return this.zza.zze();
    }
}
