package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfbk implements zzgdj {
    final /* synthetic */ zzeln zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhj zzc;
    final /* synthetic */ zzfbl zzd;
    final /* synthetic */ zzfbn zze;

    zzfbk(zzfbn zzfbn, zzeln zzeln, zzfhu zzfhu, zzfhj zzfhj, zzfbl zzfbl) {
        this.zza = zzeln;
        this.zzb = zzfhu;
        this.zzc = zzfhj;
        this.zzd = zzfbl;
        Objects.requireNonNull(zzfbn);
        this.zze = zzfbn;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhu zzfhu;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfbn zzfbn = this.zze;
        zzdos zzdos = (zzdos) zzfbn.zze.zzd();
        if (zzdos == null) {
            zze2 = zzfdx.zzb(th, (zzedr) null);
        } else {
            zze2 = zzdos.zzb().zza(th);
        }
        synchronized (zzfbn) {
            if (zzdos != null) {
                zzdos.zza().zzdD(zze2);
                zzfbn.zzb.execute(new zzfbi(this, zze2));
            } else {
                zzfbn.zzd.zzdD(zze2);
                zzfbn.zzk(this.zzd).zze().zzb().zzc().zzh();
            }
            zzfdt.zzb(zze2.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zzg = zzfbn.zzg;
                zzfhj zzfhj = this.zzc;
                zzfhj.zza(zze2);
                zzfhj.zzh(th);
                zzfhj.zzg(false);
                zzg.zzc(zzfhj.zzm());
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
        zzfbn zzfbn = this.zze;
        zzdon zzdon = (zzdon) obj;
        synchronized (zzfbn) {
            zzdon.zzo().zzd(zzfbn.zzd);
            this.zza.zzb(zzdon);
            Executor zzh = zzfbn.zzb;
            zzfbd zzf = zzfbn.zzd;
            Objects.requireNonNull(zzf);
            zzh.execute(new zzfbj(zzf));
            zzfbn.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzfhu = this.zzb) == null) {
                zzfhx zzg = zzfbn.zzg;
                zzfhj zzfhj = this.zzc;
                zzfhj.zzb(zzdon.zzq().zzb);
                zzfhj.zzd(zzdon.zzm().zzg());
                zzfhj.zzg(true);
                zzg.zzc(zzfhj.zzm());
            } else {
                zzfhu.zzg(zzdon.zzq().zzb);
                zzfhu.zze(zzdon.zzm().zzg());
                zzfhj zzfhj2 = this.zzc;
                zzfhj2.zzg(true);
                zzfhu.zza(zzfhj2);
                zzfhu.zzh();
            }
        }
    }
}
