package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeou implements zzeuc {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb;
    private final Clock zzc;
    private final Executor zzd;
    private final zzeuc zze;
    private final long zzf;
    private final zzdsj zzg;

    public zzeou(zzeuc zzeuc, long j, Clock clock, Executor executor, zzdsj zzdsj) {
        this.zzc = clock;
        this.zze = zzeuc;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdsj;
        this.zzb = new AtomicReference(false);
    }

    public final int zza() {
        return this.zze.zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (((java.lang.Boolean) r8.zzb.get()).booleanValue() != false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        if (r1.zza() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r0 = r1.zza;
        r1 = r8.zze;
        r5 = new com.google.android.gms.internal.ads.zzeot(r1.zzb(), r8.zzf, r8.zzc);
        r8.zza.set(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzmk)).booleanValue() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzml)).booleanValue() == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
        r2 = r8.zzg.zza();
        r2.zzb("action", "scs");
        r2.zzb("sid", java.lang.String.valueOf(r1.zza()));
        r2.zzj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzmj
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicReference r0 = r8.zza
            java.lang.Object r1 = r0.get()
            com.google.android.gms.internal.ads.zzeot r1 = (com.google.android.gms.internal.ads.zzeot) r1
            if (r1 == 0) goto L_0x0022
            boolean r2 = r1.zza()
            if (r2 == 0) goto L_0x00fa
        L_0x0022:
            com.google.android.gms.internal.ads.zzeuc r1 = r8.zze
            long r2 = r8.zzf
            com.google.android.gms.common.util.Clock r4 = r8.zzc
            com.google.android.gms.internal.ads.zzeot r5 = new com.google.android.gms.internal.ads.zzeot
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb()
            r5.<init>(r1, r2, r4)
            r0.set(r5)
        L_0x0034:
            r1 = r5
            goto L_0x00fa
        L_0x0037:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzmi
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicReference r0 = r8.zzb
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x006b
            java.util.concurrent.ScheduledExecutorService r1 = com.google.android.gms.internal.ads.zzcaf.zzd
            com.google.android.gms.internal.ads.zzeor r2 = new com.google.android.gms.internal.ads.zzeor
            r2.<init>(r8)
            long r5 = r8.zzf
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3 = r5
            r1.scheduleWithFixedDelay(r2, r3, r5, r7)
        L_0x006b:
            monitor-enter(r8)
            java.util.concurrent.atomic.AtomicReference r0 = r8.zza     // Catch:{ all -> 0x00fd }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.ads.zzeot r1 = (com.google.android.gms.internal.ads.zzeot) r1     // Catch:{ all -> 0x00fd }
            if (r1 != 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzeot r1 = new com.google.android.gms.internal.ads.zzeot     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.ads.zzeuc r2 = r8.zze     // Catch:{ all -> 0x00fd }
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzb()     // Catch:{ all -> 0x00fd }
            long r3 = r8.zzf     // Catch:{ all -> 0x00fd }
            com.google.android.gms.common.util.Clock r5 = r8.zzc     // Catch:{ all -> 0x00fd }
            r1.<init>(r2, r3, r5)     // Catch:{ all -> 0x00fd }
            r0.set(r1)     // Catch:{ all -> 0x00fd }
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza     // Catch:{ all -> 0x00fd }
            monitor-exit(r8)     // Catch:{ all -> 0x00fd }
            return r0
        L_0x008c:
            monitor-exit(r8)     // Catch:{ all -> 0x00fd }
            java.util.concurrent.atomic.AtomicReference r0 = r8.zzb
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r1.zza()
            if (r0 != 0) goto L_0x00a2
            goto L_0x00fa
        L_0x00a2:
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            com.google.android.gms.internal.ads.zzeuc r1 = r8.zze
            long r2 = r8.zzf
            com.google.android.gms.common.util.Clock r4 = r8.zzc
            com.google.android.gms.internal.ads.zzeot r5 = new com.google.android.gms.internal.ads.zzeot
            com.google.common.util.concurrent.ListenableFuture r6 = r1.zzb()
            r5.<init>(r6, r2, r4)
            java.util.concurrent.atomic.AtomicReference r2 = r8.zza
            r2.set(r5)
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzmk
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzml
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00f9
            com.google.android.gms.internal.ads.zzdsj r2 = r8.zzg
            com.google.android.gms.internal.ads.zzdsi r2 = r2.zza()
            java.lang.String r3 = "action"
            java.lang.String r4 = "scs"
            r2.zzb(r3, r4)
            int r1 = r1.zza()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "sid"
            r2.zzb(r3, r1)
            r2.zzj()
        L_0x00f9:
            return r0
        L_0x00fa:
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            return r0
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00fd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeou.zzb():com.google.common.util.concurrent.ListenableFuture");
    }
}
