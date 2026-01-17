package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcrv implements zzr {
    private final zzcxf zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcrv(zzcxf zzcxf) {
        this.zza = zzcxf;
    }

    private final void zzh() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.zza.zza();
        }
    }

    public final void zzd() {
    }

    public final void zzdk() {
    }

    public final void zzds() {
        zzh();
    }

    public final void zzdt() {
        this.zza.zzc();
    }

    public final void zzdv() {
    }

    public final void zzdw(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
