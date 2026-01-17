package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaly implements zzakt {
    private final zzen zza = new zzen();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaly(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.zze = true == "Serif".equals(zzex.zzC(bArr, 43, bArr.length + -43)) ? "serif" : str;
            int i = bArr[25] * Ascii.DC4;
            this.zzg = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.zzb = z;
            if (z) {
                this.zzf = Math.max(0.0f, Math.min(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.95f));
            } else {
                this.zzf = 0.85f;
            }
        } else {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = str;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(android.text.SpannableStringBuilder r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            if (r5 == r6) goto L_0x0047
            r6 = r9 | 33
            r9 = r5 & 1
            r0 = r5 & 2
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0018
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 3
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L_0x002e
        L_0x0018:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            r4.setSpan(r0, r7, r8, r6)
            goto L_0x002d
        L_0x0021:
            if (r0 == 0) goto L_0x002d
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 2
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L_0x002e
        L_0x002d:
            r2 = r1
        L_0x002e:
            r5 = r5 & 4
            if (r5 != 0) goto L_0x003f
            if (r9 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r1)
            r4.setSpan(r5, r7, r8, r6)
            return
        L_0x003f:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r4.setSpan(r5, r7, r8, r6)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzc(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public final void zza(byte[] bArr, int i, int i2, zzaks zzaks, zzdn zzdn) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        zzdn zzdn2 = zzdn;
        zzen zzen = this.zza;
        zzen.zzJ(bArr, i6 + i2);
        zzen.zzL(i6);
        boolean z = true;
        boolean z2 = false;
        int i7 = 2;
        zzdd.zzd(zzen.zza() >= 2);
        int zzq = zzen.zzq();
        if (zzq == 0) {
            str = "";
        } else {
            int zzc2 = zzen.zzc();
            Charset zzC = zzen.zzC();
            int zzc3 = zzen.zzc() - zzc2;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            str = zzen.zzB(zzq - zzc3, zzC);
        }
        if (str.isEmpty()) {
            zzdn2.zza(new zzakl(zzfyq.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i8 = this.zzc;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        zzc(spannableStringBuilder2, i8, 0, 0, spannableStringBuilder.length(), 16711680);
        int i9 = this.zzd;
        zzb(spannableStringBuilder2, i9, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.zze;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.zzf;
        while (zzen.zza() >= 8) {
            int zzc4 = zzen.zzc();
            int zzg2 = zzen.zzg();
            int zzg3 = zzen.zzg();
            if (zzg3 == 1937013100) {
                zzdd.zzd(zzen.zza() >= i7 ? z : z2);
                int zzq2 = zzen.zzq();
                int i10 = z2;
                while (i10 < zzq2) {
                    zzdd.zzd(zzen.zza() >= 12 ? z : z2);
                    int zzq3 = zzen.zzq();
                    int zzq4 = zzen.zzq();
                    zzen.zzM(i7);
                    int zzm = zzen.zzm();
                    zzen.zzM(z ? 1 : 0);
                    int zzg4 = zzen.zzg();
                    if (zzq4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i4 = zzq2;
                        zzea.zzf("Tx3gParser", "Truncating styl end (" + zzq4 + ") to cueText.length() (" + length2 + ").");
                        i5 = spannableStringBuilder.length();
                    } else {
                        i4 = zzq2;
                        i5 = zzq4;
                    }
                    if (zzq3 >= i5) {
                        zzea.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i5 + ").");
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                        int i11 = zzq3;
                        int i12 = i5;
                        zzc(spannableStringBuilder3, zzm, i8, i11, i12, 0);
                        zzb(spannableStringBuilder3, zzg4, i9, i11, i12, 0);
                    }
                    i10++;
                    zzq2 = i4;
                    zzdn zzdn3 = zzdn;
                    z = true;
                    z2 = false;
                    i7 = 2;
                }
                i3 = i7;
            } else if (zzg3 != 1952608120 || !this.zzb) {
                i3 = 2;
            } else {
                i3 = 2;
                zzdd.zzd(zzen.zza() >= 2);
                int i13 = this.zzg;
                String str3 = zzex.zza;
                f = Math.max(0.0f, Math.min(((float) zzen.zzq()) / ((float) i13), 0.95f));
            }
            zzen.zzL(zzc4 + zzg2);
            zzdn zzdn4 = zzdn;
            i7 = i3;
            z = true;
            z2 = false;
        }
        zzcs zzcs = new zzcs();
        zzcs.zzl(spannableStringBuilder);
        zzcs.zze(f, 0);
        zzcs.zzf(0);
        zzdn.zza(new zzakl(zzfyq.zzo(zzcs.zzq()), -9223372036854775807L, -9223372036854775807L));
    }
}
