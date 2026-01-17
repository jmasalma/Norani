package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfbv implements zzeln {
    final /* synthetic */ zzfbx zza;

    zzfbv(zzfbx zzfbx) {
        Objects.requireNonNull(zzfbx);
        this.zza = zzfbx;
    }

    public final void zza() {
        zzfbx zzfbx = this.zza;
        synchronized (zzfbx) {
            zzfbx.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbx zzfbx = this.zza;
        zzdon zzdon = (zzdon) obj;
        synchronized (zzfbx) {
            zzfbx.zzd = zzdon;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdP)).booleanValue()) {
                zzdon.zzd().zza = zzfbx.zzc;
            }
            zzfbx.zzd.zzk();
        }
    }
}
