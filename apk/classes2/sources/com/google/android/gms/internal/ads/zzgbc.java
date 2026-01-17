package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
class zzgbc extends zzgbd {
    private volatile zzgbd zza;
    final zzgay zzb;
    final Character zzc;

    zzgbc(zzgay zzgay, Character ch) {
        zzgay zzgay2 = zzgay;
        this.zzb = zzgay;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzgay.zze('=')) {
                z = false;
            }
        }
        zzfvp.zzi(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgbc) {
            zzgbc zzgbc = (zzgbc) obj;
            if (!this.zzb.equals(zzgbc.zzb) || !Objects.equals(this.zzc, zzgbc.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgay zzgay = this.zzb;
        sb.append(zzgay);
        if (8 % zzgay.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public int zza(byte[] bArr, CharSequence charSequence) throws zzgbb {
        int i;
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzgay zzgay = this.zzb;
        if (zzgay.zzd(length)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < zzg.length()) {
                long j = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i = zzgay.zzc;
                    if (i4 >= i) {
                        break;
                    }
                    j <<= zzgay.zzb;
                    if (i2 + i4 < zzg.length()) {
                        j |= (long) zzgay.zzb(zzg.charAt(i5 + i2));
                        i5++;
                    }
                    i4++;
                }
                int i6 = zzgay.zzd;
                int i7 = i5 * zzgay.zzb;
                int i8 = (i6 - 1) * 8;
                while (i8 >= (i6 * 8) - i7) {
                    bArr[i3] = (byte) ((int) ((j >>> i8) & 255));
                    i8 -= 8;
                    i3++;
                }
                i2 += i;
            }
            return i3;
        }
        throw new zzgbb("Invalid input length " + zzg.length());
    }

    /* access modifiers changed from: package-private */
    public zzgbd zzb(zzgay zzgay, Character ch) {
        return new zzgbc(zzgay, ch);
    }

    /* access modifiers changed from: package-private */
    public void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfvp.zzk(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zzh(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    /* access modifiers changed from: package-private */
    public final int zze(int i) {
        zzgay zzgay = this.zzb;
        return zzgay.zzc * zzgbm.zzb(i, zzgay.zzd, RoundingMode.CEILING);
    }

    public final zzgbd zzf() {
        zzgbd zzgbd = this.zza;
        if (zzgbd == null) {
            zzgay zzgay = this.zzb;
            zzgay zzc2 = zzgay.zzc();
            if (zzc2 == zzgay) {
                zzgbd = this;
            } else {
                zzgbd = zzb(zzc2, this.zzc);
            }
            this.zza = zzgbd;
        }
        return zzgbd;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzfvp.zzk(i, i + i2, bArr.length);
        zzgay zzgay = this.zzb;
        int i3 = zzgay.zzd;
        int i4 = 0;
        zzfvp.zze(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgay.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgay.zza(zzgay.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.zzc;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    zzgbc(String str, String str2, Character ch) {
        this(new zzgay(str, str2.toCharArray()), ch);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }
}
