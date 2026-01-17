package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfdf implements zzbkf {
    public final /* synthetic */ zzfjy zza;
    public final /* synthetic */ zzeca zzb;

    public /* synthetic */ zzfdf(zzfjy zzfjy, zzeca zzeca) {
        this.zza = zzfjy;
        this.zzb = zzeca;
    }

    public final void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        String str = (String) map.get("u");
        if (str == null) {
            int i = zze.zza;
            zzo.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        zzfca zzD = zzcex.zzD();
        if (zzD == null || zzD.zzai) {
            zzfcd zzR = ((zzcgj) zzcex).zzR();
            if (zzR == null) {
                zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                return;
            }
            this.zzb.zzd(new zzecc(zzv.zzD().currentTimeMillis(), zzR.zzb, str, 2));
            return;
        }
        this.zza.zzd(str, zzD.zzax, (zzfhu) null, (zzcyi) null);
    }
}
