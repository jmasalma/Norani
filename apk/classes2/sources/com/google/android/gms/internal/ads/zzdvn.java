package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdvn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdvn(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzdvn zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdvn(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        WeakReference zzc2 = ((zzchm) this.zzb).zzc();
        WeakReference weakReference = zzc2;
        zzdwh zzdwh = new zzdwh();
        zzdwh zzdwh2 = zzdwh;
        zzgdy zzc3 = zzffu.zzc();
        zzgdy zzgdy = zzc3;
        zzdwf zzdwf = new zzdwf(zza2, zzc2, (zzdvt) this.zzc.zzb(), zzdwh, zzc3);
        zzdwf zzdwf2 = zzdwf;
        return zzdwf;
    }
}
