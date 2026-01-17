package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzacz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzacz(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzacz zza(zzen zzen) throws zzaz {
        String str;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        try {
            zzen.zzM(4);
            int zzm = (zzen.zzm() & 3) + 1;
            if (zzm != 3) {
                ArrayList arrayList = new ArrayList();
                int zzm2 = zzen.zzm() & 31;
                for (int i9 = 0; i9 < zzm2; i9++) {
                    arrayList.add(zzb(zzen));
                }
                int zzm3 = zzen.zzm();
                for (int i10 = 0; i10 < zzm3; i10++) {
                    arrayList.add(zzb(zzen));
                }
                if (zzm2 > 0) {
                    byte[] bArr = zzfv.zza;
                    zzfu zzg2 = zzfv.zzg((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                    int i11 = zzg2.zze;
                    int i12 = zzg2.zzf;
                    int i13 = zzg2.zzj;
                    int i14 = zzg2.zzk;
                    int i15 = zzg2.zzl;
                    int i16 = zzg2.zzm;
                    float f2 = zzg2.zzg;
                    str = zzdk.zzc(zzg2.zza, zzg2.zzb, zzg2.zzc);
                    i2 = i15;
                    i = i16;
                    f = f2;
                    i5 = zzg2.zzi + 8;
                    i4 = i13;
                    i3 = i14;
                    i8 = i11;
                    i7 = i12;
                    i6 = zzg2.zzh + 8;
                } else {
                    i8 = -1;
                    i7 = -1;
                    i6 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    i2 = -1;
                    i = 16;
                    str = null;
                    f = 1.0f;
                }
                return new zzacz(arrayList, zzm, i8, i7, i6, i5, i4, i3, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzaz.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzen zzen) {
        int zzq = zzen.zzq();
        int zzc2 = zzen.zzc();
        zzen.zzM(zzq);
        return zzdk.zze(zzen.zzN(), zzc2, zzq);
    }
}
