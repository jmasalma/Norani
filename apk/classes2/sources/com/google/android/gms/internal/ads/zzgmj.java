package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgmj {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgmj() {
    }

    public final zzgmj zza(Enum enumR, Object obj) {
        this.zza.put(enumR, obj);
        this.zzb.put(obj, enumR);
        return this;
    }

    public final zzgml zzb() {
        return new zzgml(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), (zzgmk) null);
    }

    /* synthetic */ zzgmj(zzgmk zzgmk) {
    }
}
