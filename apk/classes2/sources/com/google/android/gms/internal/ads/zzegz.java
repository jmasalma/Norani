package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzegz implements zzgdj {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcd zzb;
    final /* synthetic */ zzfca zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfju zze;
    final /* synthetic */ zzfcn zzf;
    final /* synthetic */ zzehb zzg;

    zzegz(zzehb zzehb, long j, zzfcd zzfcd, zzfca zzfca, String str, zzfju zzfju, zzfcn zzfcn) {
        this.zza = j;
        this.zzb = zzfcd;
        this.zzc = zzfca;
        this.zzd = str;
        this.zze = zzfju;
        this.zzf = zzfcn;
        Objects.requireNonNull(zzehb);
        this.zzg = zzehb;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void zza(java.lang.Throwable r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            com.google.android.gms.internal.ads.zzehb r2 = r1.zzg
            com.google.android.gms.common.util.Clock r3 = r2.zza
            long r3 = r3.elapsedRealtime()
            long r5 = r1.zza
            long r3 = r3 - r5
            boolean r5 = r0 instanceof java.util.concurrent.TimeoutException
            r6 = 3
            r7 = 0
            if (r5 == 0) goto L_0x001a
            r5 = 2
        L_0x0018:
            r14 = r7
            goto L_0x0063
        L_0x001a:
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzegj
            if (r5 == 0) goto L_0x0020
            r5 = r6
            goto L_0x0018
        L_0x0020:
            boolean r5 = r0 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L_0x0026
            r5 = 4
            goto L_0x0018
        L_0x0026:
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzfdd
            if (r5 == 0) goto L_0x002c
            r5 = 5
            goto L_0x0018
        L_0x002c:
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzdwm
            r8 = 6
            if (r5 == 0) goto L_0x0061
            com.google.android.gms.ads.internal.client.zze r5 = com.google.android.gms.internal.ads.zzfdx.zza(r17)
            int r5 = r5.zza
            if (r5 != r6) goto L_0x003a
            r8 = 1
        L_0x003a:
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzbO
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r9.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0061
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzedq
            if (r5 == 0) goto L_0x0061
            r5 = r0
            com.google.android.gms.internal.ads.zzedq r5 = (com.google.android.gms.internal.ads.zzedq) r5
            com.google.android.gms.ads.internal.client.zze r5 = r5.zzb()
            if (r5 == 0) goto L_0x0061
            int r5 = r5.zza
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14 = r5
            goto L_0x0062
        L_0x0061:
            r14 = r7
        L_0x0062:
            r5 = r8
        L_0x0063:
            monitor-enter(r2)
            boolean r8 = r2.zze     // Catch:{ all -> 0x00f8 }
            if (r8 == 0) goto L_0x0082
            com.google.android.gms.internal.ads.zzehd r8 = r2.zzb     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfcd r9 = r1.zzb     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfca r10 = r1.zzc     // Catch:{ all -> 0x00f8 }
            boolean r11 = r0 instanceof com.google.android.gms.internal.ads.zzedq     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x0079
            r7 = r0
            com.google.android.gms.internal.ads.zzedq r7 = (com.google.android.gms.internal.ads.zzedq) r7     // Catch:{ all -> 0x00f8 }
        L_0x0079:
            r11 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r5
            r12 = r3
            r7.zza(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00f8 }
        L_0x0082:
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zziK     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00f8 }
            java.lang.Object r7 = r8.zzb(r7)     // Catch:{ all -> 0x00f8 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00f8 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzfjy r7 = r2.zzc     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfju r8 = r1.zze     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfcn r9 = r1.zzf     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfca r10 = r1.zzc     // Catch:{ all -> 0x00f8 }
            java.util.List r11 = r10.zzn     // Catch:{ all -> 0x00f8 }
            java.util.List r8 = r8.zzd(r9, r10, r11)     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.ads.internal.util.client.zzv r9 = r10.zzax     // Catch:{ all -> 0x00f8 }
            r7.zze(r8, r9)     // Catch:{ all -> 0x00f8 }
        L_0x00a9:
            boolean r7 = r2.zzg     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x00b1
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            return
        L_0x00b1:
            java.util.LinkedHashMap r15 = r2.zzd     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfca r13 = r1.zzc     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.internal.ads.zzeha r11 = new com.google.android.gms.internal.ads.zzeha     // Catch:{ all -> 0x00f8 }
            java.lang.String r8 = r1.zzd     // Catch:{ all -> 0x00f8 }
            java.lang.String r9 = r13.zzaf     // Catch:{ all -> 0x00f8 }
            r7 = r11
            r10 = r5
            r5 = r11
            r11 = r3
            r6 = r13
            r13 = r14
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x00f8 }
            r15.put(r6, r5)     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdx.zza(r17)     // Catch:{ all -> 0x00f8 }
            int r5 = r0.zza     // Catch:{ all -> 0x00f8 }
            r7 = 3
            if (r5 == r7) goto L_0x00d4
            if (r5 != 0) goto L_0x00ef
        L_0x00d4:
            com.google.android.gms.ads.internal.client.zze r5 = r0.zzd     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x00ef
            java.lang.String r5 = r5.zzc     // Catch:{ all -> 0x00f8 }
            java.lang.String r7 = "com.google.android.gms.ads"
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x00f8 }
            if (r5 != 0) goto L_0x00ef
            com.google.android.gms.internal.ads.zzedq r5 = new com.google.android.gms.internal.ads.zzedq     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.ads.internal.client.zze r0 = r0.zzd     // Catch:{ all -> 0x00f8 }
            r7 = 13
            r5.<init>(r7, r0)     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdx.zza(r5)     // Catch:{ all -> 0x00f8 }
        L_0x00ef:
            com.google.android.gms.internal.ads.zzedr r5 = r2.zzf     // Catch:{ all -> 0x00f8 }
            r5.zzf(r6, r3, r0)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            return
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegz.zza(java.lang.Throwable):void");
    }

    public final void zzb(Object obj) {
        zzehb zzehb = this.zzg;
        long elapsedRealtime = zzehb.zza.elapsedRealtime() - this.zza;
        synchronized (zzehb) {
            if (zzehb.zze) {
                zzehb.zzb.zza(this.zzb, this.zzc, 0, (zzedq) null, elapsedRealtime);
            }
            if (!zzehb.zzg) {
                zzfca zzfca = this.zzc;
                if (zzehb.zzq(zzfca)) {
                    ((zzeha) zzehb.zzd.get(zzfca)).zzd = elapsedRealtime;
                } else {
                    zzehb.zzd.put(zzfca, new zzeha(this.zzd, zzfca.zzaf, 0, elapsedRealtime, (Integer) null));
                }
                zzehb.zzf.zzg(zzfca, elapsedRealtime, (zze) null);
            }
        }
    }
}
