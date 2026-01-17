package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcgg implements Runnable {
    public final /* synthetic */ zzcgi zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcgg(zzcgi zzcgi, Map map) {
        this.zza = zzcgi;
        this.zzb = map;
    }

    public final void run() {
        this.zza.zza.zzd("pubVideoCmd", this.zzb);
    }
}
