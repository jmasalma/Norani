package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzagt implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagt(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzagt zzb(zzen zzen) {
        int zzg2 = zzen.zzg();
        String zze2 = zzay.zze(zzen.zzB(zzen.zzg(), StandardCharsets.US_ASCII));
        String zzB = zzen.zzB(zzen.zzg(), StandardCharsets.UTF_8);
        int zzg3 = zzen.zzg();
        int zzg4 = zzen.zzg();
        int zzg5 = zzen.zzg();
        int zzg6 = zzen.zzg();
        int zzg7 = zzen.zzg();
        byte[] bArr = new byte[zzg7];
        zzen.zzH(bArr, 0, zzg7);
        return new zzagt(zzg2, zze2, zzB, zzg3, zzg4, zzg5, zzg6, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagt zzagt = (zzagt) obj;
            return this.zza == zzagt.zza && this.zzb.equals(zzagt.zzb) && this.zzc.equals(zzagt.zzc) && this.zzd == zzagt.zzd && this.zze == zzagt.zze && this.zzf == zzagt.zzf && this.zzg == zzagt.zzg && Arrays.equals(this.zzh, zzagt.zzh);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    public final void zza(zzar zzar) {
        zzar.zza(this.zzh, this.zza);
    }
}
