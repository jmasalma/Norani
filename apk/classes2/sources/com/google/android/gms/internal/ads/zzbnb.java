package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbnb {
    public static void zza(zzbnc zzbnc, String str, Map map) {
        try {
            zzbnc.zze(str, zzbb.zzb().zzo(map));
        } catch (JSONException unused) {
            int i = zze.zza;
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbnc zzbnc, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = zze.zza;
        zzo.zze("Dispatching AFMA event: ".concat(sb2));
        zzbnc.zza(sb.toString());
    }

    public static void zzc(zzbnc zzbnc, String str, String str2) {
        zzbnc.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbnc zzbnc, String str, JSONObject jSONObject) {
        zzbnc.zzb(str, jSONObject.toString());
    }
}
