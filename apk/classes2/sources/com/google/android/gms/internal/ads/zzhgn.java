package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzhgn implements zzhgr {
    private final Map zza;

    zzhgn(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
