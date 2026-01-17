package com.google.android.gms.internal.ads;

import android.graphics.Point;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzxx implements zzyo {
    public final /* synthetic */ zzyi zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int[] zzc;
    public final /* synthetic */ Point zzd;

    public /* synthetic */ zzxx(zzyi zzyi, String str, int[] iArr, Point point) {
        this.zza = zzyi;
        this.zzb = str;
        this.zzc = iArr;
        this.zzd = point;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzbm r21, int[] r22) {
        /*
            r19 = this;
            r0 = r19
            r10 = r21
            int r1 = com.google.android.gms.internal.ads.zzyu.zzb
            com.google.android.gms.internal.ads.zzyi r11 = r0.zza
            int[] r1 = r0.zzc
            r12 = r1[r20]
            android.graphics.Point r1 = r0.zzd
            if (r1 == 0) goto L_0x0013
            int r2 = r1.x
            goto L_0x0015
        L_0x0013:
            int r2 = r11.zzi
        L_0x0015:
            if (r1 == 0) goto L_0x001a
            int r1 = r1.y
            goto L_0x001c
        L_0x001a:
            int r1 = r11.zzj
        L_0x001c:
            boolean r3 = r11.zzl
            r13 = -1
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r9) goto L_0x0088
            if (r1 != r9) goto L_0x0029
            r14 = r9
            goto L_0x008b
        L_0x0029:
            r5 = r9
            r4 = 0
        L_0x002b:
            int r6 = r10.zza
            if (r4 >= r6) goto L_0x0086
            com.google.android.gms.internal.ads.zzz r6 = r10.zzb(r4)
            int r7 = r6.zzv
            if (r7 <= 0) goto L_0x0080
            int r6 = r6.zzw
            if (r6 <= 0) goto L_0x0080
            if (r3 == 0) goto L_0x004c
            if (r7 > r6) goto L_0x0041
            r8 = 0
            goto L_0x0042
        L_0x0041:
            r8 = 1
        L_0x0042:
            if (r2 > r1) goto L_0x0046
            r14 = 0
            goto L_0x0047
        L_0x0046:
            r14 = 1
        L_0x0047:
            if (r8 == r14) goto L_0x004c
            r14 = r1
            r8 = r2
            goto L_0x004e
        L_0x004c:
            r8 = r1
            r14 = r2
        L_0x004e:
            int r15 = r7 * r8
            int r9 = r6 * r14
            if (r15 < r9) goto L_0x005f
            android.graphics.Point r8 = new android.graphics.Point
            java.lang.String r15 = com.google.android.gms.internal.ads.zzex.zza
            int r9 = r9 + r7
            int r9 = r9 + r13
            int r9 = r9 / r7
            r8.<init>(r14, r9)
            goto L_0x006a
        L_0x005f:
            android.graphics.Point r9 = new android.graphics.Point
            java.lang.String r14 = com.google.android.gms.internal.ads.zzex.zza
            int r15 = r15 + r6
            int r15 = r15 + r13
            int r15 = r15 / r6
            r9.<init>(r15, r8)
            r8 = r9
        L_0x006a:
            int r9 = r7 * r6
            int r14 = r8.x
            float r14 = (float) r14
            r15 = 1065017672(0x3f7ae148, float:0.98)
            float r14 = r14 * r15
            int r14 = (int) r14
            if (r7 < r14) goto L_0x0080
            int r7 = r8.y
            float r7 = (float) r7
            float r7 = r7 * r15
            int r7 = (int) r7
            if (r6 < r7) goto L_0x0080
            if (r9 >= r5) goto L_0x0080
            r5 = r9
        L_0x0080:
            int r4 = r4 + 1
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002b
        L_0x0086:
            r14 = r5
            goto L_0x008b
        L_0x0088:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x008b:
            int r1 = com.google.android.gms.internal.ads.zzfyq.zzd
            com.google.android.gms.internal.ads.zzfyn r15 = new com.google.android.gms.internal.ads.zzfyn
            r15.<init>()
            r9 = 0
        L_0x0093:
            int r1 = r10.zza
            if (r9 >= r1) goto L_0x00d1
            com.google.android.gms.internal.ads.zzz r1 = r10.zzb(r9)
            int r1 = r1.zza()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r8) goto L_0x00ac
            if (r1 == r13) goto L_0x00a9
            if (r1 > r14) goto L_0x00a9
            goto L_0x00ac
        L_0x00a9:
            r16 = 0
            goto L_0x00ae
        L_0x00ac:
            r16 = 1
        L_0x00ae:
            java.lang.String r7 = r0.zzb
            com.google.android.gms.internal.ads.zzys r6 = new com.google.android.gms.internal.ads.zzys
            r17 = r22[r9]
            r1 = r6
            r2 = r20
            r3 = r21
            r4 = r9
            r5 = r11
            r13 = r6
            r6 = r17
            r17 = r8
            r8 = r12
            r18 = r17
            r17 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r15.zzf(r13)
            int r9 = r17 + 1
            r13 = -1
            goto L_0x0093
        L_0x00d1:
            com.google.android.gms.internal.ads.zzfyq r1 = r15.zzi()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxx.zza(int, com.google.android.gms.internal.ads.zzbm, int[]):java.util.List");
    }
}
