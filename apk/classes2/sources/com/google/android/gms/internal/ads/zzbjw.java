package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjw implements zzbkf {
    zzbjw() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        if (zzcfg.zzJ() != null) {
            zzcfg.zzJ().zza();
        }
        zzm zzL = zzcfg.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        zzm zzM = zzcfg.zzM();
        if (zzM != null) {
            zzM.zzb();
            return;
        }
        int i = zze.zza;
        zzo.zzj("A GMSG tried to close something that wasn't an overlay.");
    }
}
