package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdlg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdlg(zzdky zzdky, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdlg zza(zzdky zzdky, zzhha zzhha, zzhha zzhha2) {
        return new zzdlg(zzdky, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdoi zza2 = ((zzdoj) this.zza).zzb();
        zzdoi zzdoi = zza2;
        zzddv zzddv = new zzddv(zza2, (Executor) this.zzb.zzb());
        zzddv zzddv2 = zzddv;
        return zzddv;
    }
}
