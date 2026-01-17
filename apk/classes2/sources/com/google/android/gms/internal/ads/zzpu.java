package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzpu implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzpu(zzqg zzqg, int i) {
        this.zza = zzqg;
        this.zzb = i;
    }

    public final void run() {
        zzqg.zzg(this.zza, this.zzb);
    }
}
