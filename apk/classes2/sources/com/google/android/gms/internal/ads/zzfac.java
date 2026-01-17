package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfac implements zzgdj {
    final /* synthetic */ zzeln zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhj zzc;
    final /* synthetic */ zzdgf zzd;
    final /* synthetic */ zzfad zze;

    zzfac(zzfad zzfad, zzeln zzeln, zzfhu zzfhu, zzfhj zzfhj, zzdgf zzdgf) {
        this.zza = zzeln;
        this.zzb = zzfhu;
        this.zzc = zzfhj;
        this.zzd = zzdgf;
        Objects.requireNonNull(zzfad);
        this.zze = zzfad;
    }

    public final void zza(Throwable th) {
        zzfhu zzfhu;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            zze.zzb("Interstitial ad failed to load", th);
        }
        zzdgf zzdgf = this.zzd;
        com.google.android.gms.ads.internal.client.zze zza2 = zzdgf.zza().zza(th);
        zzfad zzfad = this.zze;
        synchronized (zzfad) {
            zzfad.zzi = null;
            zzdgf.zzb().zzdD(zza2);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zziC)).booleanValue()) {
                zzfad.zzb.execute(new zzezy(this, zza2));
                zzfad.zzb.execute(new zzezz(this, zza2));
            }
            zzfdt.zzb(zza2.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zze2 = zzfad.zzg;
                zzfhj zzfhj = this.zzc;
                zzfhj.zza(zza2);
                zzfhj.zzh(th);
                zzfhj.zzg(false);
                zze2.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzc(zza2);
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
        zzdfb zzdfb = (zzdfb) obj;
        zzfad zzfad = this.zze;
        synchronized (zzfad) {
            zzfad.zzi = null;
            zzbcv zzbcv = zzbde.zziC;
            if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                zzdaj zzo = zzdfb.zzo();
                zzo.zza(zzfad.zzd);
                zzo.zzd(zzfad.zze);
            }
            this.zza.zzb(zzdfb);
            if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                zzfad.zzb.execute(new zzfaa(this));
                zzfad.zzb.execute(new zzfab(this));
            }
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zze2 = zzfad.zzg;
                zzfhj zzfhj = this.zzc;
                zzfhj.zzb(zzdfb.zzq().zzb);
                zzfhj.zzd(zzdfb.zzm().zzg());
                zzfhj.zzg(true);
                zze2.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzg(zzdfb.zzq().zzb);
                zzfhu.zze(zzdfb.zzm().zzg());
                zzfhj zzfhj2 = this.zzc;
                zzfhj2.zzg(true);
                zzfhu.zza(zzfhj2);
                zzfhu.zzh();
            }
        }
    }
}
