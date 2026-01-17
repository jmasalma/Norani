package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbsm implements Runnable {
    public final /* synthetic */ zzbso zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzbsm(zzbso zzbso, boolean z) {
        this.zza = zzbso;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzm(this.zzb);
    }
}
