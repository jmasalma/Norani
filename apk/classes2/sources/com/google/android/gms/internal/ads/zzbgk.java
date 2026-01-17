package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbgk extends zzayt implements zzbgm {
    zzbgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    public final float zzf() throws RemoteException {
        Parcel zzda = zzda(6, zza());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel zzda = zzda(5, zza());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    public final zzed zzh() throws RemoteException {
        Parcel zzda = zzda(7, zza());
        zzed zzb = zzec.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzda = zzda(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(3, zza);
    }

    public final boolean zzk() throws RemoteException {
        Parcel zzda = zzda(10, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzl() throws RemoteException {
        Parcel zzda = zzda(8, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final void zzm(zzbhx zzbhx) throws RemoteException {
        throw null;
    }
}
