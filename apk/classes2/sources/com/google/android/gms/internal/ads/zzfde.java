package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfde implements zzbkf {
    public final /* synthetic */ zzded zza;
    public final /* synthetic */ zzcmq zzb;
    public final /* synthetic */ zzfjy zzc;
    public final /* synthetic */ zzeca zzd;

    public /* synthetic */ zzfde(zzded zzded, zzcmq zzcmq, zzfjy zzfjy, zzeca zzeca) {
        this.zza = zzded;
        this.zzb = zzcmq;
        this.zzc = zzfjy;
        this.zzd = zzeca;
    }

    public final void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        zzbke.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            int i = zze.zza;
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        zzeca zzeca = this.zzd;
        zzfjy zzfjy = this.zzc;
        zzgdn.zzr(zzbke.zza(zzcfg, str), new zzfdg(zzcfg, this.zzb, zzfjy, zzeca), zzcaf.zza);
    }
}
