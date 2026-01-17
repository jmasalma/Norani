package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzclw implements zzclg {
    private final Context zza;
    private final zzg zzb = zzv.zzp().zzi();

    public zzclw(Context context) {
        this.zza = context;
    }

    public final void zza(Map map) {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            zzg zzg = this.zzb;
            boolean parseBoolean = Boolean.parseBoolean(str);
            zzg.zzD(parseBoolean);
            if (parseBoolean) {
                zzad.zzc(this.zza);
            }
        }
    }
}
