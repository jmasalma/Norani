package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class CsiParamDefaults_Factory implements zzhgr<CsiParamDefaults> {
    private final zzhha zza;
    private final zzhha zzb;

    private CsiParamDefaults_Factory(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static CsiParamDefaults_Factory create(zzhha<Context> zzhha, zzhha<VersionInfoParcel> zzhha2) {
        return new CsiParamDefaults_Factory(zzhha, zzhha2);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    /* renamed from: get */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
