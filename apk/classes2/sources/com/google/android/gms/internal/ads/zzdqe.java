package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdqe {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdqe(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (!this.zzf.getAndSet(true)) {
            zzv.zzp().zzi().zzo(new zzdqc(this));
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        Map map;
        this.zzd = true;
        zzbzm zzg = zzv.zzp().zzi().zzg();
        if (zzg != null) {
            JSONObject zzf2 = zzg.zzf();
            if (zzf2 != null) {
                this.zzb = ((Boolean) zzbd.zzc().zzb(zzbde.zzes)).booleanValue() ? zzf2.optJSONObject("common_settings") : null;
                this.zze = zzf2.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzf2.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                Map map2 = this.zza;
                                if (map2.containsKey(optString2)) {
                                    map = (Map) map2.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    map2.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    @CheckForNull
    public final JSONObject zza() {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzes)).booleanValue()) {
            return null;
        }
        return this.zzb;
    }

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzeq)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzh();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzer)).booleanValue()) {
                zzg();
            }
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza2 = zzdqg.zza(this.zze, str, str2);
        if (zza2 != null) {
            return (JSONObject) map.get(zza2);
        }
        return null;
    }

    public final void zzf() {
        zzg();
        this.zzc.execute(new zzdqb(this));
    }
}
