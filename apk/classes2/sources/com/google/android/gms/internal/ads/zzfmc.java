package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfmc implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfmd zzb;

    zzfmc(zzfmd zzfmd, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfmd);
        this.zzb = zzfmd;
    }

    public final void run() {
        this.zzb.zza.zzg.zze(this.zza);
    }
}
