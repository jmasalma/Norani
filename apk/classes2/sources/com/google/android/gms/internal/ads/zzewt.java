package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewt implements zzeuc {
    private final zzbzs zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgdy zzd;
    private final int zze;
    private final int zzf;

    zzewt(zzbzs zzbzs, boolean z, zzbzh zzbzh, zzgdy zzgdy, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.zza = zzbzs;
        this.zzb = z;
        this.zzd = zzgdy;
        this.zzc = scheduledExecutorService;
        this.zze = i;
        this.zzf = i2;
    }

    public final int zza() {
        return 50;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhk)).booleanValue() && this.zzb) {
            return zzgdn.zzh(new zzewu((String) null));
        }
        if (this.zzf == 2) {
            return zzgdn.zzh(new zzewu((String) null));
        }
        if (!Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzhm)).split(",")).contains(String.valueOf(this.zze))) {
            return zzgdn.zzh(new zzewu((String) null));
        }
        ListenableFuture zzh = zzgdn.zzh((Object) null);
        zzewr zzewr = new zzewr();
        zzgdy zzgdy = this.zzd;
        return zzgdn.zze(zzgdn.zzo(zzgdn.zzm(zzh, zzewr, zzgdy), ((Long) zzbfs.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzews(this), zzgdy);
    }
}
