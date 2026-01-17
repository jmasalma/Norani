package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdnw implements zzbkf {
    final /* synthetic */ zzdny zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbkf zzd;

    /* synthetic */ zzdnw(zzdny zzdny, WeakReference weakReference, String str, zzbkf zzbkf, zzdnx zzdnx) {
        Objects.requireNonNull(zzdny);
        this.zza = zzdny;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbkf;
    }

    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
