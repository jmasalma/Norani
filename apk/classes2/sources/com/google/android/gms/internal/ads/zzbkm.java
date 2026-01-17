package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkm implements zzbkf {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzb zzb;
    private final zzbso zzc;
    private final zzbsv zzd;

    public zzbkm(zzb zzb2, zzbso zzbso, zzbsv zzbsv) {
        this.zzb = zzb2;
        this.zzc = zzbso;
        this.zzd = zzbsv;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                zzb zzb2 = this.zzb;
                if (!zzb2.zzc()) {
                    zzb2.zzb((String) null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzc(map);
                    return;
                } else if (intValue == 3) {
                    new zzbsr(zzcfg, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbsl(zzcfg, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        int i2 = zze.zza;
                        zzo.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcfg == null) {
            int i3 = zze.zza;
            zzo.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcfg.zzau(i);
    }
}
