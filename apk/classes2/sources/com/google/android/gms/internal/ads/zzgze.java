package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgze implements zzgyv {
    final int zza;
    final zzhck zzb;
    final boolean zzc;
    final boolean zzd;

    zzgze(zzgzm zzgzm, int i, zzhck zzhck, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzhck;
        this.zzc = z;
        this.zzd = z2;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgze) obj).zza;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhck zzb() {
        return this.zzb;
    }

    public final zzhcl zzc() {
        return this.zzb.zza();
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
