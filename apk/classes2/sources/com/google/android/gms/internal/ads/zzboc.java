package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzboc extends zzcar {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzboh zzb;
    private boolean zzc;

    public zzboc(zzboh zzboh) {
        this.zzb = zzboh;
    }

    public final void zzb() {
        zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            zze.zza("release: Lock acquired");
            if (this.zzc) {
                zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbnz(this), new zzcan());
            zzj(new zzboa(this), new zzbob(this));
            zze.zza("release: Lock released");
        }
    }
}
