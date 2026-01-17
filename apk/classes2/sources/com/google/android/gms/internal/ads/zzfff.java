package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfff {
    private final zzfej zza;
    private final zzffd zzb;
    private final zzfef zzc;
    /* access modifiers changed from: private */
    public final ArrayDeque zzd;
    /* access modifiers changed from: private */
    public zzffl zze;
    /* access modifiers changed from: private */
    public int zzf = 1;

    public zzfff(zzfej zzfej, zzfef zzfef, zzffd zzffd) {
        this.zza = zzfej;
        this.zzc = zzfef;
        this.zzb = zzffd;
        this.zzd = new ArrayDeque();
        zzfef.zzb(new zzffa(this));
    }

    public static /* synthetic */ void zzc(zzfff zzfff) {
        synchronized (zzfff) {
            zzfff.zzf = 1;
            zzfff.zzh();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzgy     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x006c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x006c }
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzbzm r0 = r0.zzg()     // Catch:{ all -> 0x006c }
            boolean r0 = r0.zzh()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            java.util.ArrayDeque r0 = r4.zzd     // Catch:{ all -> 0x006c }
            r0.clear()     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return
        L_0x002d:
            boolean r0 = r4.zzi()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006a
        L_0x0033:
            java.util.ArrayDeque r0 = r4.zzd     // Catch:{ all -> 0x006c }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x006a
            java.lang.Object r0 = r0.pollFirst()     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzffe r0 = (com.google.android.gms.internal.ads.zzffe) r0     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.zzfet r1 = r0.zza()     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzfej r1 = r4.zza     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzfet r2 = r0.zza()     // Catch:{ all -> 0x006c }
            boolean r1 = r1.zze(r2)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0033
        L_0x0055:
            com.google.android.gms.internal.ads.zzfej r1 = r4.zza     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzffd r2 = r4.zzb     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzffl r3 = new com.google.android.gms.internal.ads.zzffl     // Catch:{ all -> 0x006c }
            r3.<init>(r1, r2, r0)     // Catch:{ all -> 0x006c }
            r4.zze = r3     // Catch:{ all -> 0x006c }
            com.google.android.gms.internal.ads.zzffb r1 = new com.google.android.gms.internal.ads.zzffb     // Catch:{ all -> 0x006c }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x006c }
            r3.zzd(r1)     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return
        L_0x006a:
            monitor-exit(r4)
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfff.zzh():void");
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized ListenableFuture zza(zzffe zzffe) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzc(zzffe);
    }

    public final synchronized void zzf(zzffe zzffe) {
        this.zzd.add(zzffe);
    }
}
