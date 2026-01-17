package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzsn implements zztd {
    private final zzfwh zza;
    private final zzfwh zzb;

    public zzsn(int i) {
        zzsl zzsl = new zzsl(i);
        zzsm zzsm = new zzsm(i);
        this.zza = zzsl;
        this.zzb = zzsm;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzsp.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzsp.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzsp zzc(com.google.android.gms.internal.ads.zztc r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "createCodec:"
            com.google.android.gms.internal.ads.zzti r1 = r11.zza
            java.lang.String r2 = r1.zza
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0062 }
            r4.append(r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0062 }
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x0062 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r2)     // Catch:{ Exception -> 0x0062 }
            com.google.android.gms.internal.ads.zzst r7 = new com.google.android.gms.internal.ads.zzst     // Catch:{ Exception -> 0x0060 }
            com.google.android.gms.internal.ads.zzfwh r2 = r10.zzb     // Catch:{ Exception -> 0x0060 }
            com.google.android.gms.internal.ads.zzsm r2 = (com.google.android.gms.internal.ads.zzsm) r2     // Catch:{ Exception -> 0x0060 }
            int r2 = r2.zza     // Catch:{ Exception -> 0x0060 }
            android.os.HandlerThread r2 = zzb(r2)     // Catch:{ Exception -> 0x0060 }
            r4 = r2
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch:{ Exception -> 0x0060 }
            r7.<init>(r0, r2)     // Catch:{ Exception -> 0x0060 }
            com.google.android.gms.internal.ads.zzsp r2 = new com.google.android.gms.internal.ads.zzsp     // Catch:{ Exception -> 0x0060 }
            com.google.android.gms.internal.ads.zzfwh r4 = r10.zza     // Catch:{ Exception -> 0x0060 }
            com.google.android.gms.internal.ads.zzsl r4 = (com.google.android.gms.internal.ads.zzsl) r4     // Catch:{ Exception -> 0x0060 }
            int r4 = r4.zza     // Catch:{ Exception -> 0x0060 }
            android.os.HandlerThread r6 = zza(r4)     // Catch:{ Exception -> 0x0060 }
            r4 = r6
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch:{ Exception -> 0x0060 }
            com.google.android.gms.internal.ads.zztb r8 = r11.zzf     // Catch:{ Exception -> 0x0060 }
            r9 = 0
            r4 = r2
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0060 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x005d }
            android.view.Surface r4 = r11.zzd     // Catch:{ Exception -> 0x005d }
            r5 = 0
            if (r4 != 0) goto L_0x0057
            boolean r1 = r1.zzh     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x0057
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005d }
            r6 = 35
            if (r1 < r6) goto L_0x0057
            r5 = 8
        L_0x0057:
            android.media.MediaFormat r11 = r11.zzb     // Catch:{ Exception -> 0x005d }
            com.google.android.gms.internal.ads.zzsp.zzh(r2, r11, r4, r3, r5)     // Catch:{ Exception -> 0x005d }
            return r2
        L_0x005d:
            r11 = move-exception
            r3 = r2
            goto L_0x0064
        L_0x0060:
            r11 = move-exception
            goto L_0x0064
        L_0x0062:
            r11 = move-exception
            r0 = r3
        L_0x0064:
            if (r3 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x006f
            r0.release()
            goto L_0x006f
        L_0x006c:
            r3.zzm()
        L_0x006f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzc(com.google.android.gms.internal.ads.zztc):com.google.android.gms.internal.ads.zzsp");
    }

    public final /* bridge */ /* synthetic */ zztf zzd(zztc zztc) throws IOException {
        throw null;
    }
}
