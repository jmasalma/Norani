package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdlm implements zzgdj {
    final /* synthetic */ zzdrr zza;
    final /* synthetic */ zzdln zzb;

    zzdlm(zzdln zzdln, zzdrr zzdrr) {
        this.zza = zzdrr;
        Objects.requireNonNull(zzdln);
        this.zzb = zzdln;
    }

    public final void zza(Throwable th) {
    }

    public final void zzb(Object obj) {
        this.zzb.zzd.zza().putLong(this.zza.zza(), zzv.zzD().currentTimeMillis());
    }
}
