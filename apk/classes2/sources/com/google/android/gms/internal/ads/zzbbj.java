package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbj implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbbk zza;

    zzbbj(zzbbk zzbbk) {
        Objects.requireNonNull(zzbbk);
        this.zza = zzbbk;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbbk zzbbk = this.zza;
        synchronized (zzbbk.zzc) {
            zzbbk.zzf = null;
            if (zzbbk.zzd != null) {
                zzbbk.zzd = null;
            }
            zzbbk.zzc.notifyAll();
        }
    }
}
