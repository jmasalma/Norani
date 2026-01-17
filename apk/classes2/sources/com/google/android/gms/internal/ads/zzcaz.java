package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcaz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbf zzc;

    zzcaz(zzcbf zzcbf, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzcbf);
        this.zzc = zzcbf;
    }

    public final void run() {
        zzcbf zzcbf = this.zzc;
        if (zzcbf.zzr != null) {
            zzcbf.zzr.zzb(this.zza, this.zzb);
        }
    }
}
