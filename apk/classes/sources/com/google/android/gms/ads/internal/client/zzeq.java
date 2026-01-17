package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzeq implements InitializationStatus {
    public final /* synthetic */ zzey zza;

    public /* synthetic */ zzeq(zzey zzey) {
        this.zza = zzey;
    }

    public final Map getAdapterStatusMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzeu(this.zza));
        return hashMap;
    }
}
