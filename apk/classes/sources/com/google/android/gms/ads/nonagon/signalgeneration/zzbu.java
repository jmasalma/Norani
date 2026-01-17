package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.ValueCallback;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbfj;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbu extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        Objects.requireNonNull(taggingLibraryJsInterface);
        this.zzb = taggingLibraryJsInterface;
    }

    public final void onFailure(String str) {
        String str2;
        int i = zze.zza;
        zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
            str2 = ",\"as\":".concat(this.zzb.zzk.zza().toString());
        } else {
            str2 = "";
        }
        String str3 = this.zza;
        Locale locale = Locale.getDefault();
        zzbeo zzbeo = zzbfj.zze;
        String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", new Object[]{str3, str, Long.valueOf(((Boolean) zzbeo.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0), str2});
        if (((Boolean) zzbeo.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new zzbs(this, format));
            } catch (RuntimeException e) {
                zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(format, (ValueCallback) null);
        }
        if (((Boolean) zzbfj.zzc.zze()).booleanValue() && ((Boolean) zzbfj.zzd.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        String str2;
        String query = queryInfo.getQuery();
        long j = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zzk.zza());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfj.zze.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0);
            jSONObject.put("signal", query);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
                str2 = ",\"as\":".concat(this.zzb.zzk.zza().toString());
            } else {
                str2 = "";
            }
            String str3 = this.zza;
            Locale locale = Locale.getDefault();
            String query2 = queryInfo.getQuery();
            if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
                j = ((Long) zzbfj.zzh.zze()).longValue();
            }
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", new Object[]{str3, query2, Long.valueOf(j), str2});
        }
        if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new zzbt(this, str));
            } catch (RuntimeException e) {
                zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(str, (ValueCallback) null);
        }
        if (((Boolean) zzbfj.zzc.zze()).booleanValue() && ((Boolean) zzbfj.zzd.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }
}
