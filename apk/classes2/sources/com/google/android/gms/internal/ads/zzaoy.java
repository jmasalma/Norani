package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaoy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, Ascii.DLE, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static Pair zza(zzadw zzadw) throws IOException {
        zzadw.zzj();
        zzaox zzd = zzd(1684108385, zzadw, new zzen(8));
        zzadw.zzk(8);
        return Pair.create(Long.valueOf(zzadw.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaow zzb(zzadw zzadw) throws IOException {
        byte[] bArr;
        int i;
        zzen zzen = new zzen(16);
        long j = zzd(1718449184, zzadw, zzen).zzb;
        zzdd.zzf(j >= 16);
        zzadw.zzh(zzen.zzN(), 0, 16);
        zzen.zzL(0);
        int zzk = zzen.zzk();
        int zzk2 = zzen.zzk();
        int zzj = zzen.zzj();
        int zzj2 = zzen.zzj();
        int zzk3 = zzen.zzk();
        int zzk4 = zzen.zzk();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            zzadw.zzh(bArr2, 0, i2);
            if (zzk == 65534) {
                if (i2 == 24) {
                    zzen zzen2 = new zzen(bArr2);
                    zzen2.zzk();
                    int zzk5 = zzen2.zzk();
                    if (zzk5 == 0 || zzk5 == zzk4) {
                        int zzj3 = zzen2.zzj();
                        if ((zzj3 >> 18) != 0) {
                            throw zzaz.zzc("invalid channel mask " + zzj3);
                        } else if (zzj3 == 0 || Integer.bitCount(zzj3) == zzk2) {
                            zzk = zzen2.zzk();
                            byte[] bArr3 = new byte[14];
                            zzen2.zzH(bArr3, 0, 14);
                            if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                                throw zzaz.zzc("invalid wav format extension guid");
                            }
                        } else {
                            throw zzaz.zzc("invalid number of channels (" + Integer.bitCount(zzj3) + ") in channel mask " + zzj3);
                        }
                    } else {
                        throw zzaz.zzc("validBits ( " + zzk5 + ")  != bitsPerSample( " + zzk4 + ") are not supported");
                    }
                } else {
                    bArr = bArr2;
                    i = 65534;
                }
            }
            i = zzk;
            bArr = bArr2;
        } else {
            bArr = zzex.zzb;
            i = zzk;
        }
        zzadw.zzk((int) (zzadw.zze() - zzadw.zzf()));
        return new zzaow(i, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzadw zzadw) throws IOException {
        zzen zzen = new zzen(8);
        int i = zzaox.zza(zzadw, zzen).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzadw.zzh(zzen.zzN(), 0, 4);
        zzen.zzL(0);
        int zzg = zzen.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzea.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzaox zzd(int i, zzadw zzadw, zzen zzen) throws IOException {
        zzaox zza2 = zzaox.zza(zzadw, zzen);
        while (true) {
            int i2 = zza2.zza;
            if (i2 == i) {
                return zza2;
            }
            zzea.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza2.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 <= 2147483647L) {
                zzadw.zzk((int) j2);
                zza2 = zzaox.zza(zzadw, zzen);
            } else {
                throw zzaz.zzc("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
        }
    }
}
