package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbyy extends zzayt implements zzbza {
    zzbyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, iObjectWrapper2);
        zza.writeString(str);
        zzayv.zzg(zza, iObjectWrapper3);
        Parcel zzda = zzda(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbze] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzbze r3, com.google.android.gms.internal.ads.zzbyx r4) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r2)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r3)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r4)
            r2 = 1
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyy.zzf(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbze, com.google.android.gms.internal.ads.zzbyx):void");
    }

    public final void zzg(zzbui zzbui) throws RemoteException {
        throw null;
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) throws RemoteException {
        throw null;
    }

    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) throws RemoteException {
        throw null;
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(8, zza);
    }

    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) throws RemoteException {
        throw null;
    }

    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) throws RemoteException {
        throw null;
    }
}
