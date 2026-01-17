package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhn implements zzdjb {
    private long zzA = 0;
    private long zzB = 0;
    private zzdf zzC;
    /* access modifiers changed from: private */
    public final zzcyi zzD;
    private final zzdjv zzE;
    private final zzb zzF;
    private final Context zza;
    private final zzdje zzb;
    private final JSONObject zzc;
    private final zzdny zzd;
    private final zzdit zze;
    private final zzavu zzf;
    /* access modifiers changed from: private */
    public final zzcwq zzg;
    /* access modifiers changed from: private */
    public final zzcvw zzh;
    /* access modifiers changed from: private */
    public final zzdeb zzi;
    private final zzfca zzj;
    private final VersionInfoParcel zzk;
    private final zzfcw zzl;
    private final zzcnn zzm;
    private final zzdjz zzn;
    private final Clock zzo;
    private final zzddx zzp;
    private final zzfjy zzq;
    private final zzdpo zzr;
    private final zzfhu zzs;
    private final zzecl zzt;
    private boolean zzu = false;
    private boolean zzv;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();

    public zzdhn(Context context, zzdje zzdje, JSONObject jSONObject, zzdny zzdny, zzdit zzdit, zzavu zzavu, zzcwq zzcwq, zzcvw zzcvw, zzdeb zzdeb, zzfca zzfca, VersionInfoParcel versionInfoParcel, zzfcw zzfcw, zzcnn zzcnn, zzdjz zzdjz, Clock clock, zzddx zzddx, zzfjy zzfjy, zzfhu zzfhu, zzecl zzecl, zzdpo zzdpo, zzdjv zzdjv, zzcyi zzcyi, zzb zzb2, zzbya zzbya) {
        this.zza = context;
        this.zzb = zzdje;
        this.zzc = jSONObject;
        this.zzd = zzdny;
        this.zze = zzdit;
        this.zzf = zzavu;
        this.zzg = zzcwq;
        this.zzh = zzcvw;
        this.zzi = zzdeb;
        this.zzj = zzfca;
        this.zzk = versionInfoParcel;
        this.zzl = zzfcw;
        this.zzm = zzcnn;
        this.zzn = zzdjz;
        this.zzo = clock;
        this.zzp = zzddx;
        this.zzq = zzfjy;
        this.zzs = zzfhu;
        this.zzt = zzecl;
        this.zzr = zzdpo;
        this.zzE = zzdjv;
        this.zzD = zzcyi;
        this.zzF = zzb2;
    }

    private final String zzG(View view) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdO)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, (Activity) null);
        } catch (Exception unused) {
            int i = zze.zza;
            zzo.zzg("Exception getting data.");
            return null;
        }
    }

    private final String zzH(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc2 = this.zze.zzc();
        if (zzc2 == 1) {
            return "1099";
        }
        if (zzc2 == 2) {
            return "2099";
        }
        if (zzc2 != 6) {
            return null;
        }
        return "3099";
    }

    private final void zzI() {
        zzb zzb2;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznP)).booleanValue() && (zzb2 = this.zzF) != null) {
            zzb2.zza();
        }
    }

    private final boolean zzJ(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzK() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzL(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdO)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", zzbv.zzf(this.zza));
            if (((Boolean) zzbd.zzc().zzb(zzbde.zziY)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdhj(this, (zzdhm) null));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdhi(this, (zzdhm) null));
            }
            zzdny zzdny = this.zzd;
            zzdny.zzl("/nativeImpression", new zzdhk(this, view, (zzdhm) null));
            zzdny.zzl("/nativeImpressionFlowControl", new zzdhl(this, this.zzq, this.zzj.zzax, this.zzs, (zzdhm) null));
            zzcai.zza(zzdny.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfca zzfca = this.zzj;
            this.zzu = zzv.zzu().zzn(this.zza, this.zzk.afmaVersion, zzfca.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final void zzA(zzbig zzbig) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = zze.zza;
            zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.zzn.zzc(zzbig);
    }

    public final void zzB(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzj2 = zzbv.zzj(this.zzk.clientJarVersion);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzj2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzj2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzC(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    public final boolean zzD() {
        if (zza() == 0) {
            return true;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlW)).booleanValue()) {
            return true;
        }
        return this.zzl.zzi.zzj;
    }

    public final boolean zzE() {
        return zzK();
    }

    public final boolean zzF(Bundle bundle) {
        if (!zzJ("impression_reporting")) {
            int i = zze.zza;
            zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        String str = null;
        JSONObject zzp2 = zzbb.zzb().zzp(bundle, (JSONObject) null);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlS)).booleanValue()) {
            str = zzG((View) null);
        }
        return zzL((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, zzp2, false, (View) null);
    }

    public final int zza() {
        zzbge zzbge = this.zzl.zzi;
        if (zzbge == null) {
            return 0;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlW)).booleanValue()) {
            return 0;
        }
        return zzbge.zzi;
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd2 = zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject zzh2 = zzbv.zzh(context, view);
        JSONObject zzg2 = zzbv.zzg(view);
        JSONObject zze2 = zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd2);
            jSONObject.put("ad_view_signal", zzh2);
            jSONObject.put("scroll_view_signal", zzg2);
            jSONObject.put("lock_screen_signal", zze2);
            return jSONObject;
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    public final JSONObject zzg(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzf2 = zzf(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzK()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zzf2 != null) {
                jSONObject.put("nas", zzf2);
            }
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    public final void zzi() {
        try {
            zzdf zzdf = this.zzC;
            if (zzdf != null) {
                zzdf.zze();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    public final void zzk() {
        this.zzd.zzi();
    }

    public final void zzm(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        View view3 = view2;
        Map map3 = map;
        Context context = this.zza;
        JSONObject zzd2 = zzbv.zzd(context, map3, map2, view2, scaleType);
        JSONObject zzh2 = zzbv.zzh(context, view2);
        JSONObject zzg2 = zzbv.zzg(view2);
        JSONObject zze2 = zzbv.zze(context, view2);
        View view4 = view;
        String zzH = zzH(view, map3);
        zzp(true == ((Boolean) zzbd.zzc().zzb(zzbde.zzdV)).booleanValue() ? view3 : view4, zzh2, zzd2, zzg2, zze2, zzH, zzbv.zzc(zzH, context, this.zzz, this.zzy), (JSONObject) null, z, false);
    }

    public final void zzn(String str) {
        zzp((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzo(Bundle bundle) {
        if (bundle == null) {
            int i = zze.zza;
            zzo.zze("Click data is null. No click is reported.");
        } else if (!zzJ("click_reporting")) {
            int i2 = zze.zza;
            zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzp((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzbb.zzb().zzp(bundle, (JSONObject) null), false, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzp(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        try {
            zzI();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdje zzdje = this.zzb;
            zzdit zzdit = this.zze;
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", zzdje.zzc(zzdit.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdit.zzc());
            jSONObject9.put("view_aware_api_used", z);
            zzbge zzbge = this.zzl.zzi;
            jSONObject9.put("custom_mute_requested", zzbge != null && zzbge.zzg);
            jSONObject9.put("custom_mute_enabled", !zzdit.zzH().isEmpty() && zzdit.zzk() != null);
            if (this.zzn.zza() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzK()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            if (zzdje.zzc(zzdit.zzA()) != null) {
                z3 = true;
            }
            jSONObject9.put("has_custom_click_handler", z3);
            String str3 = null;
            try {
                JSONObject optJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zzd(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i = zze.zza;
                zzo.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjc)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjd)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                if (jSONObject11 != null) {
                    str3 = jSONObject11.getString("gws_query_id");
                }
                if (str3 != null) {
                    this.zzt.zzq(str3, this.zze);
                }
            }
            zzcai.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            int i2 = zze.zza;
            zzo.zzh("Unable to create click JSON.", e2);
        }
    }

    public final void zzq(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        View view3 = view2;
        Map map3 = map;
        JSONObject jSONObject2 = this.zzc;
        boolean z2 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlW)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                int i2 = zze.zza;
                zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzK()) {
                int i3 = zze.zza;
                zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject zzd2 = zzbv.zzd(context, map3, map2, view3, scaleType);
        JSONObject zzh2 = zzbv.zzh(context, view3);
        JSONObject zzg2 = zzbv.zzg(view2);
        JSONObject zze2 = zzbv.zze(context, view3);
        String zzH = zzH(view, map3);
        JSONObject zzc2 = zzbv.zzc(zzH, context, this.zzz, this.zzy);
        if (z2) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        int i4 = zze.zza;
                        zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzp(view2, zzh2, zzd2, zzg2, zze2, zzH, zzc2, (JSONObject) null, z, true);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                    int i42 = zze.zza;
                    zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzp(view2, zzh2, zzd2, zzg2, zze2, zzH, zzc2, (JSONObject) null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                int i5 = zze.zza;
                zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                zzv.zzp().zzw(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzp(view2, zzh2, zzd2, zzg2, zze2, zzH, zzc2, (JSONObject) null, z, true);
    }

    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd2 = zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject zzh2 = zzbv.zzh(context, view);
        JSONObject zzg2 = zzbv.zzg(view);
        JSONObject zze2 = zzbv.zze(context, view);
        boolean zzi2 = zzbv.zzi(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", zzd2);
            jSONObject.put("ad_view_signal", zzh2);
            jSONObject.put("scroll_view_signal", zzg2);
            jSONObject.put("lock_screen_signal", zze2);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdO)).booleanValue()) {
                jSONObject.put("view_signals", zzG(view));
            }
            jSONObject.put("policy_validator_enabled", zzi2);
            jSONObject.put("screen", zzbv.zzf(context));
            zzcai.zza(this.zzd.zzg("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("Unable to create native ad signals logging JSON.", e);
        }
    }

    public final void zzs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcai.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("", e);
        }
    }

    public final void zzt(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzL(zzbv.zzh(context, view), zzbv.zzd(context, map, map2, view, scaleType), zzbv.zzg(view), zzbv.zze(context, view), zzG(view), (JSONObject) null, zzbv.zzi(context, this.zzj), view);
    }

    public final void zzu() {
        zzL((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false, (View) null);
    }

    public final void zzv(View view, MotionEvent motionEvent, View view2) {
        this.zzy = zzbv.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = currentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation((float) this.zzy.x, (float) this.zzy.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
        zzI();
    }

    public final void zzw(Bundle bundle) {
        if (bundle == null) {
            int i = zze.zza;
            zzo.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzJ("touch_reporting")) {
            int i2 = zze.zza;
            zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i3 = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i3);
            zzI();
        }
    }

    public final void zzx(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = zze.zza;
            zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjz zzdjz = this.zzn;
        if (view != null) {
            view.setOnClickListener(zzdjz);
            view.setClickable(true);
            zzdjz.zzc = new WeakReference(view);
        }
    }

    public final void zzy() {
        this.zzx = true;
    }

    public final void zzz(zzdf zzdf) {
        this.zzC = zzdf;
    }

    public final void zzl(zzdj zzdj) {
        try {
            if (!this.zzw) {
                if (zzdj == null) {
                    zzdit zzdit = this.zze;
                    if (zzdit.zzk() != null) {
                        this.zzw = true;
                        this.zzq.zzd(zzdit.zzk().zzf(), this.zzj.zzax, this.zzs, (zzcyi) null);
                        zzi();
                        return;
                    }
                }
                this.zzw = true;
                this.zzq.zzd(zzdj.zzf(), this.zzj.zzax, this.zzs, (zzcyi) null);
                zzi();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
