package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcyt implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzcyt(zzcyv zzcyv, zzcyu zzcyu) {
        this.zza = new WeakReference(zzcyv);
    }

    public final void run() {
        zzcyv zzcyv = (zzcyv) this.zza.get();
        if (zzcyv != null) {
            zzcyv.zzq(new zzcyr());
        }
    }
}
