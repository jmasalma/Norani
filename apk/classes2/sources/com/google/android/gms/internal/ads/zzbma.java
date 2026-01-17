package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbma implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcak zza;
    final /* synthetic */ zzbmc zzb;

    zzbma(zzbmc zzbmc, zzcak zzcak) {
        this.zza = zzcak;
        Objects.requireNonNull(zzbmc);
        this.zzb = zzbmc;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i));
    }
}
