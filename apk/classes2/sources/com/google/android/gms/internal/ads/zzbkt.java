package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbkt implements zzbku {
    final /* synthetic */ zzcak zza;

    zzbkt(zzbkv zzbkv, zzcak zzcak) {
        this.zza = zzcak;
        Objects.requireNonNull(zzbkv);
    }

    public final void zza(String str) {
        this.zza.zzd(new zzbol(str));
    }

    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
