package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcsr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcsr(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcsr zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcsr(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsq((Clock) this.zza.zzb(), (zzbzl) this.zzb.zzb());
    }
}
