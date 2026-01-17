package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeev extends zzbrc {
    final /* synthetic */ zzeex zza;
    private final zzedp zzb;

    /* synthetic */ zzeev(zzeex zzeex, zzedp zzedp, zzeew zzeew) {
        Objects.requireNonNull(zzeex);
        this.zza = zzeex;
        this.zzb = zzedp;
    }

    public final void zze(String str) throws RemoteException {
        ((zzefd) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzefd) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzefd) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbpz zzbpz) throws RemoteException {
        this.zza.zzd = zzbpz;
        ((zzefd) this.zzb.zzc).zzo();
    }
}
