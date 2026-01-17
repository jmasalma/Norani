package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhx implements zzhgr {
    private final zzhha zza;

    private zzdhx(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdhx zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdhx(zzhha, zzhha2);
    }

    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zza).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String str = "native";
        String str2 = "native";
        zzv.zzr();
        zzayz zzayz = new zzayz(UUID.randomUUID().toString(), zza2, "native", new JSONObject(), false, true);
        zzayz zzayz2 = zzayz;
        return zzayz;
    }
}
