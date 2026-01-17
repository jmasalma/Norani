package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbea implements Runnable {
    public final /* synthetic */ zzbed zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzbea(zzbed zzbed, int i) {
        this.zza = zzbed;
        this.zzb = i;
    }

    public final void run() {
        zzbed.zzb(this.zza, this.zzb);
    }
}
