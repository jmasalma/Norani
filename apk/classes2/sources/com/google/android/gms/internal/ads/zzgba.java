package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgba extends zzgbc {
    private zzgba(zzgay zzgay, Character ch) {
        super(zzgay, ch);
        zzfvp.zze(zzgay.zzf.length == 64);
    }

    /* access modifiers changed from: package-private */
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgbb {
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzgay zzgay = this.zzb;
        if (zzgay.zzd(length)) {
            int i = 0;
            int i2 = 0;
            while (i < zzg.length()) {
                int i3 = i2 + 1;
                int zzb = (zzgay.zzb(zzg.charAt(i + 1)) << 12) | (zzgay.zzb(zzg.charAt(i)) << 18);
                bArr[i2] = (byte) (zzb >>> 16);
                int i4 = i + 2;
                if (i4 < zzg.length()) {
                    int i5 = i + 3;
                    int zzb2 = zzb | (zzgay.zzb(zzg.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((zzb2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    if (i5 < zzg.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((zzb2 | zzgay.zzb(zzg.charAt(i5))) & KotlinVersion.MAX_COMPONENT_VALUE);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new zzgbb("Invalid input length " + zzg.length());
    }

    /* access modifiers changed from: package-private */
    public final zzgbd zzb(zzgay zzgay, Character ch) {
        return new zzgba(zzgay, ch);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfvp.zzk(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            zzgay zzgay = this.zzb;
            byte b = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << Ascii.DLE) | (bArr[i3 + 2] & 255);
            appendable.append(zzgay.zza(b >>> Ascii.DC2));
            appendable.append(zzgay.zza((b >>> Ascii.FF) & 63));
            appendable.append(zzgay.zza((b >>> 6) & 63));
            appendable.append(zzgay.zza(b & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzh(appendable, bArr, i3, i2 - i3);
        }
    }

    zzgba(String str, String str2, Character ch) {
        this(new zzgay(str, str2.toCharArray()), ch);
    }
}
