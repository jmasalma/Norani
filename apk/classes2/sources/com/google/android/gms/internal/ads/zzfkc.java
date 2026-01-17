package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfkc {
    private final Map zza;
    private final zzfle zzb;
    private final zzfkl zzc;
    private final Clock zzd;

    zzfkc(zzfle zzfle, zzfkl zzfkl, Context context, Clock clock) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put(AdFormat.APP_OPEN_AD, new HashMap());
        hashMap.put(AdFormat.INTERSTITIAL, new HashMap());
        hashMap.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfle;
        this.zzc = zzfkl;
        this.zzd = clock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.Object zzk(java.lang.Class r12, com.google.android.gms.ads.AdFormat r13, java.lang.String r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.google.android.gms.internal.ads.zzfkl r7 = r11.zzc     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.common.util.Clock r8 = r11.zzd     // Catch:{ all -> 0x00a3 }
            long r0 = r8.currentTimeMillis()     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "2"
            r7.zzg(r0, r2)     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r11.zza     // Catch:{ all -> 0x00a3 }
            boolean r1 = r0.containsKey(r13)     // Catch:{ all -> 0x00a3 }
            r9 = 0
            if (r1 != 0) goto L_0x0019
            monitor-exit(r11)
            return r9
        L_0x0019:
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x00a3 }
            r10 = r0
            com.google.android.gms.internal.ads.zzfld r10 = (com.google.android.gms.internal.ads.zzfld) r10     // Catch:{ all -> 0x00a3 }
            if (r10 == 0) goto L_0x00a1
            com.google.android.gms.ads.AdFormat r0 = r10.zze()     // Catch:{ all -> 0x00a3 }
            boolean r13 = r13.equals(r0)     // Catch:{ all -> 0x00a3 }
            if (r13 != 0) goto L_0x0034
            goto L_0x00a1
        L_0x0034:
            com.google.android.gms.internal.ads.zzfkr r13 = new com.google.android.gms.internal.ads.zzfkr     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.ads.internal.client.zzfv r0 = r10.zze     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r0.zza     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.ads.AdFormat r1 = r10.zze()     // Catch:{ all -> 0x00a3 }
            r13.<init>(r0, r1)     // Catch:{ all -> 0x00a3 }
            r13.zzb(r14)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzfkt r14 = new com.google.android.gms.internal.ads.zzfkt     // Catch:{ all -> 0x00a3 }
            r14.<init>(r13, r9)     // Catch:{ all -> 0x00a3 }
            long r1 = r8.currentTimeMillis()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.ads.internal.client.zzfv r13 = r10.zze     // Catch:{ all -> 0x00a3 }
            int r4 = r13.zzd     // Catch:{ all -> 0x00a3 }
            int r5 = r10.zzd()     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "2"
            r0 = r7
            r3 = r14
            r0.zzl(r1, r3, r4, r5, r6)     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = r10.zzo()     // Catch:{ ClassCastException -> 0x0084 }
            java.lang.Object r13 = r10.zzk()     // Catch:{ ClassCastException -> 0x0084 }
            if (r13 != 0) goto L_0x0068
            r13 = r9
            goto L_0x006c
        L_0x0068:
            java.lang.Object r13 = r12.cast(r13)     // Catch:{ ClassCastException -> 0x0084 }
        L_0x006c:
            if (r13 == 0) goto L_0x0082
            long r1 = r8.currentTimeMillis()     // Catch:{ ClassCastException -> 0x0084 }
            com.google.android.gms.ads.internal.client.zzfv r0 = r10.zze     // Catch:{ ClassCastException -> 0x0084 }
            int r3 = r0.zzd     // Catch:{ ClassCastException -> 0x0084 }
            int r4 = r10.zzd()     // Catch:{ ClassCastException -> 0x0084 }
            java.lang.String r8 = "2"
            r0 = r7
            r6 = r14
            r7 = r8
            r0.zzm(r1, r3, r4, r5, r6, r7)     // Catch:{ ClassCastException -> 0x0084 }
        L_0x0082:
            monitor-exit(r11)
            return r13
        L_0x0084:
            r13 = move-exception
            java.lang.String r14 = "PreloadAdManager.pollAd"
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x00a3 }
            r0.zzw(r13, r14)     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00a3 }
            java.lang.String r14 = "Unable to cast ad to the requested type:"
            java.lang.String r12 = r14.concat(r12)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.ads.internal.util.zze.zzb(r12, r13)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r11)
            return r9
        L_0x00a1:
            monitor-exit(r11)
            return r9
        L_0x00a3:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a3 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzk(java.lang.Class, com.google.android.gms.ads.AdFormat, java.lang.String):java.lang.Object");
    }

    private final synchronized boolean zzl(AdFormat adFormat) {
        int size;
        int i;
        Map map = this.zza;
        size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            i = Math.max(((Integer) zzbd.zzc().zzb(zzbde.zzeM)).intValue(), 1);
        } else if (ordinal == 2) {
            i = Math.max(((Integer) zzbd.zzc().zzb(zzbde.zzeN)).intValue(), 1);
        } else if (ordinal != 5) {
            i = 0;
        } else {
            i = Math.max(((Integer) zzbd.zzc().zzb(zzbde.zzeO)).intValue(), 1);
        }
        if (size < i) {
            return true;
        }
        return false;
    }

    public final synchronized int zza(AdFormat adFormat, String str) {
        String str2;
        int i;
        Map map = this.zza;
        int i2 = 0;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfld zzfld = (zzfld) ((Map) map.get(adFormat)).get(str);
        if (zzfld != null) {
            i2 = zzfld.zzd();
        }
        zzfkl zzfkl = this.zzc;
        long currentTimeMillis = this.zzd.currentTimeMillis();
        if (zzfld == null) {
            str2 = null;
        } else {
            str2 = zzfld.zze.zza;
        }
        String str3 = str2;
        if (zzfld == null) {
            i = -1;
        } else {
            i = zzfld.zze.zzd;
        }
        zzfkl.zzf(i2, currentTimeMillis, str, str3, adFormat, i);
        return i2;
    }

    public final synchronized zzbaw zzb(String str) {
        return (zzbaw) zzk(zzbaw.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized zzbx zzc(String str) {
        return (zzbx) zzk(zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.ads.internal.client.zzfv zzd(com.google.android.gms.ads.AdFormat r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.Map r0 = r11.zza     // Catch:{ all -> 0x0048 }
            boolean r1 = r0.containsKey(r12)     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r1 != 0) goto L_0x000b
            goto L_0x0046
        L_0x000b:
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0048 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzfld r0 = (com.google.android.gms.internal.ads.zzfld) r0     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzfkl r3 = r11.zzc     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.util.Clock r1 = r11.zzd     // Catch:{ all -> 0x0048 }
            long r4 = r1.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0023
            r7 = r2
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.ads.internal.client.zzfv r1 = r0.zze     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.zza     // Catch:{ all -> 0x0048 }
            r7 = r1
        L_0x0028:
            r1 = -1
            if (r0 != 0) goto L_0x002d
            r9 = r1
            goto L_0x0032
        L_0x002d:
            com.google.android.gms.ads.internal.client.zzfv r6 = r0.zze     // Catch:{ all -> 0x0048 }
            int r6 = r6.zzd     // Catch:{ all -> 0x0048 }
            r9 = r6
        L_0x0032:
            if (r0 != 0) goto L_0x0036
        L_0x0034:
            r10 = r1
            goto L_0x003b
        L_0x0036:
            int r1 = r0.zzd()     // Catch:{ all -> 0x0048 }
            goto L_0x0034
        L_0x003b:
            r6 = r13
            r8 = r12
            r3.zzd(r4, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0046
            com.google.android.gms.ads.internal.client.zzfv r12 = r0.zze     // Catch:{ all -> 0x0048 }
            monitor-exit(r11)
            return r12
        L_0x0046:
            monitor-exit(r11)
            return r2
        L_0x0048:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0048 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzd(com.google.android.gms.ads.AdFormat, java.lang.String):com.google.android.gms.ads.internal.client.zzfv");
    }

    public final synchronized zzbwv zze(String str) {
        return (zzbwv) zzk(zzbwv.class, AdFormat.REWARDED, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Map zzf(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.getAdFormat(r6)     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x004a
            java.util.Map r1 = r5.zza     // Catch:{ all -> 0x004c }
            boolean r2 = r1.containsKey(r6)     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x0015
            goto L_0x004a
        L_0x0015:
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x004c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x004c }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x004c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004c }
        L_0x0023:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzfld r2 = (com.google.android.gms.internal.ads.zzfld) r2     // Catch:{ all -> 0x004c }
            java.lang.String r3 = r2.zzn()     // Catch:{ all -> 0x004c }
            com.google.android.gms.ads.internal.client.zzfv r2 = r2.zze     // Catch:{ all -> 0x004c }
            r0.put(r3, r2)     // Catch:{ all -> 0x004c }
            goto L_0x0023
        L_0x0039:
            com.google.android.gms.internal.ads.zzfkl r1 = r5.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.common.util.Clock r2 = r5.zzd     // Catch:{ all -> 0x004c }
            long r2 = r2.currentTimeMillis()     // Catch:{ all -> 0x004c }
            int r4 = r0.size()     // Catch:{ all -> 0x004c }
            r1.zze(r6, r2, r4)     // Catch:{ all -> 0x004c }
            monitor-exit(r5)
            return r0
        L_0x004a:
            monitor-exit(r5)
            return r0
        L_0x004c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzf(int):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzg(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.getAdFormat(r6)     // Catch:{ all -> 0x006d }
            if (r6 == 0) goto L_0x006b
            java.util.Map r0 = r5.zza     // Catch:{ all -> 0x006d }
            boolean r1 = r0.containsKey(r6)     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0010
            goto L_0x006b
        L_0x0010:
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x006d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x006d }
            int r1 = r0.size()     // Catch:{ all -> 0x006d }
            java.util.Set r2 = r0.keySet()     // Catch:{ all -> 0x006d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x006d }
        L_0x0022:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006d }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x006d }
            com.google.android.gms.internal.ads.zzfld r4 = (com.google.android.gms.internal.ads.zzfld) r4     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0022
            r4.zzA()     // Catch:{ all -> 0x006d }
            r4.zzv()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x006d }
            int r4 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "Destroyed ad preloader for preloadId: "
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x006d }
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0022
        L_0x004c:
            r0.clear()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "Destroyed all ad preloaders for ad format: "
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x006d }
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x006d }
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)     // Catch:{ all -> 0x006d }
            com.google.android.gms.internal.ads.zzfkl r0 = r5.zzc     // Catch:{ all -> 0x006d }
            com.google.android.gms.common.util.Clock r2 = r5.zzd     // Catch:{ all -> 0x006d }
            long r2 = r2.currentTimeMillis()     // Catch:{ all -> 0x006d }
            r0.zzc(r2, r6, r1)     // Catch:{ all -> 0x006d }
            monitor-exit(r5)
            return
        L_0x006b:
            monitor-exit(r5)
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzg(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzh(com.google.android.gms.ads.AdFormat r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.Map r0 = r10.zza     // Catch:{ all -> 0x0044 }
            boolean r1 = r0.containsKey(r11)     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x000a
            goto L_0x0041
        L_0x000a:
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x0044 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzfld r1 = (com.google.android.gms.internal.ads.zzfld) r1     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0044 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0044 }
            r0.remove(r12)     // Catch:{ all -> 0x0044 }
            r1.zzA()     // Catch:{ all -> 0x0044 }
            r1.zzv()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzfkl r2 = r10.zzc     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.util.Clock r0 = r10.zzd     // Catch:{ all -> 0x0044 }
            long r3 = r0.currentTimeMillis()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.ads.internal.client.zzfv r0 = r1.zze     // Catch:{ all -> 0x0044 }
            java.lang.String r6 = r0.zza     // Catch:{ all -> 0x0044 }
            int r8 = r0.zzd     // Catch:{ all -> 0x0044 }
            int r9 = r1.zzd()     // Catch:{ all -> 0x0044 }
            r5 = r12
            r7 = r11
            r2.zzb(r3, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0044 }
            monitor-exit(r10)
            r11 = 1
            return r11
        L_0x0041:
            monitor-exit(r10)
            r11 = 0
            return r11
        L_0x0044:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0044 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzh(com.google.android.gms.ads.AdFormat, java.lang.String):boolean");
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        String str2;
        zzfkt zzfkt;
        int i;
        Clock clock = this.zzd;
        long currentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        int i2 = 0;
        if (!map.containsKey(adFormat)) {
            return false;
        }
        zzfld zzfld = (zzfld) ((Map) map.get(adFormat)).get(str);
        if (zzfld == null) {
            str2 = null;
        } else {
            str2 = zzfld.zzo();
        }
        boolean z = str2 != null && adFormat.equals(zzfld.zze());
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        if (zzfld == null) {
            zzfkt = null;
        } else {
            zzfkr zzfkr = new zzfkr(zzfld.zze.zza, adFormat);
            zzfkr.zzb(str);
            zzfkt = new zzfkt(zzfkr, (zzfks) null);
        }
        zzfkl zzfkl = this.zzc;
        if (zzfld == null) {
            i = 0;
        } else {
            i = zzfld.zze.zzd;
        }
        if (zzfld != null) {
            i2 = zzfld.zzd();
        }
        zzfkl.zzh(i, i2, currentTimeMillis, valueOf, str2, zzfkt, "2");
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzj(java.lang.String r9, com.google.android.gms.ads.internal.client.zzfv r10, com.google.android.gms.ads.internal.client.zzch r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r10.zzb     // Catch:{ all -> 0x0060 }
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.getAdFormat(r0)     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x000a
            goto L_0x005d
        L_0x000a:
            java.util.Map r1 = r8.zza     // Catch:{ all -> 0x0060 }
            boolean r2 = r1.containsKey(r0)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0060 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0060 }
            boolean r2 = r2.containsKey(r9)     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x005d
            boolean r2 = r8.zzl(r0)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzfle r2 = r8.zzb     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzfld r11 = r2.zzb(r9, r10, r11)     // Catch:{ all -> 0x0060 }
            if (r11 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzfkl r2 = r8.zzc     // Catch:{ all -> 0x0060 }
            r11.zzz(r2)     // Catch:{ all -> 0x0060 }
            r11.zzh()     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0060 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0060 }
            r1.put(r9, r11)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzfkr r11 = new com.google.android.gms.internal.ads.zzfkr     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r10.zza     // Catch:{ all -> 0x0060 }
            r11.<init>(r1, r0)     // Catch:{ all -> 0x0060 }
            r11.zzb(r9)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzfkt r6 = new com.google.android.gms.internal.ads.zzfkt     // Catch:{ all -> 0x0060 }
            r9 = 0
            r6.<init>(r11, r9)     // Catch:{ all -> 0x0060 }
            int r3 = r10.zzd     // Catch:{ all -> 0x0060 }
            com.google.android.gms.common.util.Clock r9 = r8.zzd     // Catch:{ all -> 0x0060 }
            long r4 = r9.currentTimeMillis()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "2"
            r2.zzp(r3, r4, r6, r7)     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            r9 = 1
            return r9
        L_0x005d:
            monitor-exit(r8)
            r9 = 0
            return r9
        L_0x0060:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0060 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzj(java.lang.String, com.google.android.gms.ads.internal.client.zzfv, com.google.android.gms.ads.internal.client.zzch):boolean");
    }
}
