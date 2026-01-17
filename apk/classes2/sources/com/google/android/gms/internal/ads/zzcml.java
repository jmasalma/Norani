package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcml implements zzgcu {
    public final /* synthetic */ zzcmq zza;
    public final /* synthetic */ Uri.Builder zzb;

    public /* synthetic */ zzcml(zzcmq zzcmq, Uri.Builder builder) {
        this.zza = zzcmq;
        this.zzb = builder;
    }

    public final ListenableFuture zza(Object obj) {
        return zzcmq.zzd(this.zza, this.zzb, (Throwable) obj);
    }
}
