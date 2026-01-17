package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdmx implements Runnable {
    public final /* synthetic */ zzdmz zza;

    public /* synthetic */ zzdmx(zzdmz zzdmz) {
        this.zza = zzdmz;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
