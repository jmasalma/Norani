package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbk {
    public static final Object zza = new Object();
    private static final zzap zzp;
    public Object zzb = zza;
    @Deprecated
    public Object zzc;
    public zzap zzd = zzp;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public zzaj zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;

    static {
        zzad zzad = new zzad();
        zzad.zza("androidx.media3.common.Timeline");
        zzad.zzb(Uri.EMPTY);
        zzp = zzad.zzc();
        String str = zzex.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzbk zzbk = (zzbk) obj;
            return Objects.equals(this.zzb, zzbk.zzb) && Objects.equals(this.zzd, zzbk.zzd) && Objects.equals((Object) null, (Object) null) && Objects.equals(this.zzj, zzbk.zzj) && this.zze == zzbk.zze && this.zzf == zzbk.zzf && this.zzg == zzbk.zzg && this.zzh == zzbk.zzh && this.zzi == zzbk.zzi && this.zzk == zzbk.zzk && this.zzm == zzbk.zzm && this.zzn == zzbk.zzn && this.zzo == zzbk.zzo;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaj zzaj = this.zzj;
        if (zzaj == null) {
            i = 0;
        } else {
            i = zzaj.hashCode();
        }
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        int i2 = (((((((((((((hashCode * 961) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j4 = this.zzm;
        return ((((((i2 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbk zza(Object obj, zzap zzap, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzaj zzaj, long j4, long j5, int i, int i2, long j6) {
        this.zzb = obj;
        this.zzd = zzap == null ? zzp : zzap;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzaj;
        this.zzl = 0;
        this.zzm = j5;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
