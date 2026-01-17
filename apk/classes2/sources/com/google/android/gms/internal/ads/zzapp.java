package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzapp extends Thread {
    private static final boolean zza = zzaqp.zzb;
    private final BlockingQueue zzb;
    /* access modifiers changed from: private */
    public final BlockingQueue zzc;
    private final zzapn zzd;
    private volatile boolean zze = false;
    private final zzaqq zzf;
    private final zzapu zzg;

    public zzapp(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzapn zzapn, zzapu zzapu) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzapn;
        this.zzg = zzapu;
        this.zzf = new zzaqq(this, blockingQueue2, zzapu);
    }

    private void zzc() throws InterruptedException {
        zzaqd zzaqd = (zzaqd) this.zzb.take();
        zzaqd.zzm("cache-queue-take");
        zzaqd.zzt(1);
        try {
            zzaqd.zzw();
            zzapn zzapn = this.zzd;
            zzapm zza2 = zzapn.zza(zzaqd.zzj());
            if (zza2 == null) {
                zzaqd.zzm("cache-miss");
                if (!this.zzf.zzc(zzaqd)) {
                    this.zzc.put(zzaqd);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaqd.zzm("cache-hit-expired");
                    zzaqd.zze(zza2);
                    if (!this.zzf.zzc(zzaqd)) {
                        this.zzc.put(zzaqd);
                    }
                } else {
                    zzaqd.zzm("cache-hit");
                    zzaqj zzh = zzaqd.zzh(new zzapz(zza2.zza, zza2.zzg));
                    zzaqd.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzaqd.zzm("cache-parsing-failed");
                        zzapn.zzc(zzaqd.zzj(), true);
                        zzaqd.zze((zzapm) null);
                        if (!this.zzf.zzc(zzaqd)) {
                            this.zzc.put(zzaqd);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaqd.zzm("cache-hit-refresh-needed");
                        zzaqd.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzaqd)) {
                            this.zzg.zzb(zzaqd, zzh, new zzapo(this, zzaqd));
                        } else {
                            this.zzg.zzb(zzaqd, zzh, (Runnable) null);
                        }
                    } else {
                        this.zzg.zzb(zzaqd, zzh, (Runnable) null);
                    }
                }
            }
        } finally {
            zzaqd.zzt(2);
        }
    }

    public final void run() {
        if (zza) {
            zzaqp.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqp.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
