package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzbwu extends zzayu implements zzbwv {
    public zzbwu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwv zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbwv ? (zzbwv) queryLocalInterface : new zzbwt(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.zzbxd} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzbxc] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.zzbwy] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.zzbxc] */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzde(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r3) {
                case 1: goto L_0x0150;
                case 2: goto L_0x012c;
                case 3: goto L_0x011f;
                case 4: goto L_0x0114;
                case 5: goto L_0x0102;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00b7;
                case 9: goto L_0x00ab;
                case 10: goto L_0x0094;
                case 11: goto L_0x0088;
                case 12: goto L_0x007c;
                case 13: goto L_0x0069;
                case 14: goto L_0x003e;
                case 15: goto L_0x002f;
                case 16: goto L_0x0023;
                case 17: goto L_0x0017;
                case 18: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            long r0 = r4.readLong()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzm(r0)
            r5.writeNoException()
            goto L_0x0179
        L_0x0017:
            long r3 = r2.zzb()
            r5.writeNoException()
            r5.writeLong(r3)
            goto L_0x0179
        L_0x0023:
            java.lang.String r3 = r2.zzf()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0179
        L_0x002f:
            boolean r3 = com.google.android.gms.internal.ads.zzayv.zzh(r4)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzj(r3)
            r5.writeNoException()
            goto L_0x0179
        L_0x003e:
            android.os.Parcelable$Creator r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x004d
            goto L_0x005e
        L_0x004d:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxc
            if (r0 == 0) goto L_0x0059
            r0 = r6
            com.google.android.gms.internal.ads.zzbxc r0 = (com.google.android.gms.internal.ads.zzbxc) r0
            goto L_0x005e
        L_0x0059:
            com.google.android.gms.internal.ads.zzbxa r0 = new com.google.android.gms.internal.ads.zzbxa
            r0.<init>(r1)
        L_0x005e:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzi(r3, r0)
            r5.writeNoException()
            goto L_0x0179
        L_0x0069:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdt r3 = com.google.android.gms.ads.internal.client.zzds.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzl(r3)
            r5.writeNoException()
            goto L_0x0179
        L_0x007c:
            com.google.android.gms.ads.internal.client.zzea r3 = r2.zzd()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x0179
        L_0x0088:
            com.google.android.gms.internal.ads.zzbws r3 = r2.zze()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x0179
        L_0x0094:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            boolean r6 = com.google.android.gms.internal.ads.zzayv.zzh(r4)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzq(r3, r6)
            r5.writeNoException()
            goto L_0x0179
        L_0x00ab:
            android.os.Bundle r3 = r2.zzc()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzf(r5, r3)
            goto L_0x0179
        L_0x00b7:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdq r3 = com.google.android.gms.ads.internal.client.zzdp.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzk(r3)
            r5.writeNoException()
            goto L_0x0179
        L_0x00ca:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbxj> r3 = com.google.android.gms.internal.ads.zzbxj.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.internal.ads.zzbxj r3 = (com.google.android.gms.internal.ads.zzbxj) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzo(r3)
            r5.writeNoException()
            goto L_0x0179
        L_0x00dd:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00e4
            goto L_0x00f7
        L_0x00e4:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxd
            if (r0 == 0) goto L_0x00f2
            r0 = r6
            com.google.android.gms.internal.ads.zzbxd r0 = (com.google.android.gms.internal.ads.zzbxd) r0
            goto L_0x00f7
        L_0x00f2:
            com.google.android.gms.internal.ads.zzbxd r0 = new com.google.android.gms.internal.ads.zzbxd
            r0.<init>(r3)
        L_0x00f7:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzs(r0)
            r5.writeNoException()
            goto L_0x0179
        L_0x0102:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzp(r3)
            r5.writeNoException()
            goto L_0x0179
        L_0x0114:
            java.lang.String r3 = r2.zzg()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0179
        L_0x011f:
            boolean r3 = r2.zzr()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayv.zza
            r5.writeInt(r3)
            goto L_0x0179
        L_0x012c:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0133
            goto L_0x0146
        L_0x0133:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbwy
            if (r0 == 0) goto L_0x0141
            r0 = r6
            com.google.android.gms.internal.ads.zzbwy r0 = (com.google.android.gms.internal.ads.zzbwy) r0
            goto L_0x0146
        L_0x0141:
            com.google.android.gms.internal.ads.zzbww r0 = new com.google.android.gms.internal.ads.zzbww
            r0.<init>(r3)
        L_0x0146:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzn(r0)
            r5.writeNoException()
            goto L_0x0179
        L_0x0150:
            android.os.Parcelable$Creator r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x015f
            goto L_0x0170
        L_0x015f:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxc
            if (r0 == 0) goto L_0x016b
            r0 = r6
            com.google.android.gms.internal.ads.zzbxc r0 = (com.google.android.gms.internal.ads.zzbxc) r0
            goto L_0x0170
        L_0x016b:
            com.google.android.gms.internal.ads.zzbxa r0 = new com.google.android.gms.internal.ads.zzbxa
            r0.<init>(r1)
        L_0x0170:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzh(r3, r0)
            r5.writeNoException()
        L_0x0179:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwu.zzde(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
