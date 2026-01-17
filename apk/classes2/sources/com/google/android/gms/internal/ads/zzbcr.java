package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbcr extends zzbcv {
    zzbcr(int i, String str, Long l, Long l2) {
        super(1, str, l, l2, (zzbcu) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzm(), ((Long) zzl()).longValue()));
    }

    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzm()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzm())));
        }
        return (Long) zzl();
    }

    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzm(), ((Long) zzl()).longValue()));
    }

    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzm(), ((Long) obj).longValue());
    }
}
