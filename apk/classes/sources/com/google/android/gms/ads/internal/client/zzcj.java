package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzayu;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzcj extends zzayu implements zzck {
    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.google.android.gms.ads.internal.client.zzce] */
    /* JADX WARNING: type inference failed for: r7v7, types: [com.google.android.gms.ads.internal.client.zzch] */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzde(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 0
            switch(r4) {
                case 1: goto L_0x0172;
                case 2: goto L_0x0160;
                case 3: goto L_0x014e;
                case 4: goto L_0x013c;
                case 5: goto L_0x012a;
                case 6: goto L_0x0117;
                case 7: goto L_0x0104;
                case 8: goto L_0x00f1;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00a6;
                case 11: goto L_0x0093;
                case 12: goto L_0x0080;
                case 13: goto L_0x006d;
                case 14: goto L_0x0056;
                case 15: goto L_0x0043;
                case 16: goto L_0x002c;
                case 17: goto L_0x0015;
                case 18: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r4 = 0
            return r4
        L_0x0006:
            int r4 = r5.readInt()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            r3.zzn(r4)
            r6.writeNoException()
            goto L_0x019a
        L_0x0015:
            int r4 = r5.readInt()
            java.lang.String r7 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            boolean r4 = r3.zzq(r4, r7)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x002c:
            int r4 = r5.readInt()
            java.lang.String r7 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            int r4 = r3.zze(r4, r7)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x0043:
            int r4 = r5.readInt()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            android.os.Bundle r4 = r3.zzf(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzf(r6, r4)
            goto L_0x019a
        L_0x0056:
            int r4 = r5.readInt()
            java.lang.String r7 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.ads.internal.client.zzfv r4 = r3.zzk(r4, r7)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzf(r6, r4)
            goto L_0x019a
        L_0x006d:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.internal.ads.zzbwv r4 = r3.zzl(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r6, r4)
            goto L_0x019a
        L_0x0080:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.internal.ads.zzbaw r4 = r3.zzg(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r6, r4)
            goto L_0x019a
        L_0x0093:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.ads.internal.client.zzbx r4 = r3.zzi(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r6, r4)
            goto L_0x019a
        L_0x00a6:
            int r4 = r5.readInt()
            java.lang.String r7 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            boolean r4 = r3.zzr(r4, r7)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x00bd:
            java.lang.String r4 = r5.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzfv> r0 = com.google.android.gms.ads.internal.client.zzfv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayv.zza(r5, r0)
            com.google.android.gms.ads.internal.client.zzfv r0 = (com.google.android.gms.ads.internal.client.zzfv) r0
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L_0x00d0
            goto L_0x00e2
        L_0x00d0:
            java.lang.String r7 = "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2"
            android.os.IInterface r7 = r1.queryLocalInterface(r7)
            boolean r2 = r7 instanceof com.google.android.gms.ads.internal.client.zzch
            if (r2 == 0) goto L_0x00dd
            com.google.android.gms.ads.internal.client.zzch r7 = (com.google.android.gms.ads.internal.client.zzch) r7
            goto L_0x00e2
        L_0x00dd:
            com.google.android.gms.ads.internal.client.zzcf r7 = new com.google.android.gms.ads.internal.client.zzcf
            r7.<init>(r1)
        L_0x00e2:
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            boolean r4 = r3.zzv(r4, r0, r7)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x00f1:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpq r4 = com.google.android.gms.internal.ads.zzbpp.zzf(r4)
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            r3.zzo(r4)
            r6.writeNoException()
            goto L_0x019a
        L_0x0104:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.ads.internal.client.zzbx r4 = r3.zzj(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r6, r4)
            goto L_0x019a
        L_0x0117:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            boolean r4 = r3.zzt(r4)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x012a:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.internal.ads.zzbaw r4 = r3.zzh(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r6, r4)
            goto L_0x019a
        L_0x013c:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            boolean r4 = r3.zzs(r4)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x014e:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            com.google.android.gms.internal.ads.zzbwv r4 = r3.zzm(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r6, r4)
            goto L_0x019a
        L_0x0160:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            boolean r4 = r3.zzu(r4)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x019a
        L_0x0172:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzfv> r4 = com.google.android.gms.ads.internal.client.zzfv.CREATOR
            java.util.ArrayList r4 = r5.createTypedArrayList(r4)
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x017f
            goto L_0x0191
        L_0x017f:
            java.lang.String r7 = "com.google.android.gms.ads.internal.client.IAdPreloadCallback"
            android.os.IInterface r7 = r0.queryLocalInterface(r7)
            boolean r1 = r7 instanceof com.google.android.gms.ads.internal.client.zzce
            if (r1 == 0) goto L_0x018c
            com.google.android.gms.ads.internal.client.zzce r7 = (com.google.android.gms.ads.internal.client.zzce) r7
            goto L_0x0191
        L_0x018c:
            com.google.android.gms.ads.internal.client.zzcc r7 = new com.google.android.gms.ads.internal.client.zzcc
            r7.<init>(r0)
        L_0x0191:
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            r3.zzp(r4, r7)
            r6.writeNoException()
        L_0x019a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzcj.zzde(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
