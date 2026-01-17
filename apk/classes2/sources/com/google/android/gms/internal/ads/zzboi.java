package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzboi {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    /* access modifiers changed from: private */
    public final zzfhx zze;
    private final zzbd zzf;
    private final zzbd zzg;
    /* access modifiers changed from: private */
    public zzboh zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzboi(Context context, VersionInfoParcel versionInfoParcel, String str, zzbd zzbd, zzbd zzbd2, zzfhx zzfhx) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfhx;
        this.zzf = zzbd;
        this.zzg = zzbd2;
    }

    public static /* synthetic */ void zzg(zzboi zzboi, zzbnd zzbnd) {
        if (zzbnd.zzi()) {
            zzboi.zzi = 1;
        }
    }

    public static /* synthetic */ void zzh(zzboi zzboi, zzavu zzavu, zzboh zzboh) {
        long currentTimeMillis = zzv.zzD().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbnl zzbnl = new zzbnl(zzboi.zzb, zzboi.zzd, (zzavu) null, (zza) null);
            zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzboi zzboi2 = zzboi;
            zzbnl.zzk(new zzbno(zzboi2, arrayList, currentTimeMillis, zzboh, zzbnl));
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbnl.zzq("/jsLoaded", new zzbnt(zzboi2, currentTimeMillis, zzboh, zzbnl));
            zzby zzby = new zzby();
            zzbnu zzbnu = new zzbnu(zzboi, (zzavu) null, zzbnl, zzby);
            zzby.zzb(zzbnu);
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbnl.zzq("/requestReload", zzbnu);
            String str = zzboi.zzc;
            zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbnl.zzh(str);
                zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbnl.zzf(str);
                zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbnl.zzg(str);
                zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            zzs.zza.postDelayed(new zzbnw(zzboi, zzboh, zzbnl, arrayList, currentTimeMillis), (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzd)).intValue());
        } catch (Throwable th) {
            int i = zze.zza;
            zzo.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhZ)).booleanValue()) {
                zzboh.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzib)).booleanValue()) {
                zzv.zzp().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzboh.zzg();
                return;
            }
            zzv.zzp().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzboh.zzg();
        }
    }

    public static /* synthetic */ void zzi(zzboi zzboi, zzboh zzboh, zzbnd zzbnd, ArrayList arrayList, long j) {
        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (zzboi.zza) {
            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzboh.zze() != -1) {
                if (zzboh.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhZ)).booleanValue()) {
                        zzboh.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzboh.zzg();
                    }
                    zzgdy zzgdy = zzcaf.zzf;
                    Objects.requireNonNull(zzbnd);
                    zzgdy.execute(new zzbnn(zzbnd));
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzc));
                    int zze2 = zzboh.zze();
                    int i = zzboi.zzi;
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    long currentTimeMillis = zzv.zzD().currentTimeMillis() - j;
                    zze.zza("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zze2 + ". Update status(onEngLoadedTimeout) is " + i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + currentTimeMillis + " ms. Rejecting.");
                    zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
            }
            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final com.google.android.gms.internal.ads.zzboc zzb(com.google.android.gms.internal.ads.zzavu r5) {
        /*
            r4 = this;
            java.lang.String r5 = "getEngine: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            java.lang.Object r5 = r4.zza
            monitor-enter(r5)
            java.lang.String r0 = "getEngine: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "refreshIfDestroyed: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            monitor-enter(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "refreshIfDestroyed: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x0089 }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzh     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x002d
            int r1 = r4.zzi     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzbnq r1 = new com.google.android.gms.internal.ads.zzbnq     // Catch:{ all -> 0x0089 }
            r1.<init>(r4)     // Catch:{ all -> 0x0089 }
            com.google.android.gms.internal.ads.zzbnr r2 = new com.google.android.gms.internal.ads.zzbnr     // Catch:{ all -> 0x0089 }
            r2.<init>()     // Catch:{ all -> 0x0089 }
            r0.zzj(r1, r2)     // Catch:{ all -> 0x0089 }
        L_0x002d:
            monitor-exit(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "refreshIfDestroyed: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzh     // Catch:{ all -> 0x008c }
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L_0x0074
            int r0 = r0.zze()     // Catch:{ all -> 0x008c }
            r3 = -1
            if (r0 != r3) goto L_0x0041
            goto L_0x0074
        L_0x0041:
            int r0 = r4.zzi     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "getEngine (NO_UPDATE): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzh     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboc r0 = r0.zza()     // Catch:{ all -> 0x008c }
            monitor-exit(r5)     // Catch:{ all -> 0x008c }
            return r0
        L_0x0052:
            r3 = 1
            if (r0 != r3) goto L_0x0067
            r4.zzi = r2     // Catch:{ all -> 0x008c }
            r4.zzd(r1)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "getEngine (PENDING_UPDATE): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzh     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboc r0 = r0.zza()     // Catch:{ all -> 0x008c }
            monitor-exit(r5)     // Catch:{ all -> 0x008c }
            return r0
        L_0x0067:
            java.lang.String r0 = "getEngine (UPDATING): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzh     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboc r0 = r0.zza()     // Catch:{ all -> 0x008c }
            monitor-exit(r5)     // Catch:{ all -> 0x008c }
            return r0
        L_0x0074:
            r4.zzi = r2     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzd(r1)     // Catch:{ all -> 0x008c }
            r4.zzh = r0     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "getEngine (NULL or REJECTED): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboh r0 = r4.zzh     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzboc r0 = r0.zza()     // Catch:{ all -> 0x008c }
            monitor-exit(r5)     // Catch:{ all -> 0x008c }
            return r0
        L_0x0089:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboi.zzb(com.google.android.gms.internal.ads.zzavu):com.google.android.gms.internal.ads.zzboc");
    }

    /* access modifiers changed from: protected */
    public final zzboh zzd(zzavu zzavu) {
        zzfhj zza2 = zzfhi.zza(this.zzb, 6);
        zza2.zzi();
        zzboh zzboh = new zzboh(this.zzg);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzcaf.zzf.execute(new zzbns(this, (zzavu) null, zzboh));
        zze.zza("loadNewJavascriptEngine: Promise created");
        zzboh.zzj(new zzbnx(this, zzboh, zza2), new zzbny(this, zzboh, zza2));
        return zzboh;
    }
}
