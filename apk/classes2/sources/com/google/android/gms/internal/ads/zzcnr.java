package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcnr(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcnr zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcnr(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zza).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String str = (String) this.zzc.zzb();
        boolean equals = "native".equals(str);
        zzv.zzr();
        zzayz zzayz = new zzayz(UUID.randomUUID().toString(), zza2, str, (JSONObject) this.zzb.zzb(), false, equals);
        zzayz zzayz2 = zzayz;
        return zzayz;
    }
}
