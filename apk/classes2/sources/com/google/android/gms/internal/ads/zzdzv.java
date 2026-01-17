package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdzv implements zzgdj {
    final /* synthetic */ zzbva zza;
    final /* synthetic */ zzbvj zzb;

    zzdzv(zzeab zzeab, zzbvj zzbvj, zzbva zzbva) {
        this.zzb = zzbvj;
        this.zza = zzbva;
        Objects.requireNonNull(zzeab);
    }

    public final void zza(Throwable th) {
        try {
            this.zzb.zze(zzbb.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
