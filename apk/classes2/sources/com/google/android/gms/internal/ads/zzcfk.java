package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfk implements Runnable {
    public final /* synthetic */ zzcfo zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcfk(zzcfo zzcfo, boolean z, long j) {
        this.zza = zzcfo;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzc.zzv(this.zzb, this.zzc);
    }
}
