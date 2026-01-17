package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeec implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeec(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeec zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzeec(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeeb((Context) this.zza.zzb(), (zzcog) this.zzb.zzb(), zzffu.zzc());
    }
}
