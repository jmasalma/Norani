package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzr(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzr zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzr(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = this.zza.zza();
        Context context = zza2;
        return new zzo(zza2, (zzdso) this.zzb.zzb(), zzffu.zzc());
    }
}
