package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmz implements Runnable {
    public final /* synthetic */ zzcnc zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcmz(zzcnc zzcnc, int i, int i2) {
        this.zza = zzcnc;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzz(this.zzb - 1, this.zzc);
    }
}
