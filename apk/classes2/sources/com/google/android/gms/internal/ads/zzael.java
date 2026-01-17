package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzael {
    private final zzen zza = new zzen(10);

    public final zzav zza(zzadw zzadw, zzahc zzahc) throws IOException {
        zzav zzav = null;
        int i = 0;
        while (true) {
            try {
                zzen zzen = this.zza;
                zzadw.zzh(zzen.zzN(), 0, 10);
                zzen.zzL(0);
                if (zzen.zzo() != 4801587) {
                    break;
                }
                zzen.zzM(3);
                int zzl = zzen.zzl();
                int i2 = zzl + 10;
                if (zzav == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(zzen.zzN(), 0, bArr, 0, 10);
                    zzadw.zzh(bArr, 10, zzl);
                    zzav = zzahe.zza(bArr, i2, zzahc, new zzagq());
                } else {
                    zzadw.zzg(zzl);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzadw.zzj();
        zzadw.zzg(i);
        return zzav;
    }
}
