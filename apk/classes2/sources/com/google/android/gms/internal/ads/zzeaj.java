package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeaj {
    private final zzbvk zza;

    zzeaj(zzbvk zzbvk) {
        this.zza = zzbvk;
    }

    public final void zza() {
        ListenableFuture zza2 = this.zza.zza();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzia)).booleanValue()) {
            zzcai.zzb(zza2, "persistFlags");
        } else {
            zzcai.zza(zza2, "persistFlags");
        }
    }
}
