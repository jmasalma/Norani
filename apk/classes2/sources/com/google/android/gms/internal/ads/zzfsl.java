package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfsl extends zzayt implements zzfsn {
    zzfsl(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(Bundle bundle, zzfsp zzfsp) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        zzayv.zzg(zza, zzfsp);
        zzdc(2, zza);
    }

    public final void zzf(String str, Bundle bundle, zzfsp zzfsp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayv.zze(zza, bundle);
        zzayv.zzg(zza, zzfsp);
        zzdc(1, zza);
    }

    public final void zzg(Bundle bundle, zzfsp zzfsp) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        zzayv.zzg(zza, zzfsp);
        zzdc(3, zza);
    }
}
