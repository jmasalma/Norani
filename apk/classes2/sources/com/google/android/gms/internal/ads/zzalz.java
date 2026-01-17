package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzalz {
    private final int[] zza = new int[4];
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;
    private Rect zzg;
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    private static int zzf(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r5 >= 4) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r5 = r5 >> 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzg(com.google.android.gms.internal.ads.zzem r10, boolean r11, android.graphics.Rect r12, int[] r13) {
        /*
            r9 = this;
            r0 = 1
            r11 = r11 ^ r0
            int r1 = r12.width()
            int r2 = r11 * r1
            int r12 = r12.height()
            r3 = 0
        L_0x000d:
            r4 = r3
        L_0x000e:
            r6 = r0
            r5 = r3
        L_0x0010:
            r7 = 4
            if (r5 >= r6) goto L_0x002b
            r8 = 64
            if (r6 > r8) goto L_0x002b
            int r8 = r10.zza()
            if (r8 >= r7) goto L_0x0021
            r5 = -1
            r6 = r5
            r5 = r3
            goto L_0x0033
        L_0x0021:
            int r5 = r5 << 4
            int r7 = r10.zzd(r7)
            r5 = r5 | r7
            int r6 = r6 << 2
            goto L_0x0010
        L_0x002b:
            r6 = r5 & 3
            if (r5 >= r7) goto L_0x0031
            r5 = r1
            goto L_0x0033
        L_0x0031:
            int r5 = r5 >> 2
        L_0x0033:
            int r7 = r1 - r4
            int r5 = java.lang.Math.min(r5, r7)
            if (r5 <= 0) goto L_0x0046
            int r7 = r2 + r5
            int[] r8 = r9.zza
            r6 = r8[r6]
            java.util.Arrays.fill(r13, r2, r7, r6)
            int r4 = r4 + r5
            r2 = r7
        L_0x0046:
            if (r4 < r1) goto L_0x000e
            int r11 = r11 + 2
            if (r11 < r12) goto L_0x004d
            return
        L_0x004d:
            int r2 = r11 * r1
            r10.zzf()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalz.zzg(com.google.android.gms.internal.ads.zzem, boolean, android.graphics.Rect, int[]):void");
    }

    public final zzcu zza(zzen zzen) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[(rect2.width() * rect2.height())];
        zzem zzem = new zzem();
        zzen.zzL(this.zzh);
        zzem.zzj(zzen);
        zzg(zzem, true, rect2, iArr);
        zzen.zzL(this.zzi);
        zzem.zzj(zzen);
        zzg(zzem, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcs zzcs = new zzcs();
        zzcs.zzc(createBitmap);
        zzcs.zzh(((float) rect2.left) / ((float) this.zze));
        zzcs.zzi(0);
        zzcs.zze(((float) rect2.top) / ((float) this.zzf), 0);
        zzcs.zzf(0);
        zzcs.zzk(((float) rect2.width()) / ((float) this.zze));
        zzcs.zzd(((float) rect2.height()) / ((float) this.zzf));
        return zzcs.zzq();
    }

    public final void zzb(String str) {
        int i;
        String trim = str.trim();
        String str2 = zzex.zza;
        for (String str3 : trim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] split = str3.substring(9).split(",", -1);
                this.zzd = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = this.zzd;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str3.startsWith("size: ")) {
                String[] split2 = str3.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(split2[0]);
                        this.zzf = Integer.parseInt(split2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e) {
                        zzea.zzg("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public final void zzc(zzen zzen) {
        int[] iArr = this.zzd;
        if (iArr != null && this.zzb) {
            zzen.zzM(zzen.zzq() - 2);
            int zzq = zzen.zzq();
            while (zzen.zzc() < zzq && zzen.zza() > 0) {
                switch (zzen.zzm()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (zzen.zza() >= 2) {
                            int zzm = zzen.zzm();
                            int zzm2 = zzen.zzm();
                            int[] iArr2 = this.zza;
                            iArr2[3] = zze(iArr, zzm >> 4);
                            iArr2[2] = zze(iArr, zzm & 15);
                            iArr2[1] = zze(iArr, zzm2 >> 4);
                            iArr2[0] = zze(iArr, zzm2 & 15);
                            this.zzc = true;
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (zzen.zza() >= 2 && this.zzc) {
                            int zzm3 = zzen.zzm();
                            int zzm4 = zzen.zzm();
                            int[] iArr3 = this.zza;
                            iArr3[3] = zzf(iArr3[3], zzm3 >> 4);
                            iArr3[2] = zzf(iArr3[2], zzm3 & 15);
                            iArr3[1] = zzf(iArr3[1], zzm4 >> 4);
                            iArr3[0] = zzf(iArr3[0], zzm4 & 15);
                            break;
                        } else {
                            return;
                        }
                        break;
                    case 5:
                        if (zzen.zza() >= 6) {
                            int zzm5 = zzen.zzm();
                            int zzm6 = zzen.zzm();
                            int i = zzm6 >> 4;
                            int zzm7 = ((zzm6 & 15) << 8) | zzen.zzm();
                            int zzm8 = zzen.zzm();
                            int zzm9 = zzen.zzm();
                            this.zzg = new Rect((zzm5 << 4) | i, (zzm8 << 4) | (zzm9 >> 4), zzm7 + 1, (((zzm9 & 15) << 8) | zzen.zzm()) + 1);
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (zzen.zza() >= 4) {
                            this.zzh = zzen.zzq();
                            this.zzi = zzen.zzq();
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
