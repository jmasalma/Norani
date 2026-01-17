package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzav extends zzdm {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    zzav(zzay zzay, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzay);
        this.zzb = zzay;
    }

    public final void zze(zze zze) {
        if (zze != null) {
            this.zzb.zzi(this.zza, zze.zzb, true, true);
        }
    }
}
