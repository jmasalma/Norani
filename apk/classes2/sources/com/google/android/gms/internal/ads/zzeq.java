package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeq implements zzds {
    private Message zza;

    private zzeq() {
        throw null;
    }

    /* synthetic */ zzeq(zzer zzer) {
    }

    public final zzeq zzb(Message message, zzes zzes) {
        this.zza = message;
        return this;
    }

    public final void zza() {
        Message message = this.zza;
        message.getClass();
        Message message2 = message;
        message.sendToTarget();
        this.zza = null;
        zzes.zzm(this);
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        Message message2 = message;
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzes.zzm(this);
        return sendMessageAtFrontOfQueue;
    }
}
