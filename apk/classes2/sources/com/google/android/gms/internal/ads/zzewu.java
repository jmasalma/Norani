package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewu implements zzeub {
    private final String zza;

    public zzewu(String str) {
        this.zza = str;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzbs.zzg(jSONObject, "pii").put("adsid", str);
            }
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzk("Failed putting trustless token.", e);
        }
    }
}
