package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbw implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbbo zza;
    final /* synthetic */ zzcak zzb;
    final /* synthetic */ zzbby zzc;

    zzbbw(zzbby zzbby, zzbbo zzbbo, zzcak zzcak) {
        this.zza = zzbbo;
        this.zzb = zzcak;
        Objects.requireNonNull(zzbby);
        this.zzc = zzbby;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        zzbby zzbby = this.zzc;
        synchronized (zzbby.zzd) {
            if (!zzbby.zzb) {
                zzbby.zzb = true;
                zzbbn zza2 = zzbby.zza;
                if (zza2 != null) {
                    zzgdy zzgdy = zzcaf.zza;
                    zzbbo zzbbo = this.zza;
                    zzcak zzcak = this.zzb;
                    zzcak.addListener(new zzbbu(zzcak, zzgdy.zza(new zzbbt(this, zza2, zzbbo, zzcak))), zzcaf.zzg);
                }
            }
        }
    }
}
