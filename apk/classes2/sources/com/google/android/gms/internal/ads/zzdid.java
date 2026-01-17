package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdid implements Runnable {
    public final /* synthetic */ zzdio zza;
    public final /* synthetic */ zzdkr zzb;

    public /* synthetic */ zzdid(zzdio zzdio, zzdkr zzdkr) {
        this.zza = zzdio;
        this.zzb = zzdkr;
    }

    public final void run() {
        this.zza.zzah(this.zzb);
    }
}
