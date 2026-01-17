package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdbx implements zzhgr {
    private final zzdbw zza;
    private final zzhha zzb;

    private zzdbx(zzdbw zzdbw, zzhha zzhha) {
        this.zza = zzdbw;
        this.zzb = zzhha;
    }

    public static zzdbx zza(zzdbw zzdbw, zzhha zzhha) {
        return new zzdbx(zzdbw, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zzb).zzb();
        Set set = zzc;
        zzcwa zza2 = this.zza.zza(zzc);
        zzhgz.zzb(zza2);
        zzcwa zzcwa = zza2;
        return zza2;
    }
}
