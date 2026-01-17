package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzccn implements Runnable {
    public final /* synthetic */ zzcct zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzccn(zzcct zzcct, String str) {
        this.zza = zzcct;
        this.zzb = str;
    }

    public final void run() {
        zzcct.zzQ(this.zza, this.zzb);
    }
}
