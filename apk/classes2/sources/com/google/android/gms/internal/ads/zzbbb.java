package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbbb extends zzayt implements zzbbd {
    zzbbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final void zzb() throws RemoteException {
        zzdb(5, zza());
    }

    public final void zzc() throws RemoteException {
        zzdb(2, zza());
    }

    public final void zzd(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zze);
        zzdb(3, zza);
    }

    public final void zze() throws RemoteException {
        zzdb(4, zza());
    }

    public final void zzf() throws RemoteException {
        zzdb(1, zza());
    }
}
