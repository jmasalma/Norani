package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbs extends zzcak {
    final /* synthetic */ zzbby zza;

    zzbbs(zzbby zzbby) {
        Objects.requireNonNull(zzbby);
        this.zza = zzbby;
    }

    public final boolean cancel(boolean z) {
        zzbby.zze(this.zza);
        return super.cancel(z);
    }
}
