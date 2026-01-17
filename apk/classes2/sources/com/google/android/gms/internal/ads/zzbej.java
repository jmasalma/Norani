package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbej {
    private final ScheduledExecutorService zza;
    private final zzo zzb;
    private final zzf zzc;
    private final zzdso zzd;
    private Runnable zze;
    private zzbeg zzf;
    /* access modifiers changed from: private */
    public CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbej(ScheduledExecutorService scheduledExecutorService, zzo zzo, zzf zzf2, zzdso zzdso) {
        this.zza = scheduledExecutorService;
        this.zzb = zzo;
        this.zzc = zzf2;
        this.zzd = zzdso;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzkn)).booleanValue() != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbeg r0 = r5.zzf
            if (r0 != 0) goto L_0x000c
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            return
        L_0x000c:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r0 = r5.zzh
            if (r0 == 0) goto L_0x0070
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            if (r0 == 0) goto L_0x0070
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L_0x0070
            long r1 = r5.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()
            long r1 = r1.elapsedRealtime()
            long r3 = r5.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzkn
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0070
        L_0x004d:
            androidx.browser.customtabs.CustomTabsSession r1 = r5.zzg
            java.lang.String r2 = r5.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.requestPostMessageChannel(r2)
            java.lang.Runnable r1 = r5.zze
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzko
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L_0x0070:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbej.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) zzbd.zzc().zzb(zzbde.zzkq));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfj.zze.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0);
        zzk(jSONObject);
        if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfj.zze.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0);
        zzk(jSONObject);
        if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final void zzf() {
        this.zzi = zzv.zzD().elapsedRealtime() + ((long) ((Integer) zzbd.zzc().zzb(zzbde.zzkm)).intValue());
        if (this.zze == null) {
            this.zze = new zzbeh(this);
        }
        zzj();
    }

    /* access modifiers changed from: package-private */
    public final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zza());
            }
            customTabsSession.postMessage(jSONObject.toString(), (Bundle) null);
            zzbei zzbei = new zzbei(this, str);
            if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbei);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbei);
        } catch (JSONException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzj = j;
    }

    public final void zzg(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        } else if (customTabsClient != null) {
            this.zzl = context;
            this.zzh = str;
            zzdso zzdso = this.zzd;
            zzbeg zzbeg = new zzbeg(this, customTabsCallback, zzdso);
            this.zzf = zzbeg;
            CustomTabsSession newSession = customTabsClient.newSession(zzbeg);
            this.zzg = newSession;
            if (newSession == null) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
            }
            zzaa.zzd(zzdso, (zzdsd) null, "pact_action", new Pair[]{new Pair("pe", "pact_init")});
        } else {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
    }
}
