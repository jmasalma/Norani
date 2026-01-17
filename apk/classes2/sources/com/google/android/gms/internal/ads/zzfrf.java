package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzfrf implements Closeable {
    public static zzfrr zza() {
        return new zzfrr();
    }

    public static zzfrr zzb(int i, zzfrq zzfrq) {
        return new zzfrr(new zzfrd(i), new zzfre(), zzfrq);
    }

    public static zzfrr zzc(zzfwh<Integer> zzfwh, zzfwh<Integer> zzfwh2, zzfrq zzfrq) {
        return new zzfrr(zzfwh, zzfwh2, zzfrq);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
