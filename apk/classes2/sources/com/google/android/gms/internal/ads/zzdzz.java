package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdzz implements zzbop {
    zzdzz() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeaa zzeaa = (zzeaa) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjI)).booleanValue()) {
            zzbvs zzbvs = zzeaa.zzd;
            jSONObject2.put("ad_request_url", zzbvs.zzg());
            jSONObject2.put("ad_request_post_body", zzbvs.zzf());
        }
        zzbvs zzbvs2 = zzeaa.zzd;
        jSONObject2.put("base_url", zzbvs2.zzd());
        jSONObject2.put("signals", zzeaa.zzc);
        zzeae zzeae = zzeaa.zzb;
        jSONObject3.put("body", zzeae.zzc);
        jSONObject3.put("headers", zzbb.zzb().zzo(zzeae.zzb));
        jSONObject3.put("response_code", zzeae.zza);
        jSONObject3.put("latency", zzeae.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbvs2.zzi());
        return jSONObject;
    }
}
