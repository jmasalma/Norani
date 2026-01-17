package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyu implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzbyu(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzbyu zza(zzhha zzhha, zzhha zzhha2) {
        return new zzbyu(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbyf zza2 = ((zzbyg) this.zzb).zzb();
        zzbyf zzbyf = zza2;
        return new zzbyt((Context) this.zza.zzb(), zza2);
    }
}
