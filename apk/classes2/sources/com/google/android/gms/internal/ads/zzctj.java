package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzctj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzctj(zzcti zzcti, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzctj zza(zzcti zzcti, zzhha zzhha, zzhha zzhha2) {
        return new zzctj(zzcti, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzb zzb2 = new zzb((Context) this.zza.zzb(), (zzbya) this.zzb.zzb(), (zzbuy) null);
        zzb zzb3 = zzb2;
        return zzb2;
    }
}
