package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcko;
import com.google.android.gms.internal.ads.zzepn;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzg(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha4;
    }

    public static zzg zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzg(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = this.zza.zza();
        Context context = zza2;
        zzbcn zza3 = zzcko.zza();
        zzbcn zzbcn = zza3;
        List zzc = zzepn.zzc();
        List list = zzc;
        VersionInfoParcel zza4 = this.zzb.zza();
        VersionInfoParcel versionInfoParcel = zza4;
        return new zzf(zza2, zza3, zzc, zza4);
    }
}
