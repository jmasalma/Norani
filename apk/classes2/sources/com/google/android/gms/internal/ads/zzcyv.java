package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcyv extends zzdbt {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private final zzdsj zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private boolean zzi = false;
    private ScheduledFuture zzj;
    private ScheduledFuture zzk;

    public zzcyv(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdsj zzdsj) {
        super(Collections.emptySet());
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
        this.zzd = zzdsj;
    }

    private final synchronized void zzf(long j) {
        ScheduledFuture scheduledFuture = this.zzj;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzj.cancel(false);
        }
        this.zze = this.zzc.elapsedRealtime() + j;
        this.zzj = this.zzb.schedule(new zzcys(this, (zzcyu) null), j, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzg(long j) {
        ScheduledFuture scheduledFuture = this.zzk;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzk.cancel(false);
        }
        this.zzf = this.zzc.elapsedRealtime() + j;
        this.zzk = this.zzb.schedule(new zzcyt(this, (zzcyu) null), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzi = false;
        zzf(0);
    }

    public final synchronized void zzb() {
        if (!this.zzi) {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1;
            } else {
                this.zzk.cancel(false);
                this.zzh = this.zzf - this.zzc.elapsedRealtime();
            }
            this.zzi = true;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        if (this.zzi) {
            if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                zzf(this.zzg);
            }
            if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                zzg(this.zzh);
            }
            this.zzi = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "In scheduleRefresh: "
            monitor-enter(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r1.<init>(r0)     // Catch:{ all -> 0x0090 }
            r1.append(r7)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x0090 }
            if (r7 > 0) goto L_0x0016
            goto L_0x0089
        L_0x0016:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0090 }
            long r1 = (long) r7     // Catch:{ all -> 0x0090 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0090 }
            boolean r7 = r6.zzi     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x0033
            long r2 = r6.zzg     // Catch:{ all -> 0x0090 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x002e
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            r6.zzg = r0     // Catch:{ all -> 0x0090 }
            monitor-exit(r6)
            return
        L_0x0033:
            com.google.android.gms.common.util.Clock r7 = r6.zzc     // Catch:{ all -> 0x0090 }
            long r2 = r7.elapsedRealtime()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zznE     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0090 }
            java.lang.Object r7 = r4.zzb(r7)     // Catch:{ all -> 0x0090 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0090 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x007d
            long r4 = r6.zze     // Catch:{ all -> 0x0090 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0056
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0089
        L_0x0056:
            r6.zzf(r0)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zznQ     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0090 }
            java.lang.Object r7 = r0.zzb(r7)     // Catch:{ all -> 0x0090 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0090 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzdsj r7 = r6.zzd     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdsi r7 = r7.zza()     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "action"
            java.lang.String r1 = "rtnc"
            r7.zzb(r0, r1)     // Catch:{ all -> 0x0090 }
            r7.zzi()     // Catch:{ all -> 0x0090 }
            monitor-exit(r6)
            return
        L_0x007d:
            long r4 = r6.zze     // Catch:{ all -> 0x0090 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x008b
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            monitor-exit(r6)
            return
        L_0x008b:
            r6.zzf(r0)     // Catch:{ all -> 0x0090 }
            monitor-exit(r6)
            return
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0090 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcyv.zzd(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "In scheduleShowRefreshedAd: "
            monitor-enter(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r1.<init>(r0)     // Catch:{ all -> 0x0078 }
            r1.append(r7)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0078 }
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x0078 }
            if (r7 > 0) goto L_0x0015
            goto L_0x0071
        L_0x0015:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0078 }
            long r1 = (long) r7     // Catch:{ all -> 0x0078 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0078 }
            boolean r7 = r6.zzi     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0032
            long r2 = r6.zzh     // Catch:{ all -> 0x0078 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x002d
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = r2
        L_0x002e:
            r6.zzh = r0     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)
            return
        L_0x0032:
            com.google.android.gms.common.util.Clock r7 = r6.zzc     // Catch:{ all -> 0x0078 }
            long r2 = r7.elapsedRealtime()     // Catch:{ all -> 0x0078 }
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zznE     // Catch:{ all -> 0x0078 }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0078 }
            java.lang.Object r7 = r4.zzb(r7)     // Catch:{ all -> 0x0078 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0078 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0065
            long r4 = r6.zzf     // Catch:{ all -> 0x0078 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0055
            java.lang.String r7 = "In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs"
            com.google.android.gms.ads.internal.util.zze.zza(r7)     // Catch:{ all -> 0x0078 }
        L_0x0055:
            long r4 = r6.zzf     // Catch:{ all -> 0x0078 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0060
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0071
        L_0x0060:
            r6.zzg(r0)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)
            return
        L_0x0065:
            long r4 = r6.zzf     // Catch:{ all -> 0x0078 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0073
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            monitor-exit(r6)
            return
        L_0x0073:
            r6.zzg(r0)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)
            return
        L_0x0078:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcyv.zze(int):void");
    }
}
