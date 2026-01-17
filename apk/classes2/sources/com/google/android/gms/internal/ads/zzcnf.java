package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcnf implements zzbkf {
    final /* synthetic */ zzcni zza;

    zzcnf(zzcni zzcni) {
        Objects.requireNonNull(zzcni);
        this.zza = zzcni;
    }

    public final void zza(Object obj, Map map) {
        zzcni zzcni = this.zza;
        if (zzcni.zzg(zzcni, map)) {
            zzcni.zzc.execute(new zzcne(this));
        }
    }
}
