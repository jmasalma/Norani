package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzego extends zzegq {
    private final zzche zza;
    private final zzdgw zzb;
    private final zzcvf zzc;
    private final zzdbw zzd;
    private final zzehb zze;
    private final zzedr zzf;

    public zzego(zzche zzche, zzdgw zzdgw, zzcvf zzcvf, zzdbw zzdbw, zzehb zzehb, zzedr zzedr) {
        this.zza = zzche;
        this.zzb = zzdgw;
        this.zzc = zzcvf;
        this.zzd = zzdbw;
        this.zze = zzehb;
        this.zzf = zzedr;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcw zzfcw, Bundle bundle, zzfca zzfca, zzfcn zzfcn) {
        zzcvf zzcvf = this.zzc;
        zzcvf.zzk(zzfcw);
        zzcvf.zzg(bundle);
        zzcvf.zzh(new zzcuy(zzfcn, zzfca, this.zze));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue()) {
            zzcvf.zze(this.zzf);
        }
        zzdha zzg = this.zza.zzg();
        zzg.zzf(zzcvf.zzl());
        zzg.zze(this.zzd);
        zzg.zzd(this.zzb);
        zzg.zzc(new zzcop((ViewGroup) null));
        zzcse zza2 = zzg.zzg().zza();
        return zza2.zzh(zza2.zzi());
    }
}
