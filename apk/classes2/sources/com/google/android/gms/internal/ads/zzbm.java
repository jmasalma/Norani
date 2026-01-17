package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbm {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzz[] zzd;
    private int zze;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbm(String str, zzz... zzzArr) {
        int length = zzzArr.length;
        int i = 1;
        zzdd.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzzArr;
        this.zza = length;
        int zzb2 = zzay.zzb(zzzArr[0].zzo);
        this.zzc = zzb2 == -1 ? zzay.zzb(zzzArr[0].zzn) : zzb2;
        String zzc2 = zzc(zzzArr[0].zzd);
        int i2 = zzzArr[0].zzf | 16384;
        while (true) {
            zzz[] zzzArr2 = this.zzd;
            if (i >= zzzArr2.length) {
                return;
            }
            if (!zzc2.equals(zzc(zzzArr2[i].zzd))) {
                zzz[] zzzArr3 = this.zzd;
                zzd("languages", zzzArr3[0].zzd, zzzArr3[i].zzd, i);
                return;
            }
            zzz[] zzzArr4 = this.zzd;
            if (i2 != (zzzArr4[i].zzf | 16384)) {
                zzd("role flags", Integer.toBinaryString(zzzArr4[0].zzf), Integer.toBinaryString(this.zzd[i].zzf), i);
                return;
            }
            i++;
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        zzea.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbm zzbm = (zzbm) obj;
            return this.zzb.equals(zzbm.zzb) && Arrays.equals(this.zzd, zzbm.zzd);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zzb.hashCode() + 527) * 31) + Arrays.hashCode(this.zzd);
        this.zze = hashCode;
        return hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzd);
        return this.zzb + ": " + arrays;
    }

    public final int zza(zzz zzz) {
        int i = 0;
        while (true) {
            zzz[] zzzArr = this.zzd;
            if (i >= zzzArr.length) {
                return -1;
            }
            if (zzz == zzzArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final zzz zzb(int i) {
        return this.zzd[i];
    }
}
