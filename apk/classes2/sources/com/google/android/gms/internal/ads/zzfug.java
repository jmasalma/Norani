package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfug implements Runnable {
    public final /* synthetic */ zzfun zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzfug(zzfun zzfun, Runnable runnable) {
        this.zza = zzfun;
        this.zzb = runnable;
    }

    public final void run() {
        zzfun.zzf(this.zza, this.zzb);
    }
}
