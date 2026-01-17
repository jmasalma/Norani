package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaqg {
    private final AtomicInteger zza = new AtomicInteger();
    private final Set zzb = new HashSet();
    private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
    private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
    private final zzapn zze;
    private final zzapw zzf;
    private final zzapx[] zzg;
    private zzapp zzh;
    private final List zzi = new ArrayList();
    private final List zzj = new ArrayList();
    private final zzapu zzk;

    public zzaqg(zzapn zzapn, zzapw zzapw, int i) {
        zzapu zzapu = new zzapu(new Handler(Looper.getMainLooper()));
        this.zze = zzapn;
        this.zzf = zzapw;
        this.zzg = new zzapx[4];
        this.zzk = zzapu;
    }

    public final zzaqd zza(zzaqd zzaqd) {
        zzaqd.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzaqd);
        }
        zzaqd.zzg(this.zza.incrementAndGet());
        zzaqd.zzm("add-to-queue");
        zzc(zzaqd, 0);
        this.zzc.add(zzaqd);
        return zzaqd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzaqd zzaqd) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzaqd);
        }
        List<zzaqf> list = this.zzi;
        synchronized (list) {
            for (zzaqf zza2 : list) {
                zza2.zza();
            }
        }
        zzc(zzaqd, 5);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzaqd zzaqd, int i) {
        List<zzaqe> list = this.zzj;
        synchronized (list) {
            for (zzaqe zza2 : list) {
                zza2.zza();
            }
        }
    }

    public final void zzd() {
        zzapp zzapp = this.zzh;
        if (zzapp != null) {
            zzapp.zzb();
        }
        zzapx[] zzapxArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzapx zzapx = zzapxArr[i];
            if (zzapx != null) {
                zzapx.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzapn zzapn = this.zze;
        zzapu zzapu = this.zzk;
        zzapp zzapp2 = new zzapp(priorityBlockingQueue, priorityBlockingQueue2, zzapn, zzapu);
        this.zzh = zzapp2;
        zzapp2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzapx zzapx2 = new zzapx(priorityBlockingQueue2, this.zzf, zzapn, zzapu);
            zzapxArr[i2] = zzapx2;
            zzapx2.start();
        }
    }
}
