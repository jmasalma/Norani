package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzelf implements zzeln {
    final /* synthetic */ zzelg zza;

    zzelf(zzelg zzelg) {
        Objects.requireNonNull(zzelg);
        this.zza = zzelg;
    }

    public final void zza() {
        zzelg zzelg = this.zza;
        synchronized (zzelg) {
            zzelg.zzj = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzelg zzelg = this.zza;
        zzdfb zzdfb = (zzdfb) obj;
        synchronized (zzelg) {
            zzelg.zzj = zzdfb;
            zzelg.zzj.zzk();
        }
    }
}
