package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfee implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzfee(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzfee zza(zzhha zzhha, zzhha zzhha2) {
        return new zzfee(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzbzw zza3 = ((zzcic) this.zzb).zzb();
        zzbzw zzbzw = zza3;
        return new zzfed(zza2, zza3);
    }
}
