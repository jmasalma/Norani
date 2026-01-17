package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjs implements zzbkf {
    zzbjs() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        try {
            String str = (String) map.get("enabled");
            zzbkf zzbkf = zzbke.zza;
            if (!zzfuv.zzc("true", str)) {
                if (!zzfuv.zzc("false", str)) {
                    return;
                }
            }
            zzfsb.zza(zzcfg.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e) {
            zzv.zzp().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
