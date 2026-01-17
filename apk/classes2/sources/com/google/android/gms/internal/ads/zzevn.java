package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevn implements zzeub {
    final String zza;
    final int zzb;

    public zzevn(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(str) && (i = this.zzb) != -1) {
            try {
                JSONObject zzg = zzbs.zzg(jSONObject, "pii");
                zzg.put("pvid", str);
                zzg.put("pvid_s", i);
            } catch (JSONException e) {
                zze.zzb("Failed putting gms core app set ID info.", e);
            }
        }
    }
}
