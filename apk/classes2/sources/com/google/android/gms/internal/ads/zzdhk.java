package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdhk implements zzbkf {
    private final WeakReference zza;
    private final WeakReference zzb;

    /* synthetic */ zzdhk(zzdhn zzdhn, View view, zzdhm zzdhm) {
        this.zza = new WeakReference(zzdhn);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznn)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference((Object) null);
        }
    }

    public final void zza(Object obj, Map map) {
        zzdhn zzdhn = (zzdhn) this.zza.get();
        if (zzdhn != null) {
            zzdhn.zzg.zza();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznn)).booleanValue()) {
                zzdhn.zzE.zza((View) this.zzb.get(), zzdhn.zzj);
            }
        }
    }
}
