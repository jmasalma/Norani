package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzt extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    zzt(zzv zzv) {
        Objects.requireNonNull(zzv);
        this.zza = zzv;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeEldestEntry(java.util.Map.Entry r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.nonagon.signalgeneration.zzv r0 = r5.zza
            monitor-enter(r0)
            int r1 = r5.size()     // Catch:{ all -> 0x0037 }
            int r2 = r0.zza     // Catch:{ all -> 0x0037 }
            r3 = 0
            if (r1 > r2) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r3
        L_0x0010:
            java.util.ArrayDeque r1 = r0.zzf     // Catch:{ all -> 0x0037 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0037 }
            java.lang.Object r4 = r6.getKey()     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0037 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0037 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzu r6 = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) r6     // Catch:{ all -> 0x0037 }
            java.lang.String r6 = r6.zzb     // Catch:{ all -> 0x0037 }
            r2.<init>(r4, r6)     // Catch:{ all -> 0x0037 }
            r1.add(r2)     // Catch:{ all -> 0x0037 }
            int r6 = r5.size()     // Catch:{ all -> 0x0037 }
            int r1 = r0.zza     // Catch:{ all -> 0x0037 }
            if (r6 <= r1) goto L_0x0035
            r3 = 1
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r3
        L_0x0037:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzt.removeEldestEntry(java.util.Map$Entry):boolean");
    }
}
