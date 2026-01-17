package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzxg implements zzwz {
    private final zzwz zza;
    private final long zzb;

    public zzxg(zzwz zzwz, long j) {
        this.zza = zzwz;
        this.zzb = j;
    }

    public final int zza(zzkv zzkv, zzhs zzhs, int i) {
        int zza2 = this.zza.zza(zzkv, zzhs, i);
        if (zza2 != -4) {
            return zza2;
        }
        zzhs.zze += this.zzb;
        return -4;
    }

    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzwz zzc() {
        return this.zza;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
