package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdzj {
    private final zzgdy zza;
    private final zzdyo zzb;
    private final zzhgl zzc;

    public zzdzj(zzgdy zzgdy, zzdyo zzdyo, zzhgl zzhgl) {
        this.zza = zzgdy;
        this.zzb = zzdyo;
        this.zzc = zzhgl;
    }

    private final ListenableFuture zzg(zzbvq zzbvq, zzdzi zzdzi, zzdzi zzdzi2, zzgcu zzgcu) {
        ListenableFuture listenableFuture;
        String str = zzbvq.zzd;
        zzv.zzr();
        if (zzs.zzD(str)) {
            listenableFuture = zzgdn.zzg(new zzdyx(1));
        } else {
            listenableFuture = zzgdn.zzf(zzdzi.zza(zzbvq), ExecutionException.class, new zzdzh(), this.zza);
        }
        zzgde zzw = zzgde.zzw(listenableFuture);
        zzdzf zzdzf = new zzdzf();
        zzgdy zzgdy = this.zza;
        return (zzgde) zzgdn.zzf((zzgde) zzgdn.zzn((zzgde) zzgdn.zzn(zzw, zzdzf, zzgdy), zzgcu, zzgdy), zzdyx.class, new zzdzg(this, zzdzi2, zzbvq, zzgcu), zzgdy);
    }

    public final ListenableFuture zze(zzbvq zzbvq) {
        zzdzc zzdzc = new zzdzc(zzbvq);
        zzdyo zzdyo = this.zzb;
        Objects.requireNonNull(zzdyo);
        return zzg(zzbvq, new zzdzd(zzdyo), new zzdze(this), zzdzc);
    }

    public final ListenableFuture zzf(zzbvq zzbvq) {
        return zzg(zzbvq, new zzdza(this), new zzdzb(this), new zzdyz());
    }
}
