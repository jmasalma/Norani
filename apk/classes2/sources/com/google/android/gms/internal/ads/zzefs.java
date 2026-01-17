package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzefs implements zzeds {
    private final Context zza;
    private final zzdgf zzb;

    public zzefs(Context context, zzdgf zzdgf) {
        this.zza = context;
        this.zzb = zzdgf;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzefm zzefm = new zzefm(zzfca, (zzbrp) zzedp.zzb, AdFormat.INTERSTITIAL);
        zzdfc zzd = this.zzb.zzd(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdff(zzefm, (zzcfg) null));
        zzefm.zzc(zzd.zzc());
        ((zzefd) zzedp.zzc).zzc(zzd.zzj());
        return zzd.zzg();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        try {
            zzbrp zzbrp = (zzbrp) zzedp.zzb;
            zzbrp.zzq(zzfca.zzZ);
            zzbrp.zzl(zzfca.zzU, zzfca.zzv.toString(), zzfcn.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefq(this, zzedp, (zzefr) null), (zzbpw) zzedp.zzc);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfdd(e);
        }
    }
}
