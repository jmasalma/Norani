package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.preload.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzfwg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzey {
    public static final Set zza = new HashSet(Arrays.asList(new AdFormat[]{AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED}));
    private static zzey zzb;
    private zzep zzc;
    private zzfc zzd;
    private zzeo zze;
    /* access modifiers changed from: private */
    public final Object zzf = new Object();
    private final Object zzg = new Object();
    /* access modifiers changed from: private */
    public final ArrayList zzh = new ArrayList();
    /* access modifiers changed from: private */
    public boolean zzi = false;
    /* access modifiers changed from: private */
    public boolean zzj = false;
    private final Object zzk = new Object();
    private zzdb zzl;
    /* access modifiers changed from: private */
    public OnAdInspectorClosedListener zzm = null;
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();

    private zzey() {
    }

    /* access modifiers changed from: private */
    public static InitializationStatus zzA(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbmd zzbmd = (zzbmd) it.next();
            hashMap.put(zzbmd.zza, new zzbml(zzbmd.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbmd.zzd, zzbmd.zzc));
        }
        return new zzbmm(hashMap);
    }

    private final void zzB(String str) {
        try {
            this.zzl.zzk();
            this.zzl.zzl((String) null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzo.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzC(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzdb) new zzau(zzbb.zza(), context).zzd(context, false);
        }
    }

    private final void zzD(RequestConfiguration requestConfiguration) {
        try {
            this.zzl.zzu(new zzfx(requestConfiguration));
        } catch (RemoteException e) {
            zzo.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzey zzf() {
        zzey zzey;
        synchronized (zzey.class) {
            if (zzb == null) {
                zzb = new zzey();
            }
            zzey = zzb;
        }
        return zzey;
    }

    public static /* synthetic */ void zzl(zzey zzey, String str) {
        synchronized (zzey.zzk) {
            zzey.zzB((String) null);
        }
    }

    public static /* synthetic */ void zzm(zzey zzey, String str) {
        synchronized (zzey.zzk) {
            zzey.zzB((String) null);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzn;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzA;
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzA = zzA(this.zzl.zzg());
            } catch (RemoteException unused) {
                zzo.zzg("Unable to get Initialization status.");
                return new zzeq(this);
            }
        }
        return zzA;
    }

    public final zzb zzg(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return this.zzc;
        }
        if (ordinal == 2) {
            return this.zzd;
        }
        if (ordinal != 5) {
            return null;
        }
        return this.zze;
    }

    public final Status zzh(Context context, List list, PreloadCallback preloadCallback) {
        boolean z;
        Status status;
        zzbde.zza(context);
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String str = String.valueOf(preloadConfiguration.getAdFormat()) + "#" + preloadConfiguration.getAdUnitId();
            hashMap.put(str, Integer.valueOf(((Integer) zzf.zzi(hashMap, str, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                    hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (!zza.contains(preloadConfiguration2.getAdFormat())) {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(String.valueOf(preloadConfiguration2.getAdFormat()))));
            } else {
                hashMap2.put(adFormat, Integer.valueOf(((Integer) zzf.zzi(hashMap2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", new Object[]{15, adFormat.name()}));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", new Object[]{adFormat.name()}));
                }
            }
            z = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put(AdFormat.APP_OPEN_AD, (Integer) zzbd.zzc().zzb(zzbde.zzeO));
        enumMap.put(AdFormat.INTERSTITIAL, (Integer) zzbd.zzc().zzb(zzbde.zzeM));
        enumMap.put(AdFormat.REWARDED, (Integer) zzbd.zzc().zzb(zzbde.zzeN));
        for (Map.Entry entry : hashMap2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int intValue = ((Integer) entry.getValue()).intValue();
            int intValue2 = ((Integer) zzf.zzi(enumMap, adFormat2, 0)).intValue();
            if (intValue > intValue2) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", new Object[]{Integer.valueOf(intValue2), adFormat2.name()}));
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String sb2 = sb.toString();
            zzo.zzg(sb2);
            status = new Status(13, sb2);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(zzf.zze(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zzp(arrayList, new zzet(this, preloadCallback));
            } catch (RemoteException e) {
                zzo.zzh("Unable to start preload.", e);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final String zzj() {
        String zzc2;
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc2 = zzfwg.zzc(this.zzl.zzf());
            } catch (RemoteException e) {
                zzo.zzh("Unable to get internal version.", e);
                return "";
            }
        }
        return zzc2;
    }

    public final void zzp(Context context) {
        synchronized (this.zzk) {
            zzC(context);
            try {
                this.zzl.zzi();
            } catch (RemoteException unused) {
                zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r3 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r4 = r2.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        zzC(r3);
        r2.zzl.zzs(new com.google.android.gms.ads.internal.client.zzew(r2, (com.google.android.gms.ads.internal.client.zzex) null));
        r2.zzl.zzo(new com.google.android.gms.internal.ads.zzbpm());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2.zzn.getTagForChildDirectedTreatment() != -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r2.zzn.getTagForUnderAgeOfConsent() == -1) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        zzD(r2.zzn);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        throw new java.lang.IllegalArgumentException("Context cannot be null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzq(android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            r2 = this;
            java.lang.Object r4 = r2.zzf
            monitor-enter(r4)
            boolean r0 = r2.zzi     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0010
            if (r5 == 0) goto L_0x000e
            java.util.ArrayList r3 = r2.zzh     // Catch:{ all -> 0x00ee }
            r3.add(r5)     // Catch:{ all -> 0x00ee }
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            return
        L_0x0010:
            boolean r0 = r2.zzj     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x001f
            if (r5 == 0) goto L_0x001d
            com.google.android.gms.ads.initialization.InitializationStatus r3 = r2.zze()     // Catch:{ all -> 0x00ee }
            r5.onInitializationComplete(r3)     // Catch:{ all -> 0x00ee }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            return
        L_0x001f:
            r0 = 1
            r2.zzi = r0     // Catch:{ all -> 0x00ee }
            if (r5 == 0) goto L_0x0029
            java.util.ArrayList r0 = r2.zzh     // Catch:{ all -> 0x00ee }
            r0.add(r5)     // Catch:{ all -> 0x00ee }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x00e6
            java.lang.Object r4 = r2.zzk
            monitor-enter(r4)
            r5 = 0
            r2.zzC(r3)     // Catch:{ RemoteException -> 0x0061 }
            com.google.android.gms.ads.internal.client.zzdb r0 = r2.zzl     // Catch:{ RemoteException -> 0x0061 }
            com.google.android.gms.ads.internal.client.zzew r1 = new com.google.android.gms.ads.internal.client.zzew     // Catch:{ RemoteException -> 0x0061 }
            r1.<init>(r2, r5)     // Catch:{ RemoteException -> 0x0061 }
            r0.zzs(r1)     // Catch:{ RemoteException -> 0x0061 }
            com.google.android.gms.ads.internal.client.zzdb r0 = r2.zzl     // Catch:{ RemoteException -> 0x0061 }
            com.google.android.gms.internal.ads.zzbpm r1 = new com.google.android.gms.internal.ads.zzbpm     // Catch:{ RemoteException -> 0x0061 }
            r1.<init>()     // Catch:{ RemoteException -> 0x0061 }
            r0.zzo(r1)     // Catch:{ RemoteException -> 0x0061 }
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzn     // Catch:{ RemoteException -> 0x0061 }
            int r0 = r0.getTagForChildDirectedTreatment()     // Catch:{ RemoteException -> 0x0061 }
            r1 = -1
            if (r0 != r1) goto L_0x0058
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzn     // Catch:{ RemoteException -> 0x0061 }
            int r0 = r0.getTagForUnderAgeOfConsent()     // Catch:{ RemoteException -> 0x0061 }
            if (r0 == r1) goto L_0x0067
        L_0x0058:
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzn     // Catch:{ RemoteException -> 0x0061 }
            r2.zzD(r0)     // Catch:{ RemoteException -> 0x0061 }
            goto L_0x0067
        L_0x005e:
            r3 = move-exception
            goto L_0x00e4
        L_0x0061:
            r0 = move-exception
            java.lang.String r1 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r1, r0)     // Catch:{ all -> 0x005e }
        L_0x0067:
            com.google.android.gms.internal.ads.zzbde.zza(r3)     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfc.zza     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlD     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "Initializing on bg thread"
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ all -> 0x005e }
            java.util.concurrent.ThreadPoolExecutor r0 = com.google.android.gms.ads.internal.util.client.zzb.zza     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.zzer r1 = new com.google.android.gms.ads.internal.client.zzer     // Catch:{ all -> 0x005e }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x005e }
            r0.execute(r1)     // Catch:{ all -> 0x005e }
            goto L_0x00cd
        L_0x009a:
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfc.zzb     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x00c5
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlD     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x00c5
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.zzes r1 = new com.google.android.gms.ads.internal.client.zzes     // Catch:{ all -> 0x005e }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x005e }
            r0.execute(r1)     // Catch:{ all -> 0x005e }
            goto L_0x00cd
        L_0x00c5:
            java.lang.String r0 = "Initializing on calling thread"
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ all -> 0x005e }
            r2.zzB(r5)     // Catch:{ all -> 0x005e }
        L_0x00cd:
            com.google.android.gms.ads.internal.client.zzep r5 = new com.google.android.gms.ads.internal.client.zzep     // Catch:{ all -> 0x005e }
            r5.<init>(r3)     // Catch:{ all -> 0x005e }
            r2.zzc = r5     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.zzfc r5 = new com.google.android.gms.ads.internal.client.zzfc     // Catch:{ all -> 0x005e }
            r5.<init>(r3)     // Catch:{ all -> 0x005e }
            r2.zzd = r5     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.zzeo r5 = new com.google.android.gms.ads.internal.client.zzeo     // Catch:{ all -> 0x005e }
            r5.<init>(r3)     // Catch:{ all -> 0x005e }
            r2.zze = r5     // Catch:{ all -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            return
        L_0x00e4:
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            throw r3
        L_0x00e6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null."
            r3.<init>(r4)
            throw r3
        L_0x00ee:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzey.zzq(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            zzC(context);
            this.zzm = onAdInspectorClosedListener;
            try {
                this.zzl.zzm(new zzev((zzex) null));
            } catch (RemoteException unused) {
                zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzl.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzo.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.zzk) {
            try {
                this.zzl.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzo.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzu(boolean z) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzl.zzp(z);
            } catch (RemoteException e) {
                zzo.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzv(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzl.zzq(f);
            } catch (RemoteException e) {
                zzo.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzl.zzt(str);
            } catch (RemoteException e) {
                zzo.zzh("Unable to set plugin.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzx(com.google.android.gms.ads.RequestConfiguration r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r4.zzk
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.zzn     // Catch:{ all -> 0x0030 }
            r4.zzn = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.ads.internal.client.zzdb r2 = r4.zzl     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            int r3 = r5.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            int r2 = r5.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.zzD(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzey.zzx(com.google.android.gms.ads.RequestConfiguration):void");
    }

    public final boolean zzz(boolean z) {
        String str;
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzl.zzj(z);
            } catch (RemoteException e) {
                if (z) {
                    str = "enable";
                } else {
                    str = "disable";
                }
                zzo.zzh("Unable to " + str + " the publisher first-party ID.", e);
                return false;
            }
        }
        return true;
    }

    public final float zza() {
        float f;
        synchronized (this.zzk) {
            zzdb zzdb = this.zzl;
            f = 1.0f;
            if (zzdb == null) {
                return 1.0f;
            }
            try {
                f = zzdb.zze();
            } catch (RemoteException e) {
                zzo.zzh("Unable to get app volume.", e);
            }
        }
        return f;
    }

    public final boolean zzy() {
        boolean z;
        synchronized (this.zzk) {
            zzdb zzdb = this.zzl;
            z = false;
            if (zzdb == null) {
                return false;
            }
            try {
                z = zzdb.zzv();
            } catch (RemoteException e) {
                zzo.zzh("Unable to get app mute state.", e);
            }
        }
        return z;
    }
}
