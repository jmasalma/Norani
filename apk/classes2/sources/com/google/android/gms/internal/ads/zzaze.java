package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaze implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) zzbd.zzc().zzb(zzbde.zzbz)).longValue();
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzazq zzj;
    private final zzbx zzk = new zzbx(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzaze(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.zze = (Application) applicationContext;
            this.zzj = new zzazq((Application) applicationContext, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int zzh(int i) {
        return (int) (((float) i) / this.zzo.density);
    }

    private final void zzi(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.zzb;
        if (weakReference != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) weakReference.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.zzm = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0131, code lost:
        if (r9 == 0) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0147, code lost:
        if (r9 == 0) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(int r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            java.util.HashSet r0 = r1.zzn
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            goto L_0x023b
        L_0x000e:
            java.lang.ref.WeakReference r0 = r1.zzb
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r9 = new int[r0]
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0087
            boolean r13 = r3.getGlobalVisibleRect(r5)
            boolean r14 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0048 }
            r3.getLocationInWindow(r9)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0050
        L_0x0048:
            r0 = move-exception
            int r15 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r15 = "Failure getting view location."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r15, r0)
        L_0x0050:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfr
            com.google.android.gms.internal.ads.zzbdc r15 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r15.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006b
            r0 = r9[r12]
            r4.left = r0
            r0 = r9[r11]
            r4.top = r0
            goto L_0x0073
        L_0x006b:
            r0 = r8[r12]
            r4.left = r0
            r0 = r8[r11]
            r4.top = r0
        L_0x0073:
            int r0 = r4.left
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x008a
        L_0x0087:
            r13 = r12
            r14 = r13
            r8 = 0
        L_0x008a:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbC
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r9.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00db
            if (r8 == 0) goto L_0x00db
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00cc }
            android.view.ViewParent r9 = r8.getParent()     // Catch:{ Exception -> 0x00cc }
        L_0x00a7:
            boolean r15 = r9 instanceof android.view.View     // Catch:{ Exception -> 0x00cc }
            if (r15 == 0) goto L_0x00df
            r15 = r9
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00cc }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ Exception -> 0x00cc }
            r12.<init>()     // Catch:{ Exception -> 0x00cc }
            boolean r16 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00cc }
            if (r16 == 0) goto L_0x00c6
            boolean r15 = r15.getGlobalVisibleRect(r12)     // Catch:{ Exception -> 0x00cc }
            if (r15 == 0) goto L_0x00c6
            android.graphics.Rect r12 = r1.zza(r12)     // Catch:{ Exception -> 0x00cc }
            r0.add(r12)     // Catch:{ Exception -> 0x00cc }
        L_0x00c6:
            android.view.ViewParent r9 = r9.getParent()     // Catch:{ Exception -> 0x00cc }
            r12 = 0
            goto L_0x00a7
        L_0x00cc:
            r0 = move-exception
            java.lang.String r9 = "PositionWatcher.getParentScrollViewRects"
            com.google.android.gms.internal.ads.zzbzs r12 = com.google.android.gms.ads.internal.zzv.zzp()
            r12.zzw(r0, r9)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00df
        L_0x00db:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00df:
            r33 = r0
            if (r8 == 0) goto L_0x00e8
            int r9 = r8.getWindowVisibility()
            goto L_0x00ea
        L_0x00e8:
            r9 = 8
        L_0x00ea:
            int r12 = r1.zzm
            r15 = -1
            if (r12 == r15) goto L_0x00f0
            r9 = r12
        L_0x00f0:
            com.google.android.gms.ads.internal.zzv.zzr()
            long r28 = com.google.android.gms.ads.internal.util.zzs.zzx(r8)
            com.google.android.gms.internal.ads.zzbcv r12 = com.google.android.gms.internal.ads.zzbde.zzkY
            com.google.android.gms.internal.ads.zzbdc r15 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r15.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0134
            if (r3 == 0) goto L_0x0158
            android.os.PowerManager r3 = r1.zzg
            android.app.KeyguardManager r12 = r1.zzh
            com.google.android.gms.ads.internal.zzv.zzr()
            boolean r3 = com.google.android.gms.ads.internal.util.zzs.zzT(r8, r3, r12)
            if (r3 == 0) goto L_0x0158
            if (r13 == 0) goto L_0x0155
            if (r14 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzlb
            com.google.android.gms.internal.ads.zzbdc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r12.zzb(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r12 = (long) r3
            int r3 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x014e
            if (r9 != 0) goto L_0x014e
            goto L_0x0149
        L_0x0134:
            if (r3 == 0) goto L_0x0158
            android.os.PowerManager r3 = r1.zzg
            android.app.KeyguardManager r12 = r1.zzh
            com.google.android.gms.ads.internal.zzv.zzr()
            boolean r3 = com.google.android.gms.ads.internal.util.zzs.zzT(r8, r3, r12)
            if (r3 == 0) goto L_0x0158
            if (r13 == 0) goto L_0x0155
            if (r14 == 0) goto L_0x0151
            if (r9 != 0) goto L_0x014e
        L_0x0149:
            r3 = r11
            r13 = r3
            r14 = r13
            r9 = 0
            goto L_0x0159
        L_0x014e:
            r13 = r11
            r14 = r13
            goto L_0x0158
        L_0x0151:
            r13 = r11
            r3 = 0
            r14 = 0
            goto L_0x0159
        L_0x0155:
            r3 = 0
            r13 = 0
            goto L_0x0159
        L_0x0158:
            r3 = 0
        L_0x0159:
            com.google.android.gms.internal.ads.zzbcv r12 = com.google.android.gms.internal.ads.zzbde.zzld
            com.google.android.gms.internal.ads.zzbdc r15 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r15.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x01b8
            android.os.PowerManager r12 = r1.zzg
            android.app.KeyguardManager r15 = r1.zzh
            com.google.android.gms.ads.internal.zzv.zzr()
            boolean r12 = com.google.android.gms.ads.internal.util.zzs.zzT(r8, r12, r15)
            if (r11 == r12) goto L_0x017a
            r12 = 0
            goto L_0x017c
        L_0x017a:
            r12 = 64
        L_0x017c:
            if (r11 == r13) goto L_0x0180
            r15 = 0
            goto L_0x0182
        L_0x0180:
            r15 = 8
        L_0x0182:
            if (r11 == r14) goto L_0x0187
            r16 = 0
            goto L_0x0189
        L_0x0187:
            r16 = 16
        L_0x0189:
            if (r9 != 0) goto L_0x018e
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x018f
        L_0x018e:
            r9 = 0
        L_0x018f:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlb
            com.google.android.gms.internal.ads.zzbdc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r11.zzb(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r10 = (long) r0
            int r0 = (r28 > r10 ? 1 : (r28 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01a7
            r0 = 32
            goto L_0x01a8
        L_0x01a7:
            r0 = 0
        L_0x01a8:
            r10 = r12 | r15
            r10 = r10 | r16
            r9 = r9 | r10
            r0 = r0 | r9
            r0 = r0 | r3
            com.google.android.gms.ads.internal.zzv.zzr()
            r9 = 0
            com.google.android.gms.ads.internal.util.zzs.zzK(r8, r0, r9)
            r9 = 1
            goto L_0x01b9
        L_0x01b8:
            r9 = r11
        L_0x01b9:
            if (r2 != r9) goto L_0x01c7
            com.google.android.gms.ads.internal.util.zzbx r0 = r1.zzk
            boolean r0 = r0.zzb()
            if (r0 != 0) goto L_0x01c7
            boolean r0 = r1.zzl
            if (r3 == r0) goto L_0x023b
        L_0x01c7:
            if (r3 != 0) goto L_0x01d1
            boolean r0 = r1.zzl
            if (r0 != 0) goto L_0x01d1
            r9 = 1
            if (r2 == r9) goto L_0x023b
            goto L_0x01d2
        L_0x01d1:
            r9 = 1
        L_0x01d2:
            com.google.android.gms.internal.ads.zzazc r0 = new com.google.android.gms.internal.ads.zzazc
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzD()
            long r10 = r2.elapsedRealtime()
            android.os.PowerManager r2 = r1.zzg
            boolean r19 = r2.isScreenOn()
            if (r8 == 0) goto L_0x01ed
            boolean r2 = r8.isAttachedToWindow()
            if (r2 == 0) goto L_0x01ed
            r20 = r9
            goto L_0x01ef
        L_0x01ed:
            r20 = 0
        L_0x01ef:
            if (r8 == 0) goto L_0x01f8
            int r2 = r8.getWindowVisibility()
            r21 = r2
            goto L_0x01fa
        L_0x01f8:
            r21 = 8
        L_0x01fa:
            android.graphics.Rect r2 = r1.zzp
            android.graphics.Rect r22 = r1.zza(r2)
            android.graphics.Rect r23 = r1.zza(r4)
            android.graphics.Rect r24 = r1.zza(r5)
            android.graphics.Rect r26 = r1.zza(r6)
            android.graphics.Rect r30 = r1.zza(r7)
            android.util.DisplayMetrics r2 = r1.zzo
            float r2 = r2.density
            r31 = r2
            r16 = r0
            r17 = r10
            r25 = r13
            r27 = r14
            r32 = r3
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33)
            java.util.HashSet r2 = r1.zzn
            java.util.Iterator r2 = r2.iterator()
        L_0x0229:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0239
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.zzazd r4 = (com.google.android.gms.internal.ads.zzazd) r4
            r4.zzdr(r0)
            goto L_0x0229
        L_0x0239:
            r1.zzl = r3
        L_0x023b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaze.zzj(int):void");
    }

    private final void zzk() {
        zzs.zza.post(new zzaza(this));
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzazb(this);
            zzv.zzx().zzc(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e) {
                int i = zze.zza;
                zzo.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e) {
            int i = zze.zza;
            zzo.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            int i2 = zze.zza;
            zzo.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zza != null) {
            try {
                zzv.zzx().zzd(this.zzd, this.zza);
            } catch (IllegalStateException e3) {
                int i3 = zze.zza;
                zzo.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzv.zzp().zzw(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e5) {
                int i4 = zze.zza;
                zzo.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzk();
    }

    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzk();
    }

    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzk();
    }

    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzk();
    }

    public final void onGlobalLayout() {
        zzj(2);
        zzk();
    }

    public final void onScrollChanged() {
        zzj(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzk();
        zzm(view);
    }

    /* access modifiers changed from: package-private */
    public final Rect zza(Rect rect) {
        return new Rect(zzh(rect.left), zzh(rect.top), zzh(rect.right), zzh(rect.bottom));
    }

    public final void zzd(zzazd zzazd) {
        this.zzn.add(zzazd);
        zzj(3);
    }

    public final void zze(zzazd zzazd) {
        this.zzn.remove(zzazd);
    }

    public final void zzf() {
        this.zzk.zza(zzc);
    }

    public final void zzg(long j) {
        this.zzk.zza(j);
    }
}
