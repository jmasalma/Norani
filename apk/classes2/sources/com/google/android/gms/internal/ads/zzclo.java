package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzclo implements zzgcu {
    public final ListenableFuture zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkR)).booleanValue()) {
            zzv.zzp().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            zzv.zzp().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgdn.zzh(new GetTopicsResponse(zzfyq.zzn()));
    }
}
