package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcwm implements zzhgr {
    private final zzhha zza;

    private zzcwm(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcwm zzc(zzhha zzhha) {
        return new zzcwm(zzhha);
    }

    /* renamed from: zza */
    public final zzcwk zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzcwk(zzc);
    }
}
