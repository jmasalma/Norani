package com.google.android.gms.internal.ads;

import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzaqs implements zzapw {
    protected final zzaqu zza;
    private final zzaqr zzb;

    public zzaqs(zzaqr zzaqr) {
        zzaqu zzaqu = new zzaqu(ConstantsKt.DEFAULT_BLOCK_SIZE);
        this.zzb = zzaqr;
        this.zza = zzaqu;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0134 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0146 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzapz zza(com.google.android.gms.internal.ads.zzaqd r18) throws com.google.android.gms.internal.ads.zzaqm {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r3 = "Error occurred when closing InputStream"
            long r4 = android.os.SystemClock.elapsedRealtime()
        L_0x000a:
            java.util.Collections.emptyList()
            r6 = 0
            com.google.android.gms.internal.ads.zzapm r0 = r18.zzd()     // Catch:{ IOException -> 0x01b0 }
            if (r0 != 0) goto L_0x0019
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ IOException -> 0x01b0 }
            goto L_0x0039
        L_0x0019:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x01b0 }
            r7.<init>()     // Catch:{ IOException -> 0x01b0 }
            java.lang.String r8 = r0.zzb     // Catch:{ IOException -> 0x01b0 }
            if (r8 == 0) goto L_0x0027
            java.lang.String r9 = "If-None-Match"
            r7.put(r9, r8)     // Catch:{ IOException -> 0x01b0 }
        L_0x0027:
            long r8 = r0.zzd     // Catch:{ IOException -> 0x01b0 }
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            java.lang.String r0 = "If-Modified-Since"
            java.lang.String r8 = com.google.android.gms.internal.ads.zzara.zzc(r8)     // Catch:{ IOException -> 0x01b0 }
            r7.put(r0, r8)     // Catch:{ IOException -> 0x01b0 }
        L_0x0038:
            r0 = r7
        L_0x0039:
            com.google.android.gms.internal.ads.zzaqr r7 = r1.zzb     // Catch:{ IOException -> 0x01b0 }
            com.google.android.gms.internal.ads.zzarb r7 = r7.zza(r2, r0)     // Catch:{ IOException -> 0x01b0 }
            int r9 = r7.zzb()     // Catch:{ IOException -> 0x01ad }
            java.util.List r0 = r7.zzd()     // Catch:{ IOException -> 0x01ad }
            r8 = 304(0x130, float:4.26E-43)
            if (r9 != r8) goto L_0x0107
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01ad }
            long r14 = r8 - r4
            com.google.android.gms.internal.ads.zzapm r8 = r18.zzd()     // Catch:{ IOException -> 0x01ad }
            if (r8 != 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzapz r8 = new com.google.android.gms.internal.ads.zzapz     // Catch:{ IOException -> 0x01ad }
            r12 = 0
            r13 = 1
            r11 = 304(0x130, float:4.26E-43)
            r10 = r8
            r16 = r0
            r10.<init>((int) r11, (byte[]) r12, (boolean) r13, (long) r14, (java.util.List) r16)     // Catch:{ IOException -> 0x01ad }
            goto L_0x0106
        L_0x0065:
            java.util.TreeSet r9 = new java.util.TreeSet     // Catch:{ IOException -> 0x01ad }
            java.util.Comparator r10 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ IOException -> 0x01ad }
            r9.<init>(r10)     // Catch:{ IOException -> 0x01ad }
            boolean r10 = r0.isEmpty()     // Catch:{ IOException -> 0x01ad }
            if (r10 != 0) goto L_0x008a
            java.util.Iterator r10 = r0.iterator()     // Catch:{ IOException -> 0x01ad }
        L_0x0076:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x01ad }
            if (r11 == 0) goto L_0x008a
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.ads.zzapv r11 = (com.google.android.gms.internal.ads.zzapv) r11     // Catch:{ IOException -> 0x01ad }
            java.lang.String r11 = r11.zza()     // Catch:{ IOException -> 0x01ad }
            r9.add(r11)     // Catch:{ IOException -> 0x01ad }
            goto L_0x0076
        L_0x008a:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ IOException -> 0x01ad }
            r13.<init>(r0)     // Catch:{ IOException -> 0x01ad }
            java.util.List r0 = r8.zzh     // Catch:{ IOException -> 0x01ad }
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x01ad }
            if (r0 != 0) goto L_0x00f6
            java.util.List r0 = r8.zzh     // Catch:{ IOException -> 0x01ad }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01ad }
        L_0x009f:
            boolean r10 = r0.hasNext()     // Catch:{ IOException -> 0x01ad }
            if (r10 == 0) goto L_0x00f6
            java.lang.Object r10 = r0.next()     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.ads.zzapv r10 = (com.google.android.gms.internal.ads.zzapv) r10     // Catch:{ IOException -> 0x01ad }
            java.lang.String r11 = r10.zza()     // Catch:{ IOException -> 0x01ad }
            boolean r11 = r9.contains(r11)     // Catch:{ IOException -> 0x01ad }
            if (r11 != 0) goto L_0x009f
            r13.add(r10)     // Catch:{ IOException -> 0x01ad }
            goto L_0x009f
        L_0x00b9:
            java.util.Map r0 = r8.zzg     // Catch:{ IOException -> 0x01ad }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x01ad }
            if (r0 != 0) goto L_0x00f6
            java.util.Map r0 = r8.zzg     // Catch:{ IOException -> 0x01ad }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x01ad }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01ad }
        L_0x00cb:
            boolean r10 = r0.hasNext()     // Catch:{ IOException -> 0x01ad }
            if (r10 == 0) goto L_0x00f6
            java.lang.Object r10 = r0.next()     // Catch:{ IOException -> 0x01ad }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ IOException -> 0x01ad }
            java.lang.Object r11 = r10.getKey()     // Catch:{ IOException -> 0x01ad }
            boolean r11 = r9.contains(r11)     // Catch:{ IOException -> 0x01ad }
            if (r11 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.zzapv r11 = new com.google.android.gms.internal.ads.zzapv     // Catch:{ IOException -> 0x01ad }
            java.lang.Object r12 = r10.getKey()     // Catch:{ IOException -> 0x01ad }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x01ad }
            java.lang.Object r10 = r10.getValue()     // Catch:{ IOException -> 0x01ad }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01ad }
            r11.<init>(r12, r10)     // Catch:{ IOException -> 0x01ad }
            r13.add(r11)     // Catch:{ IOException -> 0x01ad }
            goto L_0x00cb
        L_0x00f6:
            com.google.android.gms.internal.ads.zzapz r0 = new com.google.android.gms.internal.ads.zzapz     // Catch:{ IOException -> 0x01ad }
            byte[] r12 = r8.zza     // Catch:{ IOException -> 0x01ad }
            r8 = 1
            r11 = 304(0x130, float:4.26E-43)
            r10 = r0
            r9 = r13
            r13 = r8
            r16 = r9
            r10.<init>((int) r11, (byte[]) r12, (boolean) r13, (long) r14, (java.util.List) r16)     // Catch:{ IOException -> 0x01ad }
            r8 = r0
        L_0x0106:
            return r8
        L_0x0107:
            java.io.InputStream r8 = r7.zzc()     // Catch:{ IOException -> 0x01ad }
            r10 = 0
            if (r8 == 0) goto L_0x0152
            int r11 = r7.zza()     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.ads.zzaqu r12 = r1.zza     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.ads.zzarh r13 = new com.google.android.gms.internal.ads.zzarh     // Catch:{ IOException -> 0x01ad }
            r13.<init>(r12, r11)     // Catch:{ IOException -> 0x01ad }
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = r12.zzb(r11)     // Catch:{ all -> 0x0140 }
        L_0x011f:
            int r14 = r8.read(r11)     // Catch:{ all -> 0x012a }
            r15 = -1
            if (r14 == r15) goto L_0x012c
            r13.write(r11, r10, r14)     // Catch:{ all -> 0x012a }
            goto L_0x011f
        L_0x012a:
            r0 = move-exception
            goto L_0x0142
        L_0x012c:
            byte[] r14 = r13.toByteArray()     // Catch:{ all -> 0x012a }
            r8.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x0139
        L_0x0134:
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.ads.zzaqp.zzd(r3, r8)     // Catch:{ IOException -> 0x01ad }
        L_0x0139:
            r12.zza(r11)     // Catch:{ IOException -> 0x01ad }
            r13.close()     // Catch:{ IOException -> 0x01ad }
            goto L_0x0154
        L_0x0140:
            r0 = move-exception
            r11 = r6
        L_0x0142:
            r8.close()     // Catch:{ IOException -> 0x0146 }
            goto L_0x014b
        L_0x0146:
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x01ad }
            com.google.android.gms.internal.ads.zzaqp.zzd(r3, r8)     // Catch:{ IOException -> 0x01ad }
        L_0x014b:
            r12.zza(r11)     // Catch:{ IOException -> 0x01ad }
            r13.close()     // Catch:{ IOException -> 0x01ad }
            throw r0     // Catch:{ IOException -> 0x01ad }
        L_0x0152:
            byte[] r14 = new byte[r10]     // Catch:{ IOException -> 0x01ad }
        L_0x0154:
            r15 = r14
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01aa }
            long r10 = r10 - r4
            boolean r8 = com.google.android.gms.internal.ads.zzaqp.zzb     // Catch:{ IOException -> 0x01aa }
            if (r8 != 0) goto L_0x0164
            r12 = 3000(0xbb8, double:1.482E-320)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x018b
        L_0x0164:
            java.lang.String r8 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x01aa }
            if (r15 == 0) goto L_0x0172
            int r11 = r15.length     // Catch:{ IOException -> 0x01aa }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x01aa }
            goto L_0x0174
        L_0x0172:
            java.lang.String r11 = "null"
        L_0x0174:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x01aa }
            com.google.android.gms.internal.ads.zzapr r13 = r18.zzy()     // Catch:{ IOException -> 0x01aa }
            int r13 = r13.zza()     // Catch:{ IOException -> 0x01aa }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x01aa }
            java.lang.Object[] r10 = new java.lang.Object[]{r2, r10, r11, r12, r13}     // Catch:{ IOException -> 0x01aa }
            com.google.android.gms.internal.ads.zzaqp.zza(r8, r10)     // Catch:{ IOException -> 0x01aa }
        L_0x018b:
            r8 = 200(0xc8, float:2.8E-43)
            if (r9 < r8) goto L_0x01a4
            r8 = 299(0x12b, float:4.19E-43)
            if (r9 > r8) goto L_0x01a4
            com.google.android.gms.internal.ads.zzapz r16 = new com.google.android.gms.internal.ads.zzapz     // Catch:{ IOException -> 0x01aa }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01aa }
            long r12 = r10 - r4
            r11 = 0
            r8 = r16
            r10 = r15
            r14 = r0
            r8.<init>((int) r9, (byte[]) r10, (boolean) r11, (long) r12, (java.util.List) r14)     // Catch:{ IOException -> 0x01aa }
            return r16
        L_0x01a4:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01aa }
            r0.<init>()     // Catch:{ IOException -> 0x01aa }
            throw r0     // Catch:{ IOException -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            r10 = r15
            goto L_0x01b3
        L_0x01ad:
            r0 = move-exception
            r10 = r6
            goto L_0x01b3
        L_0x01b0:
            r0 = move-exception
            r7 = r6
            r10 = r7
        L_0x01b3:
            boolean r8 = r0 instanceof java.net.SocketTimeoutException
            if (r8 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.zzarf r0 = new com.google.android.gms.internal.ads.zzarf
            com.google.android.gms.internal.ads.zzaql r7 = new com.google.android.gms.internal.ads.zzaql
            r7.<init>()
            java.lang.String r8 = "socket"
            r0.<init>(r8, r7, r6)
        L_0x01c3:
            r6 = r0
            goto L_0x022b
        L_0x01c5:
            boolean r8 = r0 instanceof java.net.MalformedURLException
            if (r8 != 0) goto L_0x026e
            if (r7 == 0) goto L_0x0268
            int r0 = r7.zzb()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = r18.zzk()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            java.lang.String r9 = "Unexpected response code %d for %s"
            com.google.android.gms.internal.ads.zzaqp.zzb(r9, r8)
            if (r10 == 0) goto L_0x021e
            java.util.List r14 = r7.zzd()
            com.google.android.gms.internal.ads.zzapz r7 = new com.google.android.gms.internal.ads.zzapz
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r12 = r8 - r4
            r11 = 0
            r8 = r7
            r9 = r0
            r8.<init>((int) r9, (byte[]) r10, (boolean) r11, (long) r12, (java.util.List) r14)
            r8 = 401(0x191, float:5.62E-43)
            if (r0 == r8) goto L_0x0211
            r8 = 403(0x193, float:5.65E-43)
            if (r0 != r8) goto L_0x01fd
            goto L_0x0211
        L_0x01fd:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x020b
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 > r2) goto L_0x020b
            com.google.android.gms.internal.ads.zzapq r0 = new com.google.android.gms.internal.ads.zzapq
            r0.<init>(r7)
            throw r0
        L_0x020b:
            com.google.android.gms.internal.ads.zzaqk r0 = new com.google.android.gms.internal.ads.zzaqk
            r0.<init>(r7)
            throw r0
        L_0x0211:
            com.google.android.gms.internal.ads.zzarf r0 = new com.google.android.gms.internal.ads.zzarf
            com.google.android.gms.internal.ads.zzapl r8 = new com.google.android.gms.internal.ads.zzapl
            r8.<init>(r7)
            java.lang.String r7 = "auth"
            r0.<init>(r7, r8, r6)
            goto L_0x01c3
        L_0x021e:
            com.google.android.gms.internal.ads.zzarf r0 = new com.google.android.gms.internal.ads.zzarf
            com.google.android.gms.internal.ads.zzapy r7 = new com.google.android.gms.internal.ads.zzapy
            r7.<init>()
            java.lang.String r8 = "network"
            r0.<init>(r8, r7, r6)
            goto L_0x01c3
        L_0x022b:
            com.google.android.gms.internal.ads.zzapr r0 = r18.zzy()
            int r7 = r18.zzb()
            com.google.android.gms.internal.ads.zzaqm r8 = r6.zzb     // Catch:{ zzaqm -> 0x0251 }
            r0.zzc(r8)     // Catch:{ zzaqm -> 0x0251 }
            java.lang.String r0 = r6.zza
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6}
            java.lang.String r6 = "%s-retry [timeout=%s]"
            java.lang.String r0 = java.lang.String.format(r6, r0)
            r2.zzm(r0)
            goto L_0x000a
        L_0x0251:
            r0 = move-exception
            java.lang.String r3 = r6.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "%s-timeout-giveup [timeout=%s]"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.zzm(r3)
            throw r0
        L_0x0268:
            com.google.android.gms.internal.ads.zzaqa r2 = new com.google.android.gms.internal.ads.zzaqa
            r2.<init>(r0)
            throw r2
        L_0x026e:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r2 = r18.zzk()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r4.concat(r2)
            r3.<init>(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqs.zza(com.google.android.gms.internal.ads.zzaqd):com.google.android.gms.internal.ads.zzapz");
    }
}
