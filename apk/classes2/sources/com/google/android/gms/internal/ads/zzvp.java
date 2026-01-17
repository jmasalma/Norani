package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzvp implements Runnable {
    public final /* synthetic */ zzdn zza;
    public final /* synthetic */ zzvs zzb;

    public /* synthetic */ zzvp(zzdn zzdn, zzvs zzvs) {
        this.zza = zzdn;
        this.zzb = zzvs;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
