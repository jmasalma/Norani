package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjv implements zzbkf {
    zzbjv() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcfg.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (JSONException e) {
            zzv.zzp().zzw(e, "GMSG clear local storage keys handler");
        }
    }
}
