package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzpw implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzpw(zzqg zzqg, long j) {
        this.zza = zzqg;
        this.zzb = j;
    }

    public final void run() {
        zzqg.zzc(this.zza, this.zzb);
    }
}
