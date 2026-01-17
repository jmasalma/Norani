package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzcf extends zzayt implements zzch {
    zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    public final void zze(String str, zze zze) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayv.zze(zza, zze);
        zzdb(3, zza);
    }

    public final void zzf(String str, zzea zzea) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayv.zzg(zza, zzea);
        zzdb(1, zza);
    }

    public final void zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdb(2, zza);
    }
}
