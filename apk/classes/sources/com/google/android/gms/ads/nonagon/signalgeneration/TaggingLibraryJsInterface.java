package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzavv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcyi;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    /* access modifiers changed from: private */
    public final WebView zzb;
    private final zzavu zzc;
    private final zzfda zzd;
    private final int zze;
    private final zzdso zzf;
    private final boolean zzg;
    /* access modifiers changed from: private */
    public final zzgdy zzh = zzcaf.zzf;
    private final zzfjy zzi;
    private final zzo zzj;
    /* access modifiers changed from: private */
    public final zzf zzk;
    /* access modifiers changed from: private */
    public final zzj zzl;

    TaggingLibraryJsInterface(WebView webView, zzavu zzavu, zzdso zzdso, zzfjy zzfjy, zzfda zzfda, zzo zzo, zzf zzf2, zzj zzj2) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzavu;
        this.zzf = zzdso;
        zzbde.zza(context);
        this.zze = ((Integer) zzbd.zzc().zzb(zzbde.zzjZ)).intValue();
        this.zzg = ((Boolean) zzbd.zzc().zzb(zzbde.zzka)).booleanValue();
        this.zzi = zzfjy;
        this.zzd = zzfda;
        this.zzj = zzo;
        this.zzk = zzf2;
        this.zzl = zzj2;
    }

    public static /* synthetic */ void zze(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        zzfda zzfda;
        Uri parse = Uri.parse(str);
        try {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzmu)).booleanValue() || (zzfda = taggingLibraryJsInterface.zzd) == null) {
                parse = taggingLibraryJsInterface.zzc.zza(parse, taggingLibraryJsInterface.zza, taggingLibraryJsInterface.zzb, (Activity) null);
            } else {
                parse = zzfda.zza(parse, taggingLibraryJsInterface.zza, taggingLibraryJsInterface.zzb, (Activity) null);
            }
        } catch (zzavv e) {
            int i = zze.zza;
            zzo.zzf("Failed to append the click signal to URL: ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        taggingLibraryJsInterface.zzi.zzd(parse.toString(), (com.google.android.gms.ads.internal.util.client.zzv) null, (zzfhu) null, (zzcyi) null);
    }

    public static /* synthetic */ void zzf(TaggingLibraryJsInterface taggingLibraryJsInterface, Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzaa zzs = zzv.zzs();
        Context context = taggingLibraryJsInterface.zza;
        CookieManager zza2 = zzs.zza(context);
        bundle.putBoolean("accept_3p_cookie", zza2 != null ? zza2.acceptThirdPartyCookies(taggingLibraryJsInterface.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, ((AdRequest.Builder) new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), queryInfoGenerationCallback);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            String zzd2 = this.zzc.zzc().zzd(this.zza, str, this.zzb);
            if (this.zzg) {
                long currentTimeMillis2 = zzv.zzD().currentTimeMillis() - currentTimeMillis;
                zzaa.zzd(this.zzf, (zzdsd) null, "csg", new Pair("clat", String.valueOf(currentTimeMillis2)));
            }
            return zzd2;
        } catch (RuntimeException e) {
            int i = zze.zza;
            zzo.zzh("Exception getting click signals. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            String str2 = "Invalid timeout for getting click signals. Timeout=" + i;
            int i2 = zze.zza;
            zzo.zzg(str2);
            return "";
        }
        try {
            return (String) zzcaf.zza.zzb(new zzbq(this, str)).get((long) Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = zze.zza;
            zzo.zzh("Exception getting click signals with timeout. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        zzv.zzr();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        zzbu zzbu = new zzbu(this, uuid);
        if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbu);
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzkc)).booleanValue()) {
                this.zzh.execute(new zzbr(this, bundle, zzbu));
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, ((AdRequest.Builder) new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), zzbu);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            String zzh2 = this.zzc.zzc().zzh(this.zza, this.zzb, (Activity) null);
            if (this.zzg) {
                long currentTimeMillis2 = zzv.zzD().currentTimeMillis() - currentTimeMillis;
                zzaa.zzd(this.zzf, (zzdsd) null, "vsg", new Pair("vlat", String.valueOf(currentTimeMillis2)));
            }
            return zzh2;
        } catch (RuntimeException e) {
            int i = zze.zza;
            zzo.zzh("Exception getting view signals. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            int i2 = zze.zza;
            zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcaf.zza.zzb(new zzbo(this)).get((long) Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = zze.zza;
            zzo.zzh("Exception getting view signals with timeout. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzke)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzcaf.zza.execute(new zzbp(this, str));
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            if (i6 != 0) {
                int i7 = 1;
                if (i6 != 1) {
                    i7 = 2;
                    if (i6 != 2) {
                        i7 = 3;
                        if (i6 != 3) {
                            i2 = -1;
                        }
                    }
                }
                i = i7;
                this.zzc.zzd(MotionEvent.obtain(0, (long) i5, i, (float) i3, (float) i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            }
            i2 = 0;
            i = i2;
            try {
                this.zzc.zzd(MotionEvent.obtain(0, (long) i5, i, (float) i3, (float) i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e) {
                e = e;
                int i8 = zze.zza;
                zzo.zzh("Failed to parse the touch string. ", e);
                zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
            int i82 = zze.zza;
            zzo.zzh("Failed to parse the touch string. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
