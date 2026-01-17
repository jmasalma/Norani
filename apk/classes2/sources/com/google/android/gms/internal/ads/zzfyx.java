package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfyx extends zzfwq {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfvq zzb;

    zzfyx(Iterator it, zzfvq zzfvq) {
        this.zza = it;
        this.zzb = zzfvq;
    }

    /* access modifiers changed from: protected */
    public final Object zza() {
        zzfvq zzfvq;
        Object next;
        do {
            Iterator it = this.zza;
            if (it.hasNext()) {
                zzfvq = this.zzb;
                next = it.next();
            } else {
                zzb();
                return null;
            }
        } while (!zzfvq.zza(next));
        return next;
    }
}
