package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdfy implements zzhgr {
    private final zzdff zza;
    private final zzhha zzb;

    private zzdfy(zzdff zzdff, zzhha zzhha) {
        this.zza = zzdff;
        this.zzb = zzhha;
    }

    public static zzdfy zza(zzdff zzdff, zzhha zzhha) {
        return new zzdfy(zzdff, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddv zzd = this.zza.zzd((Executor) this.zzb.zzb());
        zzddv zzddv = zzd;
        return zzd;
    }
}
