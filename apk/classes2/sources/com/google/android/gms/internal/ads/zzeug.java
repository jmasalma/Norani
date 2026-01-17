package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeug implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzeug(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
    }

    public static zzeug zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzeug(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    /* renamed from: zza */
    public final zzeuf zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        Set zzc2 = ((zzhhd) this.zzb).zzb();
        Set set = zzc2;
        return new zzeuf(zza2, zzffu.zzc(), zzc2, (zzfhu) this.zzc.zzb(), (zzdsj) this.zzd.zzb());
    }
}
