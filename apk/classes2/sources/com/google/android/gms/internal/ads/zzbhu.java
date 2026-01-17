package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbhu extends zzayt implements zzbhw {
    zzbhu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzbhj zzbhj) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbhj);
        zzdb(1, zza);
    }
}
