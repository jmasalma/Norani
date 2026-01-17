package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbph implements zzbku {
    private final zzcak zza;

    public zzbph(zzbpi zzbpi, zzcak zzcak) {
        Objects.requireNonNull(zzbpi);
        this.zza = zzcak;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zza.zzd(new zzbol());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zza.zzd(new zzbol(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zza.zzd(e);
        }
    }
}
