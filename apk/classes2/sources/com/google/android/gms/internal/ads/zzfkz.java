package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzea;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfkz implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzea zzb;
    final /* synthetic */ zzfld zzc;

    zzfkz(zzfld zzfld, long j, zzea zzea) {
        this.zza = j;
        this.zzb = zzea;
        Objects.requireNonNull(zzfld);
        this.zzc = zzfld;
    }

    public final void run() {
        zzfld zzfld = this.zzc;
        if (zzfld.zzp != null) {
            zzfld.zzp.zzi(this.zza, zzfld.zzO(this.zzb), zzfld.zzr, zzfld.zze.zzd, zzfld.zzd(), zzfld.zzD());
        }
    }
}
