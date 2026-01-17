package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcck implements Runnable {
    public final /* synthetic */ zzcct zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcck(zzcct zzcct, int i, int i2) {
        this.zza = zzcct;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        zzcct.zzO(this.zza, this.zzb, this.zzc);
    }
}
