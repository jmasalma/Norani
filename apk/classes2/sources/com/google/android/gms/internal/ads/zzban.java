package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzban extends zzbae {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzban(int i) {
        int i2 = i >> 3;
        this.zzc = (i & 7) > 0 ? i2 + 1 : i2;
        this.zzd = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zzb(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zza
            monitor-enter(r0)
            java.security.MessageDigest r1 = r9.zza()     // Catch:{ all -> 0x005e }
            r9.zzb = r1     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            byte[] r10 = new byte[r2]     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return r10
        L_0x0010:
            r1.reset()     // Catch:{ all -> 0x005e }
            java.security.MessageDigest r1 = r9.zzb     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x005e }
            byte[] r10 = r10.getBytes(r3)     // Catch:{ all -> 0x005e }
            r1.update(r10)     // Catch:{ all -> 0x005e }
            java.security.MessageDigest r10 = r9.zzb     // Catch:{ all -> 0x005e }
            byte[] r10 = r10.digest()     // Catch:{ all -> 0x005e }
            int r1 = r10.length     // Catch:{ all -> 0x005e }
            int r3 = r9.zzc     // Catch:{ all -> 0x005e }
            if (r1 <= r3) goto L_0x002e
            r1 = r3
        L_0x002e:
            byte[] r4 = new byte[r1]     // Catch:{ all -> 0x005e }
            java.lang.System.arraycopy(r10, r2, r4, r2, r1)     // Catch:{ all -> 0x005e }
            int r10 = r9.zzd     // Catch:{ all -> 0x005e }
            r10 = r10 & 7
            if (r10 <= 0) goto L_0x005c
            r5 = 0
        L_0x003b:
            r7 = 8
            if (r2 >= r1) goto L_0x004b
            if (r2 <= 0) goto L_0x0042
            long r5 = r5 << r7
        L_0x0042:
            byte r7 = r4[r2]     // Catch:{ all -> 0x005e }
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r7 = (long) r7     // Catch:{ all -> 0x005e }
            long r5 = r5 + r7
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004b:
            int r10 = 8 - r10
            long r1 = r5 >>> r10
        L_0x004f:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x005c
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r1
            int r10 = (int) r5     // Catch:{ all -> 0x005e }
            byte r10 = (byte) r10     // Catch:{ all -> 0x005e }
            r4[r3] = r10     // Catch:{ all -> 0x005e }
            long r1 = r1 >>> r7
            goto L_0x004f
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return r4
        L_0x005e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzban.zzb(java.lang.String):byte[]");
    }
}
