package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbod implements zzcao {
    final /* synthetic */ zzboc zza;

    zzbod(zzboh zzboh, zzboc zzboc) {
        this.zza = zzboc;
        Objects.requireNonNull(zzboh);
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zze.zza("Getting a new session for JS Engine.");
        this.zza.zzi(((zzbnd) obj).zzj());
    }
}
