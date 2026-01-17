package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzki implements Runnable {
    public final /* synthetic */ zzkt zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzki(zzkt zzkt, int i, boolean z) {
        this.zza = zzkt;
        this.zzb = i;
        this.zzc = z;
    }

    public final void run() {
        this.zza.zzv.zzJ(this.zzb, this.zza.zzb[this.zzb].zzb(), this.zzc);
    }
}
