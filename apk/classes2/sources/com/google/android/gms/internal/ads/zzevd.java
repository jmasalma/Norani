package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevd implements zzeub {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfsa zzc;

    public zzevd(AdvertisingIdClient.Info info, String str, zzfsa zzfsa) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfsa;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            JSONObject zzg = zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzg.put("pdid", str);
                    zzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzg.put("rdid", info.getId());
            zzg.put("is_lat", info.isLimitAdTrackingEnabled());
            zzg.put("idtype", "adid");
            zzfsa zzfsa = this.zzc;
            if (zzfsa.zzc()) {
                zzg.put("paidv1_id_android_3p", zzfsa.zzb());
                zzg.put("paidv1_creation_time_android_3p", zzfsa.zza());
            }
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
