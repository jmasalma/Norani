package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzecm;
import com.google.android.gms.internal.ads.zzecn;
import com.google.android.gms.internal.ads.zzedf;
import com.google.android.gms.internal.ads.zzedh;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfwg;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzm extends zzbtp implements zzah {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcfg zzd;
    zzi zze;
    zzu zzf;
    boolean zzg = false;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    boolean zzj = false;
    boolean zzk = false;
    zzh zzl;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzf(this);
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;
    private Toolbar zzw;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        zzedh zzQ;
        zzedf zzP;
        zzcfg zzcfg = this.zzd;
        if (zzcfg != null) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() || (zzP = zzcfg.zzP()) == null) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzfB)).booleanValue() && (zzQ = zzcfg.zzQ()) != null && zzQ.zzb()) {
                    zzv.zzC().zzg(zzQ.zza(), view);
                    return;
                }
                return;
            }
            zzP.zza(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzaU)).booleanValue() != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzaT)).booleanValue() != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.zzo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzK(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzaa r4 = com.google.android.gms.ads.internal.zzv.zzs()
            boolean r6 = r4.zzd(r3, r6)
            boolean r4 = r5.zzk
            if (r4 == 0) goto L_0x0033
            if (r0 != 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzaU
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r4.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0048
        L_0x0033:
            if (r6 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzaT
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r0.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = r2
            goto L_0x0057
        L_0x004a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L_0x0057
            com.google.android.gms.ads.internal.zzl r6 = r6.zzo
            if (r6 == 0) goto L_0x0057
            boolean r6 = r6.zzg
            if (r6 == 0) goto L_0x0057
            r2 = r1
        L_0x0057:
            android.view.Window r6 = r3.getWindow()
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbr
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0081
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x007b
            if (r2 == 0) goto L_0x0078
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x007d
        L_0x0078:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x007d
        L_0x007b:
            r0 = 256(0x100, float:3.59E-43)
        L_0x007d:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0081:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0099
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L_0x0098
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0098:
            return
        L_0x0099:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzK(android.content.res.Configuration):void");
    }

    private static final void zzL(zzedh zzedh, View view) {
        if (zzedh != null && view != null) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfB)).booleanValue() || !zzedh.zzb()) {
                zzv.zzC().zzj(zzedh.zza(), view);
            }
        }
    }

    public final void zzA(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzb(zzbde.zzgk)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzb(zzbde.zzgl)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzbd.zzc().zzb(zzbde.zzgm)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzbd.zzc().zzb(zzbde.zzgn)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzv.zzp().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1 A[SYNTHETIC, Splitter:B:38:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzD(boolean r43) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            r42 = this;
            r1 = r42
            boolean r0 = r1.zzs
            r2 = 1
            if (r0 != 0) goto L_0x000c
            android.app.Activity r0 = r1.zzb
            r0.requestWindowFeature(r2)
        L_0x000c:
            android.app.Activity r3 = r1.zzb
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x02c1
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzc
            com.google.android.gms.internal.ads.zzcfg r4 = r4.zzd
            r14 = 0
            if (r4 == 0) goto L_0x0020
            com.google.android.gms.internal.ads.zzcgy r4 = r4.zzN()
            goto L_0x0021
        L_0x0020:
            r4 = r14
        L_0x0021:
            r13 = 0
            if (r4 == 0) goto L_0x002c
            boolean r4 = r4.zzV()
            if (r4 == 0) goto L_0x002c
            r10 = r2
            goto L_0x002d
        L_0x002c:
            r10 = r13
        L_0x002d:
            r1.zzm = r13
            if (r10 == 0) goto L_0x0060
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzc
            int r4 = r4.zzj
            r5 = 6
            if (r4 != r5) goto L_0x004a
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            if (r4 != r2) goto L_0x0046
            r4 = r2
            goto L_0x0047
        L_0x0046:
            r4 = r13
        L_0x0047:
            r1.zzm = r4
            goto L_0x0061
        L_0x004a:
            r5 = 7
            if (r4 != r5) goto L_0x0060
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r5 = 2
            if (r4 != r5) goto L_0x005c
            r4 = r2
            goto L_0x005d
        L_0x005c:
            r4 = r13
        L_0x005d:
            r1.zzm = r4
            goto L_0x0061
        L_0x0060:
            r4 = r13
        L_0x0061:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Delay onShow to next orientation change: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            int r5 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zze(r4)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzc
            int r4 = r4.zzj
            r1.zzA(r4)
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r0.setFlags(r4, r4)
            java.lang.String r0 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)
            boolean r0 = r1.zzk
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r4)
            goto L_0x0098
        L_0x0091:
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            int r4 = zza
            r0.setBackgroundColor(r4)
        L_0x0098:
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            r3.setContentView(r0)
            r1.zzs = r2
            if (r43 == 0) goto L_0x017c
            com.google.android.gms.ads.internal.zzv.zzB()     // Catch:{ Exception -> 0x016e }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch:{ Exception -> 0x016e }
            com.google.android.gms.internal.ads.zzcfg r0 = r0.zzd     // Catch:{ Exception -> 0x016e }
            if (r0 == 0) goto L_0x00b0
            com.google.android.gms.internal.ads.zzchd r0 = r0.zzO()     // Catch:{ Exception -> 0x016e }
            r4 = r0
            goto L_0x00b1
        L_0x00b0:
            r4 = r14
        L_0x00b1:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch:{ Exception -> 0x016e }
            com.google.android.gms.internal.ads.zzcfg r0 = r0.zzd     // Catch:{ Exception -> 0x016e }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.zzU()     // Catch:{ Exception -> 0x016e }
            r5 = r0
            goto L_0x00be
        L_0x00bd:
            r5 = r14
        L_0x00be:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch:{ Exception -> 0x016e }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7 = r0.zzm     // Catch:{ Exception -> 0x016e }
            com.google.android.gms.internal.ads.zzcfg r0 = r0.zzd     // Catch:{ Exception -> 0x016e }
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.ads.internal.zza r0 = r0.zzj()     // Catch:{ Exception -> 0x016e }
            goto L_0x00cc
        L_0x00cb:
            r0 = r14
        L_0x00cc:
            com.google.android.gms.internal.ads.zzbcc r20 = com.google.android.gms.internal.ads.zzbcc.zza()     // Catch:{ Exception -> 0x016e }
            r18 = 0
            r19 = 0
            r6 = 1
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r21 = r7
            r7 = r10
            r2 = r10
            r10 = r21
            r13 = r0
            r0 = r14
            r14 = r20
            com.google.android.gms.internal.ads.zzcfg r3 = com.google.android.gms.internal.ads.zzcft.zza(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x016e }
            r1.zzd = r3     // Catch:{ Exception -> 0x016e }
            com.google.android.gms.internal.ads.zzcgy r22 = r3.zzN()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            com.google.android.gms.internal.ads.zzbiv r4 = r3.zzp
            com.google.android.gms.internal.ads.zzbix r5 = r3.zze
            com.google.android.gms.ads.internal.overlay.zzad r6 = r3.zzi
            com.google.android.gms.internal.ads.zzcfg r3 = r3.zzd
            if (r3 == 0) goto L_0x0109
            com.google.android.gms.internal.ads.zzcgy r3 = r3.zzN()
            com.google.android.gms.ads.internal.zzb r14 = r3.zzd()
            r30 = r14
            goto L_0x010b
        L_0x0109:
            r30 = r0
        L_0x010b:
            r40 = 0
            r41 = 0
            r23 = 0
            r25 = 0
            r28 = 1
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r24 = r4
            r26 = r5
            r27 = r6
            r22.zzX(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            com.google.android.gms.internal.ads.zzcgy r3 = r3.zzN()
            com.google.android.gms.ads.internal.overlay.zze r4 = new com.google.android.gms.ads.internal.overlay.zze
            r4.<init>(r1)
            r3.zzC(r4)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            java.lang.String r4 = r3.zzl
            if (r4 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            r3.loadUrl(r4)
            goto L_0x015c
        L_0x014c:
            java.lang.String r7 = r3.zzh
            if (r7 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzcfg r5 = r1.zzd
            java.lang.String r6 = r3.zzf
            java.lang.String r9 = "UTF-8"
            r10 = 0
            java.lang.String r8 = "text/html"
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x015c:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            com.google.android.gms.internal.ads.zzcfg r3 = r3.zzd
            if (r3 == 0) goto L_0x0189
            r3.zzaw(r1)
            goto L_0x0189
        L_0x0166:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x016e:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzg r2 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r3 = "Could not obtain webview for the overlay."
            r2.<init>(r3, r0)
            throw r2
        L_0x017c:
            r2 = r10
            r0 = r14
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            com.google.android.gms.internal.ads.zzcfg r3 = r3.zzd
            r1.zzd = r3
            android.app.Activity r4 = r1.zzb
            r3.zzan(r4)
        L_0x0189:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            boolean r3 = r3.zzw
            if (r3 == 0) goto L_0x019e
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()
            com.google.android.gms.internal.ads.zzcfg r4 = r1.zzd
            android.webkit.WebView r4 = r4.zzG()
            r5 = 0
            r3.setAcceptThirdPartyCookies(r4, r5)
            goto L_0x019f
        L_0x019e:
            r5 = 0
        L_0x019f:
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            r3.zzai(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            com.google.android.gms.internal.ads.zzcfg r3 = r3.zzd
            if (r3 == 0) goto L_0x01b3
            com.google.android.gms.internal.ads.zzedh r3 = r3.zzQ()
            com.google.android.gms.ads.internal.overlay.zzh r4 = r1.zzl
            zzL(r3, r4)
        L_0x01b3:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            int r3 = r3.zzk
            r4 = 5
            if (r3 == r4) goto L_0x0273
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            android.view.ViewParent r3 = r3.getParent()
            boolean r6 = r3 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x01cf
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.gms.internal.ads.zzcfg r6 = r1.zzd
            android.view.View r6 = r6.zzF()
            r3.removeView(r6)
        L_0x01cf:
            boolean r3 = r1.zzk
            if (r3 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            r3.zzam()
        L_0x01d8:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            boolean r3 = r3.zzw
            r6 = -1
            if (r3 == 0) goto L_0x0268
            android.app.Activity r3 = r1.zzb
            android.widget.Toolbar r7 = new android.widget.Toolbar
            r7.<init>(r3)
            r1.zzw = r7
            int r3 = android.view.View.generateViewId()
            r7.setId(r3)
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            android.view.View r3 = r3.zzF()
            int r7 = android.view.View.generateViewId()
            r3.setId(r7)
            android.widget.Toolbar r3 = r1.zzw
            r7 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r3.setBackgroundColor(r7)
            android.widget.Toolbar r3 = r1.zzw
            r3.setVisibility(r5)
            com.google.android.gms.internal.ads.zzbzs r3 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ NullPointerException -> 0x021f, NotFoundException -> 0x021d }
            android.content.res.Resources r3 = r3.zze()     // Catch:{ NullPointerException -> 0x021f, NotFoundException -> 0x021d }
            int r7 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_cross     // Catch:{ NullPointerException -> 0x021f, NotFoundException -> 0x021d }
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r7, r0)     // Catch:{ NullPointerException -> 0x021f, NotFoundException -> 0x021d }
            android.widget.Toolbar r3 = r1.zzw     // Catch:{ NullPointerException -> 0x021f, NotFoundException -> 0x021d }
            r3.setNavigationIcon(r0)     // Catch:{ NullPointerException -> 0x021f, NotFoundException -> 0x021d }
            goto L_0x0225
        L_0x021d:
            r0 = move-exception
            goto L_0x0220
        L_0x021f:
            r0 = move-exception
        L_0x0220:
            java.lang.String r3 = "Error obtaining close icon."
            com.google.android.gms.ads.internal.util.zze.zzb(r3, r0)
        L_0x0225:
            android.widget.Toolbar r0 = r1.zzw
            android.view.View$OnClickListener r3 = r1.zzp
            r0.setNavigationOnClickListener(r3)
            android.widget.Toolbar r0 = r1.zzw
            r0.setTitleMarginStart(r5)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r0.<init>(r6, r3)
            r5 = 10
            r0.addRule(r5)
            com.google.android.gms.ads.internal.overlay.zzh r5 = r1.zzl
            android.widget.Toolbar r7 = r1.zzw
            r5.addView(r7, r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r6, r3)
            android.widget.Toolbar r3 = r1.zzw
            int r3 = r3.getId()
            r5 = 3
            r0.addRule(r5, r3)
            r3 = 12
            r0.addRule(r3)
            com.google.android.gms.ads.internal.overlay.zzh r3 = r1.zzl
            com.google.android.gms.internal.ads.zzcfg r5 = r1.zzd
            android.view.View r5 = r5.zzF()
            r3.addView(r5, r0)
            android.widget.Toolbar r0 = r1.zzw
            r1.zzJ(r0)
            goto L_0x0273
        L_0x0268:
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            com.google.android.gms.internal.ads.zzcfg r3 = r1.zzd
            android.view.View r3 = r3.zzF()
            r0.addView(r3, r6, r6)
        L_0x0273:
            if (r43 != 0) goto L_0x027c
            boolean r0 = r1.zzm
            if (r0 != 0) goto L_0x027c
            r42.zze()
        L_0x027c:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            int r0 = r0.zzk
            if (r0 == r4) goto L_0x0292
            r1.zzw(r2)
            com.google.android.gms.internal.ads.zzcfg r0 = r1.zzd
            boolean r0 = r0.zzaB()
            if (r0 == 0) goto L_0x0291
            r3 = 1
            r1.zzy(r2, r3)
        L_0x0291:
            return
        L_0x0292:
            android.app.Activity r0 = r1.zzb
            com.google.android.gms.internal.ads.zzecm r2 = com.google.android.gms.internal.ads.zzecn.zze()
            r2.zza(r0)
            r2.zzb(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r0 = r0.zzq
            r2.zzc(r0)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r0 = r0.zzr
            r2.zzd(r0)
            com.google.android.gms.internal.ads.zzecn r0 = r2.zze()
            r1.zzf(r0)     // Catch:{ zzg -> 0x02b6, RemoteException -> 0x02b4 }
            return
        L_0x02b4:
            r0 = move-exception
            goto L_0x02b7
        L_0x02b6:
            r0 = move-exception
        L_0x02b7:
            com.google.android.gms.ads.internal.overlay.zzg r2 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x02c1:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzD(boolean):void");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzr = true;
            if (this.zzq != null) {
                zzfrw zzfrw = zzs.zza;
                zzfrw.removeCallbacks(this.zzq);
                zzfrw.post(this.zzq);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzr2;
        if (this.zzb.isFinishing() && !this.zzt) {
            this.zzt = true;
            zzcfg zzcfg = this.zzd;
            if (zzcfg != null) {
                zzcfg.zzZ(this.zzn - 1);
                synchronized (this.zzo) {
                    if (!this.zzr && this.zzd.zzaC()) {
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfn)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzr2 = adOverlayInfoParcel.zzc) != null) {
                            zzr2.zzds();
                        }
                        this.zzq = new zzd(this);
                        zzs.zza.postDelayed(this.zzq, ((Long) zzbd.zzc().zzb(zzbde.zzbk)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() || !this.zzd.canGoBack()) {
            boolean zzaH = this.zzd.zzaH();
            if (!zzaH) {
                this.zzd.zzd("onbackblocked", Collections.emptyMap());
            }
            return zzaH;
        }
        this.zzd.goBack();
        return false;
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            activity.overridePendingTransition(0, 0);
            zzcfg zzcfg = this.zzd;
            if (zzcfg != null) {
                zzcfg.zzai((zzm) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzcfg zzcfg;
        zzr zzr2;
        if (!this.zzu) {
            this.zzu = true;
            zzcfg zzcfg2 = this.zzd;
            if (zzcfg2 != null) {
                this.zzl.removeView(zzcfg2.zzF());
                zzi zzi2 = this.zze;
                if (zzi2 != null) {
                    this.zzd.zzan(zzi2.zzd);
                    this.zzd.zzaq(false);
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zznc)).booleanValue() && this.zzd.getParent() != null) {
                        ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                    }
                    ViewGroup viewGroup = this.zze.zzc;
                    View zzF = this.zzd.zzF();
                    zzi zzi3 = this.zze;
                    viewGroup.addView(zzF, zzi3.zza, zzi3.zzb);
                    this.zze = null;
                } else {
                    Activity activity = this.zzb;
                    if (activity.getApplicationContext() != null) {
                        this.zzd.zzan(activity.getApplicationContext());
                    }
                }
                this.zzd = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            if (!(adOverlayInfoParcel == null || (zzr2 = adOverlayInfoParcel.zzc) == null)) {
                zzr2.zzdw(this.zzn);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzcfg = adOverlayInfoParcel2.zzd) != null) {
                zzL(zzcfg.zzQ(), this.zzc.zzd.zzF());
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    /* access modifiers changed from: protected */
    public final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzecn zzecn) throws zzg, RemoteException {
        zzbtj zzbtj;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbtj = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbtj.zzg(ObjectWrapper.wrap(zzecn));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    public final void zzh(int i, int i2, Intent intent) {
        zzdsj zze2;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbcv zzbcv = zzbde.zzny;
            if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
                zzcfg zzcfg = this.zzd;
                if (zzcfg != null && zzcfg.zzN() != null && (zze2 = zzcfg.zzN().zze()) != null && (adOverlayInfoParcel = this.zzc) != null && ((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                    zzdsi zza2 = zze2.zza();
                    zza2.zzb("action", "hilca");
                    zza2.zzb("gqi", zzfwg.zzc(adOverlayInfoParcel.zzq));
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    zza2.zzb("hilr", sb.toString());
                    if (i2 == -1 && intent != null) {
                        String stringExtra = intent.getStringExtra("callerPackage");
                        String stringExtra2 = intent.getStringExtra("loadingStage");
                        if (stringExtra != null) {
                            zza2.zzb("hilcp", stringExtra);
                        }
                        if (stringExtra2 != null) {
                            zza2.zzb("hills", stringExtra2);
                        }
                    }
                    zza2.zzi();
                }
            }
        }
    }

    public final void zzi() {
        this.zzn = 1;
    }

    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzK((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008a A[Catch:{ zzg -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d9 A[Catch:{ zzg -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fe A[Catch:{ zzg -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzl(android.os.Bundle r9) {
        /*
            r8 = this;
            boolean r0 = r8.zzs
            r1 = 1
            if (r0 != 0) goto L_0x000a
            android.app.Activity r0 = r8.zzb
            r0.requestWindowFeature(r1)
        L_0x000a:
            r0 = 0
            if (r9 == 0) goto L_0x0017
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0017
            r2 = r1
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            r8.zzj = r2
            r2 = 4
            android.app.Activity r3 = r8.zzb     // Catch:{ zzg -> 0x010a }
            android.content.Intent r4 = r3.getIntent()     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(r4)     // Catch:{ zzg -> 0x010a }
            r8.zzc = r4     // Catch:{ zzg -> 0x010a }
            if (r4 == 0) goto L_0x0102
            boolean r4 = r4.zzw     // Catch:{ zzg -> 0x010a }
            if (r4 == 0) goto L_0x0040
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ zzg -> 0x010a }
            r5 = 28
            if (r4 < r5) goto L_0x0037
            r3.setShowWhenLocked(r1)     // Catch:{ zzg -> 0x010a }
            goto L_0x0040
        L_0x0037:
            android.view.Window r4 = r3.getWindow()     // Catch:{ zzg -> 0x010a }
            r5 = 524288(0x80000, float:7.34684E-40)
            r4.addFlags(r5)     // Catch:{ zzg -> 0x010a }
        L_0x0040:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.zzc     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r4.zzm     // Catch:{ zzg -> 0x010a }
            int r4 = r4.clientJarVersion     // Catch:{ zzg -> 0x010a }
            r5 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r4 <= r5) goto L_0x004d
            r8.zzn = r2     // Catch:{ zzg -> 0x010a }
        L_0x004d:
            android.content.Intent r4 = r3.getIntent()     // Catch:{ zzg -> 0x010a }
            if (r4 == 0) goto L_0x005f
            android.content.Intent r4 = r3.getIntent()     // Catch:{ zzg -> 0x010a }
            java.lang.String r5 = "shouldCallOnOverlayOpened"
            boolean r4 = r4.getBooleanExtra(r5, r1)     // Catch:{ zzg -> 0x010a }
            r8.zzv = r4     // Catch:{ zzg -> 0x010a }
        L_0x005f:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.zzc     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.zzl r5 = r4.zzo     // Catch:{ zzg -> 0x010a }
            r6 = 5
            if (r5 == 0) goto L_0x006d
            boolean r7 = r5.zza     // Catch:{ zzg -> 0x010a }
            r8.zzk = r7     // Catch:{ zzg -> 0x010a }
            if (r7 == 0) goto L_0x0088
            goto L_0x0073
        L_0x006d:
            int r7 = r4.zzk     // Catch:{ zzg -> 0x010a }
            if (r7 != r6) goto L_0x0086
            r8.zzk = r1     // Catch:{ zzg -> 0x010a }
        L_0x0073:
            int r4 = r4.zzk     // Catch:{ zzg -> 0x010a }
            if (r4 == r6) goto L_0x0088
            int r4 = r5.zzf     // Catch:{ zzg -> 0x010a }
            r5 = -1
            if (r4 == r5) goto L_0x0088
            com.google.android.gms.ads.internal.overlay.zzk r4 = new com.google.android.gms.ads.internal.overlay.zzk     // Catch:{ zzg -> 0x010a }
            r5 = 0
            r4.<init>(r8, r5)     // Catch:{ zzg -> 0x010a }
            r4.zzb()     // Catch:{ zzg -> 0x010a }
            goto L_0x0088
        L_0x0086:
            r8.zzk = r0     // Catch:{ zzg -> 0x010a }
        L_0x0088:
            if (r9 != 0) goto L_0x00b6
            boolean r9 = r8.zzv     // Catch:{ zzg -> 0x010a }
            if (r9 == 0) goto L_0x00a0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.internal.ads.zzcwl r9 = r9.zzt     // Catch:{ zzg -> 0x010a }
            if (r9 == 0) goto L_0x0097
            r9.zzb()     // Catch:{ zzg -> 0x010a }
        L_0x0097:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.overlay.zzr r9 = r9.zzc     // Catch:{ zzg -> 0x010a }
            if (r9 == 0) goto L_0x00a0
            r9.zzdt()     // Catch:{ zzg -> 0x010a }
        L_0x00a0:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzg -> 0x010a }
            int r4 = r9.zzk     // Catch:{ zzg -> 0x010a }
            if (r4 == r1) goto L_0x00b6
            com.google.android.gms.ads.internal.client.zza r9 = r9.zzb     // Catch:{ zzg -> 0x010a }
            if (r9 == 0) goto L_0x00ad
            r9.onAdClicked()     // Catch:{ zzg -> 0x010a }
        L_0x00ad:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.internal.ads.zzded r9 = r9.zzu     // Catch:{ zzg -> 0x010a }
            if (r9 == 0) goto L_0x00b6
            r9.zzdf()     // Catch:{ zzg -> 0x010a }
        L_0x00b6:
            com.google.android.gms.ads.internal.overlay.zzh r9 = new com.google.android.gms.ads.internal.overlay.zzh     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.zzc     // Catch:{ zzg -> 0x010a }
            java.lang.String r5 = r4.zzn     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7 = r4.zzm     // Catch:{ zzg -> 0x010a }
            java.lang.String r7 = r7.afmaVersion     // Catch:{ zzg -> 0x010a }
            java.lang.String r4 = r4.zzs     // Catch:{ zzg -> 0x010a }
            r9.<init>(r3, r5, r7, r4)     // Catch:{ zzg -> 0x010a }
            r8.zzl = r9     // Catch:{ zzg -> 0x010a }
            r4 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r4)     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.util.zzaa r9 = com.google.android.gms.ads.internal.zzv.zzs()     // Catch:{ zzg -> 0x010a }
            r9.zzl(r3)     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzg -> 0x010a }
            int r3 = r9.zzk     // Catch:{ zzg -> 0x010a }
            if (r3 == r1) goto L_0x00fe
            r4 = 2
            if (r3 == r4) goto L_0x00f1
            r9 = 3
            if (r3 == r9) goto L_0x00ed
            if (r3 != r6) goto L_0x00e5
            r8.zzD(r0)     // Catch:{ zzg -> 0x010a }
            return
        L_0x00e5:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch:{ zzg -> 0x010a }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ zzg -> 0x010a }
            throw r9     // Catch:{ zzg -> 0x010a }
        L_0x00ed:
            r8.zzD(r1)     // Catch:{ zzg -> 0x010a }
            return
        L_0x00f1:
            com.google.android.gms.ads.internal.overlay.zzi r1 = new com.google.android.gms.ads.internal.overlay.zzi     // Catch:{ zzg -> 0x010a }
            com.google.android.gms.internal.ads.zzcfg r9 = r9.zzd     // Catch:{ zzg -> 0x010a }
            r1.<init>(r9)     // Catch:{ zzg -> 0x010a }
            r8.zze = r1     // Catch:{ zzg -> 0x010a }
            r8.zzD(r0)     // Catch:{ zzg -> 0x010a }
            return
        L_0x00fe:
            r8.zzD(r0)     // Catch:{ zzg -> 0x010a }
            return
        L_0x0102:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch:{ zzg -> 0x010a }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ zzg -> 0x010a }
            throw r9     // Catch:{ zzg -> 0x010a }
        L_0x010a:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r9)
            r8.zzn = r2
            android.app.Activity r9 = r8.zzb
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzl(android.os.Bundle):void");
    }

    public final void zzm() {
        zzcfg zzcfg = this.zzd;
        if (zzcfg != null) {
            try {
                this.zzl.removeView(zzcfg.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    public final void zzo() {
        zzr zzr2;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (!(adOverlayInfoParcel == null || (zzr2 = adOverlayInfoParcel.zzc) == null)) {
            zzr2.zzdk();
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzecm zze2 = zzecn.zze();
            zze2.zza(activity);
            zze2.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze2.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzq() {
    }

    public final void zzr() {
        zzr zzr2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (!(adOverlayInfoParcel == null || (zzr2 = adOverlayInfoParcel.zzc) == null)) {
            zzr2.zzd();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue()) {
            zzcfg zzcfg = this.zzd;
            if (zzcfg == null || zzcfg.zzaE()) {
                int i = zze.zza;
                zzo.zzj("The webview does not exist. Ignoring action.");
                return;
            }
            this.zzd.onResume();
        }
    }

    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    public final void zzt() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue()) {
            zzcfg zzcfg = this.zzd;
            if (zzcfg == null || zzcfg.zzaE()) {
                int i = zze.zza;
                zzo.zzj("The webview does not exist. Ignoring action.");
                return;
            }
            this.zzd.onResume();
        }
    }

    public final void zzu() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    public final void zzv() {
        zzr zzr2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzr2 = adOverlayInfoParcel.zzc) != null) {
            zzr2.zzdv();
        }
    }

    public final void zzw(boolean z) {
        if (!this.zzc.zzw) {
            int intValue = ((Integer) zzbd.zzc().zzb(zzbde.zzfs)).intValue();
            int i = 0;
            boolean z2 = ((Boolean) zzbd.zzc().zzb(zzbde.zzbn)).booleanValue() || z;
            zzt zzt2 = new zzt();
            zzt2.zzd = 50;
            zzt2.zza = true != z2 ? 0 : intValue;
            if (true != z2) {
                i = intValue;
            }
            zzt2.zzb = i;
            zzt2.zzc = intValue;
            this.zzf = new zzu(this.zzb, zzt2, this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(true != z2 ? 9 : 11);
            zzy(z, this.zzc.zzg);
            this.zzl.addView(this.zzf, layoutParams);
            zzJ(this.zzf);
        }
    }

    public final void zzx() {
        this.zzs = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.zzc).zzo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzy(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbl
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzc
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.zzh
            if (r0 == 0) goto L_0x0022
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzbm
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzc
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzl r3 = r3.zzo
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.zzi
            if (r3 == 0) goto L_0x0043
            r3 = r1
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzbsu r7 = new com.google.android.gms.internal.ads.zzbsu
            com.google.android.gms.internal.ads.zzcfg r4 = r6.zzd
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzh(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.zzu r7 = r6.zzf
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            r7.zzb(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzy(boolean, boolean):void");
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
