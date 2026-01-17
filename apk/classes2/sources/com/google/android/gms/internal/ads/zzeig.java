package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeig implements Runnable {
    public final /* synthetic */ zzeih zza;
    public final /* synthetic */ zzfcn zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ zzedp zzd;

    public /* synthetic */ zzeig(zzeih zzeih, zzfcn zzfcn, zzfca zzfca, zzedp zzedp) {
        this.zza = zzeih;
        this.zzb = zzfcn;
        this.zzc = zzfca;
        this.zzd = zzedp;
    }

    public final void run() {
        zzeik.zze(this.zzb, this.zzc, this.zzd);
    }
}
