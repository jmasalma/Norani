package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzbav extends zzayu implements zzbaw {
    public zzbav() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbaw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzbaw ? (zzbaw) queryLocalInterface : new zzbau(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzde(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            switch(r3) {
                case 2: goto L_0x00a0;
                case 3: goto L_0x0086;
                case 4: goto L_0x0058;
                case 5: goto L_0x004d;
                case 6: goto L_0x003f;
                case 7: goto L_0x002c;
                case 8: goto L_0x0020;
                case 9: goto L_0x0014;
                case 10: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3 = 0
            return r3
        L_0x0005:
            long r0 = r4.readLong()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzk(r0)
            r5.writeNoException()
            goto L_0x00aa
        L_0x0014:
            long r3 = r2.zze()
            r5.writeNoException()
            r5.writeLong(r3)
            goto L_0x00aa
        L_0x0020:
            java.lang.String r3 = r2.zzh()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x00aa
        L_0x002c:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdt r3 = com.google.android.gms.ads.internal.client.zzds.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzj(r3)
            r5.writeNoException()
            goto L_0x00aa
        L_0x003f:
            boolean r3 = com.google.android.gms.internal.ads.zzayv.zzh(r4)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzi(r3)
            r5.writeNoException()
            goto L_0x00aa
        L_0x004d:
            com.google.android.gms.ads.internal.client.zzea r3 = r2.zzg()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x00aa
        L_0x0058:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L_0x0068
            r6 = 0
            goto L_0x007c
        L_0x0068:
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbbd
            if (r1 == 0) goto L_0x0076
            r6 = r0
            com.google.android.gms.internal.ads.zzbbd r6 = (com.google.android.gms.internal.ads.zzbbd) r6
            goto L_0x007c
        L_0x0076:
            com.google.android.gms.internal.ads.zzbbb r0 = new com.google.android.gms.internal.ads.zzbbb
            r0.<init>(r6)
            r6 = r0
        L_0x007c:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzl(r3, r6)
            r5.writeNoException()
            goto L_0x00aa
        L_0x0086:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            java.lang.String r6 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback"
            android.os.IInterface r3 = r3.queryLocalInterface(r6)
            boolean r6 = r3 instanceof com.google.android.gms.internal.ads.zzbba
            if (r6 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzbba r3 = (com.google.android.gms.internal.ads.zzbba) r3
        L_0x0099:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r5.writeNoException()
            goto L_0x00aa
        L_0x00a0:
            com.google.android.gms.ads.internal.client.zzbx r3 = r2.zzf()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
        L_0x00aa:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbav.zzde(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
