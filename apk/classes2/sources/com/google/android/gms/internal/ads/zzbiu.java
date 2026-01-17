package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbiu implements zzbkf {
    private final zzbiv zza;

    public zzbiu(zzbiv zzbiv) {
        this.zza = zzbiv;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza != null) {
            String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (str == null) {
                int i = zze.zza;
                zzo.zzi("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzbs.zza(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    int i2 = zze.zza;
                    zzo.zzh("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                int i3 = zze.zza;
                zzo.zzg("Failed to convert ad metadata to Bundle.");
                return;
            }
            this.zza.zza(str, bundle);
        }
    }
}
