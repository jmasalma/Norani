package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzegf extends zzbri {
    final /* synthetic */ zzegh zza;
    private final zzedp zzb;

    /* synthetic */ zzegf(zzegh zzegh, zzedp zzedp, zzegg zzegg) {
        Objects.requireNonNull(zzegh);
        this.zza = zzegh;
        this.zzb = zzedp;
    }

    public final void zze(String str) throws RemoteException {
        ((zzefd) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzefd) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(zzbqf zzbqf) throws RemoteException {
        this.zza.zzc = zzbqf;
        ((zzefd) this.zzb.zzc).zzo();
    }
}
