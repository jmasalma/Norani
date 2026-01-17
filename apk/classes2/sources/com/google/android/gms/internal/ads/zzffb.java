package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzffb implements zzgdj {
    final /* synthetic */ zzffe zza;
    final /* synthetic */ zzfff zzb;

    zzffb(zzfff zzfff, zzffe zzffe) {
        this.zza = zzffe;
        Objects.requireNonNull(zzfff);
        this.zzb = zzfff;
    }

    public final void zza(Throwable th) {
        zzfff zzfff = this.zzb;
        synchronized (zzfff) {
            zzfff.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        zzfff zzfff = this.zzb;
        synchronized (zzfff) {
            zzfff.zze = null;
            zzfff.zzd.addFirst(this.zza);
            if (zzfff.zzf == 1) {
                zzfff.zzh();
            }
        }
    }
}
