package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfh implements Runnable {
    final /* synthetic */ zzfi zza;

    zzfh(zzfi zzfi) {
        Objects.requireNonNull(zzfi);
        this.zza = zzfi;
    }

    public final void run() {
        zzfk zzfk = this.zza.zza;
        if (zzfk.zza != null) {
            try {
                zzfk.zza.zze(1);
            } catch (RemoteException e) {
                zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
