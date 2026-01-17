package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbgn extends zzayt implements zzbgp {
    zzbgn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double zzb() throws RemoteException {
        Parcel zzda = zzda(3, zza());
        double readDouble = zzda.readDouble();
        zzda.recycle();
        return readDouble;
    }

    public final int zzc() throws RemoteException {
        Parcel zzda = zzda(5, zza());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    public final int zzd() throws RemoteException {
        Parcel zzda = zzda(4, zza());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    public final Uri zze() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        Uri uri = (Uri) zzayv.zza(zzda, Uri.CREATOR);
        zzda.recycle();
        return uri;
    }

    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzda = zzda(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final Map zzg() throws RemoteException {
        Parcel zzda = zzda(6, zza());
        HashMap zzc = zzayv.zzc(zzda);
        zzda.recycle();
        return zzc;
    }
}
