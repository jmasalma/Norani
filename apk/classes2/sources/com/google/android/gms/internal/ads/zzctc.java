package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzctc implements zzdbq, zzcxm {
    private final Clock zza;
    private final zzcte zzb;
    private final zzfcw zzc;
    private final String zzd;

    zzctc(Clock clock, zzcte zzcte, zzfcw zzfcw, String str) {
        this.zza = clock;
        this.zzb = zzcte;
        this.zzc = zzfcw;
        this.zzd = str;
    }

    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    public final void zzu() {
        Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.elapsedRealtime());
    }
}
