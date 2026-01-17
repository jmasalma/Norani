package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzac;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdjv {
    private final zzdsj zza;

    zzdjv(zzdsj zzdsj) {
        this.zza = zzdsj;
    }

    public final void zza(View view, zzfca zzfca) {
        String str;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznn)).booleanValue() && view != null) {
            if (true != zzac.zza(view)) {
                str = "0";
            } else {
                str = "1";
            }
            zzdsi zza2 = this.zza.zza();
            zza2.zzb("action", "hcp");
            zza2.zzb("hcp", str);
            zza2.zzc(zzfca);
            zza2.zzj();
        }
    }
}
