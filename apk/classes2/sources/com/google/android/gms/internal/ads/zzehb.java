package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehb {
    /* access modifiers changed from: private */
    public final Clock zza;
    /* access modifiers changed from: private */
    public final zzehd zzb;
    /* access modifiers changed from: private */
    public final zzfjy zzc;
    /* access modifiers changed from: private */
    public final LinkedHashMap zzd = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final boolean zze;
    /* access modifiers changed from: private */
    public final zzedr zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    private long zzh;
    private long zzi;

    public zzehb(Clock clock, zzehd zzehd, zzedr zzedr, zzfjy zzfjy) {
        this.zza = clock;
        this.zzb = zzehd;
        this.zze = ((Boolean) zzbd.zzc().zzb(zzbde.zzha)).booleanValue();
        this.zzf = zzedr;
        this.zzc = zzfjy;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r3.zzc != 8) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzq(com.google.android.gms.internal.ads.zzfca r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = r2.zzd     // Catch:{ all -> 0x0018 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzeha r3 = (com.google.android.gms.internal.ads.zzeha) r3     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r3 != 0) goto L_0x000e
            monitor-exit(r2)
            return r0
        L_0x000e:
            int r3 = r3.zzc     // Catch:{ all -> 0x0018 }
            r1 = 8
            monitor-exit(r2)
            if (r3 != r1) goto L_0x0017
            r3 = 1
            return r3
        L_0x0017:
            return r0
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehb.zzq(com.google.android.gms.internal.ads.zzfca):boolean");
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ListenableFuture zzf(zzfcn zzfcn, zzfca zzfca, ListenableFuture listenableFuture, zzfju zzfju) {
        zzfca zzfca2 = zzfca;
        ListenableFuture listenableFuture2 = listenableFuture;
        synchronized (this) {
            zzfcd zzfcd = zzfcn.zzb.zzb;
            long elapsedRealtime = this.zza.elapsedRealtime();
            String str = zzfca2.zzw;
            if (str != null) {
                this.zzd.put(zzfca2, new zzeha(str, zzfca2.zzaf, 9, 0, (Integer) null));
                zzgdn.zzr(listenableFuture2, new zzegz(this, elapsedRealtime, zzfcd, zzfca, str, zzfju, zzfcn), zzcaf.zzg);
            }
        }
        return listenableFuture2;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry value : this.zzd.entrySet()) {
            zzeha zzeha = (zzeha) value.getValue();
            if (zzeha.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeha.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfca zzfca) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfca != null) {
            this.zzf.zze(zzfca);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfca zzfca = (zzfca) it.next();
            String str = zzfca.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfca, new zzeha(str, zzfca.zzaf, IntCompanionObject.MAX_VALUE, 0, (Integer) null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzm(com.google.android.gms.internal.ads.zzfca r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.zzd     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.ads.zzeha r2 = (com.google.android.gms.internal.ads.zzeha) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0015
            boolean r0 = r1.zzg     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            r0 = 8
            r2.zzc = r0     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            return
        L_0x0015:
            monitor-exit(r1)
            return
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehb.zzm(com.google.android.gms.internal.ads.zzfca):void");
    }
}
