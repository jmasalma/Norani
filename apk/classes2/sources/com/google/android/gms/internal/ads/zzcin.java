package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcin extends zzevf {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    final zzhha zze;
    final zzhha zzf;
    final zzhha zzg;
    final zzhha zzh;
    final zzhha zzi;
    final zzhha zzj = zzewz.zza(zzffu.zza());
    final zzhha zzk;
    final zzhha zzl;
    final zzhha zzm;
    final zzhha zzn;
    final zzhha zzo;
    final zzhha zzp;
    final zzhha zzq;
    final zzhha zzr;
    final zzhha zzs;
    final zzhha zzt;
    final zzhha zzu;
    final zzhha zzv;
    final zzhha zzw;
    final zzhha zzx;
    private final zzewi zzy;
    private final zzcio zzz;

    zzcin(zzcio zzcio, zzewi zzewi) {
        zzcio zzcio2 = zzcio;
        this.zzz = zzcio2;
        this.zzy = zzewi;
        this.zza = zzhgq.zzc(zzfhv.zza(zzcio2.zzz));
        zzewk zza2 = zzewk.zza(zzewi);
        this.zzb = zza2;
        zzewl zza3 = zzewl.zza(zzewi);
        this.zzc = zza3;
        zzewm zza4 = zzewm.zza(zzewi);
        this.zzd = zza4;
        zzckz zzckz = zzcky.zza;
        zzhha zzhha = zzcio2.zzf;
        zzhha zzhha2 = zzcio2.zzc;
        this.zze = zzeve.zza(zzckz, zzhha, zzhha2, zzffu.zza(), zza2, zza3, zza4);
        this.zzf = zzevs.zza(zzcks.zza, zzffu.zza(), zzhha);
        zzewj zza5 = zzewj.zza(zzewi);
        this.zzg = zza5;
        this.zzh = zzewa.zza(zzcku.zza, zzffu.zza(), zza5);
        this.zzi = zzewh.zza(zzckw.zza, zzhha2, zzhha);
        zzewo zza6 = zzewo.zza(zzewi);
        this.zzk = zza6;
        zzewp zza7 = zzewp.zza(zzewi);
        this.zzl = zza7;
        zzhha zzhha3 = zzcio2.zzal;
        this.zzm = zzewv.zza(zzhha3, zza4, zzcla.zza, zzffu.zza(), zza5, zzhha2, zza6, zza7);
        this.zzn = zzevo.zza(zza5, zzckq.zza, zzhha3, zzhha2, zzffu.zza());
        zzewn zza8 = zzewn.zza(zzewi);
        this.zzo = zza8;
        zzhha zzc2 = zzhgq.zzc(zzdrd.zza());
        this.zzp = zzc2;
        zzhha zzc3 = zzhgq.zzc(zzdrb.zza());
        this.zzq = zzc3;
        zzhha zzc4 = zzhgq.zzc(zzdrf.zza());
        this.zzr = zzc4;
        zzhha zzc5 = zzhgq.zzc(zzdrh.zza());
        this.zzs = zzc5;
        zzhgu zzc6 = zzhgv.zzc(4);
        zzc6.zzb(zzfgu.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfgu.BUILD_URL, zzc3);
        zzc6.zzb(zzfgu.HTTP, zzc4);
        zzc6.zzb(zzfgu.PRE_PROCESS, zzc5);
        zzhgv zzc7 = zzc6.zzc();
        this.zzt = zzc7;
        zzhha zzc8 = zzhgq.zzc(zzdri.zza(zza8, zzcio2.zzf, zzffu.zza(), zzc7));
        this.zzu = zzc8;
        zzhhc zza9 = zzhhd.zza(0, 1);
        zza9.zza(zzc8);
        zzhhd zzc9 = zza9.zzc();
        this.zzv = zzc9;
        zzfhd zzc10 = zzfhd.zzc(zzc9);
        this.zzw = zzc10;
        this.zzx = zzhgq.zzc(zzfhc.zza(zzffu.zza(), zzcio2.zzc, zzc10));
    }

    public final zzeuf zza() {
        zzcio zzcio = this.zzz;
        Context zzc2 = zzchl.zzc(zzcio.zzbp);
        zzhha zzhha = this.zza;
        zzhha zzhha2 = this.zzn;
        zzhha zzhha3 = this.zzm;
        zzhha zzhha4 = this.zzj;
        zzhha zzhha5 = this.zzi;
        zzhha zzhha6 = this.zzh;
        zzhha zzhha7 = this.zzf;
        zzhha zzhha8 = this.zze;
        zzhha zzhha9 = zzcio.zzbo;
        return zzewq.zza(zzc2, zzckv.zza(), zzclb.zza(), zzhha9.zzb(), zzc(), zzd(), zzhgq.zza(zzhha8), zzhgq.zza(zzhha7), zzhgq.zza(zzhha6), zzhgq.zza(zzhha5), zzhgq.zza(zzhha4), zzhgq.zza(zzhha3), zzhgq.zza(zzhha2), zzffu.zzc(), (zzfhu) zzhha.zzb(), (zzdsj) zzcio.zzl.zzb());
    }

    public final zzeuf zzb() {
        zzcio zzcio = this.zzz;
        Context zzc2 = zzchl.zzc(zzcio.zzbp);
        zzewi zzewi = this.zzy;
        zzgdy zzc3 = zzffu.zzc();
        zzevy zzevy = new zzevy(zzckv.zza(), zzffu.zzc(), zzewj.zzd(zzewi));
        zzhha zzhha = zzcio.zzc;
        long longValue = ((Long) zzbd.zzc().zzb(zzbde.zzex)).longValue();
        return new zzeuf(zzc2, zzc3, zzfyv.zzs(new zzeso(zzevy, 0, (ScheduledExecutorService) zzhha.zzb()), new zzeso(new zzewf(zzckx.zza(), (ScheduledExecutorService) zzhha.zzb(), zzchl.zzc(zzcio.zzbp)), longValue, (ScheduledExecutorService) zzhha.zzb()), new zzeso(zzeve.zzc(zzckz.zza(), zzchl.zzc(zzcio.zzbp), (ScheduledExecutorService) zzhha.zzb(), zzffu.zzc(), zzewi.zza(), zzewl.zzd(zzewi), zzewm.zzd(zzewi)), 0, (ScheduledExecutorService) zzhha.zzb()), new zzeso(new zzewx(zzffu.zzc()), 0, (ScheduledExecutorService) zzhha.zzb()), new zzevq(zzckt.zza(), zzffu.zzc(), zzchl.zzc(zzcio.zzbp)), zzd(), zzc(), (zzeuc) zzcio.zzbo.zzb(), zzevo.zzc(zzewj.zzd(zzewi), zzckr.zza(), (zzbzs) zzcio.zzal.zzb(), (ScheduledExecutorService) zzhha.zzb(), zzffu.zzc())), (zzfhu) this.zza.zzb(), (zzdsj) zzcio.zzl.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzevi zzc() {
        zzewi zzewi = this.zzy;
        zzbzj zza2 = zzckz.zza();
        zzgdy zzc2 = zzffu.zzc();
        String zzf2 = zzewi.zzf();
        String str = zzf2;
        return new zzevi(zza2, zzc2, zzf2, zzewi.zzd(), zzewi.zza());
    }

    /* access modifiers changed from: package-private */
    public final zzewc zzd() {
        zzewi zzewi = this.zzy;
        zzbcn zza2 = zzcko.zza();
        zzgdy zzc2 = zzffu.zzc();
        List zzh2 = zzewi.zzh();
        zzhgz.zzb(zzh2);
        List list = zzh2;
        return new zzewc(zza2, zzc2, zzh2);
    }

    public final zzfha zze() {
        return (zzfha) this.zzx.zzb();
    }

    public final zzfhu zzf() {
        return (zzfhu) this.zza.zzb();
    }
}
