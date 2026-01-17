package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbkp implements zzaa {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    zzbkp(zzbkr zzbkr, boolean z, zza zza2, Map map, Map map2) {
        this.zzb = z;
        this.zzc = zza2;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzbkr);
    }

    public final void zza(boolean z) {
        if (!this.zza) {
            if (z && this.zzb) {
                this.zzc.zzdf();
            }
            this.zza = true;
            Map map = this.zzd;
            map.put((String) this.zze.get("event_id"), Boolean.valueOf(z));
            this.zzc.zzd("openIntentAsync", map);
        }
    }

    public final void zzb(int i) {
    }
}
