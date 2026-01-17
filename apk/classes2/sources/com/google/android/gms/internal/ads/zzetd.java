package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzetd implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzetd(List list, Bundle bundle) {
        this.zza = list;
        this.zzb = bundle;
    }

    public final Object call() {
        int i = zzeti.zzb;
        JSONArray jSONArray = new JSONArray();
        for (ListenableFuture listenableFuture : this.zza) {
            if (((JSONObject) listenableFuture.get()) != null) {
                jSONArray.put(listenableFuture.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzetj(jSONArray.toString(), this.zzb);
    }
}
