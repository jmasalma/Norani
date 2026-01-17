package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzqf implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzqf(zzqg zzqg, String str) {
        this.zza = zzqg;
        this.zzb = str;
    }

    public final void run() {
        zzqg.zzb(this.zza, this.zzb);
    }
}
