package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzgzr extends AbstractList {
    private final zzgzp zza;
    private final zzgzq zzb;

    public zzgzr(zzgzp zzgzp, zzgzq zzgzq) {
        this.zza = zzgzp;
        this.zzb = zzgzq;
    }

    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzd(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
