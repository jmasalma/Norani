package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmi implements Runnable {
    public final /* synthetic */ zzcmq zza;
    public final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcmi(zzcmq zzcmq, Throwable th) {
        this.zza = zzcmq;
        this.zzb = th;
    }

    public final void run() {
        zzcmq.zzh(this.zza, this.zzb);
    }
}
