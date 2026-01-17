package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfpu {
    private final zzays zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfpu(zzays zzays, File file, File file2, File file3) {
        this.zza = zzays;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzays zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j) {
        return this.zza.zzb() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zze() {
        /*
            r9 = this;
            byte[] r0 = r9.zze
            r1 = 0
            if (r0 != 0) goto L_0x0057
            java.io.File r0 = r9.zzd
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            com.google.android.gms.internal.ads.zzgxz r0 = com.google.android.gms.internal.ads.zzgxz.zzb     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            r3 = 256(0x100, float:3.59E-43)
        L_0x0015:
            byte[] r4 = new byte[r3]     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            r5 = 0
            r6 = r5
        L_0x0019:
            if (r6 >= r3) goto L_0x0027
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            r8 = -1
            if (r7 != r8) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            int r6 = r6 + r7
            goto L_0x0019
        L_0x0027:
            if (r6 != 0) goto L_0x002b
            r4 = r1
            goto L_0x002f
        L_0x002b:
            com.google.android.gms.internal.ads.zzgxz r4 = com.google.android.gms.internal.ads.zzgxz.zzv(r4, r5, r6)     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
        L_0x002f:
            if (r4 != 0) goto L_0x003d
            com.google.android.gms.internal.ads.zzgxz r0 = com.google.android.gms.internal.ads.zzgxz.zzu(r0)     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            byte[] r0 = r0.zzA()     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L_0x0055
        L_0x003d:
            r0.add(r4)     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.14794E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ IOException -> 0x0051, all -> 0x0048 }
            goto L_0x0015
        L_0x0048:
            r0 = move-exception
            r1 = r2
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L_0x0050:
            r2 = r1
        L_0x0051:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r0 = r1
        L_0x0055:
            r9.zze = r0
        L_0x0057:
            byte[] r0 = r9.zze
            if (r0 != 0) goto L_0x005c
            return r1
        L_0x005c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpu.zze():byte[]");
    }
}
