package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzcc extends zzayt implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    public final void zze(zzfv zzfv) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzfv);
        zzdb(1, zza);
    }

    public final void zzf(zzfv zzfv) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzfv);
        zzdb(2, zza);
    }
}
