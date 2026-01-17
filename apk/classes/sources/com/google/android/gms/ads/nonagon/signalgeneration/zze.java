package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zze implements zzhgr {
    private final zzhha zza;

    private zze(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zze zza(zzhha zzhha) {
        return new zze(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = this.zza.zza();
        Context context = zza2;
        return new zzd(zza2);
    }
}
