package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfla implements Runnable {
    final /* synthetic */ zze zza;
    final /* synthetic */ zzfld zzb;

    zzfla(zzfld zzfld, zze zze) {
        this.zza = zze;
        Objects.requireNonNull(zzfld);
        this.zzb = zzfld;
    }

    public final void run() {
        this.zzb.zzJ(this.zza);
    }
}
