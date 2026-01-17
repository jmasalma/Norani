package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzccm implements Runnable {
    public final /* synthetic */ zzcct zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzccm(zzcct zzcct, boolean z, long j) {
        this.zza = zzcct;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzc.zzv(this.zzb, this.zzc);
    }
}
