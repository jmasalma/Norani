package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbei extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbej zzb;

    zzbei(zzbej zzbej, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbej);
        this.zzb = zzbej;
    }

    public final void onFailure(String str) {
        int i = zze.zza;
        zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbej zzbej = this.zzb;
            zzbej.zzg.postMessage(zzbej.zzc(this.zza, str).toString(), (Bundle) null);
        } catch (JSONException e) {
            zzo.zzh("Error creating PACT Error Response JSON: ", e);
        }
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbej zzbej = this.zzb;
            zzbej.zzg.postMessage(zzbej.zzd(this.zza, query).toString(), (Bundle) null);
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
