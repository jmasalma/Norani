package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfzc extends zzgav {
    final /* synthetic */ zzfzd zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzc(zzfzd zzfzd, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzfzd);
        this.zza = zzfzd;
    }

    /* access modifiers changed from: package-private */
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
