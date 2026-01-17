package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegt extends zzegq {
    private final zzche zza;
    private final zzcvf zzb;
    private final zzejh zzc;
    private final zzdbw zzd;
    private final zzdgw zze;
    private final zzcyv zzf;
    private final ViewGroup zzg;
    private final zzdbb zzh;
    private final zzehb zzi;
    private final zzedr zzj;

    public zzegt(zzche zzche, zzcvf zzcvf, zzejh zzejh, zzdbw zzdbw, zzdgw zzdgw, zzcyv zzcyv, ViewGroup viewGroup, zzdbb zzdbb, zzehb zzehb, zzedr zzedr) {
        this.zza = zzche;
        this.zzb = zzcvf;
        this.zzc = zzejh;
        this.zzd = zzdbw;
        this.zze = zzdgw;
        this.zzf = zzcyv;
        this.zzg = viewGroup;
        this.zzh = zzdbb;
        this.zzi = zzehb;
        this.zzj = zzedr;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcw zzfcw, Bundle bundle, zzfca zzfca, zzfcn zzfcn) {
        zzcvf zzcvf = this.zzb;
        zzcvf.zzk(zzfcw);
        zzcvf.zzg(bundle);
        zzcvf.zzh(new zzcuy(zzfcn, zzfca, this.zzi));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue()) {
            zzcvf.zze(this.zzj);
        }
        zzcpw zzd2 = this.zza.zzd();
        zzd2.zzi(zzcvf.zzl());
        zzd2.zzf(this.zzd);
        zzd2.zze(this.zzc);
        zzd2.zzd(this.zze);
        zzd2.zzg(new zzcqs(this.zzf, this.zzh));
        zzd2.zzc(new zzcop(this.zzg));
        zzcse zzc2 = zzd2.zzk().zzc();
        return zzc2.zzh(zzc2.zzi());
    }
}
