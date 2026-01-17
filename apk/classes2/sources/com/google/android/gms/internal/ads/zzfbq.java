package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfbq implements zzeln {
    final /* synthetic */ zzfbr zza;

    zzfbq(zzfbr zzfbr) {
        Objects.requireNonNull(zzfbr);
        this.zza = zzfbr;
    }

    public final void zza() {
        zzfbr zzfbr = this.zza;
        synchronized (zzfbr) {
            zzfbr.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbr zzfbr = this.zza;
        zzdon zzdon = (zzdon) obj;
        synchronized (zzfbr) {
            zzfbr.zzi = zzdon;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdP)).booleanValue()) {
                zzdon.zzd().zza = zzfbr.zzd;
            }
            zzfbr.zzi.zzk();
        }
    }
}
