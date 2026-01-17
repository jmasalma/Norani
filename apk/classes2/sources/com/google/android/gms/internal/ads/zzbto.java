package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbto extends zzayt implements zzbtq {
    zzbto(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final boolean zzH() throws RemoteException {
        Parcel zzda = zzda(11, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzayv.zze(zza, intent);
        zzdb(12, zza);
    }

    public final void zzi() throws RemoteException {
        zzdb(10, zza());
    }

    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(13, zza);
    }

    public final void zzl(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        zzdb(1, zza);
    }

    public final void zzm() throws RemoteException {
        zzdb(8, zza());
    }

    public final void zzo() throws RemoteException {
        zzdb(5, zza());
    }

    public final void zzp(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzdb(15, zza);
    }

    public final void zzq() throws RemoteException {
        zzdb(2, zza());
    }

    public final void zzr() throws RemoteException {
        zzdb(4, zza());
    }

    public final void zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        Parcel zzda = zzda(6, zza);
        if (zzda.readInt() != 0) {
            bundle.readFromParcel(zzda);
        }
        zzda.recycle();
    }

    public final void zzt() throws RemoteException {
        zzdb(3, zza());
    }

    public final void zzu() throws RemoteException {
        zzdb(7, zza());
    }

    public final void zzv() throws RemoteException {
        zzdb(14, zza());
    }

    public final void zzx() throws RemoteException {
        zzdb(9, zza());
    }
}
