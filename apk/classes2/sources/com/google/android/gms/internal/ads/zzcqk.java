package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqk implements zzazd {
    private final zzcfg zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcqk(zzcfg zzcfg, Executor executor) {
        this.zza = zzcfg;
        this.zzb = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzdr(com.google.android.gms.internal.ads.zzazc r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcfg r0 = r3.zza     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzmY     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x0062 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0060
        L_0x0018:
            boolean r4 = r4.zzj     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x003e
            java.util.concurrent.atomic.AtomicReference r4 = r3.zzc     // Catch:{ all -> 0x0062 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0062 }
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0062 }
            java.lang.Object r4 = r4.getAndSet(r2)     // Catch:{ all -> 0x0062 }
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0062 }
            if (r4 != 0) goto L_0x0060
            java.util.concurrent.Executor r4 = r3.zzb     // Catch:{ all -> 0x0062 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.zzcqi r1 = new com.google.android.gms.internal.ads.zzcqi     // Catch:{ all -> 0x0062 }
            r1.<init>(r0)     // Catch:{ all -> 0x0062 }
            r4.execute(r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r3)
            return
        L_0x003e:
            java.util.concurrent.atomic.AtomicReference r4 = r3.zzc     // Catch:{ all -> 0x0062 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0062 }
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0062 }
            java.lang.Object r4 = r4.getAndSet(r2)     // Catch:{ all -> 0x0062 }
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0062 }
            if (r4 != 0) goto L_0x0060
            java.util.concurrent.Executor r4 = r3.zzb     // Catch:{ all -> 0x0062 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.zzcqj r1 = new com.google.android.gms.internal.ads.zzcqj     // Catch:{ all -> 0x0062 }
            r1.<init>(r0)     // Catch:{ all -> 0x0062 }
            r4.execute(r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r3)
            return
        L_0x0060:
            monitor-exit(r3)
            return
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqk.zzdr(com.google.android.gms.internal.ads.zzazc):void");
    }
}
