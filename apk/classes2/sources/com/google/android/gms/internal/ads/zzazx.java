package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzazx {
    private final Object zza = new Object();
    private zzazv zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzazv zzazv = this.zzb;
            if (zzazv == null) {
                return null;
            }
            Activity zza2 = zzazv.zza();
            return zza2;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzazv zzazv = this.zzb;
            if (zzazv == null) {
                return null;
            }
            Context zzb2 = zzazv.zzb();
            return zzb2;
        }
    }

    public final void zzc(zzazw zzazw) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzazv();
            }
            this.zzb.zzf(zzazw);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzc     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x000e
            r1 = r4
        L_0x000e:
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0015
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0036 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x0021
            java.lang.String r4 = "Can not cast Context to Application"
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0036 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.zzazv r2 = r3.zzb     // Catch:{ all -> 0x0036 }
            if (r2 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzazv r2 = new com.google.android.gms.internal.ads.zzazv     // Catch:{ all -> 0x0036 }
            r2.<init>()     // Catch:{ all -> 0x0036 }
            r3.zzb = r2     // Catch:{ all -> 0x0036 }
        L_0x002c:
            com.google.android.gms.internal.ads.zzazv r2 = r3.zzb     // Catch:{ all -> 0x0036 }
            r2.zzg(r1, r4)     // Catch:{ all -> 0x0036 }
            r4 = 1
            r3.zzc = r4     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazx.zzd(android.content.Context):void");
    }

    public final void zze(zzazw zzazw) {
        synchronized (this.zza) {
            zzazv zzazv = this.zzb;
            if (zzazv != null) {
                zzazv.zzh(zzazw);
            }
        }
    }
}
