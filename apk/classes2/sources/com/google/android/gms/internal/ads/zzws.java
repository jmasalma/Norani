package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzws {
    private final zzen zza = new zzen(32);
    private zzwr zzb;
    private zzwr zzc;
    private zzwr zzd;
    private long zze;
    private final zzzm zzf;

    public zzws(zzzm zzzm) {
        this.zzf = zzzm;
        zzwr zzwr = new zzwr(0, 65536);
        this.zzb = zzwr;
        this.zzc = zzwr;
        this.zzd = zzwr;
    }

    private final int zzi(int i) {
        zzwr zzwr = this.zzd;
        if (zzwr.zzc == null) {
            zzzf zzb2 = this.zzf.zzb();
            zzwr zzwr2 = new zzwr(this.zzd.zzb, 65536);
            zzwr.zzc = zzb2;
            zzwr.zzd = zzwr2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwr zzj(zzwr zzwr, long j) {
        while (j >= zzwr.zzb) {
            zzwr = zzwr.zzd;
        }
        return zzwr;
    }

    private static zzwr zzk(zzwr zzwr, long j, ByteBuffer byteBuffer, int i) {
        zzwr zzj = zzj(zzwr, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwr zzl(zzwr zzwr, long j, byte[] bArr, int i) {
        zzwr zzj = zzj(zzwr, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwr zzm(zzwr zzwr, zzhs zzhs, zzwu zzwu, zzen zzen) {
        zzwr zzwr2;
        zzhs zzhs2 = zzhs;
        zzwu zzwu2 = zzwu;
        zzen zzen2 = zzen;
        if (zzhs.zzl()) {
            long j = zzwu2.zzb;
            int i = 1;
            zzen2.zzI(1);
            zzwr zzl = zzl(zzwr, j, zzen.zzN(), 1);
            long j2 = j + 1;
            byte b = zzen.zzN()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            zzhp zzhp = zzhs2.zzb;
            byte[] bArr = zzhp.zza;
            if (bArr == null) {
                zzhp.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = b2 != 0;
            zzwr2 = zzl(zzl, j2, zzhp.zza, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                zzen2.zzI(2);
                zzwr2 = zzl(zzwr2, j3, zzen.zzN(), 2);
                j3 += 2;
                i = zzen.zzq();
            }
            int i2 = i;
            int[] iArr = zzhp.zzd;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhp.zze;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = i2 * 6;
                zzen2.zzI(i3);
                zzwr2 = zzl(zzwr2, j3, zzen.zzN(), i3);
                j3 += (long) i3;
                zzen2.zzL(0);
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr2[i4] = zzen.zzq();
                    iArr4[i4] = zzen.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwu2.zza - ((int) (j3 - zzwu2.zzb));
            }
            zzafa zzafa = zzwu2.zzc;
            String str = zzex.zza;
            zzafa zzafa2 = zzafa;
            zzhp.zzc(i2, iArr2, iArr4, zzafa.zzb, zzhp.zza, zzafa.zza, zzafa.zzc, zzafa.zzd);
            long j4 = zzwu2.zzb;
            int i5 = (int) (j3 - j4);
            zzwu2.zzb = j4 + ((long) i5);
            zzwu2.zza -= i5;
        } else {
            zzwr2 = zzwr;
        }
        if (zzhs.zze()) {
            zzen2.zzI(4);
            zzwr zzl2 = zzl(zzwr2, zzwu2.zzb, zzen.zzN(), 4);
            int zzp = zzen.zzp();
            zzwu2.zzb += 4;
            zzwu2.zza -= 4;
            zzhs2.zzj(zzp);
            zzwr zzk = zzk(zzl2, zzwu2.zzb, zzhs2.zzc, zzp);
            zzwu2.zzb += (long) zzp;
            int i6 = zzwu2.zza - zzp;
            zzwu2.zza = i6;
            ByteBuffer byteBuffer = zzhs2.zzf;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                zzhs2.zzf = ByteBuffer.allocate(i6);
            } else {
                zzhs2.zzf.clear();
            }
            return zzk(zzk, zzwu2.zzb, zzhs2.zzf, zzwu2.zza);
        }
        zzhs2.zzj(zzwu2.zza);
        return zzk(zzwr2, zzwu2.zzb, zzhs2.zzc, zzwu2.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzwr zzwr = this.zzd;
        if (j == zzwr.zzb) {
            this.zzd = zzwr.zzd;
        }
    }

    public final int zza(zzl zzl, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzwr zzwr = this.zzd;
        int zza2 = zzl.zza(zzwr.zzc.zza, zzwr.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzwr zzwr;
        if (j != -1) {
            while (true) {
                zzwr = this.zzb;
                if (j < zzwr.zzb) {
                    break;
                }
                this.zzf.zzc(zzwr.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwr.zza) {
                this.zzc = zzwr;
            }
        }
    }

    public final void zzd(zzhs zzhs, zzwu zzwu) {
        zzm(this.zzc, zzhs, zzwu, this.zza);
    }

    public final void zze(zzhs zzhs, zzwu zzwu) {
        this.zzc = zzm(this.zzc, zzhs, zzwu, this.zza);
    }

    public final void zzf() {
        zzwr zzwr = this.zzb;
        if (zzwr.zzc != null) {
            this.zzf.zzd(zzwr);
            zzwr.zzb();
        }
        this.zzb.zze(0, 65536);
        zzwr zzwr2 = this.zzb;
        this.zzc = zzwr2;
        this.zzd = zzwr2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzen zzen, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzwr zzwr = this.zzd;
            zzen.zzH(zzwr.zzc.zza, zzwr.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
