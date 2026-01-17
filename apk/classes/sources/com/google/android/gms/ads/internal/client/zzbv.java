package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbwi;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbv extends zzayt implements zzbx {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzA() throws RemoteException {
        zzdb(5, zza());
    }

    public final void zzB() throws RemoteException {
        zzdb(11, zza());
    }

    public final void zzC() throws RemoteException {
        zzdb(6, zza());
    }

    public final void zzD(zzbh zzbh) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbh);
        zzdb(20, zza);
    }

    public final void zzE(zzbk zzbk) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbk);
        zzdb(7, zza);
    }

    public final void zzF(zzcb zzcb) throws RemoteException {
        throw null;
    }

    public final void zzG(zzr zzr) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzr);
        zzdb(13, zza);
    }

    public final void zzH(zzco zzco) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzco);
        zzdb(8, zza);
    }

    public final void zzI(zzbaz zzbaz) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbaz);
        zzdb(40, zza);
    }

    public final void zzJ(zzx zzx) throws RemoteException {
        throw null;
    }

    public final void zzK(zzcv zzcv) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzcv);
        zzdb(45, zza);
    }

    public final void zzL(zzeh zzeh) throws RemoteException {
        throw null;
    }

    public final void zzM(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(34, zza);
    }

    public final void zzN(zzbtz zzbtz) throws RemoteException {
        throw null;
    }

    public final void zzO(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(22, zza);
    }

    public final void zzP(zzbdz zzbdz) throws RemoteException {
        throw null;
    }

    public final void zzQ(zzdt zzdt) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdt);
        zzdb(42, zza);
    }

    public final void zzR(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdb(48, zza);
    }

    public final void zzS(zzbuc zzbuc, String str) throws RemoteException {
        throw null;
    }

    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    public final void zzU(zzbwi zzbwi) throws RemoteException {
        throw null;
    }

    public final void zzV(String str) throws RemoteException {
        throw null;
    }

    public final void zzW(zzgc zzgc) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzgc);
        zzdb(29, zza);
    }

    public final void zzY(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(44, zza);
    }

    public final void zzZ() throws RemoteException {
        throw null;
    }

    public final boolean zzaa() throws RemoteException {
        Parcel zzda = zzda(46, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzab() throws RemoteException {
        Parcel zzda = zzda(23, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzac() throws RemoteException {
        throw null;
    }

    public final boolean zzad(zzm zzm) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        Parcel zzda = zzda(4, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final void zzae(zzcs zzcs) throws RemoteException {
        throw null;
    }

    public final long zzc() throws RemoteException {
        Parcel zzda = zzda(47, zza());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final zzr zzh() throws RemoteException {
        Parcel zzda = zzda(12, zza());
        zzr zzr = (zzr) zzayv.zza(zzda, zzr.CREATOR);
        zzda.recycle();
        return zzr;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbk zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 33
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbk
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbk r1 = (com.google.android.gms.ads.internal.client.zzbk) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbi r2 = new com.google.android.gms.ads.internal.client.zzbi
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbv.zzj():com.google.android.gms.ads.internal.client.zzbk");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzco zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 32
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzco
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzco r1 = (com.google.android.gms.ads.internal.client.zzco) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzcm r2 = new com.google.android.gms.ads.internal.client.zzcm
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbv.zzk():com.google.android.gms.ads.internal.client.zzco");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzea zzl() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 41
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzea
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzea r1 = (com.google.android.gms.ads.internal.client.zzea) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdy r2 = new com.google.android.gms.ads.internal.client.zzdy
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbv.zzl():com.google.android.gms.ads.internal.client.zzea");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzed zzm() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 26
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzed
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzed r1 = (com.google.android.gms.ads.internal.client.zzed) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzeb r2 = new com.google.android.gms.ads.internal.client.zzeb
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbv.zzm():com.google.android.gms.ads.internal.client.zzed");
    }

    public final IObjectWrapper zzo() throws RemoteException {
        Parcel zzda = zzda(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final String zzs() throws RemoteException {
        Parcel zzda = zzda(31, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        throw null;
    }

    public final String zzu() throws RemoteException {
        throw null;
    }

    public final void zzy() throws RemoteException {
        zzdb(2, zza());
    }

    public final void zzz(zzm zzm, zzbn zzbn) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, zzbn);
        zzdb(43, zza);
    }
}
