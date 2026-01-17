package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcgk implements Runnable {
    public final /* synthetic */ zzcgm zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcgk(zzcgm zzcgm, String str) {
        this.zza = zzcgm;
        this.zzb = str;
    }

    public final void run() {
        zzcgm.zza(this.zza, this.zzb);
    }
}
