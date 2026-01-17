package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfto implements Runnable {
    public final /* synthetic */ zzftw zza;
    public final /* synthetic */ zzfud zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzfub zzd;

    public /* synthetic */ zzfto(zzftw zzftw, zzfud zzfud, int i, zzfub zzfub) {
        this.zza = zzftw;
        this.zzb = zzfud;
        this.zzc = i;
        this.zzd = zzfub;
    }

    public final void run() {
        zzftw.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
