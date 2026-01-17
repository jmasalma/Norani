package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcdu implements Runnable {
    public final /* synthetic */ zzccb zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcdu(zzccb zzccb, boolean z, long j) {
        this.zza = zzccb;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        int i = zzcdw.zzd;
        this.zza.zzv(this.zzb, this.zzc);
    }
}
