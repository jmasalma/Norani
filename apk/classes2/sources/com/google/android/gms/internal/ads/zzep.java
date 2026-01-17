package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzep implements zzdj {
    protected zzep() {
    }

    public final long zza() {
        return System.currentTimeMillis();
    }

    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    public final long zzc() {
        return System.nanoTime();
    }

    public final zzdt zzd(Looper looper, Handler.Callback callback) {
        return new zzes(new Handler(looper, callback));
    }
}
