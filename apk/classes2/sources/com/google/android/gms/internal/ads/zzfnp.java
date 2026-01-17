package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfnp implements Runnable {
    zzfnp() {
    }

    public final void run() {
        if (zzfns.zzc != null) {
            zzfns.zzc.post(zzfns.zzd);
            zzfns.zzc.postDelayed(zzfns.zze, 200);
        }
    }
}
