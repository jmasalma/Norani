package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzcfo extends WebViewClient implements zzcgy {
    public static final /* synthetic */ int zzb = 0;
    private zzdsj zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final HashSet zzF;
    private final zzecl zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbya zza;
    private final zzcfg zzc;
    private final zzbcc zzd;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private zza zzg;
    private zzr zzh;
    private zzcgw zzi;
    private zzcgx zzj;
    private zzbiv zzk;
    private zzbix zzl;
    private zzded zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private zzad zzw;
    private zzbst zzx;
    private zzb zzy;
    private zzbso zzz;

    public zzcfo(zzcfg zzcfg, zzbcc zzbcc, boolean z, zzbst zzbst, zzbso zzbso, zzecl zzecl) {
        this.zzd = zzbcc;
        this.zzc = zzcfg;
        this.zzs = z;
        this.zzx = zzbst;
        this.zzz = null;
        this.zzF = new HashSet(Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzfW)).split(",")));
        this.zzG = zzecl;
    }

    private static WebResourceResponse zzY() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzaY)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzZ(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        String str2;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    int i2 = zzfra.zzb;
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzs zzr2 = zzv.zzr();
                        zzcfg zzcfg = this.zzc;
                        zzr2.zzg(zzcfg.getContext(), zzcfg.zzm().afmaVersion, false, httpURLConnection, false, 60000);
                        webResourceResponse = null;
                        zzl zzl2 = new zzl((String) null);
                        zzl2.zzc(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzl2.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzv.zzr();
                            zzv.zzr();
                            String contentType = httpURLConnection.getContentType();
                        } else {
                            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                            if (headerField != null) {
                                if (!headerField.startsWith("tel:")) {
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol != null) {
                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                            int i3 = zze.zza;
                                            zzo.zzj("Unsupported scheme: " + protocol);
                                            webResourceResponse = zzY();
                                            break;
                                        }
                                        String str3 = "Redirecting to " + headerField;
                                        int i4 = zze.zza;
                                        zzo.zze(str3);
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    } else {
                                        int i5 = zze.zza;
                                        zzo.zzj("Protocol is null");
                                        webResourceResponse = zzY();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                throw new IOException("Missing Location header in redirect");
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzv.zzr();
            zzv.zzr();
            String contentType2 = httpURLConnection.getContentType();
            String str4 = "";
            if (TextUtils.isEmpty(contentType2)) {
                str2 = str4;
            } else {
                str2 = contentType2.split(";")[0].trim();
            }
            zzv.zzr();
            String contentType3 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType3)) {
                String[] split = contentType3.split(";");
                if (split.length != 1) {
                    int i6 = 1;
                    while (true) {
                        if (i6 >= split.length) {
                            break;
                        }
                        if (split[i6].trim().startsWith("charset")) {
                            String[] split2 = split[i6].trim().split("=");
                            if (split2.length > 1) {
                                str4 = split2[1].trim();
                                break;
                            }
                        }
                        i6++;
                    }
                }
            }
            String str5 = str4;
            Map headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry entry2 : headerFields.entrySet()) {
                if (!(entry2.getKey() == null || entry2.getValue() == null || ((List) entry2.getValue()).isEmpty())) {
                    hashMap.put((String) entry2.getKey(), (String) ((List) entry2.getValue()).get(0));
                }
            }
            webResourceResponse = zzv.zzs().zzb(str2, str5, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    public final void zzaa(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbkf) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener != null) {
            ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    public final void zzac(View view, zzbya zzbya, int i) {
        if (zzbya.zzi() && i > 0) {
            zzbya.zzg(view);
            if (zzbya.zzi()) {
                zzs.zza.postDelayed(new zzcfh(this, view, zzbya, i), 100);
            }
        }
    }

    private static final boolean zzad(zzcfg zzcfg) {
        return zzcfg.zzD() != null && zzcfg.zzD().zzb();
    }

    private static final boolean zzae(boolean z, zzcfg zzcfg) {
        return z && !zzcfg.zzO().zzi() && !zzcfg.zzU().equals("interstitial_mb");
    }

    public static /* synthetic */ void zzh(zzcfo zzcfo) {
        zzcfg zzcfg = zzcfo.zzc;
        zzcfg.zzad();
        zzm zzL = zzcfg.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    public final void onAdClicked() {
        zza zza2 = this.zzg;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzn(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r3 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r3.zza();
        r2.zzj = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        zzk();
        r3 = r2.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3.zzL() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzmq)).booleanValue() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r3.zzL().zzG(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r2.zzB = true;
        r3 = r2.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.Object r3 = r2.zzf
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcfg r0 = r2.zzc     // Catch:{ all -> 0x0048 }
            boolean r1 = r0.zzaE()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0015
            java.lang.String r4 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x0048 }
            r0.zzX()     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            return
        L_0x0015:
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            r3 = 1
            r2.zzB = r3
            com.google.android.gms.internal.ads.zzcgx r3 = r2.zzj
            if (r3 == 0) goto L_0x0023
            r3.zza()
            r3 = 0
            r2.zzj = r3
        L_0x0023:
            r2.zzk()
            com.google.android.gms.internal.ads.zzcfg r3 = r2.zzc
            com.google.android.gms.ads.internal.overlay.zzm r0 = r3.zzL()
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzmq
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.ads.internal.overlay.zzm r3 = r3.zzL()
            r3.zzG(r4)
        L_0x0047:
            return
        L_0x0048:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "AdWebView shouldOverrideUrlLoading: "
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.net.Uri r0 = android.net.Uri.parse(r14)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "gmsg"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r0.getHost()
            java.lang.String r3 = "mobileads.google.com"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x002f
            r12.zzn(r0)
            goto L_0x010f
        L_0x002f:
            boolean r1 = r12.zzn
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.zzcfg r1 = r12.zzc
            android.webkit.WebView r1 = r1.zzG()
            if (r13 != r1) goto L_0x006e
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "http"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x004f
            java.lang.String r3 = "https"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x006e
        L_0x004f:
            com.google.android.gms.ads.internal.client.zza r0 = r12.zzg
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0.onAdClicked()
            com.google.android.gms.internal.ads.zzbya r0 = r12.zza
            if (r0 == 0) goto L_0x005e
            r0.zzh(r14)
        L_0x005e:
            r12.zzg = r1
        L_0x0060:
            com.google.android.gms.internal.ads.zzded r0 = r12.zzm
            if (r0 == 0) goto L_0x0069
            r0.zzdf()
            r12.zzm = r1
        L_0x0069:
            boolean r13 = super.shouldOverrideUrlLoading(r13, r14)
            return r13
        L_0x006e:
            com.google.android.gms.internal.ads.zzcfg r13 = r12.zzc
            android.webkit.WebView r1 = r13.zzG()
            boolean r1 = r1.willNotDraw()
            if (r1 != 0) goto L_0x0102
            com.google.android.gms.internal.ads.zzavu r1 = r13.zzI()     // Catch:{ zzavv -> 0x00c4 }
            com.google.android.gms.internal.ads.zzfda r3 = r13.zzS()     // Catch:{ zzavv -> 0x00c4 }
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzmu     // Catch:{ zzavv -> 0x00c4 }
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ zzavv -> 0x00c4 }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ zzavv -> 0x00c4 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ zzavv -> 0x00c4 }
            boolean r4 = r4.booleanValue()     // Catch:{ zzavv -> 0x00c4 }
            if (r4 == 0) goto L_0x00ad
            if (r3 == 0) goto L_0x00ad
            if (r1 == 0) goto L_0x00d1
            boolean r1 = r1.zzf(r0)     // Catch:{ zzavv -> 0x00c4 }
            if (r1 == 0) goto L_0x00d1
            android.content.Context r1 = r13.getContext()     // Catch:{ zzavv -> 0x00c4 }
            android.app.Activity r4 = r13.zzi()     // Catch:{ zzavv -> 0x00c4 }
            android.view.View r13 = (android.view.View) r13     // Catch:{ zzavv -> 0x00c4 }
            android.net.Uri r0 = r3.zza(r0, r1, r13, r4)     // Catch:{ zzavv -> 0x00c4 }
            goto L_0x00d1
        L_0x00ad:
            if (r1 == 0) goto L_0x00d1
            boolean r3 = r1.zzf(r0)     // Catch:{ zzavv -> 0x00c4 }
            if (r3 == 0) goto L_0x00d1
            android.content.Context r3 = r13.getContext()     // Catch:{ zzavv -> 0x00c4 }
            android.app.Activity r4 = r13.zzi()     // Catch:{ zzavv -> 0x00c4 }
            android.view.View r13 = (android.view.View) r13     // Catch:{ zzavv -> 0x00c4 }
            android.net.Uri r0 = r1.zza(r0, r3, r13, r4)     // Catch:{ zzavv -> 0x00c4 }
            goto L_0x00d1
        L_0x00c4:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Unable to append parameter to URL: "
            java.lang.String r13 = r1.concat(r13)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r13)
        L_0x00d1:
            com.google.android.gms.ads.internal.zzb r13 = r12.zzy
            if (r13 == 0) goto L_0x00e0
            boolean r1 = r13.zzc()
            if (r1 == 0) goto L_0x00dc
            goto L_0x00e0
        L_0x00dc:
            r13.zzb(r14)
            goto L_0x010f
        L_0x00e0:
            com.google.android.gms.ads.internal.overlay.zzc r13 = new com.google.android.gms.ads.internal.overlay.zzc
            java.lang.String r5 = r0.toString()
            r10 = 0
            r11 = 0
            java.lang.String r4 = "android.intent.action.VIEW"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.google.android.gms.internal.ads.zzcfg r14 = r12.zzc
            if (r14 == 0) goto L_0x00fb
            java.lang.String r14 = r14.zzr()
            goto L_0x00fd
        L_0x00fb:
            java.lang.String r14 = ""
        L_0x00fd:
            r0 = 0
            r12.zzv(r13, r2, r0, r14)
            goto L_0x010f
        L_0x0102:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r14 = "AdWebView unable to handle URL: "
            java.lang.String r13 = r14.concat(r13)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r13)
        L_0x010f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void zzA(boolean z, int i, String str, boolean z2, boolean z3) {
        zza zza2;
        zzded zzded;
        zzcfg zzcfg = this.zzc;
        boolean zzaF = zzcfg.zzaF();
        boolean zzae = zzae(zzaF, zzcfg);
        boolean z4 = true;
        if (!zzae && z2) {
            z4 = false;
        }
        if (zzae) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzcfn zzcfn = zzaF ? null : new zzcfn(zzcfg, this.zzh);
        zzbiv zzbiv = this.zzk;
        zzbix zzbix = this.zzl;
        zzad zzad = this.zzw;
        VersionInfoParcel zzm2 = zzcfg.zzm();
        if (z4) {
            zzded = null;
        } else {
            zzded = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zza2, zzcfn, zzbiv, zzbix, zzad, zzcfg, z, i, str, zzm2, zzded, zzad(zzcfg) ? this.zzG : null, z3));
    }

    public final void zzB(String str, zzbkf zzbkf) {
        synchronized (this.zzf) {
            HashMap hashMap = this.zze;
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                hashMap.put(str, list);
            }
            list.add(zzbkf);
        }
    }

    public final void zzC(zzcgw zzcgw) {
        this.zzi = zzcgw;
    }

    public final void zzD(zzb zzb2) {
        this.zzy = zzb2;
    }

    public final void zzE(int i, int i2) {
        zzbso zzbso = this.zzz;
        if (zzbso != null) {
            zzbso.zze(i, i2);
        }
    }

    public final void zzF(boolean z) {
        this.zzn = false;
    }

    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    public final void zzH(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    public final void zzI() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcaf.zzf.execute(new zzcfi(this));
        }
    }

    public final void zzJ(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    public final void zzK(zzcgx zzcgx) {
        this.zzj = zzcgx;
    }

    public final void zzL(zzbya zzbya) {
        this.zza = zzbya;
    }

    public final void zzM(zzcmq zzcmq, zzeca zzeca, zzfjy zzfjy) {
        zzQ("/click");
        if (zzeca == null || zzfjy == null) {
            zzded zzded = this.zzm;
            zzbkf zzbkf = zzbke.zza;
            zzB("/click", new zzbjd(zzded, zzcmq));
            return;
        }
        zzB("/click", new zzfde(this.zzm, zzcmq, zzfjy, zzeca));
    }

    public final void zzN(zzcmq zzcmq) {
        zzQ("/click");
        zzded zzded = this.zzm;
        zzbkf zzbkf = zzbke.zza;
        zzB("/click", new zzbjd(zzded, zzcmq));
    }

    public final void zzO(zzcmq zzcmq, zzeca zzeca, zzdsj zzdsj) {
        zzQ("/open");
        zzB("/open", new zzbkr(this.zzy, this.zzz, zzeca, zzdsj, zzcmq));
    }

    public final void zzP(zzfca zzfca) {
        zzcfg zzcfg = this.zzc;
        if (zzv.zzo().zzp(zzcfg.getContext())) {
            zzQ("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbkl(zzcfg.getContext(), zzfca.zzaw));
        }
    }

    public final void zzQ(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.clear();
            }
        }
    }

    public final void zzR(String str, zzbkf zzbkf) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.remove(zzbkf);
            }
        }
    }

    public final void zzS(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbkf> list = (List) this.zze.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbkf zzbkf : list) {
                    if (predicate.apply(zzbkf)) {
                        arrayList.add(zzbkf);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final boolean zzT() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzU() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final boolean zzV() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzW() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01c4: MOVE  (r1v47 com.google.android.gms.internal.ads.zzbkg) = (r36v0 com.google.android.gms.internal.ads.zzbkg)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public final void zzX(com.google.android.gms.ads.internal.client.zza r19, com.google.android.gms.internal.ads.zzbiv r20, com.google.android.gms.ads.internal.overlay.zzr r21, com.google.android.gms.internal.ads.zzbix r22, com.google.android.gms.ads.internal.overlay.zzad r23, boolean r24, com.google.android.gms.internal.ads.zzbki r25, com.google.android.gms.ads.internal.zzb r26, com.google.android.gms.internal.ads.zzbsv r27, com.google.android.gms.internal.ads.zzbya r28, com.google.android.gms.internal.ads.zzeca r29, com.google.android.gms.internal.ads.zzfjy r30, com.google.android.gms.internal.ads.zzdsj r31, com.google.android.gms.internal.ads.zzbkz r32, com.google.android.gms.internal.ads.zzded r33, com.google.android.gms.internal.ads.zzbky r34, com.google.android.gms.internal.ads.zzbks r35, com.google.android.gms.internal.ads.zzbkg r36, com.google.android.gms.internal.ads.zzcmq r37) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r25
            r4 = r27
            r5 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r9 = r36
            r8 = r37
            if (r26 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzcfg r6 = r0.zzc
            com.google.android.gms.ads.internal.zzb r7 = new com.google.android.gms.ads.internal.zzb
            android.content.Context r6 = r6.getContext()
            r8 = 0
            r7.<init>(r6, r5, r8)
            r8 = r7
            goto L_0x002e
        L_0x002c:
            r8 = r26
        L_0x002e:
            com.google.android.gms.internal.ads.zzcfg r7 = r0.zzc
            com.google.android.gms.internal.ads.zzbso r6 = new com.google.android.gms.internal.ads.zzbso
            r6.<init>(r7, r4)
            r0.zzz = r6
            r0.zza = r5
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzbf
            com.google.android.gms.internal.ads.zzbdc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.zzbiu r5 = new com.google.android.gms.internal.ads.zzbiu
            r5.<init>(r1)
            java.lang.String r6 = "/adMetadata"
            r0.zzB(r6, r5)
        L_0x0055:
            if (r2 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.zzbiw r5 = new com.google.android.gms.internal.ads.zzbiw
            r5.<init>(r2)
            java.lang.String r6 = "/appEvent"
            r0.zzB(r6, r5)
        L_0x0061:
            java.lang.String r5 = "/backButton"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzj
            r0.zzB(r5, r6)
            java.lang.String r5 = "/refresh"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzk
            r0.zzB(r5, r6)
            java.lang.String r5 = "/canOpenApp"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzb
            r0.zzB(r5, r6)
            java.lang.String r5 = "/canOpenURLs"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zza
            r0.zzB(r5, r6)
            java.lang.String r5 = "/canOpenIntents"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzc
            r0.zzB(r5, r6)
            java.lang.String r5 = "/close"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzd
            r0.zzB(r5, r6)
            java.lang.String r5 = "/customClose"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zze
            r0.zzB(r5, r6)
            java.lang.String r5 = "/instrument"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzn
            r0.zzB(r5, r6)
            java.lang.String r5 = "/delayPageLoaded"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzp
            r0.zzB(r5, r6)
            java.lang.String r5 = "/delayPageClosed"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzq
            r0.zzB(r5, r6)
            java.lang.String r5 = "/getLocationInfo"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzr
            r0.zzB(r5, r6)
            java.lang.String r5 = "/log"
            com.google.android.gms.internal.ads.zzbkf r6 = com.google.android.gms.internal.ads.zzbke.zzg
            r0.zzB(r5, r6)
            com.google.android.gms.internal.ads.zzbkm r5 = new com.google.android.gms.internal.ads.zzbkm
            com.google.android.gms.internal.ads.zzbso r6 = r0.zzz
            r5.<init>(r8, r6, r4)
            java.lang.String r4 = "/mraid"
            r0.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzbst r4 = r0.zzx
            if (r4 == 0) goto L_0x00ca
            java.lang.String r5 = "/mraidLoaded"
            r0.zzB(r5, r4)
        L_0x00ca:
            com.google.android.gms.internal.ads.zzbkr r6 = new com.google.android.gms.internal.ads.zzbkr
            com.google.android.gms.internal.ads.zzbso r5 = r0.zzz
            r4 = r6
            r16 = r5
            r5 = r8
            r2 = r6
            r6 = r16
            r16 = r7
            r7 = r29
            r1 = r37
            r17 = r8
            r8 = r31
            r9 = r37
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r4 = "/open"
            r0.zzB(r4, r2)
            com.google.android.gms.internal.ads.zzcdo r2 = new com.google.android.gms.internal.ads.zzcdo
            r2.<init>()
            java.lang.String r4 = "/precache"
            r0.zzB(r4, r2)
            java.lang.String r2 = "/touch"
            com.google.android.gms.internal.ads.zzbkf r4 = com.google.android.gms.internal.ads.zzbke.zzi
            r0.zzB(r2, r4)
            java.lang.String r2 = "/video"
            com.google.android.gms.internal.ads.zzbkf r4 = com.google.android.gms.internal.ads.zzbke.zzl
            r0.zzB(r2, r4)
            java.lang.String r2 = "/videoMeta"
            com.google.android.gms.internal.ads.zzbkf r4 = com.google.android.gms.internal.ads.zzbke.zzm
            r0.zzB(r2, r4)
            java.lang.String r2 = "/httpTrack"
            java.lang.String r4 = "/click"
            if (r10 == 0) goto L_0x0121
            if (r11 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.zzfde r5 = new com.google.android.gms.internal.ads.zzfde
            r5.<init>(r13, r1, r11, r10)
            r0.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzfdf r1 = new com.google.android.gms.internal.ads.zzfdf
            r1.<init>(r11, r10)
            r0.zzB(r2, r1)
            goto L_0x012e
        L_0x0121:
            com.google.android.gms.internal.ads.zzbjd r5 = new com.google.android.gms.internal.ads.zzbjd
            r5.<init>(r13, r1)
            r0.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzbkf r1 = com.google.android.gms.internal.ads.zzbke.zzf
            r0.zzB(r2, r1)
        L_0x012e:
            com.google.android.gms.internal.ads.zzbyo r1 = com.google.android.gms.ads.internal.zzv.zzo()
            android.content.Context r2 = r16.getContext()
            boolean r1 = r1.zzp(r2)
            if (r1 == 0) goto L_0x015b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzfca r2 = r16.zzD()
            if (r2 == 0) goto L_0x014d
            com.google.android.gms.internal.ads.zzfca r1 = r16.zzD()
            java.util.Map r1 = r1.zzaw
        L_0x014d:
            com.google.android.gms.internal.ads.zzbkl r2 = new com.google.android.gms.internal.ads.zzbkl
            android.content.Context r4 = r16.getContext()
            r2.<init>(r4, r1)
            java.lang.String r1 = "/logScionEvent"
            r0.zzB(r1, r2)
        L_0x015b:
            if (r3 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzbkh r1 = new com.google.android.gms.internal.ads.zzbkh
            r1.<init>(r3)
            java.lang.String r2 = "/setInterstitialProperties"
            r0.zzB(r2, r1)
        L_0x0167:
            if (r12 == 0) goto L_0x0180
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzjp
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0180
            java.lang.String r1 = "/inspectorNetworkExtras"
            r0.zzB(r1, r12)
        L_0x0180:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzjI
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0199
            if (r14 == 0) goto L_0x0199
            java.lang.String r1 = "/shareSheet"
            r0.zzB(r1, r14)
        L_0x0199:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzjN
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01b2
            if (r15 == 0) goto L_0x01b2
            java.lang.String r1 = "/inspectorOutOfContextTest"
            r0.zzB(r1, r15)
        L_0x01b2:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzjS
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01cd
            r1 = r36
            if (r1 == 0) goto L_0x01cd
            java.lang.String r2 = "/inspectorStorage"
            r0.zzB(r2, r1)
        L_0x01cd:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzlV
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0202
            java.lang.String r1 = "/bindPlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzu
            r0.zzB(r1, r2)
            java.lang.String r1 = "/presentPlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzv
            r0.zzB(r1, r2)
            java.lang.String r1 = "/expandPlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzw
            r0.zzB(r1, r2)
            java.lang.String r1 = "/collapsePlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzx
            r0.zzB(r1, r2)
            java.lang.String r1 = "/closePlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzy
            r0.zzB(r1, r2)
        L_0x0202:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzdB
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0222
            java.lang.String r1 = "/setPAIDPersonalizationEnabled"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzA
            r0.zzB(r1, r2)
            java.lang.String r1 = "/resetPAID"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzz
            r0.zzB(r1, r2)
        L_0x0222:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzmp
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0250
            com.google.android.gms.internal.ads.zzfca r1 = r16.zzD()
            if (r1 == 0) goto L_0x0250
            com.google.android.gms.internal.ads.zzfca r1 = r16.zzD()
            boolean r1 = r1.zzar
            if (r1 == 0) goto L_0x0250
            java.lang.String r1 = "/writeToLocalStorage"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzB
            r0.zzB(r1, r2)
            java.lang.String r1 = "/clearLocalStorageKeys"
            com.google.android.gms.internal.ads.zzbkf r2 = com.google.android.gms.internal.ads.zzbke.zzC
            r0.zzB(r1, r2)
        L_0x0250:
            r1 = r19
            r0.zzg = r1
            r1 = r21
            r0.zzh = r1
            r1 = r20
            r0.zzk = r1
            r1 = r22
            r0.zzl = r1
            r1 = r23
            r0.zzw = r1
            r7 = r17
            r0.zzy = r7
            r0.zzm = r13
            r1 = r31
            r0.zzA = r1
            r1 = r24
            r0.zzn = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.zzX(com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzbiv, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzbix, com.google.android.gms.ads.internal.overlay.zzad, boolean, com.google.android.gms.internal.ads.zzbki, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzbsv, com.google.android.gms.internal.ads.zzbya, com.google.android.gms.internal.ads.zzeca, com.google.android.gms.internal.ads.zzfjy, com.google.android.gms.internal.ads.zzdsj, com.google.android.gms.internal.ads.zzbkz, com.google.android.gms.internal.ads.zzded, com.google.android.gms.internal.ads.zzbky, com.google.android.gms.internal.ads.zzbks, com.google.android.gms.internal.ads.zzbkg, com.google.android.gms.internal.ads.zzcmq):void");
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0166, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0167, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0171, code lost:
        r7 = r14;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018e, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01df, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0 A[SYNTHETIC, Splitter:B:23:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0166 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018e A[Catch:{ all -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01df A[Catch:{ all -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0236 A[Catch:{ Exception | NoClassDefFoundError -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0288 A[Catch:{ Exception | NoClassDefFoundError -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02ab A[Catch:{ Exception | NoClassDefFoundError -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x017c=Splitter:B:56:0x017c, B:66:0x01cd=Splitter:B:66:0x01cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r20, java.util.Map r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "AdWebViewClient.interceptRequest.gcache"
            java.lang.String r0 = "range"
            java.lang.String r4 = "ms"
            java.lang.String r5 = "Cache connection took "
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.<init>()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzcfg r7 = r1.zzc     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzfca r8 = r7.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r8 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzfca r6 = r7.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.util.Map r6 = r6.zzaw     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
        L_0x001f:
            android.content.Context r8 = r7.getContext()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r9 = r1.zzE     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyq.zzc(r2, r8, r9, r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r8 = r6.equals(r2)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r8 != 0) goto L_0x0036
            r8 = r21
            android.webkit.WebResourceResponse r0 = r1.zzZ(r6, r8)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            return r0
        L_0x0036:
            r8 = r21
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbbo> r6 = com.google.android.gms.internal.ads.zzbbo.CREATOR     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            android.net.Uri r6 = android.net.Uri.parse(r20)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzbbo r6 = com.google.android.gms.internal.ads.zzbbo.zza(r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r6 == 0) goto L_0x0297
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r15.<init>()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r10 = "Access-Control-Allow-Origin"
            java.lang.String r11 = "*"
            r15.put(r10, r11)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            android.net.Uri r10 = android.net.Uri.parse(r20)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.util.Set r11 = r10.getQueryParameterNames()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r11 = r11.contains(r0)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r12 = 0
            r14 = 1
            if (r11 == 0) goto L_0x0095
            r11 = 45
            com.google.android.gms.internal.ads.zzfva r11 = com.google.android.gms.internal.ads.zzfva.zzc(r11)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzfwe r11 = com.google.android.gms.internal.ads.zzfwe.zzb(r11)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r0 = r10.getQueryParameter(r0)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.util.List r0 = r11.zzf(r0)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            int r10 = r0.size()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r11 = 2
            if (r10 != r11) goto L_0x0095
            java.lang.Object r10 = r0.get(r12)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            int r0 = r0 + r14
            if (r10 <= 0) goto L_0x0093
            long r12 = (long) r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.zzh = r12     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
        L_0x0093:
            int r0 = r0 - r10
            goto L_0x0096
        L_0x0095:
            r0 = -1
        L_0x0096:
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzeD     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzbdc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Object r10 = r12.zzb(r10)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r12 = "X-Afma-Gcache-CachedBytes"
            java.lang.String r13 = "X-Afma-Gcache-IsDownloaded"
            java.lang.String r11 = "X-Afma-Gcache-IsGcacheHit"
            java.lang.String r9 = "X-Afma-Gcache-HasAdditionalMetadataFromReadV2"
            if (r10 == 0) goto L_0x0236
            java.lang.String r10 = r7.zzr()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfwg.zzc(r10)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.zzi = r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            int r10 = r7.zzf()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.zzj = r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r10 = r6.zzg     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r10 == 0) goto L_0x00d1
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzeF     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzbdc r14 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Object r10 = r14.zzb(r10)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            goto L_0x00dd
        L_0x00d1:
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzeE     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzbdc r14 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Object r10 = r14.zzb(r10)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
        L_0x00dd:
            r14 = r3
            long r2 = r10.longValue()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r17 = r10.elapsedRealtime()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.ads.internal.zzv.zzd()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            android.content.Context r7 = r7.getContext()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzbbz.zza(r7, r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x01c9, TimeoutException -> 0x01c7, InterruptedException -> 0x0179, all -> 0x0175 }
            java.lang.Object r2 = r6.get(r2, r7)     // Catch:{ ExecutionException -> 0x01c9, TimeoutException -> 0x01c7, InterruptedException -> 0x0179, all -> 0x0175 }
            com.google.android.gms.internal.ads.zzbca r2 = (com.google.android.gms.internal.ads.zzbca) r2     // Catch:{ ExecutionException -> 0x01c9, TimeoutException -> 0x01c7, InterruptedException -> 0x0179, all -> 0x0175 }
            boolean r3 = r2.zzd()     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            r15.put(r9, r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            boolean r3 = r2.zzf()     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            r15.put(r11, r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            boolean r3 = r2.zze()     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            r15.put(r13, r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            long r9 = r2.zza()     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            java.lang.String r3 = java.lang.Long.toString(r9)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            r15.put(r12, r3)     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            java.io.InputStream r2 = r2.zzc()     // Catch:{ ExecutionException -> 0x0170, TimeoutException -> 0x016e, InterruptedException -> 0x016a, all -> 0x0166 }
            r3 = -1
            if (r0 == r3) goto L_0x013d
            long r9 = (long) r0
            java.io.InputStream r2 = com.google.android.gms.internal.ads.zzgbg.zza(r2, r9)     // Catch:{ ExecutionException -> 0x013a, TimeoutException -> 0x0138, InterruptedException -> 0x0136, all -> 0x0166 }
            goto L_0x013d
        L_0x0136:
            r0 = move-exception
            goto L_0x016c
        L_0x0138:
            r0 = move-exception
            goto L_0x013b
        L_0x013a:
            r0 = move-exception
        L_0x013b:
            r7 = r14
            goto L_0x0173
        L_0x013d:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r6 = r0.elapsedRealtime()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r6 = r6 - r17
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzcfk r3 = new com.google.android.gms.internal.ads.zzcfk     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r9 = 1
            r3.<init>(r1, r9, r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.post(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.append(r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.append(r4)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
        L_0x0161:
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            goto L_0x0281
        L_0x0166:
            r0 = move-exception
            r12 = 1
            goto L_0x020f
        L_0x016a:
            r0 = move-exception
            r2 = 0
        L_0x016c:
            r12 = 1
            goto L_0x017c
        L_0x016e:
            r0 = move-exception
            goto L_0x0171
        L_0x0170:
            r0 = move-exception
        L_0x0171:
            r7 = r14
            r2 = 0
        L_0x0173:
            r12 = 1
            goto L_0x01cd
        L_0x0175:
            r0 = move-exception
            r12 = 0
            goto L_0x020f
        L_0x0179:
            r0 = move-exception
            r2 = 0
            r12 = 0
        L_0x017c:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeI     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x01c5 }
            java.lang.Object r3 = r7.zzb(r3)     // Catch:{ all -> 0x01c5 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01c5 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x01c5 }
            if (r3 == 0) goto L_0x0196
            com.google.android.gms.internal.ads.zzbzs r3 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x01c5 }
            r7 = r14
            r3.zzw(r0, r7)     // Catch:{ all -> 0x01c5 }
        L_0x0196:
            r3 = 1
            r6.cancel(r3)     // Catch:{ all -> 0x01c5 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01c5 }
            r0.interrupt()     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r6 = r0.elapsedRealtime()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r6 = r6 - r17
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzcfk r3 = new com.google.android.gms.internal.ads.zzcfk     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r3.<init>(r1, r12, r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.post(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.append(r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.append(r4)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            goto L_0x0161
        L_0x01c5:
            r0 = move-exception
            goto L_0x020f
        L_0x01c7:
            r0 = move-exception
            goto L_0x01ca
        L_0x01c9:
            r0 = move-exception
        L_0x01ca:
            r7 = r14
            r2 = 0
            r12 = 0
        L_0x01cd:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeI     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x01c5 }
            java.lang.Object r3 = r9.zzb(r3)     // Catch:{ all -> 0x01c5 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01c5 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x01c5 }
            if (r3 == 0) goto L_0x01e6
            com.google.android.gms.internal.ads.zzbzs r3 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x01c5 }
            r3.zzw(r0, r7)     // Catch:{ all -> 0x01c5 }
        L_0x01e6:
            r3 = 1
            r6.cancel(r3)     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r6 = r0.elapsedRealtime()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r6 = r6 - r17
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzcfk r3 = new com.google.android.gms.internal.ads.zzcfk     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r3.<init>(r1, r12, r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.post(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.append(r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r0.append(r4)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            goto L_0x0161
        L_0x020f:
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r2 = r2.elapsedRealtime()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r2 = r2 - r17
            com.google.android.gms.internal.ads.zzfrw r6 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzcfk r7 = new com.google.android.gms.internal.ads.zzcfk     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r7.<init>(r1, r12, r2)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.post(r7)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.append(r2)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r6.append(r4)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            throw r0     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
        L_0x0236:
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.zzv.zzc()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            com.google.android.gms.internal.ads.zzbbl r2 = r2.zzb(r6)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r2 == 0) goto L_0x0284
            boolean r3 = r2.zze()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r3 == 0) goto L_0x0284
            boolean r3 = r2.zzd()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r15.put(r9, r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r3 = r2.zzg()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r15.put(r11, r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r3 = r2.zzf()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r15.put(r13, r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            long r3 = r2.zza()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r15.put(r12, r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.io.InputStream r2 = r2.zzc()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r3 = -1
            if (r0 == r3) goto L_0x0281
            long r3 = (long) r0     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.io.InputStream r0 = com.google.android.gms.internal.ads.zzgbg.zza(r2, r3)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            r16 = r0
            goto L_0x0286
        L_0x0281:
            r16 = r2
            goto L_0x0286
        L_0x0284:
            r16 = 0
        L_0x0286:
            if (r16 == 0) goto L_0x0297
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r14 = "OK"
            r13 = 200(0xc8, float:2.8E-43)
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            return r0
        L_0x0297:
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzk()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r0 == 0) goto L_0x02b0
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfa.zzb     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Object r0 = r0.zze()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            if (r0 == 0) goto L_0x02b0
            android.webkit.WebResourceResponse r0 = r19.zzZ(r20, r21)     // Catch:{ Exception -> 0x02b4, NoClassDefFoundError -> 0x02b2 }
            return r0
        L_0x02b0:
            r2 = 0
            return r2
        L_0x02b2:
            r0 = move-exception
            goto L_0x02b5
        L_0x02b4:
            r0 = move-exception
        L_0x02b5:
            java.lang.String r2 = "AdWebViewClient.interceptRequest"
            com.google.android.gms.internal.ads.zzbzs r3 = com.google.android.gms.ads.internal.zzv.zzp()
            r3.zzw(r0, r2)
            android.webkit.WebResourceResponse r0 = zzY()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final zzb zzd() {
        return this.zzy;
    }

    public final void zzdH() {
        zzded zzded = this.zzm;
        if (zzded != null) {
            zzded.zzdH();
        }
    }

    public final void zzdf() {
        zzded zzded = this.zzm;
        if (zzded != null) {
            zzded.zzdf();
        }
    }

    public final zzdsj zze() {
        return this.zzA;
    }

    public final void zzk() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            boolean z = true;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue()) {
                zzcfg zzcfg = this.zzc;
                if (zzcfg.zzl() != null) {
                    zzbdl.zza(zzcfg.zzl().zza(), zzcfg.zzk(), "awfllc");
                }
            }
            zzcgw zzcgw = this.zzi;
            if (this.zzC || this.zzo) {
                z = false;
            }
            zzcgw.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzl() {
        zzbya zzbya = this.zza;
        if (zzbya != null) {
            zzbya.zzf();
            this.zza = null;
        }
        zzab();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbso zzbso = this.zzz;
            if (zzbso != null) {
                zzbso.zzb(true);
                this.zzz = null;
            }
        }
    }

    public final void zzm(boolean z) {
        this.zzE = z;
    }

    public final void zzn(Uri uri) {
        String str;
        zze.zza("Received GMSG: ".concat(String.valueOf(String.valueOf(uri))));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzgV)).booleanValue() && zzv.zzp().zzg() != null) {
                if (path == null || path.length() < 2) {
                    str = "null";
                } else {
                    str = path.substring(1);
                }
                zzcaf.zza.execute(new zzcfj(str));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfV)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbd.zzc().zzb(zzbde.zzfX)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgdn.zzr(zzv.zzr().zzb(uri), new zzcfm(this, list, path, uri), zzcaf.zzf);
                return;
            }
        }
        zzv.zzr();
        zzaa(zzs.zzQ(uri), list, path);
    }

    public final void zzo() {
        zzbcc zzbcc = this.zzd;
        if (zzbcc != null) {
            zzbcc.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzk();
        this.zzc.destroy();
    }

    public final void zzp() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzk();
    }

    public final void zzq() {
        this.zzD--;
        zzk();
    }

    public final void zzr(int i, int i2, boolean z) {
        zzbst zzbst = this.zzx;
        if (zzbst != null) {
            zzbst.zzb(i, i2);
        }
        zzbso zzbso = this.zzz;
        if (zzbso != null) {
            zzbso.zzd(i, i2, false);
        }
    }

    public final void zzs() {
        zzbya zzbya = this.zza;
        if (zzbya != null) {
            zzcfg zzcfg = this.zzc;
            WebView zzG2 = zzcfg.zzG();
            if (ViewCompat.isAttachedToWindow(zzG2)) {
                zzac(zzG2, zzbya, 10);
                return;
            }
            zzab();
            zzcfl zzcfl = new zzcfl(this, zzbya);
            this.zzH = zzcfl;
            ((View) zzcfg).addOnAttachStateChangeListener(zzcfl);
        }
    }

    public final void zzv(zzc zzc2, boolean z, boolean z2, String str) {
        zzded zzded;
        zzcfg zzcfg = this.zzc;
        boolean zzaF = zzcfg.zzaF();
        boolean z3 = false;
        boolean z4 = zzae(zzaF, zzcfg) || z2;
        if (z4 || !z) {
            z3 = true;
        }
        zza zza2 = z4 ? null : this.zzg;
        zzr zzr2 = zzaF ? null : this.zzh;
        zzad zzad = this.zzw;
        VersionInfoParcel zzm2 = zzcfg.zzm();
        if (z3) {
            zzded = null;
        } else {
            zzded = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zzc2, zza2, zzr2, zzad, zzm2, zzcfg, zzded, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzecl zzecl = this.zzG;
        zzcfg zzcfg = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcfg, zzcfg.zzm(), str, str2, 14, zzecl));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        zzded zzded;
        zzcfg zzcfg = this.zzc;
        boolean zzae = zzae(zzcfg.zzaF(), zzcfg);
        boolean z3 = true;
        if (!zzae && z2) {
            z3 = false;
        }
        zza zza2 = zzae ? null : this.zzg;
        zzr zzr2 = this.zzh;
        zzad zzad = this.zzw;
        VersionInfoParcel zzm2 = zzcfg.zzm();
        if (z3) {
            zzded = null;
        } else {
            zzded = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zza2, zzr2, zzad, zzcfg, z, i, zzm2, zzded, zzad(zzcfg) ? this.zzG : null));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc2;
        zzbso zzbso = this.zzz;
        boolean zzf2 = zzbso != null ? zzbso.zzf() : false;
        zzv.zzj();
        zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzf2, this.zzA);
        zzbya zzbya = this.zza;
        if (zzbya != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzc2 = adOverlayInfoParcel.zza) != null) {
                str = zzc2.zzb;
            }
            zzbya.zzh(str);
        }
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zza zza2;
        zzded zzded;
        zzcfg zzcfg = this.zzc;
        boolean zzaF = zzcfg.zzaF();
        boolean zzae = zzae(zzaF, zzcfg);
        boolean z3 = true;
        if (!zzae && z2) {
            z3 = false;
        }
        if (zzae) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzcfn zzcfn = zzaF ? null : new zzcfn(zzcfg, this.zzh);
        zzbiv zzbiv = this.zzk;
        zzbix zzbix = this.zzl;
        zzad zzad = this.zzw;
        VersionInfoParcel zzm2 = zzcfg.zzm();
        if (z3) {
            zzded = null;
        } else {
            zzded = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zza2, zzcfn, zzbiv, zzbix, zzad, zzcfg, z, i, str, str2, zzm2, zzded, zzad(zzcfg) ? this.zzG : null));
    }
}
