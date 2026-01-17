package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzblu extends zzayu implements zzblv {
    public zzblu() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzayv.zzd(parcel);
        zzb((ParcelFileDescriptor) zzayv.zza(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
