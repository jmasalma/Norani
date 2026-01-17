package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzafk implements zzaeu {
    final /* synthetic */ zzafn zza;
    private final long zzb;

    public zzafk(zzafn zzafn, long j) {
        Objects.requireNonNull(zzafn);
        this.zza = zzafn;
        this.zzb = j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final zzaes zzg(long j) {
        zzafn zzafn = this.zza;
        zzaes zza2 = zzafn.zzi[0].zza(j);
        for (int i = 1; i < zzafn.zzi.length; i++) {
            zzaes zza3 = zzafn.zzi[i].zza(j);
            if (zza3.zza.zzc < zza2.zza.zzc) {
                zza2 = zza3;
            }
        }
        return zza2;
    }

    public final boolean zzh() {
        return true;
    }
}
