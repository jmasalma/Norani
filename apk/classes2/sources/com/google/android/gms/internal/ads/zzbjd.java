package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbjd implements zzbkf {
    public final /* synthetic */ zzded zza;
    public final /* synthetic */ zzcmq zzb;

    public /* synthetic */ zzbjd(zzded zzded, zzcmq zzcmq) {
        this.zza = zzded;
        this.zzb = zzcmq;
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
        zzcmq zzcmq = this.zzb;
        zzgde zzw = zzgde.zzw(zzbke.zza(zzcfg, str));
        zzbjg zzbjg = new zzbjg(zzcmq, str);
        zzgdy zzgdy = zzcaf.zza;
        zzgdn.zzr((zzgde) zzgdn.zzn(zzw, zzbjg, zzgdy), new zzbjt(zzcfg), zzgdy);
    }
}
