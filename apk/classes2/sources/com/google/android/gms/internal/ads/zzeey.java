package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeey implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeey(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeey zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeey(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeex zzb() {
        return new zzeex((Context) this.zza.zzb(), (zzcpx) this.zzb.zzb());
    }
}
