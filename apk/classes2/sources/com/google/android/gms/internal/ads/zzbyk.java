package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyk implements zzazd {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbyk(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbyo r0 = com.google.android.gms.ads.internal.zzv.zzo()
            android.content.Context r1 = r3.zza
            boolean r0 = r0.zzp(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            boolean r2 = r3.zzd     // Catch:{ all -> 0x0037 }
            if (r2 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0016:
            r3.zzd = r4     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = r3.zzc     // Catch:{ all -> 0x0037 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0022:
            boolean r2 = r3.zzd     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzbyo r2 = com.google.android.gms.ads.internal.zzv.zzo()     // Catch:{ all -> 0x0037 }
            r2.zzf(r1, r4)     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x002e:
            com.google.android.gms.internal.ads.zzbyo r2 = com.google.android.gms.ads.internal.zzv.zzo()     // Catch:{ all -> 0x0037 }
            r2.zzg(r1, r4)     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyk.zzb(boolean):void");
    }

    public final void zzdr(zzazc zzazc) {
        zzb(zzazc.zzj);
    }
}
