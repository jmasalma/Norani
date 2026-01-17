package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgcq extends zzgco {
    private zzgcq() {
        throw null;
    }

    /* synthetic */ zzgcq(zzgcr zzgcr) {
        super((zzgcr) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzgcs zzgcs) {
        int i;
        synchronized (zzgcs) {
            i = zzgcs.remainingField - 1;
            zzgcs.remainingField = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzgcs zzgcs, Set set, Set set2) {
        synchronized (zzgcs) {
            if (zzgcs.seenExceptionsField == null) {
                zzgcs.seenExceptionsField = set2;
            }
        }
    }
}
