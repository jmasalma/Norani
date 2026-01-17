package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzccd implements Runnable {
    private final zzcbp zza;
    private boolean zzb = false;

    zzccd(zzcbp zzcbp) {
        this.zza = zzcbp;
    }

    private final void zzc() {
        zzfrw zzfrw = zzs.zza;
        zzfrw.removeCallbacks(this);
        zzfrw.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
