package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdv;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdwf extends zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    /* access modifiers changed from: private */
    public final zzdvt zzd;
    private final zzgdy zze;
    private zzdvi zzf;

    zzdwf(Context context, WeakReference weakReference, zzdvt zzdvt, zzdwh zzdwh, zzgdy zzgdy) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvt;
        this.zze = zzgdy;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* access modifiers changed from: private */
    public static String zzk(Object obj) {
        ResponseInfo responseInfo;
        zzea zzc2;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else if (!(obj instanceof NativeAd)) {
            return "";
        } else {
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzc2 = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc2.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzl(String str) {
        try {
            zzgdn.zzr(this.zzf.zzb(str), new zzdwd(this), this.zze);
        } catch (NullPointerException e) {
            zzv.zzp().zzw(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk();
        }
    }

    private final synchronized void zzm(String str) {
        try {
            zzgdn.zzr(this.zzf.zzb(str), new zzdwe(this), this.zze);
        } catch (NullPointerException e) {
            zzv.zzp().zzw(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk();
        }
    }

    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Map map = this.zza;
            Object obj = map.get(str);
            if (obj != null) {
                map.remove(str);
            }
            if (obj instanceof AdView) {
                zzdwh.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzdwh.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }

    public final void zzf(zzdvi zzdvi) {
        this.zzf = zzdvi;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj) {
        this.zza.put(str, obj);
        zzl(zzk(obj));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r0 == 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r0 == 1) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r0 == 2) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r0 == 3) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r0 == 4) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        if (r0 == 5) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = r8.zze();
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load(zzj(), r0, r8.zza(), new com.google.android.gms.internal.ads.zzdwb(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = r8.zze();
        com.google.android.gms.ads.rewarded.RewardedAd.load(zzj(), r0, r8.zza(), new com.google.android.gms.internal.ads.zzdwa(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = r8.zze();
        r1 = new com.google.android.gms.ads.AdLoader.Builder(zzj(), r0);
        r1.forNativeAd(new com.google.android.gms.internal.ads.zzdvw(r7, r0));
        r1.withAdListener(new com.google.android.gms.internal.ads.zzdwc(r7));
        r0 = r8.zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzjP)).booleanValue() == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r0 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r1.withNativeAdOptions(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        r1.build().loadAd(r8.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0 = r8.zze();
        com.google.android.gms.ads.interstitial.InterstitialAd.load(zzj(), r0, r8.zza(), new com.google.android.gms.internal.ads.zzdvz(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0 = r8.zze();
        r1 = com.google.android.gms.internal.ads.zzbde.zzjP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(r1)).booleanValue() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        if (r8.zzn() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0100, code lost:
        r2 = new com.google.android.gms.ads.admanager.AdManagerAdView(zzj());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        r2 = new com.google.android.gms.ads.AdView(zzj());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0113, code lost:
        r2.setAdSize(r8.zzb());
        r2.setAdUnitId(r0);
        r2.setAdListener(new com.google.android.gms.internal.ads.zzdvy(r7, r0, r2));
        r0 = r8.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(r1)).booleanValue() == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        if (r8.zzn() == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        if (r0 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        r2.setVideoOptions(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0147, code lost:
        r2.loadAd(r8.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r0 = r8.zze();
        com.google.android.gms.ads.appopen.AppOpenAd.load(zzj(), r0, r8.zza(), new com.google.android.gms.internal.ads.zzdvx(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0165, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzdwg r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r8.zzf()     // Catch:{ all -> 0x0166 }
            int r1 = r0.hashCode()     // Catch:{ all -> 0x0166 }
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1999289321: goto L_0x0044;
                case -1372958932: goto L_0x003a;
                case -428325382: goto L_0x0030;
                case 543046670: goto L_0x0026;
                case 1854800829: goto L_0x001c;
                case 1951953708: goto L_0x0012;
                default: goto L_0x0011;
            }     // Catch:{ all -> 0x0166 }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x004e
            r0 = r6
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "REWARDED_INTERSTITIAL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x004e
            r0 = r2
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x004e
            r0 = r3
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "APP_OPEN_AD"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x004e
            r0 = 0
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x004e
            r0 = r5
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x004e
            r0 = r4
            goto L_0x004f
        L_0x004e:
            r0 = -1
        L_0x004f:
            if (r0 == 0) goto L_0x0150
            if (r0 == r6) goto L_0x00e4
            if (r0 == r5) goto L_0x00ce
            if (r0 == r4) goto L_0x0089
            if (r0 == r3) goto L_0x0073
            if (r0 == r2) goto L_0x005d
            monitor-exit(r7)
            return
        L_0x005d:
            java.lang.String r0 = r8.zze()     // Catch:{ all -> 0x0166 }
            android.content.Context r1 = r7.zzj()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.AdRequest r8 = r8.zza()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdwb r2 = new com.google.android.gms.internal.ads.zzdwb     // Catch:{ all -> 0x0166 }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load(r1, r0, r8, r2)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)
            return
        L_0x0073:
            java.lang.String r0 = r8.zze()     // Catch:{ all -> 0x0166 }
            android.content.Context r1 = r7.zzj()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.AdRequest r8 = r8.zza()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdwa r2 = new com.google.android.gms.internal.ads.zzdwa     // Catch:{ all -> 0x0166 }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.rewarded.RewardedAd.load(r1, r0, r8, r2)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)
            return
        L_0x0089:
            java.lang.String r0 = r8.zze()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.AdLoader$Builder r1 = new com.google.android.gms.ads.AdLoader$Builder     // Catch:{ all -> 0x0166 }
            android.content.Context r2 = r7.zzj()     // Catch:{ all -> 0x0166 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdvw r2 = new com.google.android.gms.internal.ads.zzdvw     // Catch:{ all -> 0x0166 }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x0166 }
            r1.forNativeAd(r2)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdwc r0 = new com.google.android.gms.internal.ads.zzdwc     // Catch:{ all -> 0x0166 }
            r0.<init>(r7)     // Catch:{ all -> 0x0166 }
            r1.withAdListener(r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.nativead.NativeAdOptions r0 = r8.zzd()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzjP     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0166 }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ all -> 0x0166 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0166 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            r1.withNativeAdOptions(r0)     // Catch:{ all -> 0x0166 }
        L_0x00c1:
            com.google.android.gms.ads.AdLoader r0 = r1.build()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.AdRequest r8 = r8.zza()     // Catch:{ all -> 0x0166 }
            r0.loadAd(r8)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)
            return
        L_0x00ce:
            java.lang.String r0 = r8.zze()     // Catch:{ all -> 0x0166 }
            android.content.Context r1 = r7.zzj()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.AdRequest r8 = r8.zza()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdvz r2 = new com.google.android.gms.internal.ads.zzdvz     // Catch:{ all -> 0x0166 }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.interstitial.InterstitialAd.load(r1, r0, r8, r2)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)
            return
        L_0x00e4:
            java.lang.String r0 = r8.zze()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzjP     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0166 }
            java.lang.Object r2 = r2.zzb(r1)     // Catch:{ all -> 0x0166 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0166 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x010a
            boolean r2 = r8.zzn()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x010a
            com.google.android.gms.ads.admanager.AdManagerAdView r2 = new com.google.android.gms.ads.admanager.AdManagerAdView     // Catch:{ all -> 0x0166 }
            android.content.Context r3 = r7.zzj()     // Catch:{ all -> 0x0166 }
            r2.<init>(r3)     // Catch:{ all -> 0x0166 }
            goto L_0x0113
        L_0x010a:
            com.google.android.gms.ads.AdView r2 = new com.google.android.gms.ads.AdView     // Catch:{ all -> 0x0166 }
            android.content.Context r3 = r7.zzj()     // Catch:{ all -> 0x0166 }
            r2.<init>(r3)     // Catch:{ all -> 0x0166 }
        L_0x0113:
            com.google.android.gms.ads.AdSize r3 = r8.zzb()     // Catch:{ all -> 0x0166 }
            r2.setAdSize(r3)     // Catch:{ all -> 0x0166 }
            r2.setAdUnitId(r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdvy r3 = new com.google.android.gms.internal.ads.zzdvy     // Catch:{ all -> 0x0166 }
            r3.<init>(r7, r0, r2)     // Catch:{ all -> 0x0166 }
            r2.setAdListener(r3)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.VideoOptions r0 = r8.zzc()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0166 }
            java.lang.Object r1 = r3.zzb(r1)     // Catch:{ all -> 0x0166 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0166 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0147
            boolean r1 = r8.zzn()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            r1 = r2
            com.google.android.gms.ads.admanager.AdManagerAdView r1 = (com.google.android.gms.ads.admanager.AdManagerAdView) r1     // Catch:{ all -> 0x0166 }
            r1.setVideoOptions(r0)     // Catch:{ all -> 0x0166 }
        L_0x0147:
            com.google.android.gms.ads.AdRequest r8 = r8.zza()     // Catch:{ all -> 0x0166 }
            r2.loadAd(r8)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)
            return
        L_0x0150:
            java.lang.String r0 = r8.zze()     // Catch:{ all -> 0x0166 }
            android.content.Context r1 = r7.zzj()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.AdRequest r8 = r8.zza()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.zzdvx r2 = new com.google.android.gms.internal.ads.zzdvx     // Catch:{ all -> 0x0166 }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.ads.appopen.AppOpenAd.load(r1, r0, r8, r2)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)
            return
        L_0x0166:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwf.zzh(com.google.android.gms.internal.ads.zzdwg):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzi(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdvt r0 = r5.zzd     // Catch:{ all -> 0x00aa }
            android.app.Activity r0 = r0.zzg()     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x000b
            goto L_0x00a8
        L_0x000b:
            java.util.Map r1 = r5.zza     // Catch:{ all -> 0x00aa }
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzjO     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00aa }
            java.lang.Object r4 = r4.zzb(r3)     // Catch:{ all -> 0x00aa }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00aa }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00aa }
            if (r4 == 0) goto L_0x0035
            boolean r4 = r2 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch:{ all -> 0x00aa }
            if (r4 != 0) goto L_0x0035
            boolean r4 = r2 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x00aa }
            if (r4 != 0) goto L_0x0035
            boolean r4 = r2 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch:{ all -> 0x00aa }
            if (r4 != 0) goto L_0x0035
            boolean r4 = r2 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch:{ all -> 0x00aa }
            if (r4 == 0) goto L_0x0038
        L_0x0035:
            r1.remove(r6)     // Catch:{ all -> 0x00aa }
        L_0x0038:
            java.lang.String r1 = zzk(r2)     // Catch:{ all -> 0x00aa }
            r5.zzm(r1)     // Catch:{ all -> 0x00aa }
            boolean r1 = r2 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x004a
            com.google.android.gms.ads.appopen.AppOpenAd r2 = (com.google.android.gms.ads.appopen.AppOpenAd) r2     // Catch:{ all -> 0x00aa }
            r2.show(r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r5)
            return
        L_0x004a:
            boolean r1 = r2 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0055
            com.google.android.gms.ads.interstitial.InterstitialAd r2 = (com.google.android.gms.ads.interstitial.InterstitialAd) r2     // Catch:{ all -> 0x00aa }
            r2.show(r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r5)
            return
        L_0x0055:
            boolean r1 = r2 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.ads.rewarded.RewardedAd r2 = (com.google.android.gms.ads.rewarded.RewardedAd) r2     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzdvu r6 = new com.google.android.gms.internal.ads.zzdvu     // Catch:{ all -> 0x00aa }
            r6.<init>()     // Catch:{ all -> 0x00aa }
            r2.show(r0, r6)     // Catch:{ all -> 0x00aa }
            monitor-exit(r5)
            return
        L_0x0065:
            boolean r1 = r2 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0075
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd r2 = (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) r2     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzdvv r6 = new com.google.android.gms.internal.ads.zzdvv     // Catch:{ all -> 0x00aa }
            r6.<init>()     // Catch:{ all -> 0x00aa }
            r2.show(r0, r6)     // Catch:{ all -> 0x00aa }
            monitor-exit(r5)
            return
        L_0x0075:
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = r0.zzb(r3)     // Catch:{ all -> 0x00aa }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00aa }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r2 instanceof com.google.android.gms.ads.AdView     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x008d
            boolean r0 = r2 instanceof com.google.android.gms.ads.nativead.NativeAd     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a8
        L_0x008d:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00aa }
            r0.<init>()     // Catch:{ all -> 0x00aa }
            android.content.Context r1 = r5.zzj()     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r0.setClassName(r1, r2)     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "adUnit"
            r0.putExtra(r2, r6)     // Catch:{ all -> 0x00aa }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x00aa }
            com.google.android.gms.ads.internal.util.zzs.zzU(r1, r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r5)
            return
        L_0x00a8:
            monitor-exit(r5)
            return
        L_0x00aa:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00aa }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwf.zzi(java.lang.String):void");
    }
}
