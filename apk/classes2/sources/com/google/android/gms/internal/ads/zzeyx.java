package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeyx implements zzezr {
    private final zzezr zza;
    private final zzezr zzb;
    private final zzfff zzc;
    private final String zzd;
    private zzcve zze;
    private final Executor zzf;

    public zzeyx(zzezr zzezr, zzezr zzezr2, zzfff zzfff, String str, Executor executor) {
        this.zza = zzezr;
        this.zzb = zzezr2;
        this.zzc = zzfff;
        this.zzd = str;
        this.zzf = executor;
    }

    public static /* synthetic */ ListenableFuture zzb(zzeyx zzeyx, zzezs zzezs, zzeyw zzeyw, zzezq zzezq, zzcve zzcve, zzezc zzezc) {
        if (zzezc != null) {
            zzeyw zzeyw2 = new zzeyw(zzeyw.zza, zzeyw.zzb, zzeyw.zzc, zzeyw.zzd, zzeyw.zze, zzeyw.zzf, zzezc.zza);
            zzfes zzfes = zzezc.zzc;
            if (zzfes != null) {
                zzeyx.zze = null;
                zzeyx.zzc.zzf(zzeyw2);
                return zzeyx.zzg(zzfes, zzezs);
            }
            zzfff zzfff = zzeyx.zzc;
            ListenableFuture zza2 = zzfff.zza(zzeyw2);
            if (zza2 != null) {
                zzeyx.zze = null;
                return zzgdn.zzn(zza2, new zzeyt(zzeyx), zzeyx.zzf);
            }
            zzfff.zzf(zzeyw2);
            zzezs = new zzezs(zzezs.zzb, zzezc.zzb);
        }
        zzcve zzcve2 = zzcve;
        ListenableFuture zzb2 = ((zzezh) zzeyx.zza).zzb(zzezs, zzezq, zzcve);
        zzeyx.zze = zzcve;
        return zzb2;
    }

    public static /* synthetic */ ListenableFuture zze(zzeyx zzeyx, zzffc zzffc) {
        zzfes zzfes;
        zzffe zzffe;
        if (zzffc == null || (zzfes = zzffc.zza) == null || (zzffe = zzffc.zzb) == null) {
            throw new zzdwm(1, "Empty prefetch");
        }
        zzbcj.zzb.zzc zzd2 = zzbcj.zzb.zzd();
        zzbcj.zzb.zza.C0003zza zza2 = zzbcj.zzb.zza.zza();
        zza2.zzf(zzbcj.zzb.zzd.IN_MEMORY);
        zza2.zzh(zzbcj.zzb.zze.zzi());
        zzd2.zzd(zza2);
        zzfes.zza.zzb().zzc().zzm((zzbcj.zzb) zzd2.zzbr());
        return zzeyx.zzg(zzfes, ((zzeyw) zzffe).zzb);
    }

    private final ListenableFuture zzg(zzfes zzfes, zzezs zzezs) {
        zzcve zzcve = zzfes.zza;
        this.zze = zzcve;
        if (zzfes.zzc != null) {
            if (zzcve.zze() != null) {
                zzfes.zzc.zzp().zzl(zzfes.zza.zze());
            }
            return zzgdn.zzh(zzfes.zzc);
        }
        zzcve.zzb().zzk(zzfes.zzb);
        zzezr zzezr = this.zza;
        zzcve zzcve2 = zzfes.zza;
        zzcve zzcve3 = zzcve2;
        return ((zzezh) zzezr).zzb(zzezs, (zzezq) null, zzcve2);
    }

    /* renamed from: zza */
    public final synchronized zzcve zzd() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezs zzezs, zzezq zzezq, Object obj) {
        zzcve zzcve = null;
        return zzf(zzezs, zzezq, (zzcve) null);
    }

    public final synchronized ListenableFuture zzf(zzezs zzezs, zzezq zzezq, zzcve zzcve) {
        zzezs zzezs2 = zzezs;
        zzezq zzezq2 = zzezq;
        synchronized (this) {
            zzcvd zza2 = zzezq2.zza(zzezs2.zzb);
            zza2.zza(new zzeyy(this.zzd));
            zzcve zzcve2 = (zzcve) zza2.zzh();
            zzcve2.zzf();
            zzcve2.zzf();
            zzm zzm = zzcve2.zzf().zzd;
            if (zzm.zzs == null) {
                if (zzm.zzx == null) {
                    zzfcw zzf2 = zzcve2.zzf();
                    zzm zzm2 = zzf2.zzd;
                    String str = zzf2.zzf;
                    zzx zzx = zzf2.zzj;
                    Executor executor = this.zzf;
                    zzcve zzcve3 = zzcve2;
                    Executor executor2 = executor;
                    zzgde zzgde = (zzgde) zzgdn.zzn(zzgde.zzw(((zzezd) this.zzb).zzb(zzezs2, zzezq2, zzcve2)), new zzeyu(this, zzezs, new zzeyw(zzezq, zzezs, zzm2, str, executor, zzx, (zzfet) null), zzezq, zzcve2), executor2);
                    return zzgde;
                }
            }
            this.zze = zzcve2;
            zzcve zzcve4 = zzcve2;
            ListenableFuture zzb2 = ((zzezh) this.zza).zzb(zzezs2, zzezq2, zzcve2);
            return zzb2;
        }
    }
}
