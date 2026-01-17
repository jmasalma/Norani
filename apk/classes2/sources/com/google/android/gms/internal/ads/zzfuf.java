package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfuf implements IBinder.DeathRecipient {
    public final /* synthetic */ zzfun zza;

    public /* synthetic */ zzfuf(zzfun zzfun) {
        this.zza = zzfun;
    }

    public final void binderDied() {
        zzfun.zzh(this.zza);
    }
}
