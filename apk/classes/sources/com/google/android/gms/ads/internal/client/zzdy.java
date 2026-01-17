package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzdy extends zzayt implements zzea {
    zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzda = zzda(5, zza());
        Bundle bundle = (Bundle) zzayv.zza(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    public final zzv zzf() throws RemoteException {
        Parcel zzda = zzda(4, zza());
        zzv zzv = (zzv) zzayv.zza(zzda, zzv.CREATOR);
        zzda.recycle();
        return zzv;
    }

    public final String zzg() throws RemoteException {
        Parcel zzda = zzda(1, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzh() throws RemoteException {
        Parcel zzda = zzda(6, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzi() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final List zzj() throws RemoteException {
        Parcel zzda = zzda(3, zza());
        ArrayList<zzv> createTypedArrayList = zzda.createTypedArrayList(zzv.CREATOR);
        zzda.recycle();
        return createTypedArrayList;
    }
}
