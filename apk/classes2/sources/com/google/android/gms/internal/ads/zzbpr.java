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
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbpr extends zzayt implements zzbpt {
    zzbpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zzayv.zzg(zza, zzbpw);
        zzdb(28, zza);
    }

    public final void zzB(zzm zzm, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zzayv.zzg(zza, zzbpw);
        zzdb(32, zza);
    }

    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(21, zza);
    }

    public final void zzE() throws RemoteException {
        zzdb(8, zza());
    }

    public final void zzF() throws RemoteException {
        zzdb(9, zza());
    }

    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayv.zza;
        zza.writeInt(z ? 1 : 0);
        zzdb(25, zza);
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(39, zza);
    }

    public final void zzI() throws RemoteException {
        zzdb(4, zza());
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(37, zza);
    }

    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzdb(30, zza);
    }

    public final void zzL() throws RemoteException {
        zzdb(12, zza());
    }

    public final boolean zzM() throws RemoteException {
        Parcel zzda = zzda(22, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    public final boolean zzN() throws RemoteException {
        Parcel zzda = zzda(13, zza());
        boolean zzh = zzayv.zzh(zzda);
        zzda.recycle();
        return zzh;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbqb zzO() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 15
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbqb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbqb r1 = (com.google.android.gms.internal.ads.zzbqb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbqb r2 = new com.google.android.gms.internal.ads.zzbqb
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpr.zzO():com.google.android.gms.internal.ads.zzbqb");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbqc zzP() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 16
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbqc
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbqc r1 = (com.google.android.gms.internal.ads.zzbqc) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbqc r2 = new com.google.android.gms.internal.ads.zzbqc
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpr.zzP():com.google.android.gms.internal.ads.zzbqc");
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    public final zzed zzh() throws RemoteException {
        Parcel zzda = zzda(26, zza());
        zzed zzb = zzec.zzb(zzda.readStrongBinder());
        zzda.recycle();
        return zzb;
    }

    public final zzbhj zzi() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpz zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 36
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpz r1 = (com.google.android.gms.internal.ads.zzbpz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpx r2 = new com.google.android.gms.internal.ads.zzbpx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpr.zzj():com.google.android.gms.internal.ads.zzbpz");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbqf zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 27
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbqf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbqf r1 = (com.google.android.gms.internal.ads.zzbqf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbqd r2 = new com.google.android.gms.internal.ads.zzbqd
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpr.zzk():com.google.android.gms.internal.ads.zzbqf");
    }

    public final zzbse zzl() throws RemoteException {
        Parcel zzda = zzda(33, zza());
        zzbse zzbse = (zzbse) zzayv.zza(zzda, zzbse.CREATOR);
        zzda.recycle();
        return zzbse;
    }

    public final zzbse zzm() throws RemoteException {
        Parcel zzda = zzda(34, zza());
        zzbse zzbse = (zzbse) zzayv.zza(zzda, zzbse.CREATOR);
        zzda.recycle();
        return zzbse;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzda = zzda(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final void zzo() throws RemoteException {
        zzdb(5, zza());
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbwn zzbwn, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzm);
        zza.writeString((String) null);
        zzayv.zzg(zza, zzbwn);
        zza.writeString(str2);
        zzdb(10, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzbmh zzbmh, List list) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbmh);
        zza.writeTypedList(list);
        zzdb(31, zza);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzbwn zzbwn, List list) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbwn);
        zza.writeStringList(list);
        zzdb(23, zza);
    }

    public final void zzs(zzm zzm, String str) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zzdb(11, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zzayv.zzg(zza, zzbpw);
        zzdb(38, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzr zzr, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        throw null;
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzr zzr, zzm zzm, String str, String str2, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzr);
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zzg(zza, zzbpw);
        zzdb(6, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzr zzr, zzm zzm, String str, String str2, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzr);
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zzg(zza, zzbpw);
        zzdb(35, zza);
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpw zzbpw) throws RemoteException {
        throw null;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzm zzm, String str, String str2, zzbpw zzbpw) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zze(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayv.zzg(zza, zzbpw);
        zzdb(7, zza);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.zzbge, android.os.Parcelable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.ads.internal.client.zzm r3, java.lang.String r4, java.lang.String r5, com.google.android.gms.internal.ads.zzbpw r6, com.google.android.gms.internal.ads.zzbge r7, java.util.List r8) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r2)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r3)
            r0.writeString(r4)
            r0.writeString(r5)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r6)
            com.google.android.gms.internal.ads.zzayv.zze(r0, r7)
            r0.writeStringList(r8)
            r2 = 14
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpr.zzz(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.client.zzm, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzbpw, com.google.android.gms.internal.ads.zzbge, java.util.List):void");
    }
}
