package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzekd implements zzeln {
    final /* synthetic */ zzeke zza;

    zzekd(zzeke zzeke) {
        Objects.requireNonNull(zzeke);
        this.zza = zzeke;
    }

    public final void zza() {
        zzeke zzeke = this.zza;
        synchronized (zzeke) {
            zzeke.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeke zzeke = this.zza;
        zzcos zzcos = (zzcos) obj;
        synchronized (zzeke) {
            if (zzeke.zzi != null) {
                if (!(zzcos.zzl() == null || zzeke.zzi.zzl() == null)) {
                    zzcos.zzl().zzb(zzeke.zzi.zzl().zza());
                }
                zzeke.zzi.zzb();
            }
            zzeke.zzi = zzcos;
            zzeke.zzi.zzk();
        }
    }
}
