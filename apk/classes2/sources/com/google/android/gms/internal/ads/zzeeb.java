package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeeb implements zzeds {
    private final Context zza;
    private final zzcog zzb;
    private final Executor zzc;

    zzeeb(Context context, zzcog zzcog, Executor executor) {
        this.zza = context;
        this.zzb = zzcog;
        this.zzc = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzcod zza2 = this.zzb.zza(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdff(new zzeea(this, zzedp, zzfca), (zzcfg) null), new zzcoe(zzfca.zzaa));
        zza2.zzd().zzo(new zzcmg((zzfdu) zzedp.zzb), this.zzc);
        ((zzefd) zzedp.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        zzfcw zzfcw = zzfcn.zza.zza;
        String jSONObject = zzfca.zzv.toString();
        ((zzfdu) zzedp.zzb).zzl(this.zza, zzfcw.zzd, jSONObject, (zzbpw) zzedp.zzc);
    }
}
