package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmh {
    private final Executor zza;
    private final zzdmc zzb;
    private final zzdsd zzc;

    zzdmh(Executor executor, zzdmc zzdmc, zzdsd zzdsd) {
        this.zza = executor;
        this.zzb = zzdmc;
        this.zzc = zzdsd;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFuture;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgdn.zzh(Collections.emptyList());
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzc.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), zzv.zzD().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                listenableFuture = zzgdn.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    listenableFuture = zzgdn.zzh((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        listenableFuture = zzgdn.zzh(new zzdmg(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        listenableFuture = zzgdn.zzm(this.zzb.zze(optJSONObject, "image_value", (zzdrr) null), new zzdme(optString), this.zza);
                    } else {
                        listenableFuture = zzgdn.zzh((Object) null);
                    }
                }
            }
            arrayList.add(listenableFuture);
        }
        return zzgdn.zzm(zzgdn.zzd(arrayList), new zzdmf(), this.zza);
    }
}
