package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbdx extends zzayt implements zzbdz {
    zzbdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbdw zzbdw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbdw);
        zzdb(1, zza);
    }
}
