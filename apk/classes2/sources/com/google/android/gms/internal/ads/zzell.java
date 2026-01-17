package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbk;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzell {
    private final zzdje zza;
    private final zzeky zzb;
    private final zzcwb zzc;

    public zzell(zzdje zzdje, zzdsj zzdsj) {
        this.zza = zzdje;
        zzeky zzeky = new zzeky(zzdsj);
        this.zzb = zzeky;
        this.zzc = new zzelk(zzeky, zzdje.zzg());
    }

    public final zzcwb zza() {
        return this.zzc;
    }

    public final zzcxm zzb() {
        return this.zzb;
    }

    public final zzdgw zzc() {
        return new zzdgw(this.zza, this.zzb.zzg());
    }

    public final zzeky zzd() {
        return this.zzb;
    }

    public final void zze(zzbk zzbk) {
        this.zzb.zzj(zzbk);
    }
}
