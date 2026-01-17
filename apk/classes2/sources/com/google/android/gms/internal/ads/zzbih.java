package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbih extends zzayt implements zzbij {
    zzbih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void zzA(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        zzdb(15, zza);
    }

    public final void zzB() throws RemoteException {
        zzdb(28, zza());
    }

    public final void zzC(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        zzdb(33, zza);
    }

    public final void zzD(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        zzdb(17, zza);
    }

    public final void zzE() throws RemoteException {
        zzdb(27, zza());
    }

    public final void zzF(zzdf zzdf) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdf);
        zzdb(26, zza);
    }

    public final void zzG(zzdt zzdt) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdt);
        zzdb(32, zza);
    }

    public final void zzH(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdb(35, zza);
    }

    public final void zzI(zzbig zzbig) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbig);
        zzdb(21, zza);
    }

    public final boolean zzJ() throws RemoteException {
        Parcel zzda = zzda(30, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzK() throws RemoteException {
        Parcel zzda = zzda(24, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzL(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, bundle);
        Parcel zzda = zzda(16, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final double zze() throws RemoteException {
        Parcel zzda = zzda(8, zza());
        double readDouble = zzda.readDouble();
        zzda.recycle();
        return readDouble;
    }

    public final long zzf() throws RemoteException {
        Parcel zzda = zzda(34, zza());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    public final Bundle zzg() throws RemoteException {
        Parcel zzda = zzda(20, zza());
        Bundle bundle = (Bundle) zzayv.zza(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    public final zzea zzh() throws RemoteException {
        Parcel zzda = zzda(31, zza());
        zzea zzb = zzdz.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    public final zzed zzi() throws RemoteException {
        Parcel zzda = zzda(11, zza());
        zzed zzb = zzec.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbgi zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 14
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbgi
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbgi r1 = (com.google.android.gms.internal.ads.zzbgi) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbgg r2 = new com.google.android.gms.internal.ads.zzbgg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbih.zzj():com.google.android.gms.internal.ads.zzbgi");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbgm zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 29
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbgm
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbgm r1 = (com.google.android.gms.internal.ads.zzbgm) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbgk r2 = new com.google.android.gms.internal.ads.zzbgk
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbih.zzk():com.google.android.gms.internal.ads.zzbgm");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbgp zzl() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 5
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbgp
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzbgp r1 = (com.google.android.gms.internal.ads.zzbgp) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzbgn r2 = new com.google.android.gms.internal.ads.zzbgn
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbih.zzl():com.google.android.gms.internal.ads.zzbgp");
    }

    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzda = zzda(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzda = zzda(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final String zzo() throws RemoteException {
        Parcel zzda = zzda(7, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzda = zzda(4, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzda = zzda(6, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        throw null;
    }

    public final String zzt() throws RemoteException {
        Parcel zzda = zzda(10, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzu() throws RemoteException {
        Parcel zzda = zzda(9, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final List zzv() throws RemoteException {
        Parcel zzda = zzda(3, zza());
        ArrayList zzb = zzayv.zzb(zzda);
        zzda.recycle();
        return zzb;
    }

    public final List zzw() throws RemoteException {
        Parcel zzda = zzda(23, zza());
        ArrayList zzb = zzayv.zzb(zzda);
        zzda.recycle();
        return zzb;
    }

    public final void zzx() throws RemoteException {
        zzdb(22, zza());
    }

    public final void zzy() throws RemoteException {
        zzdb(13, zza());
    }

    public final void zzz(zzdj zzdj) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdj);
        zzdb(25, zza);
    }
}
