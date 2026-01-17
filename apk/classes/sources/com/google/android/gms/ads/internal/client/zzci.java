package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbwu;
import com.google.android.gms.internal.ads.zzbwv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzci extends zzayt implements zzck {
    zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    public final int zze(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzda = zzda(16, zza);
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    public final Bundle zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        Parcel zzda = zzda(15, zza);
        Bundle bundle = (Bundle) zzayv.zza(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    public final zzbaw zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(12, zza);
        zzbaw zzb = zzbav.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    public final zzbaw zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(5, zza);
        zzbaw zzb = zzbav.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbx zzi(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 11
            android.os.Parcel r4 = r3.zzda(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.ads.internal.client.zzbx
            if (r2 == 0) goto L_0x0023
            r0 = r1
            com.google.android.gms.ads.internal.client.zzbx r0 = (com.google.android.gms.ads.internal.client.zzbx) r0
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.ads.internal.client.zzbv r1 = new com.google.android.gms.ads.internal.client.zzbv
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzci.zzi(java.lang.String):com.google.android.gms.ads.internal.client.zzbx");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbx zzj(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 7
            android.os.Parcel r4 = r3.zzda(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.ads.internal.client.zzbx
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.ads.internal.client.zzbx r0 = (com.google.android.gms.ads.internal.client.zzbx) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.ads.internal.client.zzbv r1 = new com.google.android.gms.ads.internal.client.zzbv
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzci.zzj(java.lang.String):com.google.android.gms.ads.internal.client.zzbx");
    }

    public final zzfv zzk(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzda = zzda(14, zza);
        zzfv zzfv = (zzfv) zzayv.zza(zzda, zzfv.CREATOR);
        zzda.recycle();
        return zzfv;
    }

    public final zzbwv zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(13, zza);
        zzbwv zzt = zzbwu.zzt(zzda.readStrongBinder());
        zzda.recycle();
        return zzt;
    }

    public final zzbwv zzm(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(3, zza);
        zzbwv zzt = zzbwu.zzt(zzda.readStrongBinder());
        zzda.recycle();
        return zzt;
    }

    public final void zzn(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdb(18, zza);
    }

    public final void zzo(zzbpq zzbpq) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbpq);
        zzdb(8, zza);
    }

    public final void zzp(List list, zzce zzce) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayv.zzg(zza, zzce);
        zzdb(1, zza);
    }

    public final boolean zzq(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzda = zzda(17, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzr(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzda = zzda(10, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzs(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(4, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(6, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzu(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzda = zzda(2, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzv(String str, zzfv zzfv, zzch zzch) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayv.zze(zza, zzfv);
        zzayv.zzg(zza, zzch);
        Parcel zzda = zzda(9, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }
}
