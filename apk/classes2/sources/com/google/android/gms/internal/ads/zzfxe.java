package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfxe implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfxf zzc;

    zzfxe(zzfxf zzfxf) {
        Iterator it;
        Objects.requireNonNull(zzfxf);
        this.zzc = zzfxf;
        this.zzb = zzfxf.zzb;
        Collection collection = zzfxf.zzb;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzfxf zzfxf = this.zzc;
        zzfxi zzfxi = zzfxf.zze;
        zzfxi.zzb = zzfxi.zzb - 1;
        zzfxf.zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        zzfxf zzfxf = this.zzc;
        zzfxf.zzb();
        if (zzfxf.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    zzfxe(zzfxf zzfxf, Iterator it) {
        Objects.requireNonNull(zzfxf);
        this.zzc = zzfxf;
        this.zzb = zzfxf.zzb;
        this.zza = it;
    }
}
