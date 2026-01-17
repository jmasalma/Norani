package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeli implements zzeln {
    final /* synthetic */ zzelj zza;

    zzeli(zzelj zzelj) {
        Objects.requireNonNull(zzelj);
        this.zza = zzelj;
    }

    public final void zza() {
        synchronized (this.zza) {
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcra zzcra = (zzcra) obj;
        zzelj zzelj = this.zza;
        synchronized (zzelj) {
            zzelj.zzc = zzcra.zzm();
            zzcra.zzk();
        }
    }
}
