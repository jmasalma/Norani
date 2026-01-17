package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdjx implements GestureDetector.OnGestureListener {
    private final zzdio zza;
    private final zzdjp zzb;

    zzdjx(zzdio zzdio, zzdjp zzdjp) {
        this.zza = zzdio;
        this.zzb = zzdjp;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdio r0 = r6.zza     // Catch:{ all -> 0x0074 }
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x0072
        L_0x0007:
            float r2 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0074 }
            float r3 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0074 }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            if (r2 <= 0) goto L_0x003b
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0029
            float r8 = r8.getX()     // Catch:{ all -> 0x0074 }
            float r7 = r7.getX()     // Catch:{ all -> 0x0074 }
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x0074 }
            r3 = 1
            goto L_0x0061
        L_0x0029:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0060
            float r8 = r8.getX()     // Catch:{ all -> 0x0074 }
            float r7 = r7.getX()     // Catch:{ all -> 0x0074 }
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x0074 }
            r3 = 2
            goto L_0x0061
        L_0x003b:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x004e
            float r8 = r8.getY()     // Catch:{ all -> 0x0074 }
            float r7 = r7.getY()     // Catch:{ all -> 0x0074 }
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x0074 }
            r3 = 8
            goto L_0x0061
        L_0x004e:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0060
            float r8 = r8.getY()     // Catch:{ all -> 0x0074 }
            float r7 = r7.getY()     // Catch:{ all -> 0x0074 }
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x0074 }
            r3 = 4
            goto L_0x0061
        L_0x0060:
            r7 = r1
        L_0x0061:
            int r8 = r0.zza()     // Catch:{ all -> 0x0074 }
            if (r3 != r8) goto L_0x0072
            com.google.android.gms.internal.ads.zzdjp r8 = r6.zzb     // Catch:{ all -> 0x0074 }
            android.widget.FrameLayout r8 = r8.zzr()     // Catch:{ all -> 0x0074 }
            r0.zzF(r8, r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)
            return r1
        L_0x0072:
            monitor-exit(r6)
            return r1
        L_0x0074:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjx.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
