package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzefq extends zzbrf {
    private final zzedp zza;

    /* synthetic */ zzefq(zzefs zzefs, zzedp zzedp, zzefr zzefr) {
        Objects.requireNonNull(zzefs);
        this.zza = zzedp;
    }

    public final void zze(String str) throws RemoteException {
        ((zzefd) this.zza.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzefd) this.zza.zzc).zzh(zze);
    }

    public final void zzg() throws RemoteException {
        ((zzefd) this.zza.zzc).zzo();
    }
}
