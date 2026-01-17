package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbxc;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzfr implements Runnable {
    public final /* synthetic */ zzbxc zza;

    public /* synthetic */ zzfr(zzbxc zzbxc) {
        this.zza = zzbxc;
    }

    public final void run() {
        zzbxc zzbxc = this.zza;
        if (zzbxc != null) {
            try {
                zzbxc.zze(1);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
