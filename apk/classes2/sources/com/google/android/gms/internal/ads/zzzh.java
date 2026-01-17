package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzzh implements Runnable {
    public final /* synthetic */ zzzi zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzzh(zzzi zzzi, int i, long j, long j2) {
        this.zza = zzzi;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        this.zza.zzb.zzZ(this.zzb, this.zzc, this.zzd);
    }
}
