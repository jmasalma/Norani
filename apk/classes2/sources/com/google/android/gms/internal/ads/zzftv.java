package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzftv extends zzfso {
    final /* synthetic */ zzftw zza;
    private final zzfub zzb;

    zzftv(zzftw zzftw, zzfub zzfub) {
        Objects.requireNonNull(zzftw);
        this.zza = zzftw;
        this.zzb = zzfub;
    }

    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzftz zzc = zzfua.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
