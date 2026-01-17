package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyb extends zzgyf {
    private final Iterable zza;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj = IntCompanionObject.MAX_VALUE;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgyb(Iterable iterable, int i, boolean z, zzgye zzgye) {
        super((zzgye) null);
        this.zzh = i;
        this.zza = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i == 0) {
            this.zzg = zzgzu.zzc;
            this.zzm = 0;
            this.zzn = 0;
            this.zzo = 0;
            return;
        }
        zzM();
    }

    private final int zzI() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgzw {
        if (this.zzf.hasNext()) {
            zzM();
            return;
        }
        throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void zzK(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= zzI()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.zzo - this.zzm == 0) {
                    zzJ();
                }
                int min = Math.min(i3, (int) (this.zzo - this.zzm));
                long j = (long) min;
                zzhce.zzo(this.zzm, bArr, (long) (i2 - i3), j);
                i3 -= min;
                this.zzm += j;
            }
        } else if (i2 > 0) {
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzL() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i > i2) {
            int i3 = i - i2;
            this.zzi = i3;
            this.zzh = i - i3;
            return;
        }
        this.zzi = 0;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = (long) byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = (long) this.zzg.limit();
        long zze = zzhce.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    public final boolean zzA() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    public final boolean zzB() throws IOException {
        return zzr() != 0;
    }

    /* access modifiers changed from: package-private */
    public final long zzC() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzh2 = zzh();
            j |= ((long) (zzh2 & Byte.MAX_VALUE)) << i;
            if ((zzh2 & 128) == 0) {
                return j;
            }
        }
        throw new zzgzw("CodedInputStream encountered a malformed varint.");
    }

    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzc() {
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    public final int zze() throws IOException {
        return zzp();
    }

    public final int zzf() throws IOException {
        return zzi();
    }

    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzhce.zza(j);
    }

    public final int zzi() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 >= 4) {
            this.zzm = 4 + j2;
            return (zzhce.zza(j2) & 255) | ((zzhce.zza(1 + j2) & 255) << 8) | ((zzhce.zza(2 + j2) & 255) << Ascii.DLE) | ((zzhce.zza(j2 + 3) & 255) << Ascii.CAN);
        }
        return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << Ascii.DLE) | ((zzh() & 255) << Ascii.CAN);
    }

    public final int zzj() throws IOException {
        return zzi();
    }

    public final int zzk() throws IOException {
        return zzD(zzp());
    }

    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
        }
        throw new zzgzw("Protocol message contained an invalid tag (zero).");
    }

    public final int zzm() throws IOException {
        return zzp();
    }

    public final long zzn() throws IOException {
        return zzq();
    }

    public final long zzo() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 >= 8) {
            this.zzm = 8 + j2;
            byte zza2 = zzhce.zza(j2 + 4);
            long j3 = j2;
            byte zza3 = zzhce.zza(j3 + 5);
            long zza4 = ((long) zzhce.zza(j2)) & 255;
            byte zza5 = zzhce.zza(j3 + 6);
            long zza6 = (((long) zzhce.zza(1 + j2)) & 255) << 8;
            byte zza7 = zzhce.zza(j3 + 7);
            return ((((long) zza2) & 255) << 32) | zza4 | zza6 | ((((long) zzhce.zza(j2 + 2)) & 255) << 16) | ((((long) zzhce.zza(3 + j2)) & 255) << 24) | ((((long) zza3) & 255) << 40) | ((((long) zza5) & 255) << 48) | ((((long) zza7) & 255) << 56);
        }
        long zzh2 = (((long) zzh()) & 255) << 8;
        return (((long) zzh()) & 255) | zzh2 | ((((long) zzh()) & 255) << 16) | ((((long) zzh()) & 255) << 24) | ((((long) zzh()) & 255) << 32) | ((((long) zzh()) & 255) << 40) | ((((long) zzh()) & 255) << 48) | ((((long) zzh()) & 255) << 56);
    }

    public final long zzs() throws IOException {
        return zzq();
    }

    public final long zzt() throws IOException {
        return zzF(zzr());
    }

    public final long zzu() throws IOException {
        return zzr();
    }

    public final zzgxz zzv() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = (long) zzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzp];
                zzhce.zzo(j2, bArr, 0, j3);
                this.zzm += j3;
                zzgxz zzgxz = zzgxz.zzb;
                return new zzgxw(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            zzgxz zzgxz2 = zzgxz.zzb;
            return new zzgxw(bArr2);
        } else if (zzp == 0) {
            return zzgxz.zzb;
        } else {
            if (zzp < 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final String zzw() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = (long) zzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzp];
                zzhce.zzo(j2, bArr, 0, j3);
                String str = new String(bArr, zzgzu.zza);
                this.zzm += j3;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgzu.zza);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp < 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final String zzx() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = (long) zzp;
            if (j3 <= j - j2) {
                String zzg2 = zzhcj.zzg(this.zzg, (int) (j2 - this.zzn), zzp);
                this.zzm += j3;
                return zzg2;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhcj.zzh(bArr, 0, zzp);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp <= 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void zzy(int i) throws zzgzw {
        if (this.zzk != i) {
            throw new zzgzw("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void zzz(int i) {
        this.zzj = i;
        zzL();
    }

    public final int zzd(int i) throws zzgzw {
        if (i >= 0) {
            int zzc = i + zzc();
            int i2 = this.zzj;
            if (zzc <= i2) {
                this.zzj = zzc;
                zzL();
                return i2;
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int zzp() throws IOException {
        byte b;
        byte b2;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte zza2 = zzhce.zza(j);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            } else if (this.zzo - this.zzm >= 10) {
                long j3 = 2 + j;
                byte zza3 = (zzhce.zza(j2) << 7) ^ zza2;
                if (zza3 < 0) {
                    b = zza3 ^ Byte.MIN_VALUE;
                } else {
                    long j4 = 3 + j;
                    byte zza4 = (zzhce.zza(j3) << Ascii.SO) ^ zza3;
                    if (zza4 >= 0) {
                        b2 = zza4 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        byte zza5 = zza4 ^ (zzhce.zza(j4) << Ascii.NAK);
                        if (zza5 < 0) {
                            b = -2080896 ^ zza5;
                        } else {
                            j4 = 5 + j;
                            byte zza6 = zzhce.zza(j5);
                            byte b3 = (zza5 ^ (zza6 << Ascii.FS)) ^ 266354560;
                            if (zza6 < 0) {
                                j5 = 6 + j;
                                if (zzhce.zza(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhce.zza(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzhce.zza(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzhce.zza(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzhce.zza(j4) >= 0) {
                                                    long j7 = j6;
                                                    b = b3;
                                                    j3 = j7;
                                                }
                                            }
                                        }
                                    }
                                }
                                b = b3;
                            }
                            b2 = b3;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return b;
            }
        }
        return (int) zzC();
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        long j3;
        long j4 = this.zzm;
        if (this.zzo != j4) {
            long j5 = j4 + 1;
            byte zza2 = zzhce.zza(j4);
            if (zza2 >= 0) {
                this.zzm++;
                return (long) zza2;
            } else if (this.zzo - this.zzm >= 10) {
                long j6 = 2 + j4;
                byte zza3 = (zzhce.zza(j5) << 7) ^ zza2;
                if (zza3 < 0) {
                    j = (long) (zza3 ^ Byte.MIN_VALUE);
                } else {
                    long j7 = 3 + j4;
                    byte zza4 = (zzhce.zza(j6) << Ascii.SO) ^ zza3;
                    if (zza4 >= 0) {
                        j = (long) (zza4 ^ 16256);
                    } else {
                        long j8 = 4 + j4;
                        byte zza5 = zza4 ^ (zzhce.zza(j7) << Ascii.NAK);
                        if (zza5 < 0) {
                            j = (long) (-2080896 ^ zza5);
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long zza6 = (((long) zzhce.zza(j8)) << 28) ^ ((long) zza5);
                            if (zza6 >= 0) {
                                j = 266354560 ^ zza6;
                            } else {
                                long j9 = 6 + j4;
                                long zza7 = zza6 ^ (((long) zzhce.zza(j7)) << 35);
                                if (zza7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    long j10 = 7 + j4;
                                    long zza8 = zza7 ^ (((long) zzhce.zza(j9)) << 42);
                                    if (zza8 >= 0) {
                                        j2 = 4363953127296L ^ zza8;
                                    } else {
                                        j9 = 8 + j4;
                                        zza7 = zza8 ^ (((long) zzhce.zza(j10)) << 49);
                                        if (zza7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j10 = 9 + j4;
                                            long zza9 = (zza7 ^ (((long) zzhce.zza(j9)) << 56)) ^ 71499008037633920L;
                                            if (zza9 < 0) {
                                                long j11 = j4 + 10;
                                                if (((long) zzhce.zza(j10)) >= 0) {
                                                    long j12 = j11;
                                                    j = zza9;
                                                    j6 = j12;
                                                }
                                            } else {
                                                j2 = zza9;
                                            }
                                        }
                                    }
                                    j6 = j10;
                                }
                                j = j3 ^ zza7;
                                j6 = j9;
                            }
                        }
                    }
                    j6 = j7;
                }
                this.zzm = j6;
                return j;
            }
        }
        return zzC();
    }
}
