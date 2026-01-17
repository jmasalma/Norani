package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzac;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpu implements zzcws {
    private final zzcfg zza;
    private final zzdsj zzb;
    private final zzfca zzc;

    zzcpu(zzcfg zzcfg, zzdsj zzdsj, zzfca zzfca) {
        this.zza = zzcfg;
        this.zzb = zzdsj;
        this.zzc = zzfca;
    }

    public final void zzt() {
        zzcfg zzcfg;
        String str;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznn)).booleanValue() && (zzcfg = this.zza) != null) {
            if (true != zzac.zza(zzcfg.zzF())) {
                str = "0";
            } else {
                str = "1";
            }
            zzdsi zza2 = this.zzb.zza();
            zza2.zzb("action", "hcp");
            zza2.zzb("hcp", str);
            zza2.zzc(this.zzc);
            zza2.zzj();
        }
    }
}
