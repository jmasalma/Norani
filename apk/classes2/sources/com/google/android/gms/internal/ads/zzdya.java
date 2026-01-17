package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdya implements zzgdj {
    final /* synthetic */ zzdyb zza;

    zzdya(zzdyb zzdyb) {
        Objects.requireNonNull(zzdyb);
        this.zza = zzdyb;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcn zzfcn = (zzfcn) obj;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcv)).booleanValue()) {
            this.zza.zzl.zzdo(zzfcn);
        }
    }
}
