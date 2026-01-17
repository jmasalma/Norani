package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbvg extends zzayt implements zzbvi {
    zzbvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zze(zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzbb);
        zzdb(2, zza);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, parcelFileDescriptor);
        zzdb(1, zza);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbvq] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(android.os.ParcelFileDescriptor r2, com.google.android.gms.internal.ads.zzbvq r3) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zze(r0, r2)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r3)
            r2 = 3
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvg.zzg(android.os.ParcelFileDescriptor, com.google.android.gms.internal.ads.zzbvq):void");
    }
}
