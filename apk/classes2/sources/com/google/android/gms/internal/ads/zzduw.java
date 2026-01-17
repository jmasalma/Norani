package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzduw implements zzcwb, zzcza, zzcxq {
    private final zzdvi zza;
    private final String zzb;
    private final String zzc;
    private int zzd;
    private zzduv zze;
    private zzcvr zzf;
    private zze zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    zzduw(zzdvi zzdvi, zzfcw zzfcw, String str) {
        this.zza = zzdvi;
        this.zzc = str;
        this.zzb = zzfcw.zzf;
        this.zzd = 0;
        this.zze = zzduv.AD_REQUESTED;
    }

    private static JSONObject zzh(zze zze2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zze2.zzc);
        jSONObject.put("errorCode", zze2.zza);
        jSONObject.put("errorDescription", zze2.zzb);
        zze zze3 = zze2.zzd;
        jSONObject.put("underlyingError", zze3 == null ? null : zzh(zze3));
        return jSONObject;
    }

    private final JSONObject zzi(zzcvr zzcvr) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzcvr.zzg());
        jSONObject2.put("responseSecsSinceEpoch", zzcvr.zzd());
        jSONObject2.put("responseId", zzcvr.zzi());
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjG)).booleanValue()) {
            String zzk2 = zzcvr.zzk();
            if (!TextUtils.isEmpty(zzk2)) {
                String valueOf = String.valueOf(zzk2);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zze("Bidding data: ".concat(valueOf));
                jSONObject2.put("biddingData", new JSONObject(zzk2));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject2.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject2.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject2.put("adResponseBody", this.zzj);
        }
        JSONObject jSONObject3 = this.zzk;
        if (jSONObject3 != null) {
            jSONObject2.put("adResponseHeaders", jSONObject3);
        }
        JSONObject jSONObject4 = this.zzl;
        if (jSONObject4 != null) {
            jSONObject2.put("transactionExtras", jSONObject4);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjJ)).booleanValue()) {
            jSONObject2.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzv zzv : zzcvr.zzj()) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("adapterClassName", zzv.zza);
            jSONObject5.put("latencyMillis", zzv.zzb);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjH)).booleanValue()) {
                jSONObject5.put("credentials", zzbb.zzb().zzn(zzv.zzd));
            }
            zze zze2 = zzv.zzc;
            if (zze2 == null) {
                jSONObject = null;
            } else {
                jSONObject = zzh(zze2);
            }
            jSONObject5.put("error", jSONObject);
            jSONArray.put(jSONObject5);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    public final void zza(zzcra zzcra) {
        zzdvi zzdvi = this.zza;
        if (zzdvi.zzq()) {
            this.zzf = zzcra.zzm();
            this.zze = zzduv.AD_LOADED;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjN)).booleanValue()) {
                zzdvi.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfca.zza(this.zzd));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjN)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzcvr zzcvr = this.zzf;
        if (zzcvr != null) {
            jSONObject = zzi(zzcvr);
        } else {
            zze zze2 = this.zzg;
            JSONObject jSONObject3 = null;
            if (!(zze2 == null || (iBinder = zze2.zze) == null)) {
                zzcvr zzcvr2 = (zzcvr) iBinder;
                jSONObject3 = zzi(zzcvr2);
                if (zzcvr2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void zzdD(zze zze2) {
        zzdvi zzdvi = this.zza;
        if (zzdvi.zzq()) {
            this.zze = zzduv.AD_LOAD_FAILED;
            this.zzg = zze2;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjN)).booleanValue()) {
                zzdvi.zzf(this.zzb, this);
            }
        }
    }

    public final void zzdn(zzbvq zzbvq) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzjN)).booleanValue()) {
            zzdvi zzdvi = this.zza;
            if (zzdvi.zzq()) {
                zzdvi.zzf(this.zzb, this);
            }
        }
    }

    public final void zzdo(zzfcn zzfcn) {
        zzdvi zzdvi = this.zza;
        if (zzdvi.zzq()) {
            zzfcm zzfcm = zzfcn.zzb;
            List list = zzfcm.zza;
            int i = 0;
            if (!list.isEmpty()) {
                this.zzd = ((zzfca) list.get(0)).zzb;
            }
            zzfcd zzfcd = zzfcm.zzb;
            String str = zzfcd.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfcd.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfcd.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzjJ)).booleanValue()) {
                return;
            }
            if (!zzdvi.zzs()) {
                this.zzo = true;
                return;
            }
            String str3 = zzfcd.zzn;
            if (!TextUtils.isEmpty(str3)) {
                this.zzj = str3;
            }
            JSONObject jSONObject2 = zzfcd.zzo;
            if (jSONObject2.length() > 0) {
                this.zzk = jSONObject2;
            }
            JSONObject jSONObject3 = this.zzk;
            if (jSONObject3 != null) {
                i = jSONObject3.toString().length();
            }
            if (!TextUtils.isEmpty(this.zzj)) {
                i += this.zzj.length();
            }
            zzdvi.zzk((long) i);
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzduv.AD_REQUESTED;
    }
}
