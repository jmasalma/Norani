package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdjr implements Runnable {
    public final /* synthetic */ zzdjt zza;
    public final /* synthetic */ zzdkr zzb;

    public /* synthetic */ zzdjr(zzdjt zzdjt, zzdkr zzdkr) {
        this.zza = zzdjt;
        this.zzb = zzdkr;
    }

    public final void run() {
        zzdjt.zzb(this.zza, this.zzb);
    }
}
