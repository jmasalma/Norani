package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcjy implements Runnable {
    public final /* synthetic */ zzcke zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcjy(zzcke zzcke, Runnable runnable) {
        this.zza = zzcke;
        this.zzb = runnable;
    }

    public final void run() {
        zzcke.zzc(this.zza, this.zzb);
    }
}
