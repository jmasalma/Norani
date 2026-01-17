package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyd extends zzgyf {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzf;
    private final long zzg;
    private long zzh;
    private long zzi;
    private final long zzj;
    private int zzk;
    private int zzl;
    private int zzm = IntCompanionObject.MAX_VALUE;

    /* synthetic */ zzgyd(ByteBuffer byteBuffer, boolean z, zzgye zzgye) {
        super((zzgye) null);
        this.zzf = byteBuffer.duplicate();
        long zze = zzhce.zze(byteBuffer);
        this.zzg = zze;
        this.zzh = ((long) byteBuffer.limit()) + zze;
        long position = zze + ((long) byteBuffer.position());
        this.zzi = position;
        this.zzj = position;
    }

    private final int zzC() {
        return (int) (this.zzh - this.zzi);
    }

    private final void zzI() {
        long j = this.zzh + ((long) this.zzk);
        this.zzh = j;
        int i = (int) (j - this.zzj);
        int i2 = this.zzm;
        if (i > i2) {
            int i3 = i - i2;
            this.zzk = i3;
            this.zzh = j - ((long) i3);
            return;
        }
        this.zzk = 0;
    }

    public final boolean zzA() throws IOException {
        return this.zzi == this.zzh;
    }

    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    public final int zzc() {
        return (int) (this.zzi - this.zzj);
    }

    public final int zze() throws IOException {
        return zzi();
    }

    public final int zzf() throws IOException {
        return zzh();
    }

    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        long j = this.zzi;
        if (this.zzh - j >= 4) {
            this.zzi = 4 + j;
            int zza2 = (zzhce.zza(1 + j) & 255) << 8;
            return ((zzhce.zza(j + 3) & 255) << Ascii.CAN) | zza2 | (zzhce.zza(j) & 255) | ((zzhce.zza(2 + j) & 255) << Ascii.DLE);
        }
        throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final int zzj() throws IOException {
        return zzh();
    }

    public final int zzk() throws IOException {
        return zzD(zzi());
    }

    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzl = 0;
            return 0;
        }
        int zzi2 = zzi();
        this.zzl = zzi2;
        if ((zzi2 >>> 3) != 0) {
            return zzi2;
        }
        throw new zzgzw("Protocol message contained an invalid tag (zero).");
    }

    public final int zzm() throws IOException {
        return zzi();
    }

    public final long zzn() throws IOException {
        return zzp();
    }

    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        long j = this.zzi;
        if (this.zzh - j >= 8) {
            this.zzi = 8 + j;
            long zza2 = (long) zzhce.zza(5 + j);
            long zza3 = (((long) zzhce.zza(j)) & 255) | ((((long) zzhce.zza(1 + j)) & 255) << 8) | ((((long) zzhce.zza(2 + j)) & 255) << 16) | ((((long) zzhce.zza(3 + j)) & 255) << 24) | ((((long) zzhce.zza(4 + j)) & 255) << 32);
            return ((((long) zzhce.zza(j + 7)) & 255) << 56) | zza3 | ((zza2 & 255) << 40) | ((((long) zzhce.zza(6 + j)) & 255) << 48);
        }
        throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzs() throws IOException {
        return zzp();
    }

    public final long zzt() throws IOException {
        return zzF(zzq());
    }

    public final long zzu() throws IOException {
        return zzq();
    }

    public final zzgxz zzv() throws IOException {
        int zzi2 = zzi();
        if (zzi2 > 0 && zzi2 <= zzC()) {
            byte[] bArr = new byte[zzi2];
            long j = (long) zzi2;
            zzhce.zzo(this.zzi, bArr, 0, j);
            this.zzi += j;
            zzgxz zzgxz = zzgxz.zzb;
            return new zzgxw(bArr);
        } else if (zzi2 == 0) {
            return zzgxz.zzb;
        } else {
            if (zzi2 < 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final String zzw() throws IOException {
        int zzi2 = zzi();
        if (zzi2 > 0 && zzi2 <= zzC()) {
            byte[] bArr = new byte[zzi2];
            long j = (long) zzi2;
            zzhce.zzo(this.zzi, bArr, 0, j);
            String str = new String(bArr, zzgzu.zza);
            this.zzi += j;
            return str;
        } else if (zzi2 == 0) {
            return "";
        } else {
            if (zzi2 < 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final String zzx() throws IOException {
        int zzi2 = zzi();
        if (zzi2 > 0 && zzi2 <= zzC()) {
            String zzg2 = zzhcj.zzg(this.zzf, (int) (this.zzi - this.zzg), zzi2);
            this.zzi += (long) zzi2;
            return zzg2;
        } else if (zzi2 == 0) {
            return "";
        } else {
            if (zzi2 <= 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void zzy(int i) throws zzgzw {
        if (this.zzl != i) {
            throw new zzgzw("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void zzz(int i) {
        this.zzm = i;
        zzI();
    }

    public final int zzd(int i) throws zzgzw {
        if (i >= 0) {
            int zzc = i + zzc();
            int i2 = this.zzm;
            if (zzc <= i2) {
                this.zzm = zzc;
                zzI();
                return i2;
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* access modifiers changed from: package-private */
    public final long zzr() throws IOException {
        int i = 0;
        long j = 0;
        while (i < 64) {
            long j2 = this.zzi;
            if (j2 != this.zzh) {
                this.zzi = 1 + j2;
                byte zza2 = zzhce.zza(j2);
                j |= ((long) (zza2 & Byte.MAX_VALUE)) << i;
                if ((zza2 & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new zzgzw("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (com.google.android.gms.internal.ads.zzhce.zza(r3) >= 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzi() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzi
            long r2 = r9.zzh
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000a
            goto L_0x0092
        L_0x000a:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhce.zza(r0)
            if (r4 < 0) goto L_0x0016
            r9.zzi = r2
            return r4
        L_0x0016:
            long r5 = r9.zzh
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0092
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzhce.zza(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L_0x002e
            r0 = r2 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x008f
        L_0x002e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L_0x003e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L_0x003c:
            r5 = r3
            goto L_0x008f
        L_0x003e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L_0x004f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x008f
        L_0x004f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L_0x008d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            if (r3 >= 0) goto L_0x008b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            if (r5 >= 0) goto L_0x008d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            if (r3 >= 0) goto L_0x008b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            if (r5 >= 0) goto L_0x008d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            if (r0 < 0) goto L_0x0092
        L_0x008b:
            r0 = r2
            goto L_0x008f
        L_0x008d:
            r0 = r2
            goto L_0x003c
        L_0x008f:
            r9.zzi = r5
            return r0
        L_0x0092:
            long r0 = r9.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyd.zzi():int");
    }

    public final long zzq() throws IOException {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.zzi;
        if (this.zzh != j4) {
            long j5 = 1 + j4;
            byte zza2 = zzhce.zza(j4);
            if (zza2 >= 0) {
                this.zzi = j5;
                return (long) zza2;
            } else if (this.zzh - j5 >= 9) {
                long j6 = 2 + j4;
                byte zza3 = (zzhce.zza(j5) << 7) ^ zza2;
                if (zza3 < 0) {
                    b = zza3 ^ Byte.MIN_VALUE;
                } else {
                    long j7 = 3 + j4;
                    byte zza4 = zza3 ^ (zzhce.zza(j6) << Ascii.SO);
                    if (zza4 >= 0) {
                        j2 = (long) (zza4 ^ 16256);
                    } else {
                        j6 = 4 + j4;
                        byte zza5 = zza4 ^ (zzhce.zza(j7) << Ascii.NAK);
                        if (zza5 < 0) {
                            b = -2080896 ^ zza5;
                        } else {
                            j7 = 5 + j4;
                            long zza6 = (((long) zzhce.zza(j6)) << 28) ^ ((long) zza5);
                            if (zza6 >= 0) {
                                j2 = 266354560 ^ zza6;
                            } else {
                                long j8 = 6 + j4;
                                long zza7 = (((long) zzhce.zza(j7)) << 35) ^ zza6;
                                if (zza7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j = j4 + 7;
                                    long zza8 = zza7 ^ (((long) zzhce.zza(j8)) << 42);
                                    if (zza8 >= 0) {
                                        j2 = 4363953127296L ^ zza8;
                                    } else {
                                        j8 = 8 + j4;
                                        zza7 = zza8 ^ (((long) zzhce.zza(j)) << 49);
                                        if (zza7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j = j4 + 9;
                                            long zza9 = (zza7 ^ (((long) zzhce.zza(j8)) << 56)) ^ 71499008037633920L;
                                            if (zza9 < 0) {
                                                long j9 = j4 + 10;
                                                if (((long) zzhce.zza(j)) >= 0) {
                                                    j = j9;
                                                }
                                            }
                                            j2 = zza9;
                                        }
                                    }
                                    this.zzi = j;
                                    return j2;
                                }
                                j2 = j3 ^ zza7;
                                j = j8;
                                this.zzi = j;
                                return j2;
                            }
                        }
                    }
                    j = j7;
                    this.zzi = j;
                    return j2;
                }
                j2 = (long) b;
                this.zzi = j;
                return j2;
            }
        }
        return zzr();
    }
}
