package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcse {
    private final zzdyb zza;
    private final zzfcw zzb;
    private final zzfha zzc;
    private final zzcle zzd;
    private final zzehi zze;
    /* access modifiers changed from: private */
    public final zzdbk zzf;
    private zzfcn zzg;
    private final zzdzj zzh;
    private final zzcvb zzi;
    private final Executor zzj;
    private final zzdyu zzk;
    private final zzedr zzl;

    zzcse(zzdyb zzdyb, zzfcw zzfcw, zzfha zzfha, zzcle zzcle, zzehi zzehi, zzdbk zzdbk, zzfcn zzfcn, zzdzj zzdzj, zzcvb zzcvb, Executor executor, zzdyu zzdyu, zzedr zzedr) {
        this.zza = zzdyb;
        this.zzb = zzfcw;
        this.zzc = zzfha;
        this.zzd = zzcle;
        this.zze = zzehi;
        this.zzf = zzdbk;
        this.zzg = zzfcn;
        this.zzh = zzdzj;
        this.zzi = zzcvb;
        this.zzj = executor;
        this.zzk = zzdyu;
        this.zzl = zzedr;
    }

    public final zze zza(Throwable th) {
        return zzfdx.zzb(th, this.zzl);
    }

    public final zzdbk zzc() {
        return this.zzf;
    }

    public final ListenableFuture zzf(zzfeq zzfeq) {
        zzfgg zza2 = this.zzc.zzb(zzfgu.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzcsa(this, zzfeq)).zza();
        zzgdn.zzr(zza2, new zzcsc(this), this.zzj);
        return zza2;
    }

    public final ListenableFuture zzg(zzbvq zzbvq) {
        zzfgg zza2 = this.zzc.zzb(zzfgu.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbvq)).zza();
        zzgdn.zzr(zza2, new zzcsd(this), this.zzj);
        return zza2;
    }

    public final ListenableFuture zzh(ListenableFuture listenableFuture) {
        zzfgq zzf2 = this.zzc.zzb(zzfgu.RENDERER, listenableFuture).zze(new zzcrz(this)).zzf(this.zze);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfR)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) zzbd.zzc().zzb(zzbde.zzfS)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final ListenableFuture zzi() {
        zzm zzm = this.zzb.zzd;
        if (zzm.zzx == null && zzm.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfha zzfha = this.zzc;
        zzfgu zzfgu = zzfgu.PRELOADED_LOADER;
        Objects.requireNonNull(zzfha);
        return zzfgk.zzc(this.zza.zze(), zzfgu, zzfha).zza();
    }

    public final ListenableFuture zzj(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfha zzfha = this.zzc;
            zzfgu zzfgu = zzfgu.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfha);
            return zzfgk.zzc(zzgdn.zzh(this.zzg), zzfgu, zzfha).zza();
        }
        zzv.zzc().zzj();
        zzfgq zzb2 = this.zzc.zzb(zzfgu.SERVER_TRANSACTION, listenableFuture);
        zzdyu zzdyu = this.zzk;
        Objects.requireNonNull(zzdyu);
        return zzb2.zzf(new zzcsb(zzdyu)).zza();
    }

    public final void zzk(zzfcn zzfcn) {
        this.zzg = zzfcn;
    }
}
