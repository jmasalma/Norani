package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbj implements zzhgr {
    private final zzhha zza;

    private zzbj(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzbj zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzbj(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzbi zzb() {
        zzdxo zza2 = this.zza.zza();
        zzdxo zzdxo = zza2;
        return new zzbi(zzffu.zzc(), zza2);
    }
}
