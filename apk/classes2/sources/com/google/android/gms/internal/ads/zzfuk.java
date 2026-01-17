package com.google.android.gms.internal.ads;

import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfuk implements Runnable {
    public final /* synthetic */ zzful zza;

    public /* synthetic */ zzfuk(zzful zzful) {
        this.zza = zzful;
    }

    public final void run() {
        zzfun zzfun = this.zza.zza;
        zzfun.zzc.zzc("unlinkToDeath", new Object[0]);
        IInterface zzb = zzfun.zzj;
        zzb.getClass();
        IInterface iInterface = zzb;
        zzb.asBinder().unlinkToDeath(zzfun.zzh, 0);
        zzfun.zzj = null;
        zzfun.zzf = false;
    }
}
