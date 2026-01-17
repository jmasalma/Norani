package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaed {
    public static zzaef zzb(zzen zzen) {
        zzen.zzM(1);
        int zzo = zzen.zzo();
        long zzc = (long) zzen.zzc();
        long j = (long) zzo;
        int i = zzo / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzt = zzen.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzt;
            jArr2[i2] = zzen.zzt();
            zzen.zzM(2);
            i2++;
        }
        zzen.zzM((int) ((zzc + j) - ((long) zzen.zzc())));
        return new zzaef(jArr, jArr2);
    }

    public static zzav zza(zzadw zzadw, boolean z) throws IOException {
        zzav zza = new zzael().zza(zzadw, z ? null : zzahe.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
