package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzyg implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzyg(zzz zzz, int i) {
        this.zza = 1 != (zzz.zze & 1) ? false : true;
        this.zzb = zzmb.zza(i, false);
    }

    /* renamed from: zza */
    public final int compareTo(zzyg zzyg) {
        return zzfyf.zzj().zzd(this.zzb, zzyg.zzb).zzd(this.zza, zzyg.zza).zza();
    }
}
