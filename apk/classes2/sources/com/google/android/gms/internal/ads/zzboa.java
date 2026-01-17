package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzboa implements zzcao {
    final /* synthetic */ zzboc zza;

    zzboa(zzboc zzboc) {
        Objects.requireNonNull(zzboc);
        this.zza = zzboc;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzboj zzboj = (zzboj) obj;
        zze.zza("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
