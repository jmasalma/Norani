package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhbk extends zzgxz {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, IntCompanionObject.MAX_VALUE};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzgxz zzd;
    /* access modifiers changed from: private */
    public final zzgxz zze;
    private final int zzf;
    private final int zzg;

    private zzhbk(zzgxz zzgxz, zzgxz zzgxz2) {
        this.zzd = zzgxz;
        this.zze = zzgxz2;
        int zzd2 = zzgxz.zzd();
        this.zzf = zzd2;
        this.zzc = zzd2 + zzgxz2.zzd();
        this.zzg = Math.max(zzgxz.zzf(), zzgxz2.zzf()) + 1;
    }

    static zzgxz zzC(zzgxz zzgxz, zzgxz zzgxz2) {
        if (zzgxz2.zzd() == 0) {
            return zzgxz;
        }
        if (zzgxz.zzd() == 0) {
            return zzgxz2;
        }
        int zzd2 = zzgxz.zzd() + zzgxz2.zzd();
        if (zzd2 < 128) {
            return zzD(zzgxz, zzgxz2);
        }
        if (zzgxz instanceof zzhbk) {
            zzhbk zzhbk = (zzhbk) zzgxz;
            zzgxz zzgxz3 = zzhbk.zze;
            if (zzgxz3.zzd() + zzgxz2.zzd() < 128) {
                return new zzhbk(zzhbk.zzd, zzD(zzgxz3, zzgxz2));
            }
            zzgxz zzgxz4 = zzhbk.zzd;
            if (zzgxz4.zzf() > zzgxz3.zzf() && zzhbk.zzg > zzgxz2.zzf()) {
                return new zzhbk(zzgxz4, new zzhbk(zzgxz3, zzgxz2));
            }
        }
        if (zzd2 >= zzc(Math.max(zzgxz.zzf(), zzgxz2.zzf()) + 1)) {
            return new zzhbk(zzgxz, zzgxz2);
        }
        return zzhbh.zza(new zzhbh((zzhbj) null), zzgxz, zzgxz2);
    }

    private static zzgxz zzD(zzgxz zzgxz, zzgxz zzgxz2) {
        int zzd2 = zzgxz.zzd();
        int zzd3 = zzgxz2.zzd();
        byte[] bArr = new byte[(zzd2 + zzd3)];
        zzgxz.zzz(bArr, 0, 0, zzd2);
        zzgxz2.zzz(bArr, 0, zzd2, zzd3);
        return new zzgxw(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return IntCompanionObject.MAX_VALUE;
        }
        return iArr[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxz)) {
            return false;
        }
        zzgxz zzgxz = (zzgxz) obj;
        int i = this.zzc;
        if (i != zzgxz.zzd()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgxz.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhbi zzhbi = new zzhbi(this, (zzhbj) null);
        zzgxv zza2 = zzhbi.next();
        zzgxv zzgxv = zza2;
        zzhbi zzhbi2 = new zzhbi(zzgxz, (zzhbj) null);
        zzgxv zza3 = zzhbi2.next();
        zzgxv zzgxv2 = zza3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int zzd2 = zza2.zzd() - i2;
            int zzd3 = zza3.zzd() - i3;
            int min = Math.min(zzd2, zzd3);
            if (i2 == 0) {
                z = zza2.zzg(zza3, i3, min);
            } else {
                z = zza3.zzg(zza2, i2, min);
            }
            if (!z) {
                return false;
            }
            i4 += min;
            if (i4 < i) {
                if (min == zzd2) {
                    zzgxv zza4 = zzhbi.next();
                    zzgxv zzgxv3 = zza4;
                    zza2 = zza4;
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == zzd3) {
                    zza3 = zzhbi2.next();
                    zzgxv zzgxv4 = zza3;
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzhbg(this);
    }

    public final byte zza(int i) {
        zzy(i, this.zzc);
        return zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zze.zze(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    public final zzgxz zzk(int i, int i2) {
        int i3 = this.zzc;
        int zzq = zzq(i, i2, i3);
        if (zzq == 0) {
            return zzgxz.zzb;
        }
        if (zzq == i3) {
            return this;
        }
        int i4 = this.zzf;
        if (i2 <= i4) {
            return this.zzd.zzk(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.zze.zzk(i - i4, i5);
        }
        zzgxz zzgxz = this.zzd;
        return new zzhbk(zzgxz.zzk(i, zzgxz.zzd()), this.zze.zzk(0, i5));
    }

    public final zzgyf zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        zzhbi zzhbi = new zzhbi(this, (zzhbj) null);
        while (zzhbi.hasNext()) {
            arrayList.add(zzhbi.next().zzn());
        }
        int i = zzgyf.zze;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgyb(arrayList, i2, true, (zzgye) null);
        }
        return zzgyf.zzG(new zzgzx(arrayList), ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgxq zzgxq) throws IOException {
        this.zzd.zzo(zzgxq);
        this.zze.zzo(zzgxq);
    }

    public final boolean zzp() {
        zzgxz zzgxz = this.zzd;
        zzgxz zzgxz2 = this.zze;
        if (zzgxz2.zzj(zzgxz.zzj(0, 0, this.zzf), 0, zzgxz2.zzd()) == 0) {
            return true;
        }
        return false;
    }

    public final zzgxu zzs() {
        return new zzhbg(this);
    }
}
