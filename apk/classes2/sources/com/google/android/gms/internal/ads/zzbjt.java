package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjt implements zzgdj {
    final /* synthetic */ zzcfg zza;

    zzbjt(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void zza(Throwable th) {
        zzv.zzp().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcfg zzcfg = this.zza;
        new zzbw(zzcfg.getContext(), zzcfg.zzm().afmaVersion, str, (zzfjq) null, zzcfg.zzD() != null ? zzcfg.zzD().zzax : null).zzb();
    }
}
