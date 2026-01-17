package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbpp;
import com.google.android.gms.internal.ads.zzbpq;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzcw extends zzayt implements zzcy {
    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbpq getAdapterCreator() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        zzbpq zzf = zzbpp.zzf(zzda.readStrongBinder());
        zzda.recycle();
        return zzf;
    }

    public final zzfd getLiteSdkVersion() throws RemoteException {
        Parcel zzda = zzda(1, zza());
        zzfd zzfd = (zzfd) zzayv.zza(zzda, zzfd.CREATOR);
        zzda.recycle();
        return zzfd;
    }
}
