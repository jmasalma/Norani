package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzbri extends zzayu implements zzbrj {
    public zzbri() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbqf zzb = zzbqe.zzb(parcel.readStrongBinder());
            zzayv.zzd(parcel);
            zzg(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzayv.zzd(parcel);
            zze(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzayv.zzd(parcel);
            zzf(zzayv.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
