package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbqr extends zzbps {
    /* access modifiers changed from: private */
    public final Object zza;
    private zzbqt zzb;
    private zzbwn zzc;
    private IObjectWrapper zzd;
    /* access modifiers changed from: private */
    public View zze;
    /* access modifiers changed from: private */
    public MediationInterstitialAd zzf;
    /* access modifiers changed from: private */
    public UnifiedNativeAdMapper zzg;
    /* access modifiers changed from: private */
    public NativeAdMapper zzh;
    /* access modifiers changed from: private */
    public MediationRewardedAd zzi;
    /* access modifiers changed from: private */
    public MediationInterscrollerAd zzj;
    /* access modifiers changed from: private */
    public MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbqr(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(zzm zzm) {
        Bundle bundle;
        Bundle bundle2 = zzm.zzm;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private final Bundle zzW(String str, zzm zzm, String str2) throws RemoteException {
        zzo.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzm != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzm.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzo.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(zzm zzm) {
        if (zzm.zzf) {
            return true;
        }
        zzbb.zzb();
        return zzf.zzw();
    }

    private static final String zzY(String str, zzm zzm) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzm.zzu;
        }
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        zzm zzm2 = zzm;
        String str2 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzo.zze("Requesting rewarded ad from adapter.");
            try {
                zzbqp zzbqp = new zzbqp(this, zzbpw);
                Bundle zzW = zzW(str2, zzm2, (String) null);
                Bundle zzV = zzV(zzm2);
                boolean zzX = zzX(zzm);
                Location location = zzm2.zzk;
                int i = zzm2.zzg;
                int i2 = zzm2.zzt;
                String zzY = zzY(str2, zzm2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW, zzV, zzX, location, i, i2, zzY, "");
                ((Adapter) obj).loadRewardedAd(mediationRewardedAdConfiguration, zzbqp);
            } catch (Exception e) {
                zzo.zzh("", e);
                zzbpn.zza(iObjectWrapper, e, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzB(zzm zzm, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzm, str, new zzbqu((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        zzm zzm2 = zzm;
        String str2 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzo.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbqp zzbqp = new zzbqp(this, zzbpw);
                Bundle zzW = zzW(str2, zzm2, (String) null);
                Bundle zzV = zzV(zzm2);
                boolean zzX = zzX(zzm);
                Location location = zzm2.zzk;
                int i = zzm2.zzg;
                int i2 = zzm2.zzt;
                String zzY = zzY(str2, zzm2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW, zzV, zzX, location, i, i2, zzY, "");
                ((Adapter) obj).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, zzbqp);
            } catch (Exception e) {
                zzbpn.zza(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                zzo.zzh("", th);
            }
        } else {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
        }
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzo.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzk;
            if (mediationAppOpenAd != null) {
                try {
                    mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                } catch (RuntimeException e) {
                    zzbpn.zza(iObjectWrapper, e, "adapter.appOpen.showAd");
                    throw e;
                }
            } else {
                zzo.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            zzo.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzI();
        } else {
            zzo.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                try {
                    mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                } catch (RuntimeException e) {
                    zzbpn.zza(iObjectWrapper, e, "adapter.interstitial.showAd");
                    throw e;
                }
            } else {
                zzo.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzo.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                } catch (RuntimeException e) {
                    zzbpn.zza(iObjectWrapper, e, "adapter.rewarded.showAd");
                    throw e;
                }
            } else {
                zzo.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                } catch (RuntimeException e) {
                    zzbpn.zza(this.zzd, e, "adapter.showVideo");
                    throw e;
                }
            } else {
                zzo.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final boolean zzM() {
        return false;
    }

    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final zzbqb zzO() {
        return null;
    }

    public final zzbqc zzP() {
        return null;
    }

    public final Bundle zze() {
        return new Bundle();
    }

    public final Bundle zzf() {
        return new Bundle();
    }

    public final Bundle zzg() {
        return new Bundle();
    }

    public final zzed zzh() {
        Object obj = this.zza;
        if (obj instanceof zza) {
            try {
                return ((zza) obj).getVideoController();
            } catch (Throwable th) {
                zzo.zzh("", th);
            }
        }
        return null;
    }

    public final zzbhj zzi() {
        zzbqt zzbqt = this.zzb;
        if (zzbqt == null) {
            return null;
        }
        zzbhk zzc2 = zzbqt.zzc();
        if (!(zzc2 instanceof zzbhk)) {
            return null;
        }
        zzbhk zzbhk = zzc2;
        return zzc2.zza();
    }

    public final zzbpz zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbqs(mediationInterscrollerAd);
        }
        return null;
    }

    public final zzbqf zzk() {
        UnifiedNativeAdMapper zza2;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbqt zzbqt = this.zzb;
            if (zzbqt == null || (zza2 = zzbqt.zza()) == null) {
                return null;
            }
            return new zzbqx(zza2);
        } else if (!(obj instanceof Adapter)) {
            return null;
        } else {
            NativeAdMapper nativeAdMapper = this.zzh;
            if (nativeAdMapper != null) {
                return new zzbqv(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
            if (unifiedNativeAdMapper != null) {
                return new zzbqx(unifiedNativeAdMapper);
            }
            return null;
        }
    }

    public final zzbse zzl() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbse.zza(((Adapter) obj).getVersionInfo());
    }

    public final zzbse zzm() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbse.zza(((Adapter) obj).getSDKVersionInfo());
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbwn zzbwn, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbwn;
            zzbwn.zzl(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper r7, com.google.android.gms.internal.ads.zzbmh r8, java.util.List r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zza
            boolean r1 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r1 == 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzbqk r1 = new com.google.android.gms.internal.ads.zzbqk
            r1.<init>(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0014:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r9.next()
            com.google.android.gms.internal.ads.zzbmn r2 = (com.google.android.gms.internal.ads.zzbmn) r2
            java.lang.String r3 = r2.zza
            int r4 = r3.hashCode()
            switch(r4) {
                case -1396342996: goto L_0x0066;
                case -1052618729: goto L_0x005c;
                case -239580146: goto L_0x0052;
                case 604727084: goto L_0x0048;
                case 1167692200: goto L_0x003e;
                case 1778294298: goto L_0x0034;
                case 1911491517: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0070
        L_0x002a:
            java.lang.String r4 = "rewarded_interstitial"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 3
            goto L_0x0071
        L_0x0034:
            java.lang.String r4 = "app_open_ad"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 6
            goto L_0x0071
        L_0x003e:
            java.lang.String r4 = "app_open"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 5
            goto L_0x0071
        L_0x0048:
            java.lang.String r4 = "interstitial"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0052:
            java.lang.String r4 = "rewarded"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 2
            goto L_0x0071
        L_0x005c:
            java.lang.String r4 = "native"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 4
            goto L_0x0071
        L_0x0066:
            java.lang.String r4 = "banner"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            r3 = 0
            goto L_0x0071
        L_0x0070:
            r3 = -1
        L_0x0071:
            r4 = 0
            switch(r3) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0097;
                case 2: goto L_0x0094;
                case 3: goto L_0x0091;
                case 4: goto L_0x008e;
                case 5: goto L_0x008b;
                case 6: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x009c
        L_0x0076:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzmm
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x009c
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L_0x009c
        L_0x008b:
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L_0x009c
        L_0x008e:
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L_0x009c
        L_0x0091:
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L_0x009c
        L_0x0094:
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L_0x009c
        L_0x0097:
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L_0x009c
        L_0x009a:
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.BANNER
        L_0x009c:
            if (r4 == 0) goto L_0x0014
            com.google.android.gms.ads.mediation.MediationConfiguration r3 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r2 = r2.zzb
            r3.<init>(r4, r2)
            r8.add(r3)
            goto L_0x0014
        L_0x00aa:
            com.google.android.gms.ads.mediation.Adapter r0 = (com.google.android.gms.ads.mediation.Adapter) r0
            java.lang.Object r7 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r7)
            android.content.Context r7 = (android.content.Context) r7
            r0.initialize(r7, r1, r8)
            return
        L_0x00b6:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqr.zzq(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbmh, java.util.List):void");
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzbwn zzbwn, List list) throws RemoteException {
        zzo.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    public final void zzs(zzm zzm, String str) throws RemoteException {
        zzB(zzm, str, (String) null);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        zzm zzm2 = zzm;
        String str2 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzo.zze("Requesting app open ad from adapter.");
            try {
                zzbqq zzbqq = new zzbqq(this, zzbpw);
                Bundle zzW = zzW(str2, zzm2, (String) null);
                Bundle zzV = zzV(zzm2);
                boolean zzX = zzX(zzm);
                Location location = zzm2.zzk;
                int i = zzm2.zzg;
                int i2 = zzm2.zzt;
                String zzY = zzY(str2, zzm2);
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = r5;
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW, zzV, zzX, location, i, i2, zzY, "");
                ((Adapter) obj).loadAppOpenAd(mediationAppOpenAdConfiguration, zzbqq);
            } catch (Exception e) {
                zzo.zzh("", e);
                zzbpn.zza(iObjectWrapper, e, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzr zzr, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        zzv(iObjectWrapper, zzr, zzm, str, (String) null, zzbpw);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzr zzr, zzm zzm, String str, String str2, zzbpw zzbpw) throws RemoteException {
        AdSize adSize;
        String str3;
        Date date;
        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        zzr zzr2 = zzr;
        zzm zzm2 = zzm;
        String str4 = str;
        String str5 = str2;
        zzbpw zzbpw2 = zzbpw;
        Object obj = this.zza;
        boolean z = obj instanceof MediationBannerAdapter;
        if (z || (obj instanceof Adapter)) {
            zzo.zze("Requesting banner ad from adapter.");
            if (zzr2.zzn) {
                adSize = zzc.zzd(zzr2.zze, zzr2.zzb);
            } else {
                adSize = zzc.zzc(zzr2.zze, zzr2.zzb, zzr2.zza);
            }
            AdSize adSize2 = adSize;
            if (z) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
                    List list = zzm2.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzm2.zzb;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbqi zzbqi = new zzbqi(date, zzm2.zzd, hashSet, zzm2.zzk, zzX(zzm), zzm2.zzg, zzm2.zzr, zzm2.zzt, zzY(str4, zzm2));
                    Bundle bundle = zzm2.zzm;
                    str3 = "";
                    try {
                        mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqt(zzbpw2), zzW(str4, zzm2, str5), adSize2, zzbqi, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                    } catch (Throwable th) {
                        th = th;
                        zzo.zzh(str3, th);
                        zzbpn.zza(iObjectWrapper2, th, "adapter.requestBannerAd");
                        throw new RemoteException();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str3 = "";
                    zzo.zzh(str3, th);
                    zzbpn.zza(iObjectWrapper2, th, "adapter.requestBannerAd");
                    throw new RemoteException();
                }
            } else {
                String str6 = "";
                Object obj2 = this.zza;
                if (obj2 instanceof Adapter) {
                    try {
                        ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str4, zzm2, str5), zzV(zzm2), zzX(zzm), zzm2.zzk, zzm2.zzg, zzm2.zzt, zzY(str4, zzm2), adSize2, this.zzl), new zzbql(this, zzbpw2));
                    } catch (Throwable th3) {
                        zzo.zzh(str6, th3);
                        zzbpn.zza(iObjectWrapper2, th3, "adapter.loadBannerAd");
                        throw new RemoteException();
                    }
                }
            }
        } else {
            zzo.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzr zzr, zzm zzm, String str, String str2, zzbpw zzbpw) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzo.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) obj;
                zzbqj zzbqj = new zzbqj(this, zzbpw, adapter);
                Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
                zzW(str, zzm, str2);
                zzV(zzm);
                zzX(zzm);
                Location location = zzm.zzk;
                int i = zzm.zzg;
                int i2 = zzm.zzt;
                zzY(str, zzm);
                zzc.zze(zzr.zze, zzr.zzb);
                zzbqj.onFailure(new AdError(7, String.valueOf(adapter.getClass().getSimpleName()).concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
            } catch (Exception e) {
                zzo.zzh("", e);
                zzbpn.zza(iObjectWrapper, e, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        zzy(iObjectWrapper, zzm, str, (String) null, zzbpw);
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzm zzm, String str, String str2, zzbpw zzbpw) throws RemoteException {
        Date date;
        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        zzm zzm2 = zzm;
        String str3 = str;
        String str4 = str2;
        zzbpw zzbpw2 = zzbpw;
        Object obj = this.zza;
        boolean z = obj instanceof MediationInterstitialAdapter;
        if (z || (obj instanceof Adapter)) {
            zzo.zze("Requesting interstitial ad from adapter.");
            if (z) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
                    List list = zzm2.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzm2.zzb;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbqi zzbqi = new zzbqi(date, zzm2.zzd, hashSet, zzm2.zzk, zzX(zzm), zzm2.zzg, zzm2.zzr, zzm2.zzt, zzY(str3, zzm2));
                    Bundle bundle = zzm2.zzm;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqt(zzbpw2), zzW(str3, zzm2, str4), zzbqi, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzo.zzh("", th);
                    zzbpn.zza(iObjectWrapper2, th, "adapter.requestInterstitialAd");
                    throw new RemoteException();
                }
            } else {
                Object obj2 = this.zza;
                if (obj2 instanceof Adapter) {
                    try {
                        ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str3, zzm2, str4), zzV(zzm2), zzX(zzm), zzm2.zzk, zzm2.zzg, zzm2.zzt, zzY(str3, zzm2), this.zzl), new zzbqm(this, zzbpw2));
                    } catch (Throwable th2) {
                        zzo.zzh("", th2);
                        zzbpn.zza(iObjectWrapper2, th2, "adapter.loadInterstitialAd");
                        throw new RemoteException();
                    }
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzm zzm, String str, String str2, zzbpw zzbpw, zzbge zzbge, List list) throws RemoteException {
        Date date;
        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        zzm zzm2 = zzm;
        String str3 = str;
        String str4 = str2;
        zzbpw zzbpw2 = zzbpw;
        Object obj = this.zza;
        boolean z = obj instanceof MediationNativeAdapter;
        if (z || (obj instanceof Adapter)) {
            zzo.zze("Requesting native ad from adapter.");
            if (z) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                    List list2 = zzm2.zze;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzm2.zzb;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbqw zzbqw = new zzbqw(date, zzm2.zzd, hashSet, zzm2.zzk, zzX(zzm), zzm2.zzg, zzbge, list, zzm2.zzr, zzm2.zzt, zzY(str3, zzm2));
                    Bundle bundle = zzm2.zzm;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzbqt(zzbpw2);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzW(str3, zzm2, str4), zzbqw, bundle2);
                } catch (Throwable th) {
                    zzo.zzh("", th);
                    zzbpn.zza(iObjectWrapper2, th, "adapter.requestNativeAd");
                    throw new RemoteException();
                }
            } else {
                Object obj2 = this.zza;
                if (obj2 instanceof Adapter) {
                    try {
                        zzbqo zzbqo = new zzbqo(this, zzbpw2);
                        Bundle zzW = zzW(str3, zzm2, str4);
                        Bundle zzV = zzV(zzm2);
                        boolean zzX = zzX(zzm);
                        Location location = zzm2.zzk;
                        int i = zzm2.zzg;
                        int i2 = zzm2.zzt;
                        String zzY = zzY(str3, zzm2);
                        MediationNativeAdConfiguration mediationNativeAdConfiguration = r9;
                        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW, zzV, zzX, location, i, i2, zzY, this.zzl, zzbge);
                        ((Adapter) obj2).loadNativeAdMapper(mediationNativeAdConfiguration, zzbqo);
                    } catch (Throwable th2) {
                        zzo.zzh("", th2);
                        zzbpn.zza(iObjectWrapper2, th2, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public zzbqr(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
