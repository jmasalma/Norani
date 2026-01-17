package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzeb extends zzayt implements zzed {
    zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float zze() throws RemoteException {
        throw null;
    }

    public final float zzf() throws RemoteException {
        throw null;
    }

    public final float zzg() throws RemoteException {
        throw null;
    }

    public final int zzh() throws RemoteException {
        Parcel zzda = zzda(5, zza());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzeg zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 11
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzeg
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzeg r1 = (com.google.android.gms.ads.internal.client.zzeg) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzee r2 = new com.google.android.gms.ads.internal.client.zzee
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzeb.zzi():com.google.android.gms.ads.internal.client.zzeg");
    }

    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(3, zza);
    }

    public final void zzk() throws RemoteException {
        zzdb(2, zza());
    }

    public final void zzl() throws RemoteException {
        zzdb(1, zza());
    }

    public final void zzm(zzeg zzeg) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzeg);
        zzdb(8, zza);
    }

    public final void zzn() throws RemoteException {
        zzdb(13, zza());
    }

    public final boolean zzo() throws RemoteException {
        Parcel zzda = zzda(12, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzda = zzda(10, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzda = zzda(4, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }
}
