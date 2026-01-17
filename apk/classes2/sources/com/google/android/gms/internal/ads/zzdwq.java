package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdwq implements zzgcu {
    public final /* synthetic */ zzbvq zza;

    public /* synthetic */ zzdwq(zzbvq zzbvq) {
        this.zza = zzbvq;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzh(new zzdyy((InputStream) obj, this.zza));
    }
}
