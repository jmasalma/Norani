package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzena {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemz zzb;

    /* access modifiers changed from: package-private */
    public final zzemz zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzemz zzemz) {
        this.zzb = zzemz;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
