package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbo extends zzayt implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String zze() throws RemoteException {
        throw null;
    }

    public final String zzf() throws RemoteException {
        throw null;
    }

    public final void zzg(zzm zzm) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        zzdb(1, zza);
    }

    public final void zzh(zzm zzm, int i) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        zza.writeInt(i);
        zzdb(5, zza);
    }

    public final boolean zzi() throws RemoteException {
        Parcel zzda = zzda(3, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }
}
