package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyu implements zzdyw {
    private final Map zza;
    private final zzgdy zzb;
    /* access modifiers changed from: private */
    public final zzcyy zzc;

    public zzdyu(Map map, zzgdy zzgdy, zzcyy zzcyy) {
        this.zza = map;
        this.zzb = zzgdy;
        this.zzc = zzcyy;
    }

    public final ListenableFuture zzc(zzbvq zzbvq) {
        this.zzc.zzdn(zzbvq);
        ListenableFuture zzg = zzgdn.zzg(new zzdwm(3));
        for (String trim : ((String) zzbd.zzc().zzb(zzbde.zziD)).split(",")) {
            zzhhg zzhhg = (zzhhg) this.zza.get(trim.trim());
            if (zzhhg != null) {
                zzg = zzgdn.zzf(zzg, zzdwm.class, new zzdys(zzhhg, zzbvq), this.zzb);
            }
        }
        zzgdn.zzr(zzg, new zzdyt(this), zzcaf.zzg);
        return zzg;
    }
}
