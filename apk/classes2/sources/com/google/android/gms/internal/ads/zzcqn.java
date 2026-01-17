package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqn implements zzcxm, zzcws {
    private final Context zza;
    private final zzcfg zzb;
    private final zzfca zzc;
    private final VersionInfoParcel zzd;
    private zzedh zze;
    private boolean zzf;
    private final zzedf zzg;

    public zzcqn(Context context, zzcfg zzcfg, zzfca zzfca, VersionInfoParcel versionInfoParcel, zzedf zzedf) {
        this.zza = context;
        this.zzb = zzcfg;
        this.zzc = zzfca;
        this.zzd = versionInfoParcel;
        this.zzg = zzedf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zza() {
        /*
            r14 = this;
            monitor-enter(r14)
            com.google.android.gms.internal.ads.zzfca r0 = r14.zzc     // Catch:{ all -> 0x00ce }
            boolean r1 = r0.zzT     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0009
            goto L_0x00cc
        L_0x0009:
            com.google.android.gms.internal.ads.zzcfg r1 = r14.zzb     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00cc
            android.content.Context r2 = r14.zza     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzedc r3 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ce }
            boolean r2 = r3.zzl(r2)     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00cc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r14.zzd     // Catch:{ all -> 0x00ce }
            int r3 = r2.buddyApkVersion     // Catch:{ all -> 0x00ce }
            int r2 = r2.clientJarVersion     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r4.<init>()     // Catch:{ all -> 0x00ce }
            r4.append(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "."
            r4.append(r3)     // Catch:{ all -> 0x00ce }
            r4.append(r2)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzfcz r2 = r0.zzV     // Catch:{ all -> 0x00ce }
            java.lang.String r10 = r2.zza()     // Catch:{ all -> 0x00ce }
            int r2 = r2.zzc()     // Catch:{ all -> 0x00ce }
            r3 = 1
            if (r2 != r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzedd r2 = com.google.android.gms.internal.ads.zzedd.VIDEO     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzede r4 = com.google.android.gms.internal.ads.zzede.DEFINED_BY_JAVASCRIPT     // Catch:{ all -> 0x00ce }
            r12 = r2
            r11 = r4
            goto L_0x0054
        L_0x0047:
            int r2 = r0.zze     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzedd r4 = com.google.android.gms.internal.ads.zzedd.HTML_DISPLAY     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x0050
            com.google.android.gms.internal.ads.zzede r2 = com.google.android.gms.internal.ads.zzede.ONE_PIXEL     // Catch:{ all -> 0x00ce }
            goto L_0x0052
        L_0x0050:
            com.google.android.gms.internal.ads.zzede r2 = com.google.android.gms.internal.ads.zzede.BEGIN_TO_RENDER     // Catch:{ all -> 0x00ce }
        L_0x0052:
            r11 = r2
            r12 = r4
        L_0x0054:
            java.lang.String r13 = r0.zzal     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzedc r5 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ce }
            android.webkit.WebView r7 = r1.zzG()     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = ""
            java.lang.String r9 = "javascript"
            com.google.android.gms.internal.ads.zzedh r0 = r5.zza(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00ce }
            r14.zze = r0     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzfll r0 = r0.zza()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzfB     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00ce }
            java.lang.Object r2 = r4.zzb(r2)     // Catch:{ all -> 0x00ce }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzedc r2 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ce }
            android.webkit.WebView r4 = r1.zzG()     // Catch:{ all -> 0x00ce }
            r2.zzj(r0, r4)     // Catch:{ all -> 0x00ce }
            java.util.List r2 = r1.zzV()     // Catch:{ all -> 0x00ce }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ce }
        L_0x0093:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x00b2
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00ce }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzedc r5 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ce }
            r5.zzg(r0, r4)     // Catch:{ all -> 0x00ce }
            goto L_0x0093
        L_0x00a7:
            android.view.View r2 = r1.zzF()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzedc r4 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ce }
            r4.zzj(r0, r2)     // Catch:{ all -> 0x00ce }
        L_0x00b2:
            com.google.android.gms.internal.ads.zzedh r2 = r14.zze     // Catch:{ all -> 0x00ce }
            r1.zzat(r2)     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.zzedc r2 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ce }
            r2.zzk(r0)     // Catch:{ all -> 0x00ce }
            r14.zzf = r3     // Catch:{ all -> 0x00ce }
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x00ce }
            r0.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "onSdkLoaded"
            r1.zzd(r2, r0)     // Catch:{ all -> 0x00ce }
            monitor-exit(r14)
            return
        L_0x00cc:
            monitor-exit(r14)
            return
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqn.zza():void");
    }

    private final boolean zzb() {
        return ((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && this.zzg.zzd();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzt() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzb()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzedf r0 = r3.zzg     // Catch:{ all -> 0x0031 }
            r0.zzb()     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            boolean r0 = r3.zzf     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0015
            r3.zza()     // Catch:{ all -> 0x0031 }
        L_0x0015:
            com.google.android.gms.internal.ads.zzfca r0 = r3.zzc     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.zzT     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzedh r0 = r3.zze     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzcfg r0 = r3.zzb     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqn.zzt():void");
    }

    public final synchronized void zzu() {
        if (zzb()) {
            this.zzg.zzc();
        } else if (!this.zzf) {
            zza();
        }
    }
}
