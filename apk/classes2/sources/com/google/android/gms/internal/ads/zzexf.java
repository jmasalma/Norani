package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzexf implements zzgdj {
    final /* synthetic */ zzeln zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhj zzc;
    final /* synthetic */ zzexg zzd;
    final /* synthetic */ zzexi zze;

    zzexf(zzexi zzexi, zzeln zzeln, zzfhu zzfhu, zzfhj zzfhj, zzexg zzexg) {
        this.zza = zzeln;
        this.zzb = zzfhu;
        this.zzc = zzfhj;
        this.zzd = zzexg;
        Objects.requireNonNull(zzexi);
        this.zze = zzexi;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhu zzfhu;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzexi zzexi = this.zze;
        zzcoc zzcoc = (zzcoc) zzexi.zze.zzd();
        if (zzcoc == null) {
            zze2 = zzfdx.zzb(th, (zzedr) null);
        } else {
            zze2 = zzcoc.zzb().zza(th);
        }
        synchronized (zzexi) {
            zzexi.zzj = null;
            if (zzcoc != null) {
                zzcoc.zzc().zzdD(zze2);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zziB)).booleanValue()) {
                    zzexi.zzc.execute(new zzexe(this, zze2));
                }
            } else {
                zzexi.zzd.zzdD(zze2);
                ((zzcoc) zzexi.zzm(this.zzd).zzh()).zzb().zzc().zzh();
            }
            zzfdt.zzb(zze2.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zzh = zzexi.zzh;
                zzfhj zzfhj = this.zzc;
                zzfhj.zza(zze2);
                zzfhj.zzh(th);
                zzfhj.zzg(false);
                zzh.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzc(zze2);
                zzfhj zzfhj2 = this.zzc;
                zzfhj2.zzh(th);
                zzfhj2.zzg(false);
                zzfhu.zza(zzfhj2);
                zzfhu.zzh();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhu zzfhu;
        zzcra zzcra = (zzcra) obj;
        zzexi zzexi = this.zze;
        synchronized (zzexi) {
            zzexi.zzj = null;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zziB)).booleanValue()) {
                zzcra.zzo().zzb(zzexi.zzd);
            }
            this.zza.zzb(zzcra);
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zzh = zzexi.zzh;
                zzfhj zzfhj = this.zzc;
                zzfhj.zzb(zzcra.zzq().zzb);
                zzfhj.zzd(zzcra.zzm().zzg());
                zzfhj.zzg(true);
                zzh.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzg(zzcra.zzq().zzb);
                zzfhu.zze(zzcra.zzm().zzg());
                zzfhj zzfhj2 = this.zzc;
                zzfhj2.zzg(true);
                zzfhu.zza(zzfhj2);
                zzfhu.zzh();
            }
        }
    }
}
