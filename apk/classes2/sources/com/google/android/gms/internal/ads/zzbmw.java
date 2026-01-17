package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbmw extends zzayt implements zzbmy {
    zzbmw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdb(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zze);
        zzdb(3, zza);
    }

    public final void zzg(zzbms zzbms) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbms);
        zzdb(1, zza);
    }
}
