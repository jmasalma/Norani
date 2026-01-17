package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzazy implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbac zzb;

    zzazy(zzbac zzbac, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbac);
        this.zzb = zzbac;
    }

    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
