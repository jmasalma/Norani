package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzfmy {
    private final String zza;
    private zzfoa zzb = new zzfoa((WebView) null);
    private long zzc;
    private int zzd;

    public zzfmy(String str) {
        zzb();
        this.zza = str;
    }

    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j) {
        if (j >= this.zzc && this.zzd != 3) {
            this.zzd = 3;
            zzfmp.zza().zzh(zza(), this.zza, str);
        }
    }

    public final void zze() {
        zzfmp.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzflm zzflm) {
        zzfmp.zza().zzd(zza(), this.zza, zzflm.zzb());
    }

    public final void zzg(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            zzfne.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
            zzfmp.zza().zzf(zza(), jSONObject);
        }
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfmp.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(zzflp zzflp, zzfln zzfln) {
        zzj(zzflp, zzfln, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzflp zzflp, zzfln zzfln, JSONObject jSONObject) {
        String zzh = zzflp.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfne.zze(jSONObject2, "environment", "app");
        zzfne.zze(jSONObject2, "adSessionType", zzfln.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfne.zze(jSONObject3, "deviceType", str + "; " + str2);
        zzfne.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfne.zze(jSONObject3, "os", "Android");
        zzfne.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfne.zze(jSONObject2, "deviceCategory", zzfnd.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfne.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfne.zze(jSONObject4, "partnerName", zzfln.zze().zzb());
        zzfne.zze(jSONObject4, "partnerVersion", zzfln.zze().zzc());
        zzfne.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfne.zze(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfne.zze(jSONObject5, "appId", zzfmn.zzb().zza().getApplicationContext().getPackageName());
        zzfne.zze(jSONObject2, "app", jSONObject5);
        if (zzfln.zzf() != null) {
            zzfne.zze(jSONObject2, "contentUrl", zzfln.zzf());
        }
        if (zzfln.zzg() != null) {
            zzfne.zze(jSONObject2, "customReferenceData", zzfln.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfln.zzh().iterator();
        if (!it.hasNext()) {
            zzfmp.zza().zzj(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzflz zzflz = (zzflz) it.next();
            throw null;
        }
    }

    public final void zzk(boolean z) {
        String str;
        if (zzp()) {
            if (true != z) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            zzfmp.zza().zzi(zza(), this.zza, str);
        }
    }

    public final void zzl(float f) {
        zzfmp.zza().zze(zza(), this.zza, f);
    }

    public final void zzm(boolean z) {
        String str;
        if (zzp()) {
            if (true != z) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            zzfmp.zza().zzg(zza(), this.zza, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(WebView webView) {
        this.zzb = new zzfoa(webView);
    }

    public void zzo() {
    }

    public final boolean zzp() {
        return this.zzb.get() != null;
    }
}
