package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzfca;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzhhh;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzs {
    public static final zzfrw zza = new zzf(Looper.getMainLooper());
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final AtomicReference zzc = new AtomicReference((Object) null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    /* access modifiers changed from: private */
    public boolean zzf = true;
    private final Object zzg = new Object();
    private String zzh;
    private volatile String zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    public static final zzbr zzA(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                int i = zze.zza;
                zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e) {
            zzv.zzp().zzw(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        Context zza2 = zzbwa.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzD(String str) {
        if (!zzl.zzk()) {
            return false;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfv)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzbd.zzc().zzb(zzbde.zzfx);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzbd.zzc().zzb(zzbde.zzfw);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        KeyguardManager zzZ;
        if (context == null || (zzZ = zzZ(context)) == null || !zzZ.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = zze.zza;
            zzo.zzh("Error loading class.", th);
            zzv.zzp().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzH(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle zzaa = zzaa(context);
            String string = zzaa.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (!TextUtils.isEmpty(zzab(zzaa)) || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (RemoteException unused) {
        }
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[Catch:{ Exception -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[Catch:{ Exception -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void zzK(android.view.View r22, int r23, android.view.MotionEvent r24) {
        /*
            r0 = r22
            r1 = 2
            int[] r2 = new int[r1]
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.content.Context r4 = r22.getContext()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r6 = r4.getPackageName()     // Catch:{ Exception -> 0x00fc }
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdpm     // Catch:{ Exception -> 0x00fc }
            r5 = 0
            if (r4 == 0) goto L_0x001d
            com.google.android.gms.internal.ads.zzdpm r0 = (com.google.android.gms.internal.ads.zzdpm) r0     // Catch:{ Exception -> 0x00fc }
            android.view.View r0 = r0.getChildAt(r5)     // Catch:{ Exception -> 0x00fc }
        L_0x001d:
            boolean r4 = r0 instanceof com.google.android.gms.ads.formats.zzj     // Catch:{ Exception -> 0x00fc }
            r7 = 1
            if (r4 != 0) goto L_0x002b
            boolean r4 = r0 instanceof com.google.android.gms.ads.nativead.NativeAdView     // Catch:{ Exception -> 0x00fc }
            if (r4 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.String r4 = "UNKNOWN"
            r8 = r5
            goto L_0x002e
        L_0x002b:
            java.lang.String r4 = "NATIVE"
            r8 = r7
        L_0x002e:
            boolean r9 = r0.getLocalVisibleRect(r3)     // Catch:{ Exception -> 0x00fc }
            if (r9 == 0) goto L_0x003d
            int r9 = r3.width()     // Catch:{ Exception -> 0x00fc }
            int r3 = r3.height()     // Catch:{ Exception -> 0x00fc }
            goto L_0x003f
        L_0x003d:
            r3 = r5
            r9 = r3
        L_0x003f:
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ Exception -> 0x00fc }
            long r10 = zzx(r0)     // Catch:{ Exception -> 0x00fc }
            r0.getLocationOnScreen(r2)     // Catch:{ Exception -> 0x00fc }
            r5 = r2[r5]     // Catch:{ Exception -> 0x00fc }
            r2 = r2[r7]     // Catch:{ Exception -> 0x00fc }
            boolean r7 = r0 instanceof com.google.android.gms.internal.ads.zzcgj     // Catch:{ Exception -> 0x00fc }
            java.lang.String r12 = "none"
            if (r7 == 0) goto L_0x007b
            r7 = r0
            com.google.android.gms.internal.ads.zzcgj r7 = (com.google.android.gms.internal.ads.zzcgj) r7     // Catch:{ Exception -> 0x00fc }
            com.google.android.gms.internal.ads.zzfcd r7 = r7.zzR()     // Catch:{ Exception -> 0x00fc }
            if (r7 == 0) goto L_0x007b
            java.lang.String r7 = r7.zzb     // Catch:{ Exception -> 0x00fc }
            int r13 = r0.hashCode()     // Catch:{ Exception -> 0x00fc }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc }
            r14.<init>()     // Catch:{ Exception -> 0x00fc }
            r14.append(r7)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r15 = ":"
            r14.append(r15)     // Catch:{ Exception -> 0x00fc }
            r14.append(r13)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r13 = r14.toString()     // Catch:{ Exception -> 0x00fc }
            r0.setContentDescription(r13)     // Catch:{ Exception -> 0x00fc }
            r13 = r7
            goto L_0x007c
        L_0x007b:
            r13 = r12
        L_0x007c:
            boolean r7 = r0 instanceof com.google.android.gms.internal.ads.zzcex     // Catch:{ Exception -> 0x00fc }
            if (r7 == 0) goto L_0x0094
            r7 = r0
            com.google.android.gms.internal.ads.zzcex r7 = (com.google.android.gms.internal.ads.zzcex) r7     // Catch:{ Exception -> 0x00fc }
            com.google.android.gms.internal.ads.zzfca r7 = r7.zzD()     // Catch:{ Exception -> 0x00fc }
            if (r7 == 0) goto L_0x0094
            int r4 = r7.zzb     // Catch:{ Exception -> 0x00fc }
            java.lang.String r4 = com.google.android.gms.internal.ads.zzfca.zza(r4)     // Catch:{ Exception -> 0x00fc }
            int r8 = r7.zze     // Catch:{ Exception -> 0x00fc }
            java.lang.String r7 = r7.zzE     // Catch:{ Exception -> 0x00fc }
            goto L_0x0095
        L_0x0094:
            r7 = r12
        L_0x0095:
            java.util.Locale r15 = java.util.Locale.US     // Catch:{ Exception -> 0x00fc }
            java.lang.String r14 = "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>"
            int r12 = r0.hashCode()     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00fc }
            java.lang.Class r8 = r0.getClass()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r17 = r8.getName()     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00fc }
            int r5 = r0.getWidth()     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00fc }
            int r0 = r0.getHeight()     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00fc }
            java.lang.Long r21 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x00fc }
            r5 = r23
            java.lang.String r1 = java.lang.Integer.toString(r5, r1)     // Catch:{ Exception -> 0x00fc }
            r5 = r12
            r8 = r13
            r9 = r4
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r2
            r2 = r14
            r14 = r19
            r4 = r15
            r15 = r0
            r16 = r20
            r17 = r3
            r18 = r21
            r19 = r1
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}     // Catch:{ Exception -> 0x00fc }
            java.lang.String r0 = java.lang.String.format(r4, r2, r0)     // Catch:{ Exception -> 0x00fc }
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ Exception -> 0x00fc }
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)     // Catch:{ Exception -> 0x00fc }
            return
        L_0x00fc:
            r0 = move-exception
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Failure getting view location."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzK(android.view.View, int, android.view.MotionEvent):void");
    }

    public static final AlertDialog.Builder zzL(Context context) {
        zzv.zzs();
        return new AlertDialog.Builder(context, 16974374);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, (zzfjq) null, (com.google.android.gms.ads.internal.util.client.zzv) null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbfn.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final boolean zzO(zzfca zzfca) {
        return ((Boolean) zzbd.zzc().zzb(zzbde.zznJ)).booleanValue() && zzfca != null && zzfca.zze == 4;
    }

    public static final int zzP(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String concat = "Could not parse value:".concat(e.toString());
            int i = zze.zza;
            zzo.zzj(concat);
            return 0;
        }
    }

    public static final Map zzQ(Uri uri) {
        String encodedQuery;
        String str;
        if (uri == null) {
            return null;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzr)).booleanValue()) {
            HashMap hashMap = new HashMap();
            if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
                int i = 0;
                while (true) {
                    int indexOf = encodedQuery.indexOf(38, i);
                    int length = encodedQuery.length();
                    if (indexOf != -1) {
                        length = indexOf;
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > length || indexOf2 == -1) {
                        indexOf2 = length;
                    }
                    String decode = Uri.decode(encodedQuery.substring(i, indexOf2));
                    if (indexOf2 == length) {
                        str = "";
                    } else {
                        str = Uri.decode(encodedQuery.substring(indexOf2 + 1, length));
                    }
                    hashMap.put(decode, str);
                    if (indexOf == -1) {
                        break;
                    }
                    i = indexOf + 1;
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap2.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap2;
    }

    public static final int[] zzR(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return zzv();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] zzS(android.app.Activity r5) {
        /*
            android.view.Window r0 = r5.getWindow()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0021
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x0021
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r0.getTop()
            r3[r2] = r4
            int r0 = r0.getBottom()
            r3[r1] = r0
            goto L_0x0025
        L_0x0021:
            int[] r3 = zzv()
        L_0x0025:
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbb.zzb()
            r2 = r3[r2]
            int r0 = r0.zzb(r5, r2)
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbb.zzb()
            r1 = r3[r1]
            int r5 = r2.zzb(r5, r1)
            int[] r5 = new int[]{r0, r5}
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzS(android.app.Activity):int[]");
    }

    public static final boolean zzT(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = zzv.zzr().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long zzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzby)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkZ)).booleanValue()) {
                    return true;
                }
                if (zzx >= ((long) ((Integer) zzbd.zzc().zzb(zzbde.zzlb)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzU(Context context, Intent intent) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlw)).booleanValue()) {
            try {
                zzae(context, intent);
            } catch (SecurityException e) {
                int i = zze.zza;
                zzo.zzk("", e);
                zzv.zzp().zzw(e, "AdUtil.startActivityWithUnknownContext");
            }
        } else {
            zzae(context, intent);
        }
    }

    public static final void zzV(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            int i = zze.zza;
            zzo.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            int i2 = zze.zza;
            zzo.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzW(Activity activity) {
        int[] zzR = zzR(activity);
        return new int[]{zzbb.zzb().zzb(activity, zzR[0]), zzbb.zzb().zzb(activity, zzR[1])};
    }

    public static final boolean zzX(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzT(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzZ(context));
    }

    public static final void zzY(Context context, Intent intent, zzdsj zzdsj, String str) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zznx)).booleanValue() || !(context instanceof zzchc)) {
            zzU(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (!(data == null || data.toString() == null)) {
                if (data.toString().matches((String) zzbd.zzc().zzb(zzbde.zznz))) {
                    ((zzchc) context).zzc(intent, 236);
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzny)).booleanValue() && zzdsj != null) {
                        zzdsi zza2 = zzdsj.zza();
                        zza2.zzb("action", "hila");
                        zza2.zzb("gqi", zzfwg.zzc(str));
                        zza2.zzi();
                        return;
                    }
                    return;
                }
            }
            zzU(context, intent);
        } catch (ActivityNotFoundException | SecurityException e) {
            int i = zze.zza;
            zzo.zzh("Error occurred while starting activity for result", e);
            zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzU(context, intent);
        } catch (Exception e2) {
            int i2 = zze.zza;
            zzo.zzh("Error occurred while starting activity for result", e2);
            zzv.zzp().zzw(e2, "AdUtil.startActivityForResult");
            zzU(context, intent);
        }
    }

    private static KeyguardManager zzZ(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        int i2 = zze.zza;
        zzo.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static Bundle zzaa(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    private static String zzab(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    private static boolean zzac(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzad(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzae(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzaf(Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return zzr();
        }
        try {
            zzcg zza2 = zzcg.zza();
            if (TextUtils.isEmpty(zza2.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str3 = (String) zzcd.zza(context, new zzce(context));
                } else {
                    str3 = (String) zzcd.zza(context, new zzcf(GooglePlayServicesUtilLight.getRemoteContext(context), context));
                }
                zza2.zza = str3;
            }
            str2 = zza2.zza;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = zzr();
        }
        String str4 = str2 + " (Mobile; " + str;
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                str4 = str4 + ";aia";
            }
        } catch (Exception e) {
            zzv.zzp().zzw(e, "AdUtil.getUserAgent");
        }
        return str4.concat(")");
    }

    public static List zzd() {
        zzbcv zzbcv = zzbde.zza;
        List<String> zzb2 = zzbd.zza().zzb();
        ArrayList arrayList = new ArrayList();
        for (String zzd2 : zzb2) {
            for (String valueOf : zzfwe.zzb(zzfva.zzc(',')).zzd(zzd2)) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcaf.zza.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzo(android.view.View):boolean");
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final String zzq(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzab(zzaa(context));
    }

    static final String zzr() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final Map zzw(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            zzv.zzp().zzw(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final long zzx(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzv.zzr().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            int i = zze.zza;
            zzo.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzz() {
        Resources zze2 = zzv.zzp().zze();
        return zze2 != null ? zze2.getString(R.string.s7) : "Test Ad";
    }

    public final ListenableFuture zzb(Uri uri) {
        return zzgdn.zzj(new zzn(uri), this.zzl);
    }

    public final String zzc(Context context, String str) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlI)).booleanValue()) {
            synchronized (this.zzg) {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String zzaf = zzaf(context, str);
                this.zzh = zzaf;
                return zzaf;
            }
        } else if (this.zzi != null) {
            return this.zzi;
        } else {
            this.zzi = zzaf(context, str);
            return this.zzi;
        }
    }

    public final void zzg(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        int i2 = zze.zza;
        zzo.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzi(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzv.zzr();
        bundle.putString("device", zzs());
        zzbcv zzbcv = zzbde.zza;
        bundle.putString("eids", TextUtils.join(",", zzbd.zza().zza()));
        if (bundle.isEmpty()) {
            int i = zze.zza;
            zzo.zze("Empty or null bundle.");
        } else {
            String str3 = (String) zzbd.zzc().zzb(zzbde.zzkX);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new zzm(this, context, str3)));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        zzbb.zzb();
        zzf.zzB(context, str, "gmob-apps", bundle, true, new zzl(context, str));
    }

    public final boolean zzj(String str) {
        zzbcv zzbcv = zzbde.zzau;
        return zzac(str, this.zzb, (String) zzbd.zzc().zzb(zzbcv));
    }

    public final boolean zzk(String str) {
        zzbcv zzbcv = zzbde.zzav;
        return zzac(str, this.zzc, (String) zzbd.zzc().zzb(zzbcv));
    }

    public final boolean zzl(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbde.zza(context);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlv)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzr) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzr) null), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final boolean zzm(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbde.zza(context);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlv)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, (zzr) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, (zzr) null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        } else if (!(context instanceof Activity)) {
            zzad(context, uri);
            return 2;
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzeT)).booleanValue()) {
                CustomTabsIntent build = new CustomTabsIntent.Builder(zzv.zzf().zza()).build();
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzff)).booleanValue()) {
                    zzbb.zzb();
                    if (zzf.zzw()) {
                        return 5;
                    }
                }
                build.intent.setPackage(zzhhh.zza(context));
                build.launchUrl(context, uri);
                return 5;
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzeR)).booleanValue()) {
                zzbef zzbef = new zzbef();
                zzbef.zze(new zzo(this, zzbef, context, uri));
                zzbef.zzb((Activity) context);
                return 5;
            }
            zzad(context, uri);
            return 9;
        }
    }
}
