package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzflc implements Runnable {
    final /* synthetic */ zzfld zza;

    zzflc(zzfld zzfld) {
        Objects.requireNonNull(zzfld);
        this.zza = zzfld;
    }

    public final void run() {
        zzfld zzfld = this.zza;
        if (zzfld.zzp != null) {
            zzfld.zzp.zzj(zzfld.zzq.currentTimeMillis(), zzfld.zzr, zzfld.zze.zzd, zzfld.zzD());
        }
    }
}
