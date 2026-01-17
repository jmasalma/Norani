package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbrn extends zzayt implements zzbrp {
    zzbrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzed zze() throws RemoteException {
        Parcel zzda = zzda(5, zza());
        zzed zzb = zzec.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    public final zzbse zzf() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        zzbse zzbse = (zzbse) zzayv.zza(zzda, zzbse.CREATOR);
        zzda.recycle();
        return zzbse;
    }

    public final zzbse zzg() throws RemoteException {
        Parcel zzda = zzda(3, zza());
        zzbse zzbse = (zzbse) zzayv.zza(zzda, zzbse.CREATOR);
        zzda.recycle();
        return zzbse;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzr zzr, zzbrs zzbrs) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzayv.zze(zza, bundle);
        zzayv.zze(zza, bundle2);
        zzayv.zze(zza, zzr);
        zzayv.zzg(zza, zzbrs);
        zzdb(1, zza);
    }

    public final void zzi(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbra zzbra, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbra);
        zzayv.zzg(zza, zzbpw);
        zzdb(23, zza);
    }

    public final void zzj(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrd zzbrd, zzbpw zzbpw, zzr zzr) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbrd);
        zzayv.zzg(zza, zzbpw);
        zzayv.zze(zza, zzr);
        zzdb(13, zza);
    }

    public final void zzk(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrd zzbrd, zzbpw zzbpw, zzr zzr) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbrd);
        zzayv.zzg(zza, zzbpw);
        zzayv.zze(zza, zzr);
        zzdb(21, zza);
    }

    public final void zzl(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrg zzbrg, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbrg);
        zzayv.zzg(zza, zzbpw);
        zzdb(14, zza);
    }

    public final void zzm(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrj zzbrj, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbrj);
        zzayv.zzg(zza, zzbpw);
        zzdb(18, zza);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzbge, android.os.Parcelable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzn(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbrj r6, com.google.android.gms.internal.ads.zzbpw r7, com.google.android.gms.internal.ads.zzbge r8) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r4)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r5)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r6)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r7)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r8)
            r2 = 22
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrn.zzn(java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzm, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbrj, com.google.android.gms.internal.ads.zzbpw, com.google.android.gms.internal.ads.zzbge):void");
    }

    public final void zzo(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrm zzbrm, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbrm);
        zzayv.zzg(zza, zzbpw);
        zzdb(20, zza);
    }

    public final void zzp(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrm zzbrm, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zze(zza, zzm);
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbrm);
        zzayv.zzg(zza, zzbpw);
        zzdb(16, zza);
    }

    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdb(19, zza);
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        Parcel zzda = zzda(24, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        Parcel zzda = zzda(15, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        Parcel zzda = zzda(17, zza);
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }
}
