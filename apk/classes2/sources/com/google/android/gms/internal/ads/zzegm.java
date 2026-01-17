package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzegm {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final zzgeh zzc;
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private zzehc zzf;
    private int zzg = IntCompanionObject.MAX_VALUE;
    private final String zzh;
    private final int zzi;
    private final zzehb zzj;
    private zzfca zzk;
    private boolean zzl;

    zzegm(zzfcn zzfcn, zzehb zzehb, zzgeh zzgeh) {
        this.zzl = false;
        this.zzi = zzfcn.zzb.zzb.zzr;
        this.zzj = zzehb;
        this.zzc = zzgeh;
        this.zzh = zzehi.zzc(zzfcn);
        List list = zzfcn.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfca) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzehc zzehc = this.zzf;
        if (zzehc != null) {
            this.zzc.zzc(zzehc);
        } else {
            this.zzc.zzd(new zzehf(3, this.zzh));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzf(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List r0 = r4.zzb     // Catch:{ all -> 0x004b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x004b }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x004b }
            com.google.android.gms.internal.ads.zzfca r1 = (com.google.android.gms.internal.ads.zzfca) r1     // Catch:{ all -> 0x004b }
            java.util.Map r2 = r4.zza     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0022
            int r2 = r2.intValue()     // Catch:{ all -> 0x004b }
            goto L_0x0025
        L_0x0022:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0025:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x004b }
            if (r5 != 0) goto L_0x0035
            java.util.Set r3 = r4.zze     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r1.zzat     // Catch:{ all -> 0x004b }
            boolean r1 = r3.contains(r1)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0007
        L_0x0035:
            int r1 = r2.intValue()     // Catch:{ all -> 0x004b }
            int r3 = r4.zzg     // Catch:{ all -> 0x004b }
            if (r1 >= r3) goto L_0x0040
            monitor-exit(r4)
            r5 = 1
            return r5
        L_0x0040:
            int r1 = r2.intValue()     // Catch:{ all -> 0x004b }
            int r2 = r4.zzg     // Catch:{ all -> 0x004b }
            if (r1 <= r2) goto L_0x0007
        L_0x0048:
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x004b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegm.zzf(boolean):boolean");
    }

    private final synchronized boolean zzg() {
        for (zzfca zzfca : this.zzd) {
            Integer num = (Integer) this.zza.get(zzfca);
            if (Integer.valueOf(num != null ? num.intValue() : IntCompanionObject.MAX_VALUE).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzh() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            boolean r1 = r2.zzf(r0)     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0012
            boolean r1 = r2.zzg()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegm.zzh():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzi() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzl     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            java.util.List r0 = r3.zzb     // Catch:{ all -> 0x0040 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0025
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.ads.zzfca r0 = (com.google.android.gms.internal.ads.zzfca) r0     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.zzav     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r3.zzd     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            monitor-exit(r3)
            return r1
        L_0x0025:
            boolean r0 = r3.zzd()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003e
            java.util.List r0 = r3.zzd     // Catch:{ all -> 0x0040 }
            int r2 = r3.zzi     // Catch:{ all -> 0x0040 }
            int r0 = r0.size()     // Catch:{ all -> 0x0040 }
            if (r0 >= r2) goto L_0x003e
            boolean r0 = r3.zzf(r1)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegm.zzi():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return null;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfca zza() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.zzi()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0040
            r0 = 0
        L_0x0008:
            java.util.List r1 = r6.zzb     // Catch:{ all -> 0x0043 }
            int r2 = r1.size()     // Catch:{ all -> 0x0043 }
            if (r0 >= r2) goto L_0x0040
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.zzfca r2 = (com.google.android.gms.internal.ads.zzfca) r2     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = r2.zzat     // Catch:{ all -> 0x0043 }
            java.util.Set r4 = r6.zze     // Catch:{ all -> 0x0043 }
            boolean r5 = r4.contains(r3)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0023
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0023:
            boolean r5 = r2.zzav     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x002a
            r5 = 1
            r6.zzl = r5     // Catch:{ all -> 0x0043 }
        L_0x002a:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0043 }
            if (r5 != 0) goto L_0x0033
            r4.add(r3)     // Catch:{ all -> 0x0043 }
        L_0x0033:
            java.util.List r3 = r6.zzd     // Catch:{ all -> 0x0043 }
            r3.add(r2)     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.zzfca r0 = (com.google.android.gms.internal.ads.zzfca) r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return r0
        L_0x0040:
            monitor-exit(r6)
            r0 = 0
            return r0
        L_0x0043:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegm.zza():com.google.android.gms.internal.ads.zzfca");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb(java.lang.Throwable r1, com.google.android.gms.internal.ads.zzfca r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 0
            r0.zzl = r1     // Catch:{ all -> 0x0023 }
            java.util.List r1 = r0.zzd     // Catch:{ all -> 0x0023 }
            r1.remove(r2)     // Catch:{ all -> 0x0023 }
            java.util.Set r1 = r0.zze     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = r2.zzat     // Catch:{ all -> 0x0023 }
            r1.remove(r2)     // Catch:{ all -> 0x0023 }
            boolean r1 = r0.zzd()     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.zzh()     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0021
            r0.zze()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)
            return
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegm.zzb(java.lang.Throwable, com.google.android.gms.internal.ads.zzfca):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(zzehc zzehc, zzfca zzfca) {
        this.zzl = false;
        this.zzd.remove(zzfca);
        if (zzd()) {
            zzehc.zzr();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfca);
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : IntCompanionObject.MAX_VALUE);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfca);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzehc;
        this.zzk = zzfca;
        if (!zzh()) {
            zze();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
