package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfpj;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzj implements zzfpj {
    final /* synthetic */ zzk zza;

    zzj(zzk zzk) {
        Objects.requireNonNull(zzk);
        this.zza = zzk;
    }

    public final void zza(int i, long j) {
        this.zza.zzj.zzd(i, System.currentTimeMillis() - j);
    }

    public final void zzb(int i, long j, String str) {
        this.zza.zzj.zze(i, System.currentTimeMillis() - j, str);
    }
}
