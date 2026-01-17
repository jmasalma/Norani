package com.google.android.gms.ads.internal.overlay;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzx implements Runnable {
    public final /* synthetic */ zzz zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;

    public /* synthetic */ zzx(zzz zzz, String str, Map map) {
        this.zza = zzz;
        this.zzb = str;
        this.zzc = map;
    }

    public final void run() {
        zzz.zza(this.zza, this.zzb, this.zzc);
    }
}
