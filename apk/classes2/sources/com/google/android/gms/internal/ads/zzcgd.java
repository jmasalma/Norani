package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcgd implements zzbkf {
    final /* synthetic */ zzcgf zza;

    zzcgd(zzcgf zzcgf) {
        Objects.requireNonNull(zzcgf);
        this.zza = zzcgf;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    zzcgf zzcgf = this.zza;
                    synchronized (zzcgf) {
                        if (zzcgf.zzI != parseInt) {
                            zzcgf.zzI = parseInt;
                            zzcgf.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    int i = zze.zza;
                    zzo.zzk("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
