package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbib extends zzayt implements zzbid {
    zzbib(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbij zzbij) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbij);
        zzdb(1, zza);
    }
}
