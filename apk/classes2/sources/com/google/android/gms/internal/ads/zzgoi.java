package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgoi implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    zzgoi(zzgom zzgom, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzgom);
    }

    public final Iterator iterator() {
        return new zzgok(this.zza.iterator(), this.zzb.iterator(), (zzgol) null);
    }
}
