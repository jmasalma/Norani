package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegv extends zzegq {
    private final zzche zza;
    private final zzcvf zzb;
    private final zzejh zzc;
    private final zzdbw zzd;
    private final zzehb zze;
    private final zzedr zzf;

    public zzegv(zzche zzche, zzcvf zzcvf, zzejh zzejh, zzdbw zzdbw, zzehb zzehb, zzedr zzedr) {
        this.zza = zzche;
        this.zzb = zzcvf;
        this.zzc = zzejh;
        this.zzd = zzdbw;
        this.zze = zzehb;
        this.zzf = zzedr;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcw zzfcw, Bundle bundle, zzfca zzfca, zzfcn zzfcn) {
        zzcvf zzcvf = this.zzb;
        zzcvf.zzk(zzfcw);
        zzcvf.zzg(bundle);
        zzcvf.zzh(new zzcuy(zzfcn, zzfca, this.zze));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue()) {
            zzcvf.zze(this.zzf);
        }
        zzdge zzf2 = this.zza.zzf();
        zzf2.zze(zzcvf.zzl());
        zzf2.zzd(this.zzd);
        zzf2.zzc(this.zzc);
        zzcse zza2 = zzf2.zzf().zza();
        return zza2.zzh(zza2.zzi());
    }
}
