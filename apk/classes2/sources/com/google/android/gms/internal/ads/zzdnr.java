package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdnr implements zzgdj {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    zzdnr(zzdny zzdny, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdny);
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcfg) obj).zzd(this.zza, this.zzb);
    }
}
