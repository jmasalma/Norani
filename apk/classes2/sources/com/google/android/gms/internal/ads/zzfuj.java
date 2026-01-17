package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfuj implements Runnable {
    public final /* synthetic */ zzful zza;
    public final /* synthetic */ IBinder zzb;

    public /* synthetic */ zzfuj(zzful zzful, IBinder iBinder) {
        this.zza = zzful;
        this.zzb = iBinder;
    }

    public final void run() {
        zzful zzful = this.zza;
        zzfun zzfun = zzful.zza;
        zzfun.zzj = zzfsm.zzb(this.zzb);
        zzfun.zzc.zzc("linkToDeath", new Object[0]);
        try {
            IInterface zzb2 = zzfun.zzj;
            if (zzb2 != null) {
                IInterface iInterface = zzb2;
                zzb2.asBinder().linkToDeath(zzfun.zzh, 0);
                zzfun zzfun2 = zzful.zza;
                zzfun2.zzf = false;
                synchronized (zzfun2.zze) {
                    for (Runnable run : zzfun2.zze) {
                        run.run();
                    }
                    zzfun2.zze.clear();
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzful.zza.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }
}
