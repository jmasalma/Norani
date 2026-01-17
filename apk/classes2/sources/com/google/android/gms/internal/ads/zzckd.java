package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzckd implements Runnable {
    public final /* synthetic */ zzcke zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzckd(zzcke zzcke, Runnable runnable) {
        this.zza = zzcke;
        this.zzb = runnable;
    }

    public final void run() {
        zzcaf.zzf.execute(new zzcjy(this.zza, this.zzb));
    }
}
