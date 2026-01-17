package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevy implements zzeuc {
    public zzevy(zzbzg zzbzg, zzgdy zzgdy, String str) {
    }

    public final int zza() {
        return 47;
    }

    public final ListenableFuture zzb() {
        ListenableFuture zzh = zzgdn.zzh((Object) null);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgd)).booleanValue()) {
            zzh = zzgdn.zzh((Object) null);
        }
        ListenableFuture zzh2 = zzgdn.zzh((Object) null);
        return zzgdn.zzc(zzh, zzh2).zza(new zzevx(zzh, zzh2), zzcaf.zza);
    }
}
