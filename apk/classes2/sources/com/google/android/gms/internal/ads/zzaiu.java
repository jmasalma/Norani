package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaiu implements zzaiq {
    private final zzen zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaiu(zzfd zzfd) {
        zzen zzen = zzfd.zza;
        this.zza = zzen;
        zzen.zzL(12);
        this.zzc = zzen.zzp() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.zzb = zzen.zzp();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzm();
        }
        if (i == 16) {
            return this.zza.zzq();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzm = this.zza.zzm();
        this.zze = zzm;
        return (zzm & 240) >> 4;
    }
}
