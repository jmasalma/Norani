package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeoc implements zzhgr {
    private final zzhha zza;

    private zzeoc(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzeoc zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeoc(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeoa zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zza).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        return new zzeoa(zza2, zzc);
    }
}
