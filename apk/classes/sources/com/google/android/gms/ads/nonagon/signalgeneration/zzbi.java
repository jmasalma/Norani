package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbi implements zzgcu {
    private final Executor zza;
    private final zzdxo zzb;

    public zzbi(Executor executor, zzdxo zzdxo) {
        this.zza = executor;
        this.zzb = zzdxo;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzbvq zzbvq = (zzbvq) obj;
        return zzgdn.zzn(this.zzb.zzc(zzbvq), new zzbh(zzbvq), this.zza);
    }
}
