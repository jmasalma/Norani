package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzo implements Callable {
    public final /* synthetic */ ListenableFuture zza;
    public final /* synthetic */ zzbvq zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzdzo(ListenableFuture listenableFuture, zzbvq zzbvq, ListenableFuture listenableFuture2) {
        this.zza = listenableFuture;
        this.zzb = zzbvq;
        this.zzc = listenableFuture2;
    }

    public final Object call() {
        Bundle bundle;
        zzbvs zzbvs = (zzbvs) this.zza.get();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && (bundle = this.zzb.zzm) != null) {
            bundle.putLong(zzdrr.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvs.zzc());
            bundle.putLong(zzdrr.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvs.zzb());
        }
        return new zzeah((JSONObject) this.zzc.get(), zzbvs);
    }
}
