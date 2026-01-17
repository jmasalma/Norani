package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeek implements Runnable {
    public final /* synthetic */ zzeen zza;
    public final /* synthetic */ zzcfg zzb;

    public /* synthetic */ zzeek(zzeen zzeen, zzcfg zzcfg) {
        this.zza = zzeen;
        this.zzb = zzcfg;
    }

    public final void run() {
        zzeen.zzd(this.zza, this.zzb);
    }
}
