package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzffl {
    private final zzffe zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzffl(zzfej zzfej, zzffd zzffd, zzffe zzffe) {
        this.zza = zzffe;
        this.zzb = zzgdn.zzf(zzgdn.zzn(zzffd.zza(zzffe), new zzffj(this, zzffd, zzfej, zzffe), zzffe.zzb()), Exception.class, new zzffk(this, zzffd), zzffe.zzb());
    }

    public static /* synthetic */ ListenableFuture zza(zzffl zzffl, zzffd zzffd, Exception exc) {
        synchronized (zzffl) {
            zzffl.zzd = true;
            throw exc;
        }
    }

    public static /* synthetic */ ListenableFuture zzb(zzffl zzffl, zzffd zzffd, zzfej zzfej, zzffe zzffe, zzfes zzfes) {
        ListenableFuture listenableFuture;
        synchronized (zzffl) {
            zzffl.zzd = true;
            zzffd.zzb(zzfes);
            if (!zzffl.zzc) {
                zzfej.zzd(zzffe.zza(), zzfes);
                listenableFuture = zzgdn.zzh((Object) null);
            } else {
                listenableFuture = zzgdn.zzh(new zzffc(zzfes, zzffe));
            }
        }
        return listenableFuture;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzffe r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002d
            boolean r0 = r2.zzc     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x000a
            goto L_0x002d
        L_0x000a:
            com.google.android.gms.internal.ads.zzffe r0 = r2.zza     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzfet r1 = r0.zza()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzfet r1 = r3.zza()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzfet r0 = r0.zza()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzfet r3 = r3.zza()     // Catch:{ all -> 0x0030 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x002d
            r3 = 1
            r2.zzc = r3     // Catch:{ all -> 0x0030 }
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zzb     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return r3
        L_0x002d:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0030:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffl.zzc(com.google.android.gms.internal.ads.zzffe):com.google.common.util.concurrent.ListenableFuture");
    }

    public final synchronized void zzd(zzgdj zzgdj) {
        zzffi zzffi = new zzffi();
        zzffe zzffe = this.zza;
        zzgdn.zzr(zzgdn.zzn(this.zzb, zzffi, zzffe.zzb()), zzgdj, zzffe.zzb());
    }
}
