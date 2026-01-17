package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqp implements zzcxm, zzazd, zzdax {
    private final zzfca zza;
    private final zzcwq zzb;
    private final zzcxv zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final zzcym zzf;
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcqp(zzfca zzfca, zzcwq zzcwq, zzcxv zzcxv, zzcym zzcym) {
        this.zza = zzfca;
        this.zzb = zzcwq;
        this.zzc = zzcxv;
        this.zzf = zzcym;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzdp() {
    }

    public final void zzdq() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzu() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfca r0 = r2.zza     // Catch:{ all -> 0x0012 }
            int r0 = r0.zze     // Catch:{ all -> 0x0012 }
            r1 = 1
            if (r0 == r1) goto L_0x0010
            r1 = 4
            if (r0 == r1) goto L_0x0010
            r2.zzd()     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            monitor-exit(r2)
            return
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqp.zzu():void");
    }

    public final void zzdr(zzazc zzazc) {
        int i = this.zza.zze;
        if (i == 1) {
            if (zzazc.zzj) {
                zzd();
            }
        } else if (i == 4 && zzazc.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzazc.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }
}
