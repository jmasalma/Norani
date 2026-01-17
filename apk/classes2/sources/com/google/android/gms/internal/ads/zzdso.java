package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdso extends zzdss {
    private final CsiParamDefaults zzf;

    public zzdso(Executor executor, zzu zzu, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super(executor, zzu, csiUrlBuilder, context);
        this.zzf = csiParamDefaults;
        csiParamDefaults.set(this.zza);
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
