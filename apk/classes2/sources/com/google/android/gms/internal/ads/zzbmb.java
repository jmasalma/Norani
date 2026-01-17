package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbmb implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcak zza;

    zzbmb(zzbmc zzbmc, zzcak zzcak) {
        this.zza = zzcak;
        Objects.requireNonNull(zzbmc);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
