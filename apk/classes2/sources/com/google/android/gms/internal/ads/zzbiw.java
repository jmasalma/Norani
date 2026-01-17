package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbiw implements zzbkf {
    private final zzbix zza;

    public zzbiw(zzbix zzbix) {
        this.zza = zzbix;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            int i = zze.zza;
            zzo.zzj("App event with no name parameter.");
            return;
        }
        this.zza.zzb(str, (String) map.get("info"));
    }
}
