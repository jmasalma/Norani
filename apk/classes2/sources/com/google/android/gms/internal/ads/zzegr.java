package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegr extends zzegq {
    private final zzche zza;
    private final zzcvf zzb;
    private final zzdbw zzc;
    private final zzehb zzd;
    private final zzedr zze;

    zzegr(zzche zzche, zzcvf zzcvf, zzdbw zzdbw, zzehb zzehb, zzedr zzedr) {
        this.zza = zzche;
        this.zzb = zzcvf;
        this.zzc = zzdbw;
        this.zzd = zzehb;
        this.zze = zzedr;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcw zzfcw, Bundle bundle, zzfca zzfca, zzfcn zzfcn) {
        zzcvf zzcvf = this.zzb;
        zzcvf.zzk(zzfcw);
        zzcvf.zzg(bundle);
        zzcvf.zzh(new zzcuy(zzfcn, zzfca, this.zzd));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue()) {
            zzcvf.zze(this.zze);
        }
        zzcof zzc2 = this.zza.zzc();
        zzc2.zzd(zzcvf.zzl());
        zzc2.zzc(this.zzc);
        zzcse zzb2 = zzc2.zze().zzb();
        return zzb2.zzh(zzb2.zzi());
    }
}
