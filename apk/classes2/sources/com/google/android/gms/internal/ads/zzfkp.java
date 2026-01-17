package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfkp {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfle zzc;
    private final zzfkl zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    zzfkp(zzfle zzfle, zzfkl zzfkl, Context context, Clock clock) {
        this.zzc = zzfle;
        this.zzd = zzfkl;
        this.zze = context;
        this.zzg = clock;
    }

    static String zzd(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        return str + "#" + name;
    }

    private final synchronized zzfld zzm(String str, AdFormat adFormat) {
        return (zzfld) this.zza.get(zzd(str, adFormat));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.Object zzn(java.lang.Class r12, java.lang.String r13, com.google.android.gms.ads.AdFormat r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.google.android.gms.internal.ads.zzfkr r0 = new com.google.android.gms.internal.ads.zzfkr     // Catch:{ all -> 0x006a }
            r0.<init>(r13, r14)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzfkt r8 = new com.google.android.gms.internal.ads.zzfkt     // Catch:{ all -> 0x006a }
            r9 = 0
            r8.<init>(r0, r9)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzfkl r0 = r11.zzd     // Catch:{ all -> 0x006a }
            com.google.android.gms.common.util.Clock r10 = r11.zzg     // Catch:{ all -> 0x006a }
            long r2 = r10.currentTimeMillis()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "1"
            r5 = -1
            r6 = -1
            r1 = r0
            r4 = r8
            r1.zzl(r2, r4, r5, r6, r7)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzfld r13 = r11.zzm(r13, r14)     // Catch:{ all -> 0x006a }
            if (r13 != 0) goto L_0x0025
            monitor-exit(r11)
            return r9
        L_0x0025:
            java.lang.String r6 = r13.zzo()     // Catch:{ ClassCastException -> 0x004d }
            java.lang.Object r14 = r13.zzk()     // Catch:{ ClassCastException -> 0x004d }
            if (r14 != 0) goto L_0x0031
            r14 = r9
            goto L_0x0035
        L_0x0031:
            java.lang.Object r14 = r12.cast(r14)     // Catch:{ ClassCastException -> 0x004d }
        L_0x0035:
            if (r14 == 0) goto L_0x004b
            long r2 = r10.currentTimeMillis()     // Catch:{ ClassCastException -> 0x004d }
            com.google.android.gms.ads.internal.client.zzfv r1 = r13.zze     // Catch:{ ClassCastException -> 0x004d }
            int r4 = r1.zzd     // Catch:{ ClassCastException -> 0x004d }
            int r5 = r13.zzd()     // Catch:{ ClassCastException -> 0x004d }
            java.lang.String r13 = "1"
            r1 = r0
            r7 = r8
            r8 = r13
            r1.zzm(r2, r4, r5, r6, r7, r8)     // Catch:{ ClassCastException -> 0x004d }
        L_0x004b:
            monitor-exit(r11)
            return r14
        L_0x004d:
            r13 = move-exception
            java.lang.String r14 = "PreloadAdManager.pollAd"
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x006a }
            r0.zzw(r13, r14)     // Catch:{ all -> 0x006a }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x006a }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x006a }
            java.lang.String r14 = "Unable to cast ad to the requested type:"
            java.lang.String r12 = r14.concat(r12)     // Catch:{ all -> 0x006a }
            com.google.android.gms.ads.internal.util.zze.zzb(r12, r13)     // Catch:{ all -> 0x006a }
            monitor-exit(r11)
            return r9
        L_0x006a:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x006a }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkp.zzn(java.lang.Class, java.lang.String, com.google.android.gms.ads.AdFormat):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzz)).booleanValue() != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.util.List zzo(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0104 }
            r0.<init>()     // Catch:{ all -> 0x0104 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0104 }
            r1.<init>()     // Catch:{ all -> 0x0104 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0104 }
        L_0x000f:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0104 }
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0104 }
            com.google.android.gms.ads.internal.client.zzfv r2 = (com.google.android.gms.ads.internal.client.zzfv) r2     // Catch:{ all -> 0x0104 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x0104 }
            int r4 = r2.zzb     // Catch:{ all -> 0x0104 }
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.getAdFormat(r4)     // Catch:{ all -> 0x0104 }
            java.lang.String r3 = zzd(r3, r4)     // Catch:{ all -> 0x0104 }
            r0.add(r3)     // Catch:{ all -> 0x0104 }
            java.util.concurrent.ConcurrentMap r4 = r8.zza     // Catch:{ all -> 0x0104 }
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzfld r5 = (com.google.android.gms.internal.ads.zzfld) r5     // Catch:{ all -> 0x0104 }
            if (r5 == 0) goto L_0x004e
            com.google.android.gms.ads.internal.client.zzfv r6 = r5.zze     // Catch:{ all -> 0x0104 }
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0104 }
            if (r6 != 0) goto L_0x0048
            java.util.concurrent.ConcurrentMap r6 = r8.zzb     // Catch:{ all -> 0x0104 }
            r6.put(r3, r5)     // Catch:{ all -> 0x0104 }
            r4.remove(r3)     // Catch:{ all -> 0x0104 }
            r1.add(r2)     // Catch:{ all -> 0x0104 }
            goto L_0x000f
        L_0x0048:
            int r2 = r2.zzd     // Catch:{ all -> 0x0104 }
            r5.zzB(r2)     // Catch:{ all -> 0x0104 }
            goto L_0x000f
        L_0x004e:
            java.util.concurrent.ConcurrentMap r5 = r8.zzb     // Catch:{ all -> 0x0104 }
            boolean r6 = r5.containsKey(r3)     // Catch:{ all -> 0x0104 }
            if (r6 == 0) goto L_0x0077
            java.lang.Object r6 = r5.get(r3)     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzfld r6 = (com.google.android.gms.internal.ads.zzfld) r6     // Catch:{ all -> 0x0104 }
            com.google.android.gms.ads.internal.client.zzfv r7 = r6.zze     // Catch:{ all -> 0x0104 }
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0104 }
            if (r7 == 0) goto L_0x0073
            int r2 = r2.zzd     // Catch:{ all -> 0x0104 }
            r6.zzB(r2)     // Catch:{ all -> 0x0104 }
            r6.zzy()     // Catch:{ all -> 0x0104 }
            r4.put(r3, r6)     // Catch:{ all -> 0x0104 }
            r5.remove(r3)     // Catch:{ all -> 0x0104 }
            goto L_0x000f
        L_0x0073:
            r1.add(r2)     // Catch:{ all -> 0x0104 }
            goto L_0x000f
        L_0x0077:
            r1.add(r2)     // Catch:{ all -> 0x0104 }
            goto L_0x000f
        L_0x007b:
            java.util.concurrent.ConcurrentMap r9 = r8.zza     // Catch:{ all -> 0x0104 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0104 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0104 }
        L_0x0085:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0104 }
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0104 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0104 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x0104 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0104 }
            boolean r3 = r0.contains(r3)     // Catch:{ all -> 0x0104 }
            if (r3 != 0) goto L_0x0085
            java.util.concurrent.ConcurrentMap r3 = r8.zzb     // Catch:{ all -> 0x0104 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0104 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzfld r2 = (com.google.android.gms.internal.ads.zzfld) r2     // Catch:{ all -> 0x0104 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0104 }
            r9.remove()     // Catch:{ all -> 0x0104 }
            goto L_0x0085
        L_0x00b2:
            java.util.concurrent.ConcurrentMap r9 = r8.zzb     // Catch:{ all -> 0x0104 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0104 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0104 }
        L_0x00bc:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0104 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0104 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzfld r0 = (com.google.android.gms.internal.ads.zzfld) r0     // Catch:{ all -> 0x0104 }
            r0.zzA()     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzy     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0104 }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ all -> 0x0104 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0104 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0104 }
            if (r2 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzz     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0104 }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ all -> 0x0104 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0104 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0104 }
            if (r2 == 0) goto L_0x00f8
        L_0x00f5:
            r0.zzv()     // Catch:{ all -> 0x0104 }
        L_0x00f8:
            boolean r0 = r0.zzC()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x00bc
            r9.remove()     // Catch:{ all -> 0x0104 }
            goto L_0x00bc
        L_0x0102:
            monitor-exit(r8)
            return r1
        L_0x0104:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0104 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkp.zzo(java.util.List):java.util.List");
    }

    private final synchronized void zzp(String str, zzfld zzfld) {
        zzfld.zzh();
        this.zza.put(str, zzfld);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzq(boolean z) {
        if (z) {
            for (zzfld zzy : this.zza.values()) {
                zzy.zzy();
            }
        } else {
            for (zzfld zzfld : this.zza.values()) {
                zzfld.zzf.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzr(boolean z) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzw)).booleanValue()) {
            zzq(z);
        }
    }

    private final synchronized boolean zzs(String str, AdFormat adFormat) {
        boolean z;
        int i;
        int i2;
        String str2;
        Clock clock = this.zzg;
        long currentTimeMillis = clock.currentTimeMillis();
        zzfld zzm = zzm(str, adFormat);
        z = zzm != null && zzm.zzC();
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        zzfkt zzfkt = new zzfkt(new zzfkr(str, adFormat), (zzfks) null);
        zzfkl zzfkl = this.zzd;
        if (zzm == null) {
            i = 0;
        } else {
            i = zzm.zze.zzd;
        }
        if (zzm == null) {
            i2 = 0;
        } else {
            i2 = zzm.zzd();
        }
        if (zzm == null) {
            str2 = null;
        } else {
            str2 = zzm.zzo();
        }
        zzfkl.zzh(i, i2, currentTimeMillis, valueOf, str2, zzfkt, "1");
        return z;
    }

    public final synchronized zzbaw zza(String str) {
        return (zzbaw) zzn(zzbaw.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized zzbx zzb(String str) {
        return (zzbx) zzn(zzbx.class, str, AdFormat.INTERSTITIAL);
    }

    public final synchronized zzbwv zzc(String str) {
        return (zzbwv) zzn(zzbwv.class, str, AdFormat.REWARDED);
    }

    public final void zzg(zzbpq zzbpq) {
        this.zzc.zzc(zzbpq);
    }

    public final synchronized void zzh(List list, zzce zzce) {
        List<zzfv> zzo = zzo(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (zzfv zzfv : zzo) {
            String str = zzfv.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzfv.zzb);
            zzfld zza2 = this.zzc.zza(zzfv, zzce);
            if (!(adFormat == null || zza2 == null)) {
                AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zza2.zzx(atomicInteger.get());
                }
                zzfkl zzfkl = this.zzd;
                zza2.zzz(zzfkl);
                zzp(zzd(str, adFormat), zza2);
                enumMap.put(adFormat, Integer.valueOf(((Integer) zzf.zzi(enumMap, adFormat, 0)).intValue() + 1));
                zzfkt zzfkt = new zzfkt(new zzfkr(str, adFormat), (zzfks) null);
                zzfkl.zzp(zzfv.zzd, this.zzg.currentTimeMillis(), zzfkt, "1");
            }
        }
        this.zzd.zzo(enumMap, this.zzg.currentTimeMillis(), "1");
    }

    public final void zzi() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e) {
                        int i = zze.zza;
                        zzo.zzk("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) zzbd.zzc().zzb(zzbde.zzD)).intValue());
        } else {
            try {
                this.zzf.registerDefaultNetworkCallback(new zzfko(this));
            } catch (RuntimeException e2) {
                int i2 = zze.zza;
                zzo.zzk("Failed to register network callback", e2);
                this.zzh = new AtomicInteger(((Integer) zzbd.zzc().zzb(zzbde.zzD)).intValue());
            }
        }
        zzv.zzb().zzc(new zzfkn(this));
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, AdFormat.REWARDED);
    }
}
