package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfbp implements OnAdMetadataChangedListener {
    final /* synthetic */ zzdq zza;
    final /* synthetic */ zzfbr zzb;

    zzfbp(zzfbr zzfbr, zzdq zzdq) {
        this.zza = zzdq;
        Objects.requireNonNull(zzfbr);
        this.zzb = zzfbr;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
