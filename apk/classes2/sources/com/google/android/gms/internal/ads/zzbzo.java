package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbzo extends zzb {
    final /* synthetic */ zzbzs zza;

    zzbzo(zzbzs zzbzs) {
        Objects.requireNonNull(zzbzs);
        this.zza = zzbzs;
    }

    public final void zza() {
        zzbzs zzbzs = this.zza;
        zzbdh zzbdh = new zzbdh(zzbzs.zze, zzbzs.zzf.afmaVersion);
        synchronized (zzbzs.zza) {
            try {
                zzv.zze();
                zzbdk.zza(zzbzs.zzh, zzbdh);
            } catch (IllegalArgumentException e) {
                int i = zze.zza;
                zzo.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
