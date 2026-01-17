package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdbr implements Runnable {
    public final /* synthetic */ zzdbs zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdbr(zzdbs zzdbs, Object obj) {
        this.zza = zzdbs;
        this.zzb = obj;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            zzv.zzp().zzv(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}
