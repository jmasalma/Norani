package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfze extends zzgav {
    final /* synthetic */ zzfzf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfze(zzfzf zzfzf, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzfzf);
        this.zza = zzfzf;
    }

    /* access modifiers changed from: package-private */
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
