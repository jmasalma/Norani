package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhp {
    private final JSONObject zza;
    private final zzdny zzb;
    private final zzb zzc;
    private final zzbya zzd;

    public zzdhp(JSONObject jSONObject, zzdny zzdny, zzb zzb2, zzbya zzbya) {
        this.zza = jSONObject;
        this.zzb = zzdny;
        this.zzc = zzb2;
        this.zzd = zzbya;
    }

    /* access modifiers changed from: package-private */
    public final zzb zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzbya zzb() {
        return this.zzd;
    }

    public final zzdny zzc() {
        return this.zzb;
    }

    public final JSONObject zzd() {
        return this.zza;
    }
}
