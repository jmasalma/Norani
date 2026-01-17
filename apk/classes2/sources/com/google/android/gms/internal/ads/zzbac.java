package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbac extends Thread {
    private boolean zza = false;
    private boolean zzb = false;
    private final Object zzc;
    private final zzazt zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbac() {
        zzazt zzazt = new zzazt();
        this.zzd = zzazt;
        this.zzc = new Object();
        this.zzf = ((Long) zzbev.zzd.zze()).intValue();
        this.zzg = ((Long) zzbev.zza.zze()).intValue();
        this.zzh = ((Long) zzbev.zze.zze()).intValue();
        this.zzi = ((Long) zzbev.zzc.zze()).intValue();
        this.zzj = ((Integer) zzbd.zzc().zzb(zzbde.zzak)).intValue();
        this.zzk = ((Integer) zzbd.zzc().zzb(zzbde.zzal)).intValue();
        this.zzl = ((Integer) zzbd.zzc().zzb(zzbde.zzam)).intValue();
        this.zze = ((Long) zzbev.zzf.zze()).intValue();
        this.zzm = (String) zzbd.zzc().zzb(zzbde.zzao);
        this.zzn = ((Boolean) zzbd.zzc().zzb(zzbde.zzap)).booleanValue();
        this.zzo = ((Boolean) zzbd.zzc().zzb(zzbde.zzaq)).booleanValue();
        ((Boolean) zzbd.zzc().zzb(zzbde.zzar)).booleanValue();
        setName("ContentFetchTask");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e6 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6 A[LOOP:2: B:48:0x00e6->B:62:0x00e6, LOOP_START, SYNTHETIC] */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.zzazx r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch:{ all -> 0x00ac }
            android.content.Context r0 = r0.zzb()     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x000c
            goto L_0x00b6
        L_0x000c:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x00ac }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00ac }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x00b6
            if (r2 == 0) goto L_0x00b6
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x00b6
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ac }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00ac }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x00ac }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00ac }
            int r5 = r3.pid     // Catch:{ all -> 0x00ac }
            if (r4 != r5) goto L_0x002a
            int r1 = r3.importance     // Catch:{ all -> 0x00ac }
            r3 = 100
            if (r1 != r3) goto L_0x00b6
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x00b6
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00ac }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzazx r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            android.app.Activity r0 = r0.zza()     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            r6.zze()     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            goto L_0x00c0
        L_0x006f:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x00a1
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x0090 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x00a1
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x0090 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0090 }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00a1
        L_0x0090:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zzw(r0, r3)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
        L_0x00a1:
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.zzazy r0 = new com.google.android.gms.internal.ads.zzazy     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            goto L_0x00c0
        L_0x00ac:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbzs r1 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.zzw(r0, r2)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
        L_0x00b6:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            r6.zze()     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
        L_0x00c0:
            int r0 = r6.zze     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00db, Exception -> 0x00c9 }
            goto L_0x00e3
        L_0x00c9:
            r0 = move-exception
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
            java.lang.String r1 = "ContentFetchTask.run"
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
            goto L_0x00e3
        L_0x00db:
            r0 = move-exception
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
        L_0x00e3:
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
        L_0x00e6:
            boolean r1 = r6.zzb     // Catch:{ all -> 0x00f8 }
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = "ContentFetchTask: waiting"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ InterruptedException -> 0x00e6 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r1)     // Catch:{ InterruptedException -> 0x00e6 }
            r0.wait()     // Catch:{ InterruptedException -> 0x00e6 }
            goto L_0x00e6
        L_0x00f5:
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            goto L_0x0000
        L_0x00f8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbac.run():void");
    }

    /* access modifiers changed from: package-private */
    public final zzbab zza(View view, zzazs zzazs) {
        if (view == null) {
            return new zzbab(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbab(this, 0, 0);
            }
            zzazs.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new zzbab(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzcfg)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzbab(this, 0, 0);
            }
            zzazs.zzf();
            webView.post(new zzbaa(this, zzazs, webView, globalVisibleRect));
            return new zzbab(this, 0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new zzbab(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzbab zza2 = zza(viewGroup.getChildAt(i3), zzazs);
                i += zza2.zza;
                i2 += zza2.zzb;
            }
            return new zzbab(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r11 == 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzazs r9 = new com.google.android.gms.internal.ads.zzazs     // Catch:{ Exception -> 0x007c }
            int r1 = r10.zzf     // Catch:{ Exception -> 0x007c }
            int r2 = r10.zzg     // Catch:{ Exception -> 0x007c }
            int r3 = r10.zzh     // Catch:{ Exception -> 0x007c }
            int r4 = r10.zzi     // Catch:{ Exception -> 0x007c }
            int r5 = r10.zzj     // Catch:{ Exception -> 0x007c }
            int r6 = r10.zzk     // Catch:{ Exception -> 0x007c }
            int r7 = r10.zzl     // Catch:{ Exception -> 0x007c }
            boolean r8 = r10.zzo     // Catch:{ Exception -> 0x007c }
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x007c }
            com.google.android.gms.internal.ads.zzazx r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch:{ Exception -> 0x007c }
            android.content.Context r0 = r0.zzb()     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = r10.zzm     // Catch:{ Exception -> 0x007c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007c }
            if (r2 != 0) goto L_0x0050
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ Exception -> 0x007c }
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzan     // Catch:{ Exception -> 0x007c }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ Exception -> 0x007c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x007c }
            int r0 = r2.getIdentifier(r3, r4, r0)     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r11.getTag(r0)     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0075
        L_0x0050:
            com.google.android.gms.internal.ads.zzbab r11 = r10.zza(r11, r9)     // Catch:{ Exception -> 0x007c }
            r9.zzj()     // Catch:{ Exception -> 0x007c }
            int r0 = r11.zza     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x005f
            int r0 = r11.zzb     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x0075
        L_0x005f:
            int r11 = r11.zzb     // Catch:{ Exception -> 0x007c }
            if (r11 != 0) goto L_0x006a
            int r11 = r9.zzb()     // Catch:{ Exception -> 0x007c }
            if (r11 == 0) goto L_0x0075
            goto L_0x006c
        L_0x006a:
            if (r11 != 0) goto L_0x0076
        L_0x006c:
            com.google.android.gms.internal.ads.zzazt r11 = r10.zzd     // Catch:{ Exception -> 0x007c }
            boolean r11 = r11.zzc(r9)     // Catch:{ Exception -> 0x007c }
            if (r11 != 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            return
        L_0x0076:
            com.google.android.gms.internal.ads.zzazt r11 = r10.zzd     // Catch:{ Exception -> 0x007c }
            r11.zza(r9)     // Catch:{ Exception -> 0x007c }
            return
        L_0x007c:
            r11 = move-exception
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r11)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzbzs r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbac.zzb(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzazs zzazs, WebView webView, String str, boolean z) {
        zzazs.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazs.zzi(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    zzazs.zzi(title + "\n" + optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzazs.zzl()) {
                this.zzd.zzb(zzazs);
            }
        } catch (JSONException unused) {
            int i = zze.zza;
            zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = zze.zza;
            zzo.zzf("Failed to get webview content.", th);
            zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            if (this.zza) {
                int i = zze.zza;
                zzo.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            int i = zze.zza;
            zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
