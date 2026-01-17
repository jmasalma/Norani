package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgal extends zzfwq {
    final Iterator zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ Set zzc;

    zzgal(zzgam zzgam, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        Objects.requireNonNull(zzgam);
        this.zza = set.iterator();
    }

    /* access modifiers changed from: protected */
    public final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.zza;
            if (it.hasNext()) {
                set = this.zzc;
                next = it.next();
            } else {
                zzb();
                return null;
            }
        } while (!set.contains(next));
        return next;
    }
}
