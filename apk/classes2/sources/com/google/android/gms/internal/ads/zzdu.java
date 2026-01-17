package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdu implements Handler.Callback {
    public final /* synthetic */ zzdz zza;

    public /* synthetic */ zzdu(zzdz zzdz) {
        this.zza = zzdz;
    }

    public final boolean handleMessage(Message message) {
        zzdz.zzg(this.zza, message);
        return true;
    }
}
