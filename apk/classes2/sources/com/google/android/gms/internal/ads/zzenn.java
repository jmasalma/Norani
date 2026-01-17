package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenn implements zzeuc {
    private final Executor zza;
    private final zzbzs zzb;

    zzenn(Executor executor, zzbzs zzbzs) {
        this.zza = executor;
        this.zzb = zzbzs;
    }

    public final int zza() {
        return 10;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdg)).booleanValue()) {
            return zzgdn.zzh(new zzeno((ArrayList) null));
        }
        return zzgdn.zzm(this.zzb.zzk(), new zzenm(), this.zza);
    }
}
