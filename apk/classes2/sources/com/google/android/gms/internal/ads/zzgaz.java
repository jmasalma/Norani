package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgaz extends zzgbc {
    final char[] zza;

    private zzgaz(zzgay zzgay) {
        super(zzgay, (Character) null);
        this.zza = new char[ConstantsKt.MINIMUM_BLOCK_SIZE];
        zzfvp.zze(zzgay.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgay.zza(i >>> 4);
            this.zza[i | 256] = zzgay.zza(i & 15);
        }
    }

    /* access modifiers changed from: package-private */
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgbb {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                zzgay zzgay = this.zzb;
                bArr[i2] = (byte) (zzgay.zzb(charSequence.charAt(i + 1)) | (zzgay.zzb(charSequence.charAt(i)) << 4));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new zzgbb("Invalid input length " + charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public final zzgbd zzb(zzgay zzgay, Character ch) {
        return new zzgaz(zzgay);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzfvp.zzk(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[b]);
            appendable.append(cArr[b | 256]);
        }
    }

    zzgaz(String str, String str2) {
        this(new zzgay("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
