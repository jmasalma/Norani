package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdeh {
    private final List zza;
    private final zzfjy zzb;
    private final zzv zzc;
    private boolean zzd;

    public zzdeh(zzfca zzfca, zzfjy zzfjy) {
        this.zza = zzfca.zzp;
        this.zzb = zzfjy;
        this.zzc = zzfca.zzax;
    }

    public final void zza() {
        if (!this.zzd) {
            this.zzb.zze(this.zza, this.zzc);
            this.zzd = true;
        }
    }
}
