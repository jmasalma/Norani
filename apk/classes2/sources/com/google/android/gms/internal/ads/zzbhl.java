package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbhl extends zzayt implements zzbhn {
    zzbhl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzbhe zzbhe) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbhe);
        zzdb(1, zza);
    }
}
