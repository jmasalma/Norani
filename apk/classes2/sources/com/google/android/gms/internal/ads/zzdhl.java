package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdhl implements zzbkf {
    private final WeakReference zza;
    private final zzfjy zzb;
    private final zzv zzc;
    private final zzfhu zzd;

    /* synthetic */ zzdhl(zzdhn zzdhn, zzfjy zzfjy, zzv zzv, zzfhu zzfhu, zzdhm zzdhm) {
        this.zza = new WeakReference(zzdhn);
        this.zzb = zzfjy;
        this.zzc = zzv;
        this.zzd = zzfhu;
    }

    public final void zza(Object obj, Map map) {
        zzdhn zzdhn = (zzdhn) this.zza.get();
        String str = (String) map.get("u");
        if (zzdhn != null && !TextUtils.isEmpty(str)) {
            this.zzb.zzd(str, this.zzc, this.zzd, zzdhn.zzD);
        }
    }
}
