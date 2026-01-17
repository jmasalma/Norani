package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbzm {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private String zzd = "";
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private boolean zzj = false;

    public zzbzm(String str, long j) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        this.zze = str;
        this.zzf = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzg = new JSONObject(str);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzmc)).booleanValue() && zzj()) {
                    return;
                }
                if (this.zzg.optInt("status", -1) != 1) {
                    this.zzh = false;
                    int i = zze.zza;
                    zzo.zzj("App settings could not be fetched successfully.");
                    return;
                }
                this.zzh = true;
                this.zzd = this.zzg.optString("app_id");
                JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.zzb.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject2 = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.zzc.put(optString2, new zzbpk(optJSONObject2));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        this.zza.add(optJSONArray3.optString(i3));
                    }
                }
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzhc)).booleanValue()) {
                    JSONObject optJSONObject3 = this.zzg.optJSONObject("common_settings");
                    if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("loeid")) == null)) {
                        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                            this.zzi.add(optJSONArray.get(i4).toString());
                        }
                    }
                }
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzgy)).booleanValue() && (optJSONObject = this.zzg.optJSONObject("common_settings")) != null) {
                    this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                int i5 = zze.zza;
                zzo.zzk("Exception occurred while processing app setting json", e);
                zzv.zzp().zzw(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j) {
        this.zzf = j;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbcv zzbcv = zzbde.zzmf;
            long longValue = ((Long) zzbd.zzc().zzb(zzbcv)).longValue();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzme)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                longValue = this.zzg.optLong("cache_ttl_sec", ((Long) zzbd.zzc().zzb(zzbcv)).longValue());
            }
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            if (longValue >= 0 && (this.zzf > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - this.zzf) > longValue)) {
                this.zza.clear();
                this.zzb.clear();
                this.zzc.clear();
                this.zzd = "";
                this.zze = "";
                this.zzg = null;
                this.zzh = false;
                this.zzi.clear();
                this.zzj = false;
                return true;
            }
        }
        return false;
    }
}
