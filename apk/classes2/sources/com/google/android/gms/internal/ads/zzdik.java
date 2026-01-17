package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdik implements Runnable {
    public final /* synthetic */ zzdio zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzdik(zzdio zzdio, boolean z) {
        this.zza = zzdio;
        this.zzb = z;
    }

    public final void run() {
        zzdio.zzt(this.zza, this.zzb);
    }
}
