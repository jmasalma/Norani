package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzw {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzaq zzd;
    private final zzbo zze;
    private final zzn zzf;
    private final zzz zzg;
    private final zze zzh;

    zzw(Application application, zzad zzad, Handler handler, Executor executor, zzaq zzaq, zzbo zzbo, zzn zzn, zzz zzz, zze zze2) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaq;
        this.zze = zzbo;
        this.zzf = zzn;
        this.zzg = zzz;
        this.zzh = zze2;
    }

    public static /* synthetic */ void zza(zzw zzw, Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                String zza2 = zzcm.zza(zzw.zza);
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zza2 + "\") to set this as a debug device.");
            }
            zzab zza3 = new zzy(zzw.zzg, zzw.zzd(zzw.zzf.zzc(activity, consentRequestParameters))).zza();
            zzaq zzaq = zzw.zzd;
            zzaq.zzg(zza3.zza);
            zzaq.zzi(zza3.zzb);
            zzw.zze.zzd(zza3.zzc);
            zzw.zzh.zza().execute(new zzu(zzw, onConsentInfoUpdateSuccessListener, zza3));
        } catch (zzg e) {
            zzw.zzb.post(new zzr(onConsentInfoUpdateFailureListener, e));
        } catch (RuntimeException e2) {
            zzw.zzb.post(new zzs(onConsentInfoUpdateFailureListener, new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))))));
        }
    }

    public static /* synthetic */ void zzb(zzw zzw, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzab zzab) {
        Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        zzw.zzb.post(new zzt(onConsentInfoUpdateSuccessListener));
        if (zzab.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzw.zze.zzc();
        }
    }

    private final zzcl zzd(zzcj zzcj) throws zzg {
        JsonWriter jsonWriter;
        JsonReader jsonReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str = zzcj.zza;
                if (str != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str);
                }
                zzcf zzcf = zzcj.zzb;
                if (zzcf != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i = zzcf.zzc;
                    if (i != 1) {
                        jsonWriter.name("os_type");
                        int i2 = i - 1;
                        if (i2 == 0) {
                            jsonWriter.value("UNKNOWN");
                        } else if (i2 == 1) {
                            jsonWriter.value("ANDROID");
                        }
                    }
                    String str2 = zzcf.zza;
                    if (str2 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str2);
                    }
                    Integer num = zzcf.zzb;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str3 = zzcj.zzc;
                if (str3 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str3);
                }
                Boolean bool = zzcj.zzd;
                if (bool != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool.booleanValue());
                }
                Map map = zzcj.zze;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jsonWriter.name((String) entry.getKey());
                        jsonWriter.value((String) entry.getValue());
                    }
                    jsonWriter.endObject();
                }
                zzch zzch = zzcj.zzf;
                if (zzch != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = zzch.zza;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = zzch.zzb;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d = zzch.zzc;
                    if (d != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d);
                    }
                    List<zzcg> list = zzch.zzd;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (zzcg zzcg : list) {
                            jsonWriter.beginObject();
                            Integer num4 = zzcg.zza;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = zzcg.zzb;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = zzcg.zzc;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = zzcg.zzd;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                zzcd zzcd = zzcj.zzg;
                if (zzcd != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str4 = zzcd.zza;
                    if (str4 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str4);
                    }
                    String str5 = zzcd.zzb;
                    if (str5 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str5);
                    }
                    String str6 = zzcd.zzc;
                    if (str6 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str6);
                    }
                    jsonWriter.endObject();
                }
                zzci zzci = zzcj.zzh;
                if (zzci != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str7 = zzci.zza;
                    if (str7 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str7);
                    }
                    jsonWriter.endObject();
                }
                List<zzce> list2 = zzcj.zzi;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (zzce ordinal : list2) {
                        switch (ordinal.ordinal()) {
                            case 0:
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                break;
                            case 1:
                                jsonWriter.value("ALWAYS_SHOW");
                                break;
                            case 2:
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                                break;
                            case 3:
                                jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                break;
                            case 4:
                                jsonWriter.value("GEO_OVERRIDE_OTHER");
                                break;
                            case 5:
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                break;
                            case 6:
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                break;
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcl zza2 = zzcl.zza(new JsonReader(new StringReader(headerField)));
                        zza2.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza2;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        jsonReader = new JsonReader(bufferedReader);
                        zzcl zza3 = zzcl.zza(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return zza3;
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                }
                throw th;
                throw th;
            } catch (Throwable th2) {
                outputStreamWriter.close();
                throw th2;
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzg(2, "Error making request.", e2);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzc.execute(new zzv(this, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener));
    }
}
