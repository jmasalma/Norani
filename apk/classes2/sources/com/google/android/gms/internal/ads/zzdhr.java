package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhr implements zzhgr {
    private final zzdhp zza;

    private zzdhr(zzdhp zzdhp) {
        this.zza = zzdhp;
    }

    public static zzdhr zza(zzdhp zzdhp) {
        return new zzdhr(zzdhp);
    }

    public static JSONObject zzc(zzdhp zzdhp) {
        JSONObject zzd = zzdhp.zzd();
        zzhgz.zzb(zzd);
        JSONObject jSONObject = zzd;
        return zzd;
    }

    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }

    public final JSONObject zzd() {
        return zzc(this.zza);
    }
}
