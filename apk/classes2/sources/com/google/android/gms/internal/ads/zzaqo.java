package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaqo {
    public static final boolean zza = zzaqp.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzaqo() {
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzaqp.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j) {
        if (!this.zzc) {
            this.zzb.add(new zzaqn(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        List<zzaqn> list = this.zzb;
        if (list.size() == 0) {
            j = 0;
        } else {
            j = ((zzaqn) list.get(list.size() - 1)).zzc - ((zzaqn) list.get(0)).zzc;
        }
        if (j > 0) {
            long j2 = ((zzaqn) list.get(0)).zzc;
            zzaqp.zza("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzaqn zzaqn : list) {
                long j3 = zzaqn.zzc;
                zzaqp.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzaqn.zzb), zzaqn.zza);
                j2 = j3;
            }
        }
    }
}
