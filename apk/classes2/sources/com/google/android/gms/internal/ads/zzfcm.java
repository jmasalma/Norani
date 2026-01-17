package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfcm {
    public final List zza;
    public final zzfcd zzb;
    public final List zzc;
    public final Bundle zzd;

    zzfcm(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && bundle != null) {
            bundle.putLong(zzdrr.SERVER_RESPONSE_PARSE_START.zza(), zzv.zzD().currentTimeMillis());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfcd zzfcd = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfca(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfcd = new zzfcd(jsonReader);
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcr)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdrr.NORMALIZATION_AD_RESPONSE_START.zza(), zzfcd.zzs);
                            bundle.putLong(zzdrr.NORMALIZATION_AD_RESPONSE_END.zza(), zzfcd.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfcl(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfcd == null ? new zzfcd(new JsonReader(new StringReader("{}"))) : zzfcd;
    }

    public static zzfcm zza(Reader reader, Bundle bundle) throws zzfce {
        try {
            zzfcm zzfcm = new zzfcm(new JsonReader(reader), bundle);
            IOUtils.closeQuietly(reader);
            return zzfcm;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfce("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            IOUtils.closeQuietly(reader);
            throw th;
        }
    }
}
