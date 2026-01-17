package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbi implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbbk zza;

    zzbbi(zzbbk zzbbk) {
        Objects.requireNonNull(zzbbk);
        this.zza = zzbbk;
    }

    public final void onConnected(Bundle bundle) {
        zzbbk zzbbk = this.zza;
        synchronized (zzbbk.zzc) {
            try {
                if (zzbbk.zzd != null) {
                    zzbbk.zzf = zzbbk.zzd.zzq();
                }
            } catch (DeadObjectException e) {
                int i = zze.zza;
                zzo.zzh("Unable to obtain a cache service instance.", e);
                zzbbk.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        zzbbk zzbbk = this.zza;
        synchronized (zzbbk.zzc) {
            zzbbk.zzf = null;
            zzbbk.zzc.notifyAll();
        }
    }
}
