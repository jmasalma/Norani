package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.0.0 */
public final class zaf extends zaa implements IInterface {
    zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zac(7, zaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        zac.zad(zaa, iAccountAccessor);
        zaa.writeInt(i);
        zac.zab(zaa, z);
        zac(9, zaa);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.signin.internal.zai, android.os.Parcelable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zag(com.google.android.gms.signin.internal.zai r2, com.google.android.gms.signin.internal.zae r3) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zac(r0, r2)
            com.google.android.gms.internal.base.zac.zad(r0, r3)
            r2 = 12
            r1.zac(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zaf.zag(com.google.android.gms.signin.internal.zai, com.google.android.gms.signin.internal.zae):void");
    }
}
