package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaqb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaqd zzc;

    zzaqb(zzaqd zzaqd, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzaqd);
        this.zzc = zzaqd;
    }

    public final void run() {
        zzaqd zzaqd = this.zzc;
        zzaqd.zza.zza(this.zza, this.zzb);
        zzaqd.zza.zzb(zzaqd.toString());
    }
}
