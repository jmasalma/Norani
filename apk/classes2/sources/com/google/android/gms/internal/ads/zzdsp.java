package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdsp implements Runnable {
    public final /* synthetic */ zzdss zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsp(zzdss zzdss, String str) {
        this.zza = zzdss;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzd.zza(this.zzb);
    }
}
