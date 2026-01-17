package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbnx implements zzcao {
    final /* synthetic */ zzboh zza;
    final /* synthetic */ zzfhj zzb;
    final /* synthetic */ zzboi zzc;

    zzbnx(zzboi zzboi, zzboh zzboh, zzfhj zzfhj) {
        this.zza = zzboh;
        this.zzb = zzfhj;
        Objects.requireNonNull(zzboi);
        this.zzc = zzboi;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnd zzbnd = (zzbnd) obj;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzboi zzboi = this.zzc;
        synchronized (zzboi.zza) {
            zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            zzboi.zzi = 0;
            if (!(zzboi.zzh == null || this.zza == zzboi.zzh)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzboi.zzh.zzb();
            }
            zzboi.zzh = this.zza;
            if (((Boolean) zzbex.zzd.zze()).booleanValue() && zzboi.zze != null) {
                zzfhx zze = zzboi.zze;
                zzfhj zzfhj = this.zzb;
                zzfhj.zzg(true);
                zze.zzc(zzfhj.zzm());
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
