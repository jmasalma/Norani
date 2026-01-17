package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeed extends zzbqz {
    private final zzedp zza;

    /* synthetic */ zzeed(zzedp zzedp, zzeee zzeee) {
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
