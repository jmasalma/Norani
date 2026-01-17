package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdhj implements zzbkf {
    private final WeakReference zza;

    /* synthetic */ zzdhj(zzdhn zzdhn, zzdhm zzdhm) {
        this.zza = new WeakReference(zzdhn);
    }

    public final void zza(Object obj, Map map) {
        zzdhn zzdhn = (zzdhn) this.zza.get();
        if (zzdhn != null) {
            zzdhn.zzh.onAdClicked();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzli)).booleanValue()) {
                zzdhn.zzi.zzdf();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdhn.zzi.zzdH();
                }
            }
        }
    }
}
