package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdim implements zzgdj {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdio zzb;

    zzdim(zzdio zzdio, String str, boolean z) {
        Objects.requireNonNull(zzdio);
        this.zzb = zzdio;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfH)).booleanValue()) {
            zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdio zzdio = this.zzb;
        zzdio.zze.zzT((zzcfg) obj);
        zzcak zzp = zzdio.zze.zzp();
        zzedh zzf = zzdio.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
