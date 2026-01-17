package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkz implements zzbkf {
    private final zzdvi zza;

    public zzbkz(zzdvi zzdvi) {
        Preconditions.checkNotNull(zzdvi, "The Inspector Manager must not be null");
        this.zza = zzdvi;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            boolean containsKey = map.containsKey("expires");
            long j = LongCompanionObject.MAX_VALUE;
            if (containsKey) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j);
        }
    }
}
