package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkx implements zzbkf {
    private final zzbkw zza;

    public zzbkx(zzbkw zzbkw) {
        this.zza = zzbkw;
    }

    public static void zzb(zzcfg zzcfg, zzbkw zzbkw) {
        zzcfg.zzag("/reward", new zzbkx(zzbkw));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbwo zzbwo = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbwo = new zzbwo(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                int i = zze.zza;
                zzo.zzk("Unable to parse reward amount.", e);
            }
            this.zza.zza(zzbwo);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
