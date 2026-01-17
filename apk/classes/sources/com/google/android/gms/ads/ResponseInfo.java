package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class ResponseInfo {
    private final zzea zza;
    private final List zzb = new ArrayList();
    private AdapterResponseInfo zzc;

    private ResponseInfo(zzea zzea) {
        this.zza = zzea;
        if (zzea != null) {
            try {
                List<zzv> zzj = zzea.zzj();
                if (zzj != null) {
                    for (zzv zza2 : zzj) {
                        AdapterResponseInfo zza3 = AdapterResponseInfo.zza(zza2);
                        if (zza3 != null) {
                            this.zzb.add(zza3);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzea zzea2 = this.zza;
        if (zzea2 != null) {
            try {
                zzv zzf = zzea2.zzf();
                if (zzf != null) {
                    this.zzc = AdapterResponseInfo.zza(zzf);
                }
            } catch (RemoteException e2) {
                zzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
            }
        }
    }

    public static ResponseInfo zza(zzea zzea) {
        if (zzea != null) {
            return new ResponseInfo(zzea);
        }
        return null;
    }

    public static ResponseInfo zzb(zzea zzea) {
        return new ResponseInfo(zzea);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public String getMediationAdapterClassName() {
        try {
            zzea zzea = this.zza;
            if (zzea != null) {
                return zzea.zzg();
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzea zzea = this.zza;
            if (zzea != null) {
                return zzea.zze();
            }
        } catch (RemoteException e) {
            zzo.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzea zzea = this.zza;
            if (zzea != null) {
                return zzea.zzi();
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzea zzc() {
        return this.zza;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo zzb2 : this.zzb) {
            jSONArray.put(zzb2.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzbb.zzb().zzn(responseExtras));
        }
        return jSONObject;
    }
}
