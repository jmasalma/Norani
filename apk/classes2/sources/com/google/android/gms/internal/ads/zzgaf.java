package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgaf extends zzfyv {
    private final transient zzfyt zza;
    private final transient zzfyq zzb;

    zzgaf(zzfyt zzfyt, zzfyq zzfyq) {
        this.zza = zzfyt;
        this.zzb = zzfyq;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    public final zzfyq zzd() {
        return this.zzb;
    }

    public final zzgaw zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }
}
