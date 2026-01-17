package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdin implements zzgdj {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdio zzb;

    zzdin(zzdio zzdio, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdio);
        this.zzb = zzdio;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfH)).booleanValue()) {
            zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzag(this.zza, (zzedh) obj);
    }
}
