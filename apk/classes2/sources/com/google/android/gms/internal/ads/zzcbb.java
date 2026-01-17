package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcbb implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbf zzc;

    zzcbb(zzcbf zzcbf, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        Objects.requireNonNull(zzcbf);
        this.zzc = zzcbf;
    }

    public final void run() {
        zzcbf zzcbf = this.zzc;
        if (zzcbf.zzr != null) {
            zzcbf.zzr.zzj(this.zza, this.zzb);
        }
    }
}
