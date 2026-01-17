package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfl implements Runnable {
    final /* synthetic */ zzfm zza;

    zzfl(zzfm zzfm) {
        Objects.requireNonNull(zzfm);
        this.zza = zzfm;
    }

    public final void run() {
        zzfm zzfm = this.zza;
        if (zzfm.zza != null) {
            try {
                zzfm.zza.zze(1);
            } catch (RemoteException e) {
                zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
