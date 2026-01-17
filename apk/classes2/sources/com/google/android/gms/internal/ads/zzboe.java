package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzboe implements zzcam {
    final /* synthetic */ zzboc zza;

    zzboe(zzboh zzboh, zzboc zzboc) {
        this.zza = zzboc;
        Objects.requireNonNull(zzboh);
    }

    public final void zza() {
        zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhZ)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
