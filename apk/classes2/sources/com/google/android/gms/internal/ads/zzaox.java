package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaox {
    public final int zza;
    public final long zzb;

    private zzaox(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaox zza(zzadw zzadw, zzen zzen) throws IOException {
        zzadw.zzh(zzen.zzN(), 0, 8);
        zzen.zzL(0);
        return new zzaox(zzen.zzg(), zzen.zzs());
    }
}
