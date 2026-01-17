package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdja implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdja(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdja zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdja(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zza).zzc();
        zzfca zzfca = zzc;
        JSONObject zzd = ((zzdhr) this.zzb).zzd();
        JSONObject jSONObject = zzd;
        return new zzdix(zzc, zzd);
    }
}
