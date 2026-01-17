package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmm implements zzgcu {
    public final /* synthetic */ Uri.Builder zza;

    public /* synthetic */ zzcmm(Uri.Builder builder) {
        this.zza = builder;
    }

    public final ListenableFuture zza(Object obj) {
        zzbcv zzbcv = zzbde.zzkG;
        Uri.Builder builder = this.zza;
        builder.appendQueryParameter((String) zzbd.zzc().zzb(zzbcv), "12");
        return zzgdn.zzh(builder.toString());
    }
}
