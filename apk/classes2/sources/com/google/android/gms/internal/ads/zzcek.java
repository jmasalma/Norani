package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcek implements Runnable {
    public final /* synthetic */ zzccb zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcek(zzccb zzccb, Map map) {
        this.zza = zzccb;
        this.zzb = map;
    }

    public final void run() {
        int i = zzceo.zza;
        this.zza.zzd("onGcacheInfoEvent", this.zzb);
    }
}
