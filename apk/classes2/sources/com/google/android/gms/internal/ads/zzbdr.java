package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbdr {
    private final Map zza = new HashMap();
    private final zzbdt zzb;

    public zzbdr(zzbdt zzbdt) {
        this.zzb = zzbdt;
    }

    public final zzbdt zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbdq zzbdq) {
        this.zza.put(str, zzbdq);
    }

    public final void zzc(String str, String str2, long j) {
        Map map = this.zza;
        zzbdq zzbdq = (zzbdq) map.get(str2);
        String[] strArr = {str};
        if (zzbdq != null) {
            this.zzb.zze(zzbdq, j, strArr);
        }
        map.put(str, new zzbdq(j, (String) null, (zzbdq) null));
    }
}
