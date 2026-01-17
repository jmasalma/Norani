package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zztj {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = r2.getSupportedPerformancePoints()
            r0 = 0
            if (r2 == 0) goto L_0x0051
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x0051
        L_0x000e:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            r6.<init>(r3, r4, r5)
            int r2 = zzc(r2, r6)
            r3 = 1
            if (r2 != r3) goto L_0x0050
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zztk.zza
            if (r4 != 0) goto L_0x0050
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 35
            if (r4 < r5) goto L_0x0029
        L_0x0027:
            r3 = r0
            goto L_0x003e
        L_0x0029:
            int r4 = zzb(r0)
            int r5 = zzb(r3)
            if (r4 != 0) goto L_0x0034
            goto L_0x003e
        L_0x0034:
            r6 = 2
            if (r5 != 0) goto L_0x003a
            if (r4 == r6) goto L_0x0027
            goto L_0x003e
        L_0x003a:
            if (r4 != r6) goto L_0x003e
            if (r5 == r6) goto L_0x0027
        L_0x003e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zztk.zza = r3
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zztk.zza
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0050
            return r0
        L_0x0050:
            return r2
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztj.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzx zzx = new zzx();
            zzx.zzah("video/avc");
            zzz zzan = zzx.zzan();
            if (zzan.zzo != null) {
                List zze = zzuc.zze(zztr.zza, zzan, z, false);
                for (int i = 0; i < zze.size(); i++) {
                    if (((zzti) zze.get(i)).zzd != null && (videoCapabilities = ((zzti) zze.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zztw unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
