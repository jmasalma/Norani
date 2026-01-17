package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzawv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawx zzb;

    zzawv(zzawx zzawx, int i, boolean z) {
        this.zza = i;
        this.zzb = zzawx;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(3:2|3|4)|5|6|9|(1:(1:25)(2:22|23))(1:24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.zza
            com.google.android.gms.internal.ads.zzawx r1 = r7.zzb
            if (r0 <= 0) goto L_0x000c
            int r0 = r0 * 1000
            long r2 = (long) r0
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            android.content.Context r0 = r1.zza     // Catch:{ all -> 0x002a }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ all -> 0x002a }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x002a }
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ all -> 0x002a }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x002a }
            int r1 = r1.versionCode     // Catch:{ all -> 0x002a }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x002a }
            com.google.android.gms.internal.ads.zzatq r0 = com.google.android.gms.internal.ads.zzfoq.zza(r0, r2, r1)     // Catch:{ all -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            com.google.android.gms.internal.ads.zzawx r1 = r7.zzb
            r1.zzk = r0
            int r2 = r7.zza
            r3 = 4
            if (r2 >= r3) goto L_0x006e
            if (r0 != 0) goto L_0x0038
            goto L_0x0069
        L_0x0038:
            boolean r3 = r0.zzaf()
            if (r3 == 0) goto L_0x0069
            java.lang.String r3 = r0.zzg()
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0069
            boolean r3 = r0.zzag()
            if (r3 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzaud r3 = r0.zzf()
            boolean r3 = r3.zzg()
            if (r3 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzaud r0 = r0.zzf()
            long r3 = r0.zza()
            r5 = -2
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            r0 = 1
            int r2 = r2 + r0
            r1.zzn(r2, r0)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawv.run():void");
    }
}
