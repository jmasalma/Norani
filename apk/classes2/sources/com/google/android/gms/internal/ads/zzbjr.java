package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjr implements zzbkf {
    zzbjr() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        try {
            zzfse.zzj(zzcfg.getContext()).zzk();
            zzfsf.zzi(zzcfg.getContext()).zzj();
            zzfsg.zza(zzcfg.getContext()).zzb((zzfsa) null);
        } catch (IOException e) {
            zzv.zzp().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
