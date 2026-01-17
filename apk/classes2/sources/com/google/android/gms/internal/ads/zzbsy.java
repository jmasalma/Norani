package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbsy extends NativeAd.Image {
    private final zzbgp zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC, Splitter:B:30:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbsy(com.google.android.gms.internal.ads.zzbgp r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            r4.zzb = r5
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r5 = r5.zzf()     // Catch:{ RemoteException -> 0x0015 }
            if (r5 == 0) goto L_0x0019
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch:{ RemoteException -> 0x0015 }
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5     // Catch:{ RemoteException -> 0x0015 }
            goto L_0x001a
        L_0x0015:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r5)
        L_0x0019:
            r5 = r1
        L_0x001a:
            r4.zzc = r5
            com.google.android.gms.internal.ads.zzbgp r5 = r4.zzb     // Catch:{ RemoteException -> 0x0023 }
            android.net.Uri r5 = r5.zze()     // Catch:{ RemoteException -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r5)
            r5 = r1
        L_0x0028:
            r4.zzd = r5
            com.google.android.gms.internal.ads.zzbgp r5 = r4.zzb     // Catch:{ RemoteException -> 0x0031 }
            double r2 = r5.zzb()     // Catch:{ RemoteException -> 0x0031 }
            goto L_0x0037
        L_0x0031:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r5)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0037:
            r4.zze = r2
            r5 = -1
            com.google.android.gms.internal.ads.zzbgp r2 = r4.zzb     // Catch:{ RemoteException -> 0x0041 }
            int r2 = r2.zzd()     // Catch:{ RemoteException -> 0x0041 }
            goto L_0x0046
        L_0x0041:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r2)
            r2 = r5
        L_0x0046:
            r4.zzf = r2
            com.google.android.gms.internal.ads.zzbgp r2 = r4.zzb     // Catch:{ RemoteException -> 0x004f }
            int r5 = r2.zzc()     // Catch:{ RemoteException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r2)
        L_0x0053:
            r4.zzg = r5
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzek
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r0.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzbgp r5 = r4.zzb     // Catch:{ RemoteException -> 0x006d }
            java.util.Map r1 = r5.zzg()     // Catch:{ RemoteException -> 0x006d }
        L_0x006d:
            r4.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsy.<init>(com.google.android.gms.internal.ads.zzbgp):void");
    }

    public final Drawable getDrawable() {
        return this.zzc;
    }

    public final double getScale() {
        return this.zze;
    }

    public final Uri getUri() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzf;
    }
}
