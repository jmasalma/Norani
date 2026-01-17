package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbvj extends zzayt implements IInterface {
    zzbvj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzbb);
        zzdb(2, zza);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbva] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(java.lang.String r2, com.google.android.gms.internal.ads.zzbva r3) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r3)
            r2 = 1
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvj.zzf(java.lang.String, com.google.android.gms.internal.ads.zzbva):void");
    }
}
