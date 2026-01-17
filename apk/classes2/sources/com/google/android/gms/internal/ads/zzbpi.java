package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbpi implements zzgcu {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    zzbpi(ListenableFuture listenableFuture, String str, zzbop zzbop, zzboo zzboo) {
        this.zzb = listenableFuture;
    }

    public static /* synthetic */ ListenableFuture zzb(zzbpi zzbpi, Object obj, zzboj zzboj) {
        zzcak zzcak = new zzcak();
        zzv.zzr();
        String uuid = UUID.randomUUID().toString();
        zzbke.zzo.zzc(uuid, new zzbph(zzbpi, zzcak));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzboj.zzp(zzbpi.zza, jSONObject);
        return zzcak;
    }

    public final ListenableFuture zza(Object obj) throws Exception {
        return zzc(obj);
    }

    public final ListenableFuture zzc(Object obj) {
        return zzgdn.zzn(this.zzb, new zzbpg(this, obj), zzcaf.zzg);
    }
}
