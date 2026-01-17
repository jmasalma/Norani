package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzqc implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ zzz zzb;
    public final /* synthetic */ zzie zzc;

    public /* synthetic */ zzqc(zzqg zzqg, zzz zzz, zzie zzie) {
        this.zza = zzqg;
        this.zzb = zzz;
        this.zzc = zzie;
    }

    public final void run() {
        zzqg.zzi(this.zza, this.zzb, this.zzc);
    }
}
