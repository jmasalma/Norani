package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzea;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfky implements Runnable {
    final /* synthetic */ zzea zza;
    final /* synthetic */ zzfld zzb;

    zzfky(zzfld zzfld, zzea zzea) {
        this.zza = zzea;
        Objects.requireNonNull(zzfld);
        this.zzb = zzfld;
    }

    public final void run() {
        this.zzb.zzH(this.zza);
    }
}
