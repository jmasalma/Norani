package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbnk implements zzbkf {
    final /* synthetic */ zzbnl zza;
    /* access modifiers changed from: private */
    public final zzbkf zzb;

    public zzbnk(zzbnl zzbnl, zzbkf zzbkf) {
        Objects.requireNonNull(zzbnl);
        this.zza = zzbnl;
        this.zzb = zzbkf;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        this.zzb.zza(this.zza, map);
    }
}
