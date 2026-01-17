package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbi extends zzayt implements zzbk {
    zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void zzc() throws RemoteException {
        zzdb(6, zza());
    }

    public final void zzd() throws RemoteException {
        zzdb(1, zza());
    }

    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdb(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zze);
        zzdb(8, zza);
    }

    public final void zzg() throws RemoteException {
        zzdb(7, zza());
    }

    public final void zzh() throws RemoteException {
        zzdb(3, zza());
    }

    public final void zzi() throws RemoteException {
        zzdb(4, zza());
    }

    public final void zzj() throws RemoteException {
        zzdb(5, zza());
    }

    public final void zzk() throws RemoteException {
        zzdb(9, zza());
    }
}
