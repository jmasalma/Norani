package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzelu implements zzgdj {
    final /* synthetic */ zzeln zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhj zzc;
    final /* synthetic */ zzdhb zzd;
    final /* synthetic */ zzelv zze;

    zzelu(zzelv zzelv, zzeln zzeln, zzfhu zzfhu, zzfhj zzfhj, zzdhb zzdhb) {
        this.zza = zzeln;
        this.zzb = zzfhu;
        this.zzc = zzfhj;
        this.zzd = zzdhb;
        Objects.requireNonNull(zzelv);
        this.zze = zzelv;
    }

    public final void zza(Throwable th) {
        zzfhu zzfhu;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            zze.zzb("Native ad failed to load", th);
        }
        zzdhb zzdhb = this.zzd;
        com.google.android.gms.ads.internal.client.zze zza2 = zzdhb.zza().zza(th);
        zzdhb.zzb().zzdD(zza2);
        zzelv zzelv = this.zze;
        zzelv.zzb.zzA().execute(new zzelt(this, zza2));
        zzfdt.zzb(zza2.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
            zzfhx zze2 = zzelv.zze;
            zzfhj zzfhj = this.zzc;
            zzfhj.zza(zza2);
            zzfhj.zzh(th);
            zzfhj.zzg(false);
            zze2.zzc(zzfhj.zzm());
            return;
        }
        zzfhu.zzc(zza2);
        zzfhj zzfhj2 = this.zzc;
        zzfhj2.zzh(th);
        zzfhj2.zzg(false);
        zzfhu.zza(zzfhj2);
        zzfhu.zzh();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhu zzfhu;
        zzelv zzelv = this.zze;
        zzcra zzcra = (zzcra) obj;
        synchronized (zzelv) {
            zzcra.zzo().zza(zzelv.zzd.zzd());
            this.zza.zzb(zzcra);
            zzelv.zzb.zzA().execute(new zzels(this));
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zze2 = zzelv.zze;
                zzfhj zzfhj = this.zzc;
                zzfhj.zzb(zzcra.zzq().zzb);
                zzfhj.zzd(zzcra.zzm().zzg());
                zzfhj.zzg(true);
                zze2.zzc(zzfhj.zzm());
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
