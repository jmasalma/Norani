package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaqq implements zzaqc {
    private final Map zza = new HashMap();
    private final zzapp zzb;
    private final BlockingQueue zzc;
    private final zzapu zzd;

    zzaqq(zzapp zzapp, BlockingQueue blockingQueue, zzapu zzapu) {
        this.zzd = zzapu;
        this.zzb = zzapp;
        this.zzc = blockingQueue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.internal.ads.zzaqd r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.zza     // Catch:{ all -> 0x005c }
            java.lang.String r5 = r5.zzj()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r0.remove(r5)     // Catch:{ all -> 0x005c }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x005a
            boolean r2 = com.google.android.gms.internal.ads.zzaqp.zzb     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x002a
            int r2 = r1.size()     // Catch:{ all -> 0x005c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005c }
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "%d waiting requests for cacheKey=%s; resend to network"
            com.google.android.gms.internal.ads.zzaqp.zzd(r3, r2)     // Catch:{ all -> 0x005c }
        L_0x002a:
            r2 = 0
            java.lang.Object r2 = r1.remove(r2)     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzaqd r2 = (com.google.android.gms.internal.ads.zzaqd) r2     // Catch:{ all -> 0x005c }
            r0.put(r5, r1)     // Catch:{ all -> 0x005c }
            r2.zzu(r4)     // Catch:{ all -> 0x005c }
            java.util.concurrent.BlockingQueue r5 = r4.zzc     // Catch:{ InterruptedException -> 0x003e }
            r5.put(r2)     // Catch:{ InterruptedException -> 0x003e }
            monitor-exit(r4)
            return
        L_0x003e:
            r5 = move-exception
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005c }
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Couldn't add request to queue. %s"
            com.google.android.gms.internal.ads.zzaqp.zzb(r0, r5)     // Catch:{ all -> 0x005c }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005c }
            r5.interrupt()     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzapp r5 = r4.zzb     // Catch:{ all -> 0x005c }
            r5.zzb()     // Catch:{ all -> 0x005c }
            monitor-exit(r4)
            return
        L_0x005a:
            monitor-exit(r4)
            return
        L_0x005c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqq.zza(com.google.android.gms.internal.ads.zzaqd):void");
    }

    public final void zzb(zzaqd zzaqd, zzaqj zzaqj) {
        List<zzaqd> list;
        zzapm zzapm = zzaqj.zzb;
        if (zzapm == null || zzapm.zza(System.currentTimeMillis())) {
            zza(zzaqd);
            return;
        }
        String zzj = zzaqd.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzaqp.zzb) {
                zzaqp.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            for (zzaqd zzb2 : list) {
                this.zzd.zzb(zzb2, zzaqj, (Runnable) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzc(com.google.android.gms.internal.ads.zzaqd r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.zza     // Catch:{ all -> 0x004c }
            java.lang.String r1 = r5.zzj()     // Catch:{ all -> 0x004c }
            boolean r2 = r0.containsKey(r1)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x004c }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x001a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            r2.<init>()     // Catch:{ all -> 0x004c }
        L_0x001a:
            java.lang.String r3 = "waiting-for-response"
            r5.zzm(r3)     // Catch:{ all -> 0x004c }
            r2.add(r5)     // Catch:{ all -> 0x004c }
            r0.put(r1, r2)     // Catch:{ all -> 0x004c }
            boolean r5 = com.google.android.gms.internal.ads.zzaqp.zzb     // Catch:{ all -> 0x004c }
            if (r5 == 0) goto L_0x0032
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.google.android.gms.internal.ads.zzaqp.zza(r0, r5)     // Catch:{ all -> 0x004c }
        L_0x0032:
            monitor-exit(r4)
            r5 = 1
            return r5
        L_0x0035:
            r2 = 0
            r0.put(r1, r2)     // Catch:{ all -> 0x004c }
            r5.zzu(r4)     // Catch:{ all -> 0x004c }
            boolean r5 = com.google.android.gms.internal.ads.zzaqp.zzb     // Catch:{ all -> 0x004c }
            if (r5 == 0) goto L_0x0049
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "new request, sending to network %s"
            com.google.android.gms.internal.ads.zzaqp.zza(r0, r5)     // Catch:{ all -> 0x004c }
        L_0x0049:
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x004c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqq.zzc(com.google.android.gms.internal.ads.zzaqd):boolean");
    }
}
