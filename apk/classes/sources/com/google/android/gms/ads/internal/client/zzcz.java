package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbpq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzcz extends zzayt implements zzdb {
    zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() throws RemoteException {
        Parcel zzda = zzda(7, zza());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    public final String zzf() throws RemoteException {
        Parcel zzda = zzda(9, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final List zzg() throws RemoteException {
        Parcel zzda = zzda(13, zza());
        ArrayList createTypedArrayList = zzda.createTypedArrayList(zzbmd.CREATOR);
        zzda.recycle();
        return createTypedArrayList;
    }

    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdb(10, zza);
    }

    public final void zzi() throws RemoteException {
        zzdb(15, zza());
    }

    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(17, zza);
    }

    public final void zzk() throws RemoteException {
        zzdb(1, zza());
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(6, zza);
    }

    public final void zzm(zzdn zzdn) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdn);
        zzdb(16, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzdb(5, zza);
    }

    public final void zzo(zzbpq zzbpq) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbpq);
        zzdb(11, zza);
    }

    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(4, zza);
    }

    public final void zzq(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzdb(2, zza);
    }

    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    public final void zzs(zzbmk zzbmk) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbmk);
        zzdb(12, zza);
    }

    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdb(18, zza);
    }

    public final void zzu(zzfx zzfx) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzfx);
        zzdb(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzda = zzda(8, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }
}
