package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbjg implements zzgcu {
    public final /* synthetic */ zzcmq zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbjg(zzcmq zzcmq, String str) {
        this.zza = zzcmq;
        this.zzb = str;
    }

    public final ListenableFuture zza(Object obj) {
        zzcmq zzcmq;
        String str = (String) obj;
        zzbkf zzbkf = zzbke.zza;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() || (zzcmq = this.zza) == null || !zzcmq.zzj(this.zzb)) {
            return zzgdn.zzh(str);
        }
        return zzcmq.zze(str, zzbb.zze());
    }
}
