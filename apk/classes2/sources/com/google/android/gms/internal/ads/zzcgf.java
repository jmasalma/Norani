package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcgf extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfg {
    public static final /* synthetic */ int zza = 0;
    private final String zzA = "";
    private zzcgi zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbgd zzE;
    private zzbgb zzF;
    private zzbaq zzG;
    private int zzH;
    /* access modifiers changed from: private */
    public int zzI;
    private zzbdq zzJ;
    private final zzbdq zzK;
    private zzbdq zzL;
    private final zzbdr zzM;
    private int zzN;
    private zzm zzO;
    private boolean zzP;
    private final zzck zzQ;
    private int zzR = -1;
    private int zzS = -1;
    private int zzT = -1;
    private int zzU = -1;
    private int zzV = -1;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbcc zzY;
    private boolean zzZ;
    private final zzchc zzb;
    private final zzavu zzc;
    private final zzfda zzd;
    private final zzbel zze;
    private final VersionInfoParcel zzf;
    private zzn zzg;
    private final zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfca zzk;
    private zzfcd zzl;
    private boolean zzm = false;
    private boolean zzn = false;
    private zzcfo zzo;
    private zzm zzp;
    private zzedh zzq;
    private zzedf zzr;
    private zzchd zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzcgf(zzchc zzchc, zzchd zzchd, String str, boolean z, boolean z2, zzavu zzavu, zzbel zzbel, VersionInfoParcel versionInfoParcel, zzbdt zzbdt, zzn zzn2, zza zza2, zzbcc zzbcc, zzfca zzfca, zzfcd zzfcd, zzfda zzfda) {
        super(zzchc);
        zzfcd zzfcd2;
        VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
        this.zzb = zzchc;
        this.zzs = zzchd;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzavu;
        this.zzd = zzfda;
        this.zze = zzbel;
        this.zzf = versionInfoParcel2;
        this.zzg = zzn2;
        this.zzh = zza2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        zzv.zzr();
        DisplayMetrics zzu2 = zzs.zzu(windowManager);
        this.zzi = zzu2;
        this.zzj = zzu2.density;
        this.zzY = zzbcc;
        this.zzk = zzfca;
        this.zzl = zzfcd;
        this.zzQ = new zzck(zzchc.zza(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlZ)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            NullPointerException nullPointerException = e;
            int i = zze.zza;
            zzo.zzh("Unable to enable Javascript.", nullPointerException);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlY)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznB)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(zzv.zzr().zzc(zzchc, versionInfoParcel2.afmaVersion));
        zzv.zzr();
        Context context = getContext();
        zzcd.zza(context, new zzk(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcgm(this, new zzcgl(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbdr zzbdr = new zzbdr(new zzbdt(true, "make_wv", this.zzt));
        this.zzM = zzbdr;
        zzbdr.zza().zzc((zzbdt) null);
        if (!(!((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue() || (zzfcd2 = this.zzl) == null || zzfcd2.zzb == null)) {
            zzbdr.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbdr.zza();
        zzbdq zzf2 = zzbdt.zzf();
        this.zzK = zzf2;
        zzbdr.zzb("native:view_create", zzf2);
        this.zzL = null;
        this.zzJ = null;
        zzcg.zza().zzb(zzchc);
        zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        zzfca zzfca = this.zzk;
        if (zzfca != null) {
            if (zzfca.zzam) {
                int i = zze.zza;
                zzo.zze("Disabling hardware acceleration on an overlay.");
                zzbc();
                return;
            }
        }
        if (!this.zzw) {
            if (!this.zzs.zzi()) {
                int i2 = zze.zza;
                zzo.zze("Enabling hardware acceleration on an AdView.");
                zzbe();
                return;
            }
        }
        int i3 = zze.zza;
        zzo.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (!this.zzP) {
            this.zzP = true;
            zzv.zzp().zzr();
        }
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, (Paint) null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, (Paint) null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(String str) {
        try {
            zzs.zza.post(new zzcga(this, "about:blank"));
        } catch (Throwable th) {
            zzv.zzp().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = zze.zza;
            zzo.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbdl.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        Map map = this.zzW;
        if (map != null) {
            for (zzcdn release : map.values()) {
                release.release();
            }
        }
        this.zzW = null;
    }

    private final void zzbi() {
        zzbdr zzbdr = this.zzM;
        if (zzbdr != null) {
            zzbdt zza2 = zzbdr.zza();
            zzbdj zzg2 = zzv.zzp().zzg();
            if (zzg2 != null) {
                zzg2.zzf(zza2);
            }
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl2 = zzv.zzp().zzl();
        this.zzy = zzl2;
        if (zzl2 == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback) null);
                zzaY(true);
            } catch (IllegalStateException unused) {
                zzaY(false);
            }
        }
    }

    public final synchronized void destroy() {
        zzbi();
        this.zzQ.zza();
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzl();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.zzv) {
            zzv.zzA().zzd(this);
            zzbh();
            this.zzv = true;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlj)).booleanValue()) {
                Activity zza2 = this.zzb.zza();
                if (zza2 == null || !zza2.isDestroyed()) {
                    zze.zza("Initiating WebView self destruct sequence in 3...");
                    zze.zza("Loading blank page in WebView, 2...");
                    zzbf("about:blank");
                    return;
                }
                zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            zzX();
        }
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            int i = zze.zza;
            zzo.zzl("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlk)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcaf.zzf.zza(new zzcfz(this, str, valueCallback));
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzl();
                    zzv.zzA().zzd(this);
                    zzbh();
                    zzbb();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
            return;
        }
        int i = zze.zza;
        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        int i = zze.zza;
        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final synchronized void loadUrl(String str) {
        if (!zzaE()) {
            try {
                zzs.zza.post(new zzcgc(this, str));
            } catch (Throwable th) {
                zzv.zzp().zzw(th, "AdWebViewImpl.loadUrl");
                int i = zze.zza;
                zzo.zzk("Could not call loadUrl. ", th);
            }
        } else {
            int i2 = zze.zza;
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void onAdClicked() {
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null) {
            zzcfo.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaE()) {
            this.zzQ.zzc();
        }
        if (this.zzZ) {
            onResume();
            this.zzZ = false;
        }
        boolean z = this.zzC;
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null && zzcfo.zzW()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
            z = true;
        }
        zzbd(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        zzcfo zzcfo;
        synchronized (this) {
            if (!zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcfo = this.zzo) != null && zzcfo.zzW() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = false;
            }
        }
        zzbd(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzly)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzv.zzr();
            zzs.zzU(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String str5 = "Couldn't find an Activity to view url/mimetype: " + str + " / " + str4;
            int i = zze.zza;
            zzo.zze(str5);
            zzv.zzp().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!zzaE()) {
            super.onDraw(canvas);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        zzm zzL2 = zzL();
        if (zzL2 != null && zzaZ) {
            zzL2.zzn();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b9 A[SYNTHETIC, Splitter:B:114:0x01b9] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Not enough space to show ad. Needs "
            monitor-enter(r9)
            boolean r1 = r9.zzaE()     // Catch:{ all -> 0x01df }
            r2 = 0
            if (r1 == 0) goto L_0x000f
            r9.setMeasuredDimension(r2, r2)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x000f:
            boolean r1 = r9.isInEditMode()     // Catch:{ all -> 0x01df }
            if (r1 != 0) goto L_0x01da
            boolean r1 = r9.zzw     // Catch:{ all -> 0x01df }
            if (r1 != 0) goto L_0x01da
            com.google.android.gms.internal.ads.zzchd r1 = r9.zzs     // Catch:{ all -> 0x01df }
            boolean r1 = r1.zzf()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0023
            goto L_0x01da
        L_0x0023:
            com.google.android.gms.internal.ads.zzchd r1 = r9.zzs     // Catch:{ all -> 0x01df }
            boolean r1 = r1.zzh()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0030
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.zzchd r1 = r9.zzs     // Catch:{ all -> 0x01df }
            boolean r1 = r1.zzj()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzef     // Catch:{ all -> 0x01df }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x01df }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x01df }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01df }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x004f
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x004f:
            com.google.android.gms.internal.ads.zzcgi r0 = r9.zzq()     // Catch:{ all -> 0x01df }
            r1 = 0
            if (r0 == 0) goto L_0x005b
            float r0 = r0.zze()     // Catch:{ all -> 0x01df }
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0065
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x0065:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01df }
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01df }
            float r1 = (float) r11     // Catch:{ all -> 0x01df }
            float r1 = r1 * r0
            float r3 = (float) r10     // Catch:{ all -> 0x01df }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01df }
            if (r11 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007c
            float r11 = (float) r3     // Catch:{ all -> 0x01df }
            float r11 = r11 * r0
            int r11 = (int) r11     // Catch:{ all -> 0x01df }
            r2 = r10
            r10 = r3
            goto L_0x008c
        L_0x007c:
            r11 = r2
        L_0x007d:
            int r1 = (int) r1     // Catch:{ all -> 0x01df }
            if (r10 != 0) goto L_0x0089
            if (r1 == 0) goto L_0x008a
            float r10 = (float) r1     // Catch:{ all -> 0x01df }
            float r10 = r10 / r0
            int r3 = (int) r10     // Catch:{ all -> 0x01df }
            r10 = r11
            r11 = r1
            r2 = r11
            goto L_0x008c
        L_0x0089:
            r2 = r10
        L_0x008a:
            r10 = r11
            r11 = r1
        L_0x008c:
            int r11 = java.lang.Math.min(r11, r2)     // Catch:{ all -> 0x01df }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01df }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x0099:
            com.google.android.gms.internal.ads.zzchd r1 = r9.zzs     // Catch:{ all -> 0x01df }
            boolean r1 = r1.zzg()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x00e1
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzen     // Catch:{ all -> 0x01df }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x01df }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x01df }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01df }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x00b8
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x00b8:
            com.google.android.gms.internal.ads.zzcgd r0 = new com.google.android.gms.internal.ads.zzcgd     // Catch:{ all -> 0x01df }
            r0.<init>(r9)     // Catch:{ all -> 0x01df }
            java.lang.String r1 = "/contentHeight"
            r9.zzag(r1, r0)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r9.zzaW(r0)     // Catch:{ all -> 0x01df }
            android.util.DisplayMetrics r0 = r9.zzi     // Catch:{ all -> 0x01df }
            float r0 = r0.density     // Catch:{ all -> 0x01df }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01df }
            int r1 = r9.zzI     // Catch:{ all -> 0x01df }
            r2 = -1
            if (r1 == r2) goto L_0x00d8
            float r11 = (float) r1     // Catch:{ all -> 0x01df }
            float r11 = r11 * r0
            int r11 = (int) r11     // Catch:{ all -> 0x01df }
            goto L_0x00dc
        L_0x00d8:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01df }
        L_0x00dc:
            r9.setMeasuredDimension(r10, r11)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x00e1:
            com.google.android.gms.internal.ads.zzchd r1 = r9.zzs     // Catch:{ all -> 0x01df }
            boolean r1 = r1.zzi()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x00f4
            android.util.DisplayMetrics r10 = r9.zzi     // Catch:{ all -> 0x01df }
            int r11 = r10.widthPixels     // Catch:{ all -> 0x01df }
            int r10 = r10.heightPixels     // Catch:{ all -> 0x01df }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x00f4:
            int r1 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01df }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01df }
            int r3 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x01df }
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01df }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L_0x0112
            if (r1 != r5) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r1 = r4
            goto L_0x0113
        L_0x0112:
            r1 = r10
        L_0x0113:
            if (r3 == r6) goto L_0x0117
            if (r3 != r5) goto L_0x0118
        L_0x0117:
            r4 = r11
        L_0x0118:
            com.google.android.gms.internal.ads.zzchd r3 = r9.zzs     // Catch:{ all -> 0x01df }
            int r5 = r3.zzb     // Catch:{ all -> 0x01df }
            r6 = 1
            if (r5 > r1) goto L_0x0126
            int r3 = r3.zza     // Catch:{ all -> 0x01df }
            if (r3 <= r4) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r3 = r2
            goto L_0x0127
        L_0x0126:
            r3 = r6
        L_0x0127:
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzfM     // Catch:{ all -> 0x01df }
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x01df }
            java.lang.Object r5 = r7.zzb(r5)     // Catch:{ all -> 0x01df }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x01df }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x01df }
            if (r5 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzchd r5 = r9.zzs     // Catch:{ all -> 0x01df }
            int r7 = r5.zzb     // Catch:{ all -> 0x01df }
            float r7 = (float) r7     // Catch:{ all -> 0x01df }
            float r8 = r9.zzj     // Catch:{ all -> 0x01df }
            float r1 = (float) r1     // Catch:{ all -> 0x01df }
            float r7 = r7 / r8
            float r1 = r1 / r8
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0153
            int r1 = r5.zza     // Catch:{ all -> 0x01df }
            float r1 = (float) r1     // Catch:{ all -> 0x01df }
            float r1 = r1 / r8
            float r4 = (float) r4     // Catch:{ all -> 0x01df }
            float r4 = r4 / r8
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0153
            r1 = r6
            goto L_0x0154
        L_0x0153:
            r1 = r2
        L_0x0154:
            r3 = r3 & r1
        L_0x0155:
            r1 = 8
            if (r3 == 0) goto L_0x01b9
            com.google.android.gms.internal.ads.zzchd r3 = r9.zzs     // Catch:{ all -> 0x01df }
            int r4 = r3.zzb     // Catch:{ all -> 0x01df }
            float r4 = (float) r4     // Catch:{ all -> 0x01df }
            float r5 = r9.zzj     // Catch:{ all -> 0x01df }
            int r3 = r3.zza     // Catch:{ all -> 0x01df }
            float r3 = (float) r3     // Catch:{ all -> 0x01df }
            float r10 = (float) r10     // Catch:{ all -> 0x01df }
            float r11 = (float) r11     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r7.<init>(r0)     // Catch:{ all -> 0x01df }
            float r4 = r4 / r5
            int r0 = (int) r4     // Catch:{ all -> 0x01df }
            r7.append(r0)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "x"
            r7.append(r0)     // Catch:{ all -> 0x01df }
            float r3 = r3 / r5
            int r0 = (int) r3     // Catch:{ all -> 0x01df }
            r7.append(r0)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = " dp, but only has "
            r7.append(r0)     // Catch:{ all -> 0x01df }
            float r10 = r10 / r5
            int r10 = (int) r10     // Catch:{ all -> 0x01df }
            r7.append(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ all -> 0x01df }
            float r11 = r11 / r5
            int r10 = (int) r11     // Catch:{ all -> 0x01df }
            r7.append(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r10 = " dp."
            r7.append(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x01df }
            int r11 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x01df }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r10)     // Catch:{ all -> 0x01df }
            int r10 = r9.getVisibility()     // Catch:{ all -> 0x01df }
            if (r10 == r1) goto L_0x01a5
            r10 = 4
            r9.setVisibility(r10)     // Catch:{ all -> 0x01df }
        L_0x01a5:
            r9.setMeasuredDimension(r2, r2)     // Catch:{ all -> 0x01df }
            boolean r10 = r9.zzm     // Catch:{ all -> 0x01df }
            if (r10 != 0) goto L_0x01b7
            com.google.android.gms.internal.ads.zzbcc r10 = r9.zzY     // Catch:{ all -> 0x01df }
            r11 = 10001(0x2711, float:1.4014E-41)
            r10.zzc(r11)     // Catch:{ all -> 0x01df }
            r9.zzm = r6     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x01b7:
            monitor-exit(r9)
            return
        L_0x01b9:
            int r10 = r9.getVisibility()     // Catch:{ all -> 0x01df }
            if (r10 == r1) goto L_0x01c2
            r9.setVisibility(r2)     // Catch:{ all -> 0x01df }
        L_0x01c2:
            boolean r10 = r9.zzn     // Catch:{ all -> 0x01df }
            if (r10 != 0) goto L_0x01cf
            com.google.android.gms.internal.ads.zzbcc r10 = r9.zzY     // Catch:{ all -> 0x01df }
            r11 = 10002(0x2712, float:1.4016E-41)
            r10.zzc(r11)     // Catch:{ all -> 0x01df }
            r9.zzn = r6     // Catch:{ all -> 0x01df }
        L_0x01cf:
            com.google.android.gms.internal.ads.zzchd r10 = r9.zzs     // Catch:{ all -> 0x01df }
            int r11 = r10.zzb     // Catch:{ all -> 0x01df }
            int r10 = r10.zza     // Catch:{ all -> 0x01df }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x01da:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01df }
            monitor-exit(r9)
            return
        L_0x01df:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01df }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgf.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!zzaE()) {
            try {
                super.onPause();
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzmX)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                    int i = zze.zza;
                    zzo.zze("Muting webview");
                    WebViewCompat.setAudioMuted(this, true);
                }
            } catch (Exception e) {
                int i2 = zze.zza;
                zzo.zzh("Could not pause webview.", e);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzna)).booleanValue()) {
                    zzv.zzp().zzw(e, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    public final void onResume() {
        if (!zzaE()) {
            try {
                super.onResume();
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzmX)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                    int i = zze.zza;
                    zzo.zze("Unmuting webview");
                    WebViewCompat.setAudioMuted(this, false);
                }
            } catch (Exception e) {
                int i2 = zze.zza;
                zzo.zzh("Could not resume webview.", e);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzna)).booleanValue()) {
                    zzv.zzp().zzw(e, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) zzbd.zzc().zzb(zzbde.zzdN)).booleanValue() && this.zzo.zzT();
        if ((!this.zzo.zzW() || this.zzo.zzU()) && !z) {
            zzavu zzavu = this.zzc;
            if (zzavu != null) {
                zzavu.zzd(motionEvent);
            }
            zzbel zzbel = this.zze;
            if (zzbel != null) {
                zzbel.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbgd zzbgd = this.zzE;
                if (zzbgd != null) {
                    zzbgd.zzd(motionEvent);
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfo) {
            this.zzo = (zzcfo) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!zzaE()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                int i = zze.zza;
                zzo.zzh("Could not stop loading webview.", e);
            }
        }
    }

    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    public final void zzB(int i) {
    }

    public final synchronized void zzC(zzcgi zzcgi) {
        if (this.zzB != null) {
            int i = zze.zza;
            zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
            return;
        }
        this.zzB = zzcgi;
    }

    public final zzfca zzD() {
        return this.zzk;
    }

    public final Context zzE() {
        return this.zzb.zzb();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return this;
    }

    public final WebViewClient zzH() {
        return this.zzo;
    }

    public final zzavu zzI() {
        return this.zzc;
    }

    public final synchronized zzbaq zzJ() {
        return this.zzG;
    }

    public final synchronized zzbgd zzK() {
        return this.zzE;
    }

    public final synchronized zzm zzL() {
        return this.zzp;
    }

    public final synchronized zzm zzM() {
        return this.zzO;
    }

    public final /* synthetic */ zzcgy zzN() {
        return this.zzo;
    }

    public final synchronized zzchd zzO() {
        return this.zzs;
    }

    public final synchronized zzedf zzP() {
        return this.zzr;
    }

    public final synchronized zzedh zzQ() {
        return this.zzq;
    }

    public final zzfcd zzR() {
        return this.zzl;
    }

    public final zzfda zzS() {
        return this.zzd;
    }

    public final ListenableFuture zzT() {
        zzbel zzbel = this.zze;
        if (zzbel == null) {
            return zzgdn.zzh((Object) null);
        }
        return zzbel.zza();
    }

    public final synchronized String zzU() {
        return this.zzt;
    }

    public final List zzV() {
        return new ArrayList();
    }

    public final void zzW(zzfca zzfca, zzfcd zzfcd) {
        this.zzk = zzfca;
        this.zzl = zzfcd;
    }

    public final synchronized void zzX() {
        zze.zza("Destroying WebView!");
        zzbb();
        zzs.zza.post(new zzcge(this));
    }

    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    public final void zzZ(int i) {
        if (i == 0) {
            zzbdr zzbdr = this.zzM;
            zzbdq zzbdq = this.zzK;
            zzbdl.zza(zzbdr.zza(), zzbdq, "aebb2");
        }
        zzbg();
        zzbdr zzbdr2 = this.zzM;
        zzbdr2.zza();
        zzbdr2.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    public final void zza(String str) {
        zzaW(str);
    }

    public final void zzaA(String str, Predicate predicate) {
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null) {
            zzcfo.zzS(str, predicate);
        }
    }

    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    public final boolean zzaD(boolean z, int i) {
        destroy();
        zzcgb zzcgb = new zzcgb(z, i);
        zzbcc zzbcc = this.zzY;
        zzbcc.zzb(zzcgb);
        zzbcc.zzc(10003);
        return true;
    }

    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    public final boolean zzaG() {
        return false;
    }

    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    public final void zzaJ(zzc zzc2, boolean z, boolean z2, String str) {
        this.zzo.zzv(zzc2, z, z2, str);
    }

    public final void zzaK(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    public final void zzaL(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzA(z, i, str, z2, z3);
    }

    public final zzcfo zzaO() {
        return this.zzo;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaV(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, (ValueCallback) null);
            return;
        }
        int i = zze.zza;
        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    /* access modifiers changed from: protected */
    public final void zzaW(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaP() == null) {
                zzbj();
            }
            if (zzaP().booleanValue()) {
                zzaV(str, (ValueCallback) null);
            } else {
                zzaX("javascript:".concat(str));
            }
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
            return;
        }
        int i = zze.zza;
        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    /* access modifiers changed from: package-private */
    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        zzv.zzp().zzy(bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r10.zzV != r9) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        if (r10.zzV != r9) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzaZ() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r10.zzo
            boolean r0 = r0.zzV()
            r1 = 0
            if (r0 != 0) goto L_0x0011
            com.google.android.gms.internal.ads.zzcfo r0 = r10.zzo
            boolean r0 = r0.zzW()
            if (r0 == 0) goto L_0x0086
        L_0x0011:
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.internal.ads.zzchc r2 = r10.zzb
            android.app.Activity r2 = r2.zza()
            r3 = 1
            if (r2 == 0) goto L_0x0050
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L_0x0035
            goto L_0x0050
        L_0x0035:
            com.google.android.gms.ads.internal.zzv.zzr()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzR(r2)
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r6)
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            r7 = r2
            goto L_0x0052
        L_0x0050:
            r6 = r4
            r7 = r5
        L_0x0052:
            com.google.android.gms.ads.internal.zzv.zzr()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L_0x0087
            int r2 = r10.zzR
            if (r2 != r5) goto L_0x0087
            int r2 = r10.zzT
            if (r2 != r6) goto L_0x0087
            int r2 = r10.zzU
            if (r2 != r7) goto L_0x0087
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzaj
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0086
            int r2 = r10.zzV
            if (r2 == r9) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            return r1
        L_0x0087:
            int r2 = r10.zzS
            if (r2 != r4) goto L_0x00a5
            int r2 = r10.zzR
            if (r2 != r5) goto L_0x00a5
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzaj
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00a6
            int r2 = r10.zzV
            if (r2 == r9) goto L_0x00a6
        L_0x00a5:
            r1 = r3
        L_0x00a6:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbsu r3 = new com.google.android.gms.internal.ads.zzbsu
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzj(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgf.zzaZ():boolean");
    }

    public final void zzaa() {
        if (this.zzJ == null) {
            zzbdr zzbdr = this.zzM;
            zzbdq zzbdq = this.zzK;
            zzbdl.zza(zzbdr.zza(), zzbdq, "aes2");
            zzbdr.zza();
            zzbdq zzf2 = zzbdt.zzf();
            this.zzJ = zzf2;
            zzbdr.zzb("native:view_show", zzf2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    public final void zzab() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzv.zzt().zze()));
        hashMap.put("app_volume", String.valueOf(zzv.zzt().zza()));
        hashMap.put("device_volume", String.valueOf(zzab.zzb(getContext())));
        zzd("volume", hashMap);
    }

    public final void zzac(boolean z) {
        this.zzo.zzm(z);
    }

    public final void zzad() {
        this.zzQ.zzb();
    }

    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        if (!zzaE()) {
            String[] strArr = new String[1];
            String str5 = (String) zzbd.zzc().zzb(zzbde.zzag);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                int i = zze.zza;
                zzo.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcgr.zzb(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        int i2 = zze.zza;
        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final void zzaf() {
        if (this.zzL == null) {
            zzbdr zzbdr = this.zzM;
            zzbdr.zza();
            zzbdq zzf2 = zzbdt.zzf();
            this.zzL = zzf2;
            zzbdr.zzb("native:view_load", zzf2);
        }
    }

    public final void zzag(String str, zzbkf zzbkf) {
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null) {
            zzcfo.zzB(str, zzbkf);
        }
    }

    public final void zzah() {
        zze.zza("Cannot add text view to inner AdWebView");
    }

    public final synchronized void zzai(zzm zzm2) {
        this.zzp = zzm2;
    }

    public final synchronized void zzaj(zzchd zzchd) {
        this.zzs = zzchd;
        requestLayout();
    }

    public final synchronized void zzak(zzbaq zzbaq) {
        this.zzG = zzbaq;
    }

    public final synchronized void zzal(boolean z) {
        this.zzz = z;
    }

    public final void zzam() {
        setBackgroundColor(0);
    }

    public final void zzan(Context context) {
        zzchc zzchc = this.zzb;
        zzchc.setBaseContext(context);
        this.zzQ.zze(zzchc.zza());
    }

    public final synchronized void zzao(boolean z) {
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzy(this.zzo.zzV(), z);
        } else {
            this.zzu = z;
        }
    }

    public final synchronized void zzap(zzbgb zzbgb) {
        this.zzF = zzbgb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzaq(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzw     // Catch:{ all -> 0x003a }
            r2.zzw = r3     // Catch:{ all -> 0x003a }
            r2.zzba()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzah     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzchd r0 = r2.zzs     // Catch:{ all -> 0x003a }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            java.lang.String r0 = ""
            com.google.android.gms.internal.ads.zzbsu r1 = new com.google.android.gms.internal.ads.zzbsu     // Catch:{ all -> 0x003a }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x003a }
            r0 = 1
            if (r0 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r1.zzl(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgf.zzaq(boolean):void");
    }

    public final synchronized void zzar(zzbgd zzbgd) {
        this.zzE = zzbgd;
    }

    public final synchronized void zzas(zzedf zzedf) {
        this.zzr = zzedf;
    }

    public final synchronized void zzat(zzedh zzedh) {
        this.zzq = zzedh;
    }

    public final synchronized void zzau(int i) {
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzA(i);
        }
    }

    public final void zzav(boolean z) {
        this.zzZ = true;
    }

    public final synchronized void zzaw(zzm zzm2) {
        this.zzO = zzm2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzax(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzH     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.zzH = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzm r3 = r2.zzp     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.zzE()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgf.zzax(boolean):void");
    }

    public final synchronized void zzay(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzB(z);
        }
    }

    public final void zzaz(String str, zzbkf zzbkf) {
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null) {
            zzcfo.zzR(str, zzbkf);
        }
    }

    public final void zzb(String str, String str2) {
        zzaW(str + "(" + str2 + ");");
    }

    public final void zzd(String str, Map map) {
        try {
            zze(str, zzbb.zzb().zzo(map));
        } catch (JSONException unused) {
            int i = zze.zza;
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public final void zzdH() {
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null) {
            zzcfo.zzdH();
        }
    }

    public final void zzdf() {
        zzcfo zzcfo = this.zzo;
        if (zzcfo != null) {
            zzcfo.zzdf();
        }
    }

    public final synchronized void zzdg() {
        zzn zzn2 = this.zzg;
        if (zzn2 != null) {
            zzn2.zzdg();
        }
    }

    public final synchronized void zzdh() {
        zzn zzn2 = this.zzg;
        if (zzn2 != null) {
            zzn2.zzdh();
        }
    }

    public final void zzdi() {
        zzm zzL2 = zzL();
        if (zzL2 != null) {
            zzL2.zzd();
        }
    }

    public final void zzdr(zzazc zzazc) {
        synchronized (this) {
            this.zzC = zzazc.zzj;
        }
        zzbd(zzazc.zzj);
    }

    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = zze.zza;
        zzo.zze("Dispatching AFMA event: ".concat(sb2));
        zzaW(sb.toString());
    }

    public final synchronized int zzf() {
        return this.zzN;
    }

    public final int zzg() {
        return getMeasuredHeight();
    }

    public final int zzh() {
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zzb.zza();
    }

    public final zza zzj() {
        return this.zzh;
    }

    public final zzbdq zzk() {
        return this.zzK;
    }

    public final zzbdr zzl() {
        return this.zzM;
    }

    public final VersionInfoParcel zzm() {
        return this.zzf;
    }

    public final zzcbq zzn() {
        return null;
    }

    public final synchronized zzcdn zzo(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcdn) map.get(str);
    }

    public final void zzp(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    public final synchronized zzcgi zzq() {
        return this.zzB;
    }

    public final synchronized String zzr() {
        zzfcd zzfcd = this.zzl;
        if (zzfcd == null) {
            return null;
        }
        return zzfcd.zzb;
    }

    public final synchronized String zzs() {
        return this.zzA;
    }

    public final synchronized void zzt(String str, zzcdn zzcdn) {
        if (this.zzW == null) {
            this.zzW = new HashMap();
        }
        this.zzW.put(str, zzcdn);
    }

    public final void zzv(boolean z, long j) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    public final synchronized void zzw() {
        zzbgb zzbgb = this.zzF;
        if (zzbgb != null) {
            zzs.zza.post(new zzdmx((zzdmz) zzbgb));
        }
    }

    public final void zzx(int i) {
    }

    public final void zzy(int i) {
    }

    public final void zzz(boolean z) {
        this.zzo.zzF(false);
    }
}
