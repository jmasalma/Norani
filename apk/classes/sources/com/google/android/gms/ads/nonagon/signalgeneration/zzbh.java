package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzdyy;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbh implements zzgcu {
    public final /* synthetic */ zzbvq zza;

    public /* synthetic */ zzbh(zzbvq zzbvq) {
        this.zza = zzbvq;
    }

    public final ListenableFuture zza(Object obj) {
        zzdyy zzdyy = (zzdyy) obj;
        zzbk zzbk = new zzbk(new JsonReader(new InputStreamReader(zzdyy.zzb())), zzdyy.zza());
        zzbvq zzbvq = this.zza;
        try {
            zzbk.zzb = zzbb.zzb().zzn(zzbvq.zza).toString();
        } catch (JSONException unused) {
            zzbk.zzb = "{}";
        }
        Bundle bundle = zzbvq.zzn;
        if (!bundle.isEmpty()) {
            try {
                zzbk.zzc = zzbb.zzb().zzn(bundle).toString();
            } catch (JSONException unused2) {
            }
        }
        return zzgdn.zzh(zzbk);
    }
}
