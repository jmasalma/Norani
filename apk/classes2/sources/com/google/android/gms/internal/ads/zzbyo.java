package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyo {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final Object zzc = new Object();
    private String zzd = null;
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference((Object) null);
    private final AtomicReference zzg = new AtomicReference((Object) null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final Object zzi = new Object();

    public static /* synthetic */ String zza(zzbyo zzbyo, Context context) {
        return (String) zzbyo.zzs("getAppInstanceId", context);
    }

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean zzr(Context context) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzaB)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, "com.google.android.gms.ads.dynamite") < ((Integer) zzbd.zzc().zzb(zzbde.zzaC)).intValue()) {
            return false;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzaD)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzs(String str, Context context) {
        AtomicReference atomicReference = this.zzf;
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final Method zzt(Context context, String str) {
        ConcurrentMap concurrentMap = this.zzh;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method method = (Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    concurrentMap.put(str2, method);
                } catch (Exception unused) {
                    zzw(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzf.get(), new Object[]{str});
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final void zzv(Context context, String str, String str2, Bundle bundle) {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                int i = zze.zza;
                zzo.zzh("Invalid event ID: ".concat(valueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                ConcurrentMap concurrentMap = this.zzh;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.zza;
        if (!atomicBoolean.get()) {
            int i = zze.zza;
            zzo.zzj("Invoke Firebase method " + str + " error.");
            if (z) {
                zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                atomicBoolean.set(true);
            }
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbyl.zza(atomicReference, (Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                zzw("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final String zzb(Context context) {
        Object zzs;
        if (zzp(context) && (zzs = zzs("generateEventId", context)) != null) {
            return zzs.toString();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc(android.content.Context r14) {
        /*
            r13 = this;
            boolean r0 = r13.zzp(r14)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzaz
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r14 = r13.zzs(r0, r14)
            java.lang.String r14 = (java.lang.String) r14
            return r14
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference r0 = r13.zzb
            java.lang.Object r4 = r0.get()
            if (r4 != 0) goto L_0x0089
            boolean r4 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r4 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzfrs r4 = com.google.android.gms.internal.ads.zzfrv.zza()
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzaA
            com.google.android.gms.internal.ads.zzbdc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.google.android.gms.internal.ads.zzbyn r6 = new com.google.android.gms.internal.ads.zzbyn
            r6.<init>(r13)
            r7 = 2
            java.util.concurrent.ExecutorService r4 = r4.zzc(r5, r6, r7)
            goto L_0x0086
        L_0x0054:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzaA
            com.google.android.gms.internal.ads.zzbdc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r6.zzb(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r7.zzb(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r7 = r5.intValue()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r11 = new java.util.concurrent.LinkedBlockingQueue
            r11.<init>()
            com.google.android.gms.internal.ads.zzbyn r12 = new com.google.android.gms.internal.ads.zzbyn
            r12.<init>(r13)
            r8 = 1
            r5 = r4
            r5.<init>(r6, r7, r8, r10, r11, r12)
        L_0x0086:
            com.google.android.gms.internal.ads.zzbyl.zza(r0, r1, r4)
        L_0x0089:
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.google.android.gms.internal.ads.zzbym r4 = new com.google.android.gms.internal.ads.zzbym
            r4.<init>(r13, r14)
            java.util.concurrent.Future r14 = r0.submit(r4)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x00a2, Exception -> 0x00a1 }
            java.lang.Object r14 = r14.get(r2, r0)     // Catch:{ TimeoutException -> 0x00a2, Exception -> 0x00a1 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ TimeoutException -> 0x00a2, Exception -> 0x00a1 }
            return r14
        L_0x00a1:
            return r1
        L_0x00a2:
            java.lang.String r14 = "TIME_OUT"
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyo.zzc(android.content.Context):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzd(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r7.zzp(r8)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            goto L_0x0044
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference r1 = r7.zzf
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurement"
            r4 = 1
            boolean r3 = r7.zzx(r8, r3, r1, r4)
            if (r3 == 0) goto L_0x0044
            r3 = 0
            java.lang.reflect.Method r4 = r7.zzt(r8, r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r1.get()     // Catch:{ Exception -> 0x0041 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0041 }
            if (r4 != 0) goto L_0x003c
            java.lang.String r4 = "getCurrentScreenClass"
            java.lang.reflect.Method r8 = r7.zzt(r8, r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0041 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r8 = r8.invoke(r1, r4)     // Catch:{ Exception -> 0x0041 }
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0041 }
        L_0x003c:
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r4
        L_0x0040:
            return r2
        L_0x0041:
            r7.zzw(r0, r3)
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyo.zzd(android.content.Context):java.lang.String");
    }

    public final String zze(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            String str2 = (String) zzs("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    public final void zzf(Context context, String str) {
        if (zzp(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(Context context, String str) {
        if (zzp(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(Context context, String str) {
        zzv(context, "_aa", str, (Bundle) null);
    }

    public final void zzi(Context context, String str) {
        zzv(context, "_aq", str, (Bundle) null);
    }

    public final void zzj(Context context, String str, Map map) {
        zzv(context, "_ac", str, zzq(map));
    }

    public final void zzk(Context context, String str, Map map) {
        zzv(context, "_ai", str, zzq(map));
    }

    public final void zzl(Context context, String str, String str2, String str3, int i) {
        if (zzp(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzv(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzm(Context context, zzm zzm) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzaG)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(Context context, zzfx zzfx) {
        zzbyp.zzb(context).zza().zzc(zzfx);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzaG)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method method = (Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, String.class, String.class});
                    concurrentMap.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzat)).booleanValue() && !this.zza.get()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzaE)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.zze;
            if (atomicInteger.get() == -1) {
                zzbb.zzb();
                if (!zzf.zzx(context, 12451000)) {
                    zzbb.zzb();
                    if (zzf.zzy(context)) {
                        int i = zze.zza;
                        zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
