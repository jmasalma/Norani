package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzftm implements Runnable {
    public final /* synthetic */ zzftw zza;
    public final /* synthetic */ zzftd zzb;
    public final /* synthetic */ zzfub zzc;

    public /* synthetic */ zzftm(zzftw zzftw, zzftd zzftd, zzfub zzfub) {
        this.zza = zzftw;
        this.zzb = zzftd;
        this.zzc = zzfub;
    }

    public final void run() {
        zzftw.zzb(this.zza, this.zzb, this.zzc);
    }
}
