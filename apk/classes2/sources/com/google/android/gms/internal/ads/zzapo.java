package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzapo implements Runnable {
    final /* synthetic */ zzaqd zza;
    final /* synthetic */ zzapp zzb;

    zzapo(zzapp zzapp, zzaqd zzaqd) {
        this.zza = zzaqd;
        Objects.requireNonNull(zzapp);
        this.zzb = zzapp;
    }

    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
