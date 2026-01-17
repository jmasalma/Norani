package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdst implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzdst(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
    }

    public static zzdst zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdst(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CsiParamDefaults csiParamDefaults = this.zzb.get();
        CsiParamDefaults csiParamDefaults2 = csiParamDefaults;
        CsiUrlBuilder csiUrlBuilder = this.zzc.get();
        CsiUrlBuilder csiUrlBuilder2 = csiUrlBuilder;
        Context zza2 = ((zzchl) this.zzd).zza();
        Context context = zza2;
        return new zzdso(zzffu.zzc(), (zzu) this.zza.zzb(), csiParamDefaults, csiUrlBuilder, zza2);
    }
}
