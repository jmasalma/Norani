package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcme implements zzclg {
    private final zzdvi zza;

    zzcme(zzdvi zzdvi) {
        this.zza = zzdvi;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzo(str.equals("true"));
        }
    }
}
