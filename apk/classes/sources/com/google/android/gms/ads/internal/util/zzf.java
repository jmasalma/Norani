package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzfrw;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzf extends zzfrw {
    public zzf(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            zzf.super.handleMessage(message);
        } catch (Exception e) {
            zzv.zzp().zzw(e, "AdMobHandler.handleMessage");
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(Message message) {
        try {
            zzf.super.zza(message);
        } catch (Throwable th) {
            zzv.zzr();
            zzs.zzN(zzv.zzp().zzd(), th);
            throw th;
        }
    }
}
