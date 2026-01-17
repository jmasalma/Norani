package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfuh implements Runnable {
    public final /* synthetic */ zzfun zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzfuh(zzfun zzfun, Runnable runnable) {
        this.zza = zzfun;
        this.zzb = runnable;
    }

    public final void run() {
        zzfun.zzg(this.zza, this.zzb);
    }
}
