package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmj implements Runnable {
    public final /* synthetic */ zzcmq zza;
    public final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcmj(zzcmq zzcmq, Throwable th) {
        this.zza = zzcmq;
        this.zzb = th;
    }

    public final void run() {
        zzcmq.zzg(this.zza, this.zzb);
    }
}
