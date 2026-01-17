package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkh implements zzbkf {
    private final zzbki zza;

    public zzbkh(zzbki zzbki) {
        this.zza = zzbki;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = zze.zza;
            zzo.zzh("Fail to parse float", e);
        }
        zzbki zzbki = this.zza;
        zzbki.zzc(equals);
        zzbki.zzb(equals2, f);
        zzcfg.zzay(equals);
    }
}
