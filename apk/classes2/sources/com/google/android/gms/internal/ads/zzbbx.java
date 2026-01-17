package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbx implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcak zza;
    final /* synthetic */ zzbby zzb;

    zzbbx(zzbby zzbby, zzcak zzcak) {
        this.zza = zzcak;
        Objects.requireNonNull(zzbby);
        this.zzb = zzbby;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
