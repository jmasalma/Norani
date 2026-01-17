package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdyf implements zzgdj {
    final /* synthetic */ Context zza;

    zzdyf(Context context) {
        this.zza = context;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbew.zzh.zze()).booleanValue() && (th instanceof zzba)) {
            zzbco.zze(this.zza);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdyy zzdyy = (zzdyy) obj;
        if (((Boolean) zzbew.zzj.zze()).booleanValue()) {
            zzbco.zze(this.zza);
        }
    }
}
