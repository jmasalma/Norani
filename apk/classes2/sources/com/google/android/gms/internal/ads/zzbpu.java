package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbpu extends zzayt implements zzbpw {
    zzbpu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void zze() throws RemoteException {
        zzdb(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzdb(2, zza());
    }

    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdb(3, zza);
    }

    public final void zzh(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zze);
        zzdb(23, zza);
    }

    public final void zzi(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzdb(22, zza);
    }

    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    public final void zzk(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zze);
        zzdb(24, zza);
    }

    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdb(21, zza);
    }

    public final void zzm() throws RemoteException {
        zzdb(8, zza());
    }

    public final void zzn() throws RemoteException {
        zzdb(4, zza());
    }

    public final void zzo() throws RemoteException {
        zzdb(6, zza());
    }

    public final void zzp() throws RemoteException {
        zzdb(5, zza());
    }

    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzdb(9, zza);
    }

    public final void zzr(zzbhj zzbhj, String str) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbhj);
        zza.writeString(str);
        zzdb(10, zza);
    }

    public final void zzs(zzbwo zzbwo) throws RemoteException {
        throw null;
    }

    public final void zzt(zzbws zzbws) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbws);
        zzdb(16, zza);
    }

    public final void zzu() throws RemoteException {
        zzdb(25, zza());
    }

    public final void zzv() throws RemoteException {
        zzdb(18, zza());
    }

    public final void zzw() throws RemoteException {
        zzdb(11, zza());
    }

    public final void zzx() throws RemoteException {
        zzdb(15, zza());
    }

    public final void zzy() throws RemoteException {
        zzdb(20, zza());
    }

    public final void zzz() throws RemoteException {
        zzdb(13, zza());
    }
}
