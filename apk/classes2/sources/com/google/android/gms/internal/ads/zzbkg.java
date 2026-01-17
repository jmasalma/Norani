package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkg implements zzbkf {
    private final zzdvi zza;

    public zzbkg(zzdvi zzdvi) {
        Preconditions.checkNotNull(zzdvi, "The Inspector Manager must not be null");
        this.zza = zzdvi;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.zza.zzj((String) map.get("persistentData"));
        }
    }
}
