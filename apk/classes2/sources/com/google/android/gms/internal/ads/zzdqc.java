package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdqc implements Runnable {
    public final /* synthetic */ zzdqe zza;

    public /* synthetic */ zzdqc(zzdqe zzdqe) {
        this.zza = zzdqe;
    }

    public final void run() {
        this.zza.zzc.execute(new zzdqd(this.zza));
    }
}
