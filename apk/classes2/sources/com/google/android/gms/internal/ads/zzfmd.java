package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfmd implements Runnable {
    final /* synthetic */ zzfme zza;

    zzfmd(zzfme zzfme) {
        Objects.requireNonNull(zzfme);
        this.zza = zzfme;
    }

    public final void run() {
        zzfme zzfme = this.zza;
        float zza2 = zzfme.zza(zzfme);
        zzfme.zze.set(false);
        if (((Float) zzfme.zzd.getAndSet(Float.valueOf(zza2))).floatValue() != zza2) {
            zzfme.zza.post(new zzfmc(this, zza2));
        }
    }
}
