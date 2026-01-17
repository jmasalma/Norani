package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzfxd extends zzfwy implements SortedSet {
    final /* synthetic */ zzfxi zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxd(zzfxi zzfxi, SortedMap sortedMap) {
        super(zzfxi, sortedMap);
        Objects.requireNonNull(zzfxi);
        this.zzc = zzfxi;
    }

    public final Comparator comparator() {
        return zza().comparator();
    }

    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfxd(this.zzc, zza().headMap(obj));
    }

    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfxd(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfxd(this.zzc, zza().tailMap(obj));
    }

    /* access modifiers changed from: package-private */
    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
