package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdtn {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    /* synthetic */ zzdtn(String str, zzdto zzdto) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdtn zzdtn) {
        String str = (String) zzbd.zzc().zzb(zzbde.zzku);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtn.zza);
            jSONObject.put("eventCategory", zzdtn.zzb);
            jSONObject.putOpt("event", zzdtn.zzc);
            jSONObject.putOpt("errorCode", zzdtn.zzd);
            jSONObject.putOpt("rewardType", zzdtn.zze);
            jSONObject.putOpt("rewardAmount", zzdtn.zzf);
        } catch (JSONException unused) {
            int i = zze.zza;
            zzo.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
