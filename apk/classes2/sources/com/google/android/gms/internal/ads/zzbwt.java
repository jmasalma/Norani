package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbwt extends zzayt implements zzbwv {
    zzbwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final long zzb() throws RemoteException {
        Parcel zzda = zzda(17, zza());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    public final Bundle zzc() throws RemoteException {
        Parcel zzda = zzda(9, zza());
        Bundle bundle = (Bundle) zzayv.zza(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    public final zzea zzd() throws RemoteException {
        Parcel zzda = zzda(12, zza());
        zzea zzb = zzdz.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbws zze() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbws
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbws r1 = (com.google.android.gms.internal.ads.zzbws) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwq r2 = new com.google.android.gms.internal.ads.zzbwq
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwt.zze():com.google.android.gms.internal.ads.zzbws");
    }

    public final String zzf() throws RemoteException {
        Parcel zzda = zzda(16, zza());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzg() throws RemoteException {
        throw null;
    }

    public final void zzh(zzm zzm, zzbxc zzbxc) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, zzbxc);
        zzdb(1, zza);
    }

    public final void zzi(zzm zzm, zzbxc zzbxc) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, zzbxc);
        zzdb(14, zza);
    }

    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(15, zza);
    }

    public final void zzk(zzdq zzdq) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdq);
        zzdb(8, zza);
    }

    public final void zzl(zzdt zzdt) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzdt);
        zzdb(13, zza);
    }

    public final void zzm(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdb(18, zza);
    }

    public final void zzn(zzbwy zzbwy) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbwy);
        zzdb(2, zza);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbxj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzo(com.google.android.gms.internal.ads.zzbxj r2) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zze(r0, r2)
            r2 = 7
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwt.zzo(com.google.android.gms.internal.ads.zzbxj):void");
    }

    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(5, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    public final boolean zzr() throws RemoteException {
        throw null;
    }

    public final void zzs(zzbxd zzbxd) throws RemoteException {
        throw null;
    }
}
