package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzk zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzi(zzk zzk, boolean z) {
        this.zza = zzk;
        this.zzb = z;
    }

    public final void run() {
        zzk.zzc(this.zza, this.zzb);
    }
}
