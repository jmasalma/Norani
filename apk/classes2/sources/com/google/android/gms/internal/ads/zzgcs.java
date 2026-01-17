package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcb;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzgcs extends zzgcb.zzf {
    private static final zzgco zzbg;
    private static final zzgdw zzbh = new zzgdw(zzgcs.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzgco zzgco;
        try {
            zzgco = new zzgcp((zzgcr) null);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgco = new zzgcq((zzgcr) null);
        }
        zzbg = zzgco;
        if (th != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgcs(int i) {
        this.remainingField = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzB() {
        return zzbg.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzw(newSetFromMap);
        zzbg.zzb(this, (Set) null, newSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptionsField);
    }

    /* access modifiers changed from: package-private */
    public abstract void zzw(Set set);
}
