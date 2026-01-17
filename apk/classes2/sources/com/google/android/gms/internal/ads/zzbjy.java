package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjy implements zzbkf {
    zzbjy() {
    }

    public final void zza(Object obj, Map map) {
        String valueOf = String.valueOf((String) map.get("string"));
        int i = zze.zza;
        zzo.zzi("Received log message: ".concat(valueOf));
    }
}
