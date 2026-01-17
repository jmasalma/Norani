package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdfr implements zzhgr {
    private final zzdff zza;
    private final zzhha zzb;

    private zzdfr(zzdff zzdff, zzhha zzhha) {
        this.zza = zzdff;
        this.zzb = zzhha;
    }

    public static zzdfr zza(zzdff zzdff, zzhha zzhha) {
        return new zzdfr(zzdff, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = this.zza.zzf((zzcur) this.zzb.zzb());
        zzhgz.zzb(zzf);
        Set set = zzf;
        return zzf;
    }
}
