package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcuu {
    private final AtomicLong zza;

    zzcuu(zzfcn zzfcn) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfcn.zza.zza.zzt.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j) {
        this.zza.set(j);
    }
}
