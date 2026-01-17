package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzegk implements zzgdj {
    final /* synthetic */ zzfca zza;
    final /* synthetic */ zzegl zzb;

    zzegk(zzegl zzegl, zzfca zzfca) {
        this.zza = zzfca;
        Objects.requireNonNull(zzegl);
        this.zzb = zzegl;
    }

    public final void zza(Throwable th) {
        zzegl zzegl = this.zzb;
        synchronized (zzegl) {
            zzegm zza2 = zzegl.zzh;
            zzfca zzfca = this.zza;
            zza2.zzb(th, zzfca);
            zzfca zza3 = zzegl.zzh.zza();
            if (zzfca.zzav) {
                while (zza3 != null) {
                    zzegl.zze(zza3);
                    zza3 = zzegl.zzh.zza();
                }
            } else if (zza3 != null) {
                zzegl.zze(zza3);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegl zzegl = this.zzb;
        zzehc zzehc = (zzehc) obj;
        synchronized (zzegl) {
            zzegl.zzh.zzc(zzehc, this.zza);
            zzfca zza2 = zzegl.zzh.zza();
            if (zza2 != null) {
                zzegl.zze(zza2);
            }
        }
    }
}
