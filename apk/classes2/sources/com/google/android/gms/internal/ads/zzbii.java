package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzbii extends zzayu implements zzbij {
    public zzbii() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzde(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            switch(r3) {
                case 2: goto L_0x01cf;
                case 3: goto L_0x01c4;
                case 4: goto L_0x01b9;
                case 5: goto L_0x01ae;
                case 6: goto L_0x01a3;
                case 7: goto L_0x0198;
                case 8: goto L_0x018d;
                case 9: goto L_0x0182;
                case 10: goto L_0x0177;
                case 11: goto L_0x016c;
                case 12: goto L_0x0160;
                case 13: goto L_0x0158;
                case 14: goto L_0x014c;
                case 15: goto L_0x0139;
                case 16: goto L_0x0122;
                case 17: goto L_0x010f;
                case 18: goto L_0x0103;
                case 19: goto L_0x00f7;
                case 20: goto L_0x00eb;
                case 21: goto L_0x00c4;
                case 22: goto L_0x00bc;
                case 23: goto L_0x00b0;
                case 24: goto L_0x00a2;
                case 25: goto L_0x008f;
                case 26: goto L_0x007c;
                case 27: goto L_0x0074;
                case 28: goto L_0x006c;
                case 29: goto L_0x0060;
                case 30: goto L_0x0052;
                case 31: goto L_0x0046;
                case 32: goto L_0x0033;
                case 33: goto L_0x0020;
                case 34: goto L_0x0014;
                case 35: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3 = 0
            return r3
        L_0x0005:
            long r0 = r4.readLong()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzH(r0)
            r5.writeNoException()
            goto L_0x01d9
        L_0x0014:
            long r3 = r2.zzf()
            r5.writeNoException()
            r5.writeLong(r3)
            goto L_0x01d9
        L_0x0020:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzC(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x0033:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdt r3 = com.google.android.gms.ads.internal.client.zzds.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzG(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x0046:
            com.google.android.gms.ads.internal.client.zzea r3 = r2.zzh()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x0052:
            boolean r3 = r2.zzJ()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayv.zza
            r5.writeInt(r3)
            goto L_0x01d9
        L_0x0060:
            com.google.android.gms.internal.ads.zzbgm r3 = r2.zzk()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x006c:
            r2.zzB()
            r5.writeNoException()
            goto L_0x01d9
        L_0x0074:
            r2.zzE()
            r5.writeNoException()
            goto L_0x01d9
        L_0x007c:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdf r3 = com.google.android.gms.ads.internal.client.zzde.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzF(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x008f:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdj r3 = com.google.android.gms.ads.internal.client.zzdi.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzz(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x00a2:
            boolean r3 = r2.zzK()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayv.zza
            r5.writeInt(r3)
            goto L_0x01d9
        L_0x00b0:
            java.util.List r3 = r2.zzw()
            r5.writeNoException()
            r5.writeList(r3)
            goto L_0x01d9
        L_0x00bc:
            r2.zzx()
            r5.writeNoException()
            goto L_0x01d9
        L_0x00c4:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00cc
            r3 = 0
            goto L_0x00e0
        L_0x00cc:
            java.lang.String r6 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbig
            if (r0 == 0) goto L_0x00da
            r3 = r6
            com.google.android.gms.internal.ads.zzbig r3 = (com.google.android.gms.internal.ads.zzbig) r3
            goto L_0x00e0
        L_0x00da:
            com.google.android.gms.internal.ads.zzbie r6 = new com.google.android.gms.internal.ads.zzbie
            r6.<init>(r3)
            r3 = r6
        L_0x00e0:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzI(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x00eb:
            android.os.Bundle r3 = r2.zzg()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzf(r5, r3)
            goto L_0x01d9
        L_0x00f7:
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.zzm()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x0103:
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.zzn()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x010f:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzD(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x0122:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            boolean r3 = r2.zzL(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x01d9
        L_0x0139:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzA(r3)
            r5.writeNoException()
            goto L_0x01d9
        L_0x014c:
            com.google.android.gms.internal.ads.zzbgi r3 = r2.zzj()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x0158:
            r2.zzy()
            r5.writeNoException()
            goto L_0x01d9
        L_0x0160:
            java.lang.String r3 = r2.zzs()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x01d9
        L_0x016c:
            com.google.android.gms.ads.internal.client.zzed r3 = r2.zzi()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x0177:
            java.lang.String r3 = r2.zzt()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x01d9
        L_0x0182:
            java.lang.String r3 = r2.zzu()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x01d9
        L_0x018d:
            double r3 = r2.zze()
            r5.writeNoException()
            r5.writeDouble(r3)
            goto L_0x01d9
        L_0x0198:
            java.lang.String r3 = r2.zzo()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x01d9
        L_0x01a3:
            java.lang.String r3 = r2.zzq()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x01d9
        L_0x01ae:
            com.google.android.gms.internal.ads.zzbgp r3 = r2.zzl()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x01d9
        L_0x01b9:
            java.lang.String r3 = r2.zzp()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x01d9
        L_0x01c4:
            java.util.List r3 = r2.zzv()
            r5.writeNoException()
            r5.writeList(r3)
            goto L_0x01d9
        L_0x01cf:
            java.lang.String r3 = r2.zzr()
            r5.writeNoException()
            r5.writeString(r3)
        L_0x01d9:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbii.zzde(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
