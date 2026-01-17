package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzy implements zzhgr {
    private final zzhha zza;

    private zzy(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzy zza(zzhha zzhha) {
        return new zzy(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzv((zzdso) this.zza.zzb());
    }
}
