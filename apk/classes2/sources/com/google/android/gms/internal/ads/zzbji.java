package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbji implements zzbkf {
    public final void zza(Object obj, Map map) {
        zzcgn zzcgn = (zzcgn) obj;
        zzbkf zzbkf = zzbke.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i = zze.zza;
            zzo.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        zzcex zzcex = (zzcex) zzcgn;
        new zzbw(zzcgn.getContext(), ((zzcgu) zzcgn).zzm().afmaVersion, str, (zzfjq) null, zzcex.zzD() != null ? zzcex.zzD().zzax : null).zzb();
    }
}
