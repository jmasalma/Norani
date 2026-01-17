package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcdm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcdn zze;

    zzcdm(zzcdn zzcdn, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzcdn);
        this.zze = zzcdn;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheCanceled"
            r0.put(r1, r2)
            java.lang.String r1 = "src"
            java.lang.String r2 = r4.zza
            r0.put(r1, r2)
            java.lang.String r1 = r4.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0020
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L_0x0020:
            java.lang.String r1 = r4.zzc
            int r2 = r1.hashCode()
            switch(r2) {
                case -1947652542: goto L_0x009f;
                case -1396664534: goto L_0x0094;
                case -1347010958: goto L_0x008a;
                case -918817863: goto L_0x007f;
                case -659376217: goto L_0x0075;
                case -642208130: goto L_0x006b;
                case -354048396: goto L_0x0060;
                case -32082395: goto L_0x0055;
                case 3387234: goto L_0x004b;
                case 96784904: goto L_0x0041;
                case 580119100: goto L_0x0036;
                case 725497484: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x00a9
        L_0x002b:
            java.lang.String r2 = "noCacheDir"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 7
            goto L_0x00aa
        L_0x0036:
            java.lang.String r2 = "expireFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 6
            goto L_0x00aa
        L_0x0041:
            java.lang.String r2 = "error"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 1
            goto L_0x00aa
        L_0x004b:
            java.lang.String r2 = "noop"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 4
            goto L_0x00aa
        L_0x0055:
            java.lang.String r2 = "externalAbort"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 10
            goto L_0x00aa
        L_0x0060:
            java.lang.String r2 = "sizeExceeded"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 11
            goto L_0x00aa
        L_0x006b:
            java.lang.String r2 = "playerFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 5
            goto L_0x00aa
        L_0x0075:
            java.lang.String r2 = "contentLengthMissing"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 0
            goto L_0x00aa
        L_0x007f:
            java.lang.String r2 = "downloadTimeout"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 9
            goto L_0x00aa
        L_0x008a:
            java.lang.String r2 = "inProgress"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 2
            goto L_0x00aa
        L_0x0094:
            java.lang.String r2 = "badUrl"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 8
            goto L_0x00aa
        L_0x009f:
            java.lang.String r2 = "interrupted"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a9
            r2 = 3
            goto L_0x00aa
        L_0x00a9:
            r2 = -1
        L_0x00aa:
            java.lang.String r3 = "internal"
            switch(r2) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b8;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b8;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00b3;
                case 9: goto L_0x00b3;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00b0;
                default: goto L_0x00af;
            }
        L_0x00af:
            goto L_0x00b8
        L_0x00b0:
            java.lang.String r3 = "policy"
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r3 = "network"
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r3 = "io"
        L_0x00b8:
            java.lang.String r2 = "type"
            r0.put(r2, r3)
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzd
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00cf
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        L_0x00cf:
            com.google.android.gms.internal.ads.zzcdn r1 = r4.zze
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzcdn.zze(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdm.run():void");
    }
}
