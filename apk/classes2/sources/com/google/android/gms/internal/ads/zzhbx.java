package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
abstract class zzhbx {
    private static volatile int zza = 100;

    zzhbx() {
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object zzb();

    /* access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzd(Object obj, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void zze(Object obj, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void zzf(Object obj, int i, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void zzg(Object obj, int i, zzgxz zzgxz);

    /* access modifiers changed from: package-private */
    public abstract void zzh(Object obj, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void zzi(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzj(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[LOOP:0: B:20:0x0040->B:23:0x004d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzk(java.lang.Object r9, com.google.android.gms.internal.ads.zzhbf r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r10.zzd()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x007d
            if (r0 == r2) goto L_0x0075
            r3 = 2
            if (r0 == r3) goto L_0x006d
            java.lang.String r3 = "Protocol message end-group tag did not match expected tag."
            r4 = 4
            r5 = 3
            if (r0 == r5) goto L_0x0035
            if (r0 == r4) goto L_0x002b
            r11 = 5
            if (r0 != r11) goto L_0x0023
            int r10 = r10.zzf()
            r8.zzd(r9, r1, r10)
            return r2
        L_0x0023:
            com.google.android.gms.internal.ads.zzgzv r9 = new com.google.android.gms.internal.ads.zzgzv
            java.lang.String r10 = "Protocol message tag had invalid wire type."
            r9.<init>(r10)
            throw r9
        L_0x002b:
            if (r11 == 0) goto L_0x002f
            r9 = 0
            return r9
        L_0x002f:
            com.google.android.gms.internal.ads.zzgzw r9 = new com.google.android.gms.internal.ads.zzgzw
            r9.<init>((java.lang.String) r3)
            throw r9
        L_0x0035:
            java.lang.Object r0 = r8.zzb()
            int r5 = r1 << 3
            int r11 = r11 + r2
            int r6 = zza
            if (r11 >= r6) goto L_0x0065
        L_0x0040:
            int r6 = r10.zzc()
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L_0x004f
            boolean r6 = r8.zzk(r0, r10, r11)
            if (r6 != 0) goto L_0x0040
        L_0x004f:
            r11 = r5 | 4
            int r10 = r10.zzd()
            if (r11 != r10) goto L_0x005f
            java.lang.Object r10 = r8.zzc(r0)
            r8.zzf(r9, r1, r10)
            return r2
        L_0x005f:
            com.google.android.gms.internal.ads.zzgzw r9 = new com.google.android.gms.internal.ads.zzgzw
            r9.<init>((java.lang.String) r3)
            throw r9
        L_0x0065:
            com.google.android.gms.internal.ads.zzgzw r9 = new com.google.android.gms.internal.ads.zzgzw
            java.lang.String r10 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x006d:
            com.google.android.gms.internal.ads.zzgxz r10 = r10.zzp()
            r8.zzg(r9, r1, r10)
            return r2
        L_0x0075:
            long r10 = r10.zzk()
            r8.zze(r9, r1, r10)
            return r2
        L_0x007d:
            long r10 = r10.zzl()
            r8.zzh(r9, r1, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbx.zzk(java.lang.Object, com.google.android.gms.internal.ads.zzhbf, int):boolean");
    }
}
