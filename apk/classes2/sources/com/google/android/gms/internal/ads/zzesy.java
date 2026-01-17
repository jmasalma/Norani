package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesy implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzesy(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzesy zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzesy(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzesw zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc3;
        VersionInfoParcel zza3 = ((zzchz) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        return new zzesw(zza2, zzc2, zzc3, zza3);
    }
}
