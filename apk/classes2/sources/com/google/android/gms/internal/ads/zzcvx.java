package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvx implements zzhgr {
    private final zzhha zza;

    private zzcvx(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcvx zza(zzhha zzhha) {
        return new zzcvx(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzcvw(zzc);
    }
}
