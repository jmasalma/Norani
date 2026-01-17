package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeyl implements zzgdj {
    final /* synthetic */ zzfhu zza;
    final /* synthetic */ zzfhj zzb;
    final /* synthetic */ zzcpx zzc;
    final /* synthetic */ zzeym zzd;

    zzeyl(zzeym zzeym, zzfhu zzfhu, zzfhj zzfhj, zzcpx zzcpx) {
        this.zza = zzfhu;
        this.zzb = zzfhj;
        this.zzc = zzcpx;
        Objects.requireNonNull(zzeym);
        this.zzd = zzeym;
    }

    public final void zza(Throwable th) {
        zzfhu zzfhu;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            zze.zzb("Banner ad failed to load", th);
        }
        zzeym zzeym = this.zzd;
        synchronized (zzeym) {
            zzcpx zzcpx = this.zzc;
            com.google.android.gms.ads.internal.client.zze zza2 = zzcpx.zzc().zza(th);
            zzeym.zzn = zza2;
            zzcpx.zze().zzdD(zza2);
            zzfdt.zzb(zza2.zza, th, "BannerAdLoader.onFailure");
            if (zzeym.zzm) {
                zzeym.zzt();
                zzeym.zzh.zzd(zzeym.zzj.zzc());
            }
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zza) == null) {
                zzfhx zzg = zzeym.zzi;
                zzfhj zzfhj = this.zzb;
                zzfhj.zza(zza2);
                zzfhj.zzh(th);
                zzfhj.zzg(false);
                zzg.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzc(zza2);
                zzfhj zzfhj2 = this.zzb;
                zzfhj2.zzh(th);
                zzfhj2.zzg(false);
                zzfhu.zza(zzfhj2);
                zzfhu.zzh();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhu zzfhu;
        zzeym zzeym = this.zzd;
        zzcos zzcos = (zzcos) obj;
        synchronized (zzeym) {
            if (zzeym.zzm) {
                zzeym.zzq();
            }
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zza) == null) {
                zzfhx zzg = zzeym.zzi;
                zzfhj zzfhj = this.zzb;
                zzfhj.zzb(zzcos.zzq().zzb);
                zzfhj.zzd(zzcos.zzm().zzg());
                zzfhj.zzg(true);
                zzg.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzg(zzcos.zzq().zzb);
                zzfhu.zze(zzcos.zzm().zzg());
                zzfhj zzfhj2 = this.zzb;
                zzfhj2.zzg(true);
                zzfhu.zza(zzfhj2);
                zzfhu.zzh();
            }
        }
    }
}
