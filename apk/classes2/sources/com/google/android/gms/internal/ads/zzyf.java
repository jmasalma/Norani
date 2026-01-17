package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzyf extends zzyp implements Comparable {
    private final int zze;
    private final int zzf = this.zzd.zza();

    public zzyf(int i, zzbm zzbm, int i2, zzyi zzyi, int i3) {
        super(i, zzbm, i2);
        this.zze = zzmb.zza(i3, zzyi.zzR) ? 1 : 0;
    }

    /* renamed from: zza */
    public final int compareTo(zzyf zzyf) {
        return Integer.compare(this.zzf, zzyf.zzf);
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzyp) {
        zzyf zzyf = (zzyf) zzyp;
        return false;
    }
}
