package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzpx implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzpx(zzqg zzqg, int i, long j, long j2) {
        this.zza = zzqg;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        zzqg.zze(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
