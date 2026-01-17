package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbvc extends zzayt implements zzbve {
    zzbvc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbvq] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzbvq r2, com.google.android.gms.internal.ads.zzbvi r3) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zze(r0, r2)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r3)
            r2 = 6
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvc.zze(com.google.android.gms.internal.ads.zzbvq, com.google.android.gms.internal.ads.zzbvi):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbvq] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.internal.ads.zzbvq r2, com.google.android.gms.internal.ads.zzbvi r3) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zze(r0, r2)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r3)
            r2 = 5
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvc.zzf(com.google.android.gms.internal.ads.zzbvq, com.google.android.gms.internal.ads.zzbvi):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Parcelable, com.google.android.gms.internal.ads.zzbvq] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.internal.ads.zzbvq r2, com.google.android.gms.internal.ads.zzbvi r3) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayv.zze(r0, r2)
            com.google.android.gms.internal.ads.zzayv.zzg(r0, r3)
            r2 = 4
            r1.zzdb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvc.zzg(com.google.android.gms.internal.ads.zzbvq, com.google.android.gms.internal.ads.zzbvi):void");
    }

    public final void zzh(String str, zzbvi zzbvi) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayv.zzg(zza, zzbvi);
        zzdb(7, zza);
    }

    public final void zzi(zzbva zzbva, zzbvj zzbvj) throws RemoteException {
        throw null;
    }
}
