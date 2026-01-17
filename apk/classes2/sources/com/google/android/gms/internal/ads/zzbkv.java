package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkv implements zzbkf {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    public final void zza(Object obj, Map map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            str = "\n".concat(String.valueOf(str5));
        }
        synchronized (this.zza) {
            zzbku zzbku = (zzbku) this.zzb.remove(str2);
            if (zzbku == null) {
                int i = zze.zza;
                zzo.zzj("Received result for unexpected method invocation: " + str2);
            } else if (!TextUtils.isEmpty(str3)) {
                zzbku.zza(str4 + str);
            } else if (str6 == null) {
                zzbku.zzb((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zze.zzc()) {
                        zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbku.zzb(jSONObject);
                } catch (JSONException e) {
                    zzbku.zza(e.getMessage());
                }
            }
        }
    }

    public final ListenableFuture zzb(zzbnm zzbnm, String str, JSONObject jSONObject) {
        zzcak zzcak = new zzcak();
        zzv.zzr();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbkt(this, zzcak));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbnm.zzp(str, jSONObject2);
        } catch (Exception e) {
            zzcak.zzd(e);
        }
        return zzcak;
    }

    public final void zzc(String str, zzbku zzbku) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbku);
        }
    }
}
