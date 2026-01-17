package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcny implements zzhgr {
    private final zzhha zza;

    private zzcny(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcny zza(zzhha zzhha) {
        return new zzcny(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zza).zzc();
        zzfca zzfca = zzc;
        try {
            return new JSONObject(zzc.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
