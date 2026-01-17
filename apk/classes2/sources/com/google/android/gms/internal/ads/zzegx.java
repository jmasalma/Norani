package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegx extends zzegq {
    private final zzche zza;
    private final zzcvf zzb;
    private final zzdbw zzc;
    private final zzehb zzd;
    @Nullable
    private final zzfco zze;
    private final zzedr zzf;

    public zzegx(zzche zzche, zzcvf zzcvf, zzdbw zzdbw, @Nullable zzfco zzfco, zzehb zzehb, zzedr zzedr) {
        this.zza = zzche;
        this.zzb = zzcvf;
        this.zzc = zzdbw;
        this.zze = zzfco;
        this.zzd = zzehb;
        this.zzf = zzedr;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcw zzfcw, Bundle bundle, zzfca zzfca, zzfcn zzfcn) {
        zzfco zzfco;
        zzcvf zzcvf = this.zzb;
        zzcvf.zzk(zzfcw);
        zzcvf.zzg(bundle);
        zzcvf.zzh(new zzcuy(zzfcn, zzfca, this.zzd));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdQ)).booleanValue() && (zzfco = this.zze) != null) {
            zzcvf.zzj(zzfco);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue()) {
            zzcvf.zze(this.zzf);
        }
        zzdor zzh = this.zza.zzh();
        zzh.zzd(zzcvf.zzl());
        zzh.zzc(this.zzc);
        zzcse zzb2 = zzh.zze().zzb();
        return zzb2.zzh(zzb2.zzi());
    }
}
