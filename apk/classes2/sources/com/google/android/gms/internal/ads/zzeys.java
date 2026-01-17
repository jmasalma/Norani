package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeys implements zzezr {
    private zzcve zza;
    private final Executor zzb = zzgef.zzc();

    public final zzcve zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzezs zzezs, zzezq zzezq, zzcve zzcve) {
        zzcvd zza2 = zzezq.zza(zzezs.zzb);
        zza2.zzb(new zzezv(true));
        zzcve zzcve2 = (zzcve) zza2.zzh();
        this.zza = zzcve2;
        zzcse zzb2 = zzcve2.zzb();
        zzfes zzfes = new zzfes();
        zzgde zzw = zzgde.zzw(zzb2.zzi());
        zzeyq zzeyq = new zzeyq(this, zzfes, zzb2);
        Executor executor = this.zzb;
        return (zzgde) zzgdn.zzm((zzgde) zzgdn.zzn(zzw, zzeyq, executor), new zzeyr(zzfes), executor);
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezs zzezs, zzezq zzezq, Object obj) {
        zzcve zzcve = null;
        return zzb(zzezs, zzezq, (zzcve) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
