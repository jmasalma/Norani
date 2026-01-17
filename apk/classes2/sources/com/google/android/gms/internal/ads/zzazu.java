package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzazu implements Runnable {
    final /* synthetic */ zzazv zza;

    zzazu(zzazv zzazv) {
        Objects.requireNonNull(zzazv);
        this.zza = zzazv;
    }

    public final void run() {
        zzazv zzazv = this.zza;
        synchronized (zzazv.zzc) {
            if (!zzazv.zzd || !zzazv.zze) {
                int i = zze.zza;
                zzo.zze("App is still foreground");
            } else {
                zzazv.zzd = false;
                int i2 = zze.zza;
                zzo.zze("App went background");
                for (zzazw zza2 : zzazv.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e) {
                        zzo.zzh("", e);
                    }
                }
            }
        }
    }
}
