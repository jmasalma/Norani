package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfue implements zzfwh {
    public final /* synthetic */ String zza = "OverlayDisplayService";

    public /* synthetic */ zzfue(String str) {
    }

    public final Object zza() {
        HandlerThread handlerThread = new HandlerThread(this.zza, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
