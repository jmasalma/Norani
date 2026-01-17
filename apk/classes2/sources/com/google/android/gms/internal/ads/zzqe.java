package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzqe implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzqe(zzqg zzqg, String str, long j, long j2) {
        this.zza = zzqg;
        this.zzb = str;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        zzqg.zzl(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
