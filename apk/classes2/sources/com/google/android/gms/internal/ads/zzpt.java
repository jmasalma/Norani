package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzpt implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ zzid zzb;

    public /* synthetic */ zzpt(zzqg zzqg, zzid zzid) {
        this.zza = zzqg;
        this.zzb = zzid;
    }

    public final void run() {
        zzqg.zza(this.zza, this.zzb);
    }
}
