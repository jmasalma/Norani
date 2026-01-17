package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcap implements zzgdj {
    final /* synthetic */ zzcar zza;

    zzcap(zzcar zzcar) {
        Objects.requireNonNull(zzcar);
        this.zza = zzcar;
    }

    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
