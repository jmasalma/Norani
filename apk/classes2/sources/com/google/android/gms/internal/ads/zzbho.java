package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbho extends zzayt implements zzbhq {
    zzbho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbhg zzbhg) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbhg);
        zzdb(1, zza);
    }
}
