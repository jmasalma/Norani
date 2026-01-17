package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdkt implements zzgdj {
    final /* synthetic */ zzdku zza;

    zzdkt(zzdku zzdku) {
        Objects.requireNonNull(zzdku);
        this.zza = zzdku;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfH)).booleanValue()) {
            zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    /* renamed from: zzc */
    public final void zzb(List list) {
        try {
            zzcfg zzcfg = (zzcfg) list.get(0);
            if (zzcfg != null) {
                this.zza.zzb(zzcfg);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzfH)).booleanValue()) {
                zzv.zzp().zzw(e, "omid native display exp");
            }
        }
    }
}
