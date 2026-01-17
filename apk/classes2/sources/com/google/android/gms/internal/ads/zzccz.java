package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzccz implements zzbkf {
    private final zzdma zza;

    public zzccz(zzdma zzdma) {
        this.zza = zzdma;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccb zzccb = (zzccb) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i = zze.zza;
            zzo.zzj("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                int i2 = zze.zza;
                zzo.zzj("src missing from video GMSG.");
                return;
            }
            zzdma zzdma = this.zza;
            Bundle bundle = new Bundle();
            bundle.putString("mediaUrl", str2);
            zzdma.zza.zzc(bundle);
        }
    }
}
