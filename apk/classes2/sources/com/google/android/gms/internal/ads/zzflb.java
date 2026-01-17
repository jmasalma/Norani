package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzflb implements Runnable {
    final /* synthetic */ zzfld zza;

    zzflb(zzfld zzfld) {
        Objects.requireNonNull(zzfld);
        this.zza = zzfld;
    }

    public final void run() {
        this.zza.zzI();
    }
}
