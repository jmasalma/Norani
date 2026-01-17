package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzapt implements Runnable {
    private final zzaqd zza;
    private final zzaqj zzb;
    private final Runnable zzc;

    public zzapt(zzaqd zzaqd, zzaqj zzaqj, Runnable runnable) {
        this.zza = zzaqd;
        this.zzb = zzaqj;
        this.zzc = runnable;
    }

    public final void run() {
        zzaqd zzaqd = this.zza;
        zzaqd.zzw();
        zzaqj zzaqj = this.zzb;
        if (zzaqj.zzc()) {
            zzaqd.zzo(zzaqj.zza);
        } else {
            zzaqd.zzn(zzaqj.zzc);
        }
        if (zzaqj.zzd) {
            zzaqd.zzm("intermediate-response");
        } else {
            zzaqd.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
