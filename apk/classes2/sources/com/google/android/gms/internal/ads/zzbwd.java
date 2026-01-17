package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbwd extends zzayt implements IInterface {
    zzbwd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwc zzbwc, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbwc);
        zza.writeString(str);
        zza.writeString(str2);
        zzdb(2, zza);
    }
}
