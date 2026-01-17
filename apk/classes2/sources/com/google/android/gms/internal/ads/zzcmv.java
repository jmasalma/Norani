package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmv implements Runnable {
    public final /* synthetic */ zzcnc zza;

    public /* synthetic */ zzcmv(zzcnc zzcnc) {
        this.zza = zzcnc;
    }

    public final void run() {
        this.zza.zzb.execute(new zzcmx(this.zza));
    }
}
