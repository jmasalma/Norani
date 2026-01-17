package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzcb implements zzd {
    private final Application zza;
    private final zzbx zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbc zzg;
    private final zzaq zzh;

    zzcb(Application application, zzbx zzbx, Handler handler, Executor executor, zze zze2, zzao zzao, zzbc zzbc, zzaq zzaq) {
        this.zza = application;
        this.zzb = zzbx;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zze2;
        this.zzf = zzao;
        this.zzg = zzbc;
        this.zzh = zzaq;
    }

    public static /* synthetic */ void zzc(zzcb zzcb) {
        String str;
        JSONObject jSONObject = new JSONObject();
        Application application = zzcb.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                str = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", str);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaq = zzcb.zzh;
            for (String str2 : zzaq.zzc().keySet()) {
                jSONObject2.put(str2, zzaq.zzc().get(str2));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcb.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }

    public final Executor zza() {
        Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new zzbz(handler);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L_0x002b;
                case -278739366: goto L_0x0021;
                case 150940456: goto L_0x0017;
                case 1671672458: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r0 = "dismiss"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = r5
            goto L_0x0036
        L_0x0017:
            java.lang.String r0 = "browser"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = r3
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "configure_app_assets"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = r4
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "load_complete"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0036
        L_0x0035:
            r8 = r1
        L_0x0036:
            if (r8 == 0) goto L_0x00b2
            if (r8 == r5) goto L_0x0047
            if (r8 == r3) goto L_0x0043
            if (r8 == r4) goto L_0x003f
            return r2
        L_0x003f:
            r7.zzd()
            return r5
        L_0x0043:
            r7.zzg(r9)
            return r5
        L_0x0047:
            java.lang.String r8 = "status"
            java.lang.String r8 = r9.optString(r8)
            int r9 = r8.hashCode()
            r0 = 5
            r6 = 4
            switch(r9) {
                case -954325659: goto L_0x0089;
                case -258041904: goto L_0x007f;
                case 429411856: goto L_0x0075;
                case 467888915: goto L_0x006b;
                case 1666911234: goto L_0x0061;
                case 1725474845: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x0092
        L_0x0057:
            java.lang.String r9 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r1 = r0
            goto L_0x0092
        L_0x0061:
            java.lang.String r9 = "non_personalized"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r1 = r3
            goto L_0x0092
        L_0x006b:
            java.lang.String r9 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r1 = r5
            goto L_0x0092
        L_0x0075:
            java.lang.String r9 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r1 = r6
            goto L_0x0092
        L_0x007f:
            java.lang.String r9 = "personalized"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r1 = r2
            goto L_0x0092
        L_0x0089:
            java.lang.String r9 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r1 = r4
        L_0x0092:
            if (r1 == 0) goto L_0x00ac
            if (r1 == r5) goto L_0x00ac
            if (r1 == r3) goto L_0x00ac
            if (r1 == r4) goto L_0x00ac
            if (r1 == r6) goto L_0x00ac
            if (r1 == r0) goto L_0x00ab
            com.google.android.gms.internal.consent_sdk.zzbc r8 = r7.zzg
            com.google.android.gms.internal.consent_sdk.zzg r9 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = "We are getting something wrong with the webview."
            r9.<init>(r5, r0)
            r8.zzh(r9)
            goto L_0x00b1
        L_0x00ab:
            r4 = r5
        L_0x00ac:
            com.google.android.gms.internal.consent_sdk.zzbc r8 = r7.zzg
            r8.zzg(r4)
        L_0x00b1:
            return r5
        L_0x00b2:
            com.google.android.gms.internal.consent_sdk.zzbc r8 = r7.zzg
            r8.zzi()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzcb.zzb(java.lang.String, org.json.JSONObject):boolean");
    }

    public final void zzd() {
        this.zzd.execute(new zzca(this));
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zzf(int i, String str, String str2) {
        this.zzg.zzj(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", new Object[]{Integer.valueOf(i), str2, str})));
    }
}
