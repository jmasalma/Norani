package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzv {
    /* access modifiers changed from: private */
    public final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    /* access modifiers changed from: private */
    public final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final zzdso zzh;
    private Map zzi;

    public zzv(zzdso zzdso) {
        this.zzh = zzdso;
        this.zza = ((Integer) zzbd.zzc().zzb(zzbde.zzhe)).intValue();
        this.zzb = ((Long) zzbd.zzc().zzb(zzbde.zzhf)).longValue();
        this.zzc = ((Boolean) zzbd.zzc().zzb(zzbde.zzhj)).booleanValue();
        this.zzd = ((Boolean) zzbd.zzc().zzb(zzbde.zzhi)).booleanValue();
        this.zze = Collections.synchronizedMap(new zzt(this));
    }

    public static /* synthetic */ void zzd(zzv zzv, zzdsd zzdsd, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzv.zzj(zzdsd, arrayDeque, "to");
        zzv.zzj(zzdsd, arrayDeque2, "of");
    }

    private final synchronized void zzi(zzdsd zzdsd) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcaf.zza.execute(new zzs(this, zzdsd, clone, clone2));
        }
    }

    private final void zzj(zzdsd zzdsd, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsd.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final synchronized void zzk() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdsd zzdsd) {
        zzu zzu = (zzu) this.zze.get(str);
        zzdsd.zzb().put("request_id", str);
        if (zzu != null) {
            zzdsd.zzb().put("mhit", "true");
            return zzu.zzb;
        }
        zzdsd.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void zze(String str, String str2, zzdsd zzdsd) {
        this.zze.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdsd);
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r2.size() >= r4) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzg(java.lang.String r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zze     // Catch:{ all -> 0x001d }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001d }
            com.google.android.gms.ads.nonagon.signalgeneration.zzu r2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) r2     // Catch:{ all -> 0x001d }
            r0 = 0
            if (r2 == 0) goto L_0x001b
            java.util.Set r2 = r2.zzc     // Catch:{ all -> 0x001d }
            r2.add(r3)     // Catch:{ all -> 0x001d }
            int r2 = r2.size()     // Catch:{ all -> 0x001d }
            monitor-exit(r1)
            if (r2 >= r4) goto L_0x001a
            r2 = 1
            return r2
        L_0x001a:
            return r0
        L_0x001b:
            monitor-exit(r1)
            return r0
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzh(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zze     // Catch:{ all -> 0x0019 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0019 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzu r2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) r2     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0016
            java.util.Set r2 = r2.zzc     // Catch:{ all -> 0x0019 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0016
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x0016:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzh(java.lang.String, java.lang.String):boolean");
    }
}
