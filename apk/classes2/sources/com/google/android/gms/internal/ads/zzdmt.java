package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmt {
    private final Executor zza;
    private final zzcnx zzb;
    private final zzddx zzc;
    private final zzcmq zzd;

    zzdmt(Executor executor, zzcnx zzcnx, zzddx zzddx, zzcmq zzcmq) {
        this.zza = executor;
        this.zzc = zzddx;
        this.zzb = zzcnx;
        this.zzd = zzcmq;
    }

    public final void zzc(zzcfg zzcfg) {
        if (zzcfg != null) {
            zzddx zzddx = this.zzc;
            zzddx.zza(zzcfg.zzF());
            zzdmp zzdmp = new zzdmp(zzcfg);
            Executor executor = this.zza;
            zzddx.zzo(zzdmp, executor);
            zzddx.zzo(new zzdmq(zzcfg), executor);
            zzcnx zzcnx = this.zzb;
            zzddx.zzo(zzcnx, executor);
            zzcnx.zzf(zzcfg);
            zzcgy zzN = zzcfg.zzN();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzkC)).booleanValue() && zzN != null) {
                zzcmq zzcmq = this.zzd;
                zzN.zzN(zzcmq);
                zzN.zzO(zzcmq, (zzeca) null, (zzdsj) null);
            }
            zzcfg.zzag("/trackActiveViewUnit", new zzdmr(this));
            zzcfg.zzag("/untrackActiveViewUnit", new zzdms(this));
        }
    }
}
