package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzsx implements zztd {
    private final Context zza;

    @Deprecated
    public zzsx() {
        this.zza = null;
    }

    public zzsx(Context context, zzfwh zzfwh, zzfwh zzfwh2) {
        this.zza = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zztf zzd(com.google.android.gms.internal.ads.zztc r7) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x0007
            goto L_0x001e
        L_0x0007:
            android.content.Context r0 = r6.zza
            if (r0 == 0) goto L_0x003f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x003f
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "com.amazon.hardware.tv_screen"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 != 0) goto L_0x001e
            goto L_0x003f
        L_0x001e:
            com.google.android.gms.internal.ads.zzz r0 = r7.zzc
            java.lang.String r0 = r0.zzo
            int r0 = com.google.android.gms.internal.ads.zzay.zzb(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zzD(r0)
            java.lang.String r2 = "DMCodecAdapterFactory"
            java.lang.String r3 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.zzea.zze(r2, r1)
            com.google.android.gms.internal.ads.zzsn r1 = new com.google.android.gms.internal.ads.zzsn
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzsp r7 = r1.zzc(r7)
            return r7
        L_0x003f:
            r0 = 0
            com.google.android.gms.internal.ads.zzti r1 = r7.zza     // Catch:{ IOException -> 0x008c, RuntimeException -> 0x008a }
            java.lang.String r2 = r1.zza     // Catch:{ IOException -> 0x008c, RuntimeException -> 0x008a }
            java.lang.String r3 = "createCodec:"
            java.lang.String r3 = r3.concat(r2)     // Catch:{ IOException -> 0x008c, RuntimeException -> 0x008a }
            android.os.Trace.beginSection(r3)     // Catch:{ IOException -> 0x008c, RuntimeException -> 0x008a }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)     // Catch:{ IOException -> 0x008c, RuntimeException -> 0x008a }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x008c, RuntimeException -> 0x008a }
            java.lang.String r3 = "configureCodec"
            android.os.Trace.beginSection(r3)     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            android.view.Surface r3 = r7.zzd     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            r4 = 0
            if (r3 != 0) goto L_0x006a
            boolean r1 = r1.zzh     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            if (r1 == 0) goto L_0x006a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            r5 = 35
            if (r1 < r5) goto L_0x006a
            r4 = 8
        L_0x006a:
            android.media.MediaFormat r1 = r7.zzb     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            r2.configure(r1, r3, r0, r4)     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            r2.start()     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            com.google.android.gms.internal.ads.zzue r1 = new com.google.android.gms.internal.ads.zzue     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            com.google.android.gms.internal.ads.zztb r7 = r7.zzf     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            r1.<init>(r2, r7, r0)     // Catch:{ IOException -> 0x0087, RuntimeException -> 0x0085 }
            return r1
        L_0x0085:
            r7 = move-exception
            goto L_0x0088
        L_0x0087:
            r7 = move-exception
        L_0x0088:
            r0 = r2
            goto L_0x008d
        L_0x008a:
            r7 = move-exception
            goto L_0x008d
        L_0x008c:
            r7 = move-exception
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            r0.release()
        L_0x0092:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsx.zzd(com.google.android.gms.internal.ads.zztc):com.google.android.gms.internal.ads.zztf");
    }
}
