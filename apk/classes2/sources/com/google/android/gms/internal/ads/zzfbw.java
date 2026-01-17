package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfbw implements OnAdMetadataChangedListener {
    final /* synthetic */ zzcb zza;
    final /* synthetic */ zzfbx zzb;

    zzfbw(zzfbx zzfbx, zzcb zzcb) {
        this.zza = zzcb;
        Objects.requireNonNull(zzfbx);
        this.zzb = zzfbx;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
