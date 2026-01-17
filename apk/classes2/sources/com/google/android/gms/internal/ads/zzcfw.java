package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfw implements Runnable {
    public final /* synthetic */ zzcfy zza;
    public final /* synthetic */ zzedf zzb;

    public /* synthetic */ zzcfw(zzcfy zzcfy, zzedf zzedf) {
        this.zza = zzcfy;
        this.zzb = zzedf;
    }

    public final void run() {
        this.zzb.zzf(new zzcfx(this.zza));
    }
}
