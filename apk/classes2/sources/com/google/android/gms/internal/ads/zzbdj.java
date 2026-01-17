package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbdj {
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    String zzd;
    Context zze;
    String zzf;
    private final HashSet zzg = new HashSet(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));
    private AtomicBoolean zzh;
    private File zzi;

    public static /* synthetic */ void zzc(zzbdj zzbdj) {
        while (true) {
            try {
                zzbdt zzbdt = (zzbdt) zzbdj.zza.take();
                zzbds zza2 = zzbdt.zza();
                if (!TextUtils.isEmpty(zza2.zzb())) {
                    zzbdj.zzg(zzbdj.zzb(zzbdj.zzb, zzbdt.zzb()), zza2);
                }
            } catch (InterruptedException e) {
                int i = zze.zza;
                zzo.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab A[SYNTHETIC, Splitter:B:38:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[SYNTHETIC, Splitter:B:44:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzg(java.util.Map r5, com.google.android.gms.internal.ads.zzbds r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.zzd
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.zzb()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.zzb()
            r1.append(r5)
        L_0x0055:
            java.lang.String r5 = r6.zza()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.zza()
            r1.append(r5)
        L_0x006b:
            java.lang.String r5 = r1.toString()
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.zzh
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c9
            java.io.File r6 = r4.zzi
            if (r6 == 0) goto L_0x00c1
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a1 }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x00a1 }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009c, all -> 0x0099 }
            r2.write(r5)     // Catch:{ IOException -> 0x009c, all -> 0x0099 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009c, all -> 0x0099 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
            return
        L_0x0092:
            r5 = move-exception
            int r6 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r0, r5)
            return
        L_0x0099:
            r5 = move-exception
            r1 = r2
            goto L_0x00b4
        L_0x009c:
            r5 = move-exception
            r1 = r2
            goto L_0x00a2
        L_0x009f:
            r5 = move-exception
            goto L_0x00b4
        L_0x00a1:
            r5 = move-exception
        L_0x00a2:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x009f }
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r6, r5)     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x00b3
            r1.close()     // Catch:{ IOException -> 0x00af }
            return
        L_0x00af:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r0, r5)
        L_0x00b3:
            return
        L_0x00b4:
            if (r1 == 0) goto L_0x00c0
            r1.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00c0
        L_0x00ba:
            r6 = move-exception
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r0, r6)
        L_0x00c0:
            throw r5
        L_0x00c1:
            int r5 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r5 = "CsiReporter: File doesn't exist. Cannot write CSI data to file."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r5)
            return
        L_0x00c9:
            com.google.android.gms.ads.internal.zzv.zzr()
            android.content.Context r6 = r4.zze
            java.lang.String r0 = r4.zzf
            com.google.android.gms.ads.internal.util.zzs.zzM(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdj.zzg(java.util.Map, com.google.android.gms.internal.ads.zzbds):void");
    }

    public final zzbdp zza(String str) {
        zzbdp zzbdp = (zzbdp) this.zzc.get(str);
        if (zzbdp != null) {
            return zzbdp;
        }
        return zzbdp.zza;
    }

    /* access modifiers changed from: package-private */
    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbez.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfqt.zza(zzfqs.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcaf.zza.execute(new zzbdi(this));
        Map map2 = this.zzc;
        zzbdp zzbdp = zzbdp.zzb;
        map2.put("action", zzbdp);
        map2.put("ad_format", zzbdp);
        map2.put("e", zzbdp.zzc);
    }

    public final void zze(String str) {
        if (!this.zzg.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.zzf);
            linkedHashMap.put("ue", str);
            zzg(zzb(this.zzb, linkedHashMap), (zzbds) null);
        }
    }

    public final boolean zzf(zzbdt zzbdt) {
        return this.zza.offer(zzbdt);
    }
}
