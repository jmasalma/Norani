package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzahz {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzadw zzadw) throws IOException {
        int i;
        zzen zzen = this.zza;
        zzadl zzadl = (zzadl) zzadw;
        int i2 = 0;
        zzadl.zzm(zzen.zzN(), 0, 1, false);
        byte b = zzen.zzN()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while (true) {
            i = i4 + 1;
            if ((b & i3) != 0) {
                break;
            }
            i3 >>= 1;
            i4 = i;
        }
        int i5 = b & (~i3);
        zzadl.zzm(zzen.zzN(), 1, i4, false);
        while (i2 < i4) {
            i2++;
            i5 = (zzen.zzN()[i2] & 255) + (i5 << 8);
        }
        this.zzb += i;
        return (long) i5;
    }

    public final boolean zza(zzadw zzadw) throws IOException {
        long zzb2;
        int i;
        long zzd = zzadw.zzd();
        int i2 = (zzd > -1 ? 1 : (zzd == -1 ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && zzd <= 1024) {
            j = zzd;
        }
        zzen zzen = this.zza;
        zzadl zzadl = (zzadl) zzadw;
        zzadl.zzm(zzen.zzN(), 0, 4, false);
        this.zzb = 4;
        for (long zzu = zzen.zzu(); zzu != 440786851; zzu = ((zzu << 8) & -256) | ((long) (zzen.zzN()[0] & 255))) {
            int i3 = (int) j;
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzadl.zzm(zzen.zzN(), 0, 1, false);
        }
        long zzb3 = zzb(zzadw);
        long j2 = (long) this.zzb;
        if (zzb3 != Long.MIN_VALUE) {
            long j3 = j2 + zzb3;
            if (i2 == 0 || j3 < zzd) {
                while (true) {
                    int i5 = (((long) this.zzb) > j3 ? 1 : (((long) this.zzb) == j3 ? 0 : -1));
                    if (i5 < 0) {
                        if (zzb(zzadw) == Long.MIN_VALUE || zzb2 < 0) {
                            return false;
                        }
                        if (i != 0) {
                            int zzb4 = (int) (zzb2 = zzb(zzadw));
                            zzadl.zzl(zzb4, false);
                            this.zzb += zzb4;
                        }
                    } else if (i5 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
