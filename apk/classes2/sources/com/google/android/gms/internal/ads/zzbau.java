package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbau extends zzayt implements zzbaw {
    zzbau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final long zze() throws RemoteException {
        Parcel zzda = zzda(9, zza());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    public final zzbx zzf() throws RemoteException {
        throw null;
    }

    public final zzea zzg() throws RemoteException {
        Parcel zzda = zzda(5, zza());
        zzea zzb = zzdz.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    public final String zzh() throws RemoteException {
        Parcel zzda = zzda(8, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final void zzi(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(6, zza);
    }

    public final void zzj(zzdt zzdt) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdt);
        zzdb(7, zza);
    }

    public final void zzk(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdb(10, zza);
    }

    public final void zzl(IObjectWrapper iObjectWrapper, zzbbd zzbbd) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbbd);
        zzdb(4, zza);
    }
}
