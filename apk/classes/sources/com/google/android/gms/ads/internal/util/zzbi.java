package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqm;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbi implements zzaqh {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbk zzb;

    zzbi(zzbo zzbo, String str, zzbk zzbk) {
        this.zza = str;
        this.zzb = zzbk;
        Objects.requireNonNull(zzbo);
    }

    public final void zza(zzaqm zzaqm) {
        int i = zze.zza;
        zzo.zzj("Failed to load URL: " + this.zza + "\n" + zzaqm.toString());
        this.zzb.zza((Object) null);
    }
}
