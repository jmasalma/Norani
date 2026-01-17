package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsu {
    private final zzg zza;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final String zze;
    private final zzdso zzf;

    public zzdsu(String str, zzdso zzdso) {
        this.zze = str;
        this.zzf = zzdso;
        this.zza = zzv.zzp().zzi();
    }

    private final Map zzg() {
        String str;
        Map zza2 = this.zzf.zza();
        zza2.put("tms", Long.toString(zzv.zzD().elapsedRealtime(), 10));
        if (this.zza.zzN()) {
            str = "";
        } else {
            str = this.zze;
        }
        zza2.put("tid", str);
        return zza2;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcl)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "aaia");
            zzg.put("aair", "MalformedJson");
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcl)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            zzg.put("rqe", str2);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcl)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_started");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcl)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzcl     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0014
            goto L_0x0043
        L_0x0014:
            boolean r0 = r3.zzd     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0043
            java.util.Map r0 = r3.zzg()     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0045 }
            java.util.List r1 = r3.zzb     // Catch:{ all -> 0x0045 }
            r1.add(r0)     // Catch:{ all -> 0x0045 }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x0045 }
        L_0x002c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0045 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.zzdso r2 = r3.zzf     // Catch:{ all -> 0x0045 }
            r2.zzg(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x002c
        L_0x003e:
            r0 = 1
            r3.zzd = r0     // Catch:{ all -> 0x0045 }
            monitor-exit(r3)
            return
        L_0x0043:
            monitor-exit(r3)
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsu.zze():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzcl     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x002f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            boolean r0 = r3.zzc     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            java.util.Map r0 = r3.zzg()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x002f }
            java.util.List r1 = r3.zzb     // Catch:{ all -> 0x002f }
            r1.add(r0)     // Catch:{ all -> 0x002f }
            r0 = 1
            r3.zzc = r0     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsu.zzf():void");
    }
}
