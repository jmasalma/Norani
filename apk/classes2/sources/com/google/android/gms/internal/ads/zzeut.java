package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeut implements Runnable {
    public final /* synthetic */ Throwable zza;

    public /* synthetic */ zzeut(Throwable th) {
        this.zza = th;
    }

    public final void run() {
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzkR)).booleanValue();
        Throwable th = this.zza;
        if (booleanValue) {
            zzv.zzp().zzx(th, "TopicsSignalUnsampled.fetchTopicsSignal");
        } else {
            zzv.zzp().zzv(th, "TopicsSignal.fetchTopicsSignal");
        }
    }
}
