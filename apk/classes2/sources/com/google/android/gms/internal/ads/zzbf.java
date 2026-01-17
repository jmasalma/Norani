package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbf {
    public final Object zza;
    public final int zzb;
    public final zzap zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbf(Object obj, int i, zzap zzap, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzap;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbf zzbf = (zzbf) obj;
            return this.zzb == zzbf.zzb && this.zze == zzbf.zze && this.zzf == zzbf.zzf && this.zzg == zzbf.zzg && this.zzh == zzbf.zzh && this.zzi == zzbf.zzi && Objects.equals(this.zzc, zzbf.zzc) && Objects.equals(this.zza, zzbf.zza) && Objects.equals(this.zzd, zzbf.zzd);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }

    public final String toString() {
        String str = "mediaItem=" + this.zzb + ", period=" + this.zze + ", pos=" + this.zzf;
        int i = this.zzh;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.zzg + ", adGroup=" + i + ", ad=" + this.zzi;
    }
}
