package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeef implements zzeds {
    private final Context zza;
    private final zzcog zzb;

    zzeef(Context context, zzcog zzcog) {
        this.zza = context;
        this.zzb = zzcog;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzefm zzefm = new zzefm(zzfca, (zzbrp) zzedp.zzb, AdFormat.APP_OPEN_AD);
        zzcod zza2 = this.zzb.zza(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdff(zzefm, (zzcfg) null), new zzcoe(zzfca.zzaa));
        zzefm.zzc(zza2.zzc());
        ((zzefd) zzedp.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        try {
            zzbrp zzbrp = (zzbrp) zzedp.zzb;
            zzbrp.zzq(zzfca.zzZ);
            zzbrp.zzi(zzfca.zzU, zzfca.zzv.toString(), zzfcn.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeed(zzedp, (zzeee) null), (zzbpw) zzedp.zzc);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfdd(e);
        }
    }
}
