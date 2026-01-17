package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbhr extends zzayt implements zzbht {
    zzbhr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzbhj zzbhj, String str) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbhj);
        zza.writeString(str);
        zzdb(1, zza);
    }
}
