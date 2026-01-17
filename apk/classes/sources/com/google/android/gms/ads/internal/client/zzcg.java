package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzayu;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzcg extends zzayu implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzde(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x0029
            r0 = 2
            if (r4 == r0) goto L_0x001e
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            java.lang.String r4 = r5.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r0 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayv.zza(r5, r0)
            com.google.android.gms.ads.internal.client.zze r0 = (com.google.android.gms.ads.internal.client.zze) r0
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            r3.zze(r4, r0)
            goto L_0x004f
        L_0x001e:
            java.lang.String r4 = r5.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            r3.zzg(r4)
            goto L_0x004f
        L_0x0029:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x0035
            r0 = 0
            goto L_0x0049
        L_0x0035:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.ads.internal.client.zzea
            if (r2 == 0) goto L_0x0043
            r0 = r1
            com.google.android.gms.ads.internal.client.zzea r0 = (com.google.android.gms.ads.internal.client.zzea) r0
            goto L_0x0049
        L_0x0043:
            com.google.android.gms.ads.internal.client.zzdy r1 = new com.google.android.gms.ads.internal.client.zzdy
            r1.<init>(r0)
            r0 = r1
        L_0x0049:
            com.google.android.gms.internal.ads.zzayv.zzd(r5)
            r3.zzf(r4, r0)
        L_0x004f:
            r6.writeNoException()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzcg.zzde(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
