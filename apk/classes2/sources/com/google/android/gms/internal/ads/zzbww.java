package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbww extends zzayt implements zzbwy {
    zzbww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() throws RemoteException {
        zzdb(7, zza());
    }

    public final void zzf() throws RemoteException {
        zzdb(6, zza());
    }

    public final void zzg() throws RemoteException {
        zzdb(2, zza());
    }

    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdb(4, zza);
    }

    public final void zzi(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zze);
        zzdb(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzdb(1, zza());
    }

    public final void zzk(zzbws zzbws) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbws);
        zzdb(3, zza);
    }
}
