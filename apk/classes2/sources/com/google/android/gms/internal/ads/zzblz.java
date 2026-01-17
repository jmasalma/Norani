package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzblz implements Runnable {
    final /* synthetic */ zzbmc zza;

    zzblz(zzbmc zzbmc) {
        Objects.requireNonNull(zzbmc);
        this.zza = zzbmc;
    }

    public final void run() {
        zzbmc.zzc(this.zza);
    }
}
