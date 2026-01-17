package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcbw implements Runnable {
    zzcbw(zzcby zzcby) {
        Objects.requireNonNull(zzcby);
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
