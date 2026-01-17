package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public class zzfrw extends Handler {
    public zzfrw() {
        Looper.getMainLooper();
    }

    public final void dispatchMessage(Message message) {
        zza(message);
    }

    /* access modifiers changed from: protected */
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfrw(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
