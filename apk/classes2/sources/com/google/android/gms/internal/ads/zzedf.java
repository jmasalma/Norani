package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedf {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfca zzc;
    private final zzcfg zzd;
    private final zzdsj zze;
    private zzflw zzf;

    zzedf(Context context, VersionInfoParcel versionInfoParcel, zzfca zzfca, zzcfg zzcfg, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfca;
        this.zzd = zzcfg;
        this.zze = zzdsj;
    }

    public final synchronized void zza(View view) {
        zzflw zzflw = this.zzf;
        if (zzflw != null) {
            zzv.zzC().zzh(zzflw, view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzflw r0 = r3.zzf     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzcfg r0 = r3.zzd     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "onSdkImpression"
            com.google.android.gms.internal.ads.zzfyt r2 = com.google.android.gms.internal.ads.zzfyt.zzd()     // Catch:{ all -> 0x0016 }
            r0.zzd(r1, r2)     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)
            return
        L_0x0014:
            monitor-exit(r3)
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedf.zzb():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzc() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzflw r0 = r5.zzf     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.zzcfg r1 = r5.zzd     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.List r2 = r1.zzV()     // Catch:{ all -> 0x0032 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0032 }
        L_0x0011:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0032 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.ads.zzedc r4 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x0032 }
            r4.zzh(r0, r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0011
        L_0x0025:
            java.lang.String r0 = "onSdkLoaded"
            com.google.android.gms.internal.ads.zzfyt r2 = com.google.android.gms.internal.ads.zzfyt.zzd()     // Catch:{ all -> 0x0032 }
            r1.zzd(r0, r2)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)
            return
        L_0x0030:
            monitor-exit(r5)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedf.zzc():void");
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zze(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzfca r7 = r6.zzc     // Catch:{ all -> 0x00ad }
            boolean r0 = r7.zzT     // Catch:{ all -> 0x00ad }
            r1 = 0
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfz     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x00ad }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ad }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfC     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x00ad }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ad }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.zzcfg r0 = r6.zzd     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0032
            goto L_0x00ab
        L_0x0032:
            com.google.android.gms.internal.ads.zzflw r2 = r6.zzf     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x003f
            int r7 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "Omid javascript session service already started for ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r1
        L_0x003f:
            android.content.Context r2 = r6.zza     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.zzedc r3 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ad }
            boolean r2 = r3.zzl(r2)     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x0054
            int r7 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "Unable to initialize omid."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r1
        L_0x0054:
            com.google.android.gms.internal.ads.zzfcz r7 = r7.zzV     // Catch:{ all -> 0x00ad }
            boolean r7 = r7.zzb()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00ab
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7 = r6.zzb     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.zzedc r2 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x00ad }
            android.webkit.WebView r3 = r0.zzG()     // Catch:{ all -> 0x00ad }
            r4 = 1
            com.google.android.gms.internal.ads.zzflw r7 = r2.zze(r7, r3, r4)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzfD     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ all -> 0x00ad }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00ad }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.zzdsj r2 = r6.zze     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x0084
            java.lang.String r3 = "1"
            goto L_0x0086
        L_0x0084:
            java.lang.String r3 = "0"
        L_0x0086:
            com.google.android.gms.internal.ads.zzdsi r2 = r2.zza()     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "omid_js_session_success"
            r2.zzb(r5, r3)     // Catch:{ all -> 0x00ad }
            r2.zzj()     // Catch:{ all -> 0x00ad }
        L_0x0092:
            if (r7 != 0) goto L_0x009d
            int r7 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "Unable to create javascript session service."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r1
        L_0x009d:
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Created omid javascript session service."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r1)     // Catch:{ all -> 0x00ad }
            r6.zzf = r7     // Catch:{ all -> 0x00ad }
            r0.zzas(r6)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r4
        L_0x00ab:
            monitor-exit(r6)
            return r1
        L_0x00ad:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ad }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedf.zze(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf(com.google.android.gms.internal.ads.zzcfx r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzflw r0 = r3.zzf     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            com.google.android.gms.internal.ads.zzcfg r1 = r3.zzd     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0018
            com.google.android.gms.internal.ads.zzedc r2 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x001a }
            r2.zzm(r0, r4)     // Catch:{ all -> 0x001a }
            r4 = 0
            r3.zzf = r4     // Catch:{ all -> 0x001a }
            r1.zzas(r4)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)
            return
        L_0x0018:
            monitor-exit(r3)
            return
        L_0x001a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedf.zzf(com.google.android.gms.internal.ads.zzcfx):void");
    }
}
