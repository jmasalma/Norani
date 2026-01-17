package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdix extends zzdiy {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdix(zzfca zzfca, JSONObject jSONObject) {
        super(zzfca);
        boolean z = false;
        this.zzb = zzbs.zzh(jSONObject, new String[]{"tracking_urls_and_actions", "active_view"});
        this.zzc = zzbs.zzl(false, jSONObject, new String[]{"allow_pub_owned_ad_view"});
        this.zzd = zzbs.zzl(false, jSONObject, new String[]{"attribution", "allow_pub_rendering"});
        this.zze = zzbs.zzl(false, jSONObject, new String[]{"enable_omid"});
        this.zzg = zzbs.zzb("", jSONObject, new String[]{"watermark_overlay_png_base64"});
        this.zzf = jSONObject.optJSONObject("overlay") != null ? true : z;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    public final zzfcz zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfcz(jSONObject) : this.zza.zzV;
    }

    public final String zzb() {
        return this.zzg;
    }

    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
