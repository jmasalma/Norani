package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzapx extends Thread {
    private final BlockingQueue zza;
    private final zzapw zzb;
    private final zzapn zzc;
    private volatile boolean zzd = false;
    private final zzapu zze;

    public zzapx(BlockingQueue blockingQueue, zzapw zzapw, zzapn zzapn, zzapu zzapu) {
        this.zza = blockingQueue;
        this.zzb = zzapw;
        this.zzc = zzapn;
        this.zze = zzapu;
    }

    private void zzb() throws InterruptedException {
        zzaqd zzaqd = (zzaqd) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaqd.zzt(3);
        try {
            zzaqd.zzm("network-queue-take");
            zzaqd.zzw();
            TrafficStats.setThreadStatsTag(zzaqd.zzc());
            zzapz zza2 = this.zzb.zza(zzaqd);
            zzaqd.zzm("network-http-complete");
            if (!zza2.zze || !zzaqd.zzv()) {
                zzaqj zzh = zzaqd.zzh(zza2);
                zzaqd.zzm("network-parse-complete");
                zzapm zzapm = zzh.zzb;
                if (zzapm != null) {
                    this.zzc.zzd(zzaqd.zzj(), zzapm);
                    zzaqd.zzm("network-cache-written");
                }
                zzaqd.zzq();
                this.zze.zzb(zzaqd, zzh, (Runnable) null);
                zzaqd.zzs(zzh);
                zzaqd.zzt(4);
            }
            zzaqd.zzp("not-modified");
            zzaqd.zzr();
            zzaqd.zzt(4);
        } catch (zzaqm e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzaqd, e);
            zzaqd.zzr();
        } catch (Exception e2) {
            zzaqp.zzc(e2, "Unhandled exception %s", e2.toString());
            zzaqm zzaqm = new zzaqm((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzaqd, zzaqm);
            zzaqd.zzr();
        } catch (Throwable th) {
            zzaqd.zzt(4);
            throw th;
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqp.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
