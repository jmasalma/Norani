package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzp implements Callable {
    public final /* synthetic */ zzbvq zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ ListenableFuture zzd;

    public /* synthetic */ zzdzp(zzbvq zzbvq, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) {
        this.zza = zzbvq;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = listenableFuture3;
    }

    public final Object call() {
        Bundle bundle;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && (bundle = this.zza.zzm) != null) {
            bundle.putLong(zzdrr.HTTP_RESPONSE_READY.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture listenableFuture = this.zzd;
        return new zzeaa((zzeae) this.zzb.get(), (JSONObject) this.zzc.get(), (zzbvs) listenableFuture.get());
    }
}
