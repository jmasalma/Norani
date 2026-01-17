package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzqa implements Runnable {
    public final /* synthetic */ zzqg zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzqa(zzqg zzqg, Exception exc) {
        this.zza = zzqg;
        this.zzb = exc;
    }

    public final void run() {
        zzqg.zzh(this.zza, this.zzb);
    }
}
