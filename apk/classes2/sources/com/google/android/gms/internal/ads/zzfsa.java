package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfsa {
    private final String zza;
    private final long zzb;

    public zzfsa() {
        this.zza = null;
        this.zzb = -1;
    }

    public zzfsa(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }
}
