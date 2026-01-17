package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchz implements zzhgr {
    private final zzchh zza;

    private zzchz(zzchh zzchh) {
        this.zza = zzchh;
    }

    public static VersionInfoParcel zzc(zzchh zzchh) {
        VersionInfoParcel zze = zzchh.zze();
        zzhgz.zzb(zze);
        VersionInfoParcel versionInfoParcel = zze;
        return zze;
    }

    public static zzchz zzd(zzchh zzchh) {
        return new zzchz(zzchh);
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
