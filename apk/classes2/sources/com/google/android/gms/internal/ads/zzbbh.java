package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbh implements zzazw {
    final /* synthetic */ zzbbk zza;

    zzbbh(zzbbk zzbbk) {
        Objects.requireNonNull(zzbbk);
        this.zza = zzbbk;
    }

    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbbk.zzh(this.zza);
        }
    }
}
