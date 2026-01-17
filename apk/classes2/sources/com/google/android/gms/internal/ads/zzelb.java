package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzt;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzelb implements zzcyk {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(zzdt zzdt) {
        this.zza.set(zzdt);
    }

    public final void zzh(zzt zzt) {
        zzezf.zza(this.zza, new zzela(zzt));
    }
}
