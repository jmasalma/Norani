package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzebi implements zzfhb {
    private final zzeaw zza;
    private final zzeba zzb;

    zzebi(zzeaw zzeaw, zzeba zzeba) {
        this.zza = zzeaw;
        this.zzb = zzeba;
    }

    public final void zzd(zzfgu zzfgu, String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue() && zzfgu.RENDERER == zzfgu) {
            zzeaw zzeaw = this.zza;
            if (zzeaw.zzc() != 0) {
                zzeaw.zzf(zzv.zzD().elapsedRealtime() - zzeaw.zzc());
            }
        }
    }

    public final void zzdE(zzfgu zzfgu, String str) {
    }

    public final void zzdF(zzfgu zzfgu, String str, Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue() && zzfgu.RENDERER == zzfgu) {
            zzeaw zzeaw = this.zza;
            if (zzeaw.zzc() != 0) {
                zzeaw.zzf(zzv.zzD().elapsedRealtime() - zzeaw.zzc());
            }
        }
    }

    public final void zzdG(zzfgu zzfgu, String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue()) {
            if (zzfgu.RENDERER == zzfgu) {
                this.zza.zzg(zzv.zzD().elapsedRealtime());
            } else if (zzfgu.PRELOADED_LOADER == zzfgu || zzfgu.SERVER_TRANSACTION == zzfgu) {
                zzeaw zzeaw = this.zza;
                zzeaw.zzh(zzv.zzD().elapsedRealtime());
                zzeba zzeba = this.zzb;
                zzeba.zza.zza(new zzeaz(zzeba, zzeaw.zzd()));
            }
        }
    }
}
