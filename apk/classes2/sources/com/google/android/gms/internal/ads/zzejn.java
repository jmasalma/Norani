package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzejn implements zzg {
    final /* synthetic */ zzdfc zza;

    zzejn(zzejo zzejo, zzdfc zzdfc) {
        this.zza = zzdfc;
        Objects.requireNonNull(zzejo);
    }

    public final void zza(View view) {
    }

    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    public final void zzc() {
        zzdfc zzdfc = this.zza;
        zzdfc.zzc().zza();
        zzdfc.zzf().zza();
    }
}
