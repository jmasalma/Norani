package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehs implements zzeds {
    private final Context zza;
    private final zzdos zzb;

    public zzehs(Context context, zzdos zzdos) {
        this.zza = context;
        this.zzb = zzdos;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzefm zzefm = new zzefm(zzfca, (zzbrp) zzedp.zzb, AdFormat.REWARDED);
        zzdoo zzd = this.zzb.zzd(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdop(zzefm));
        zzefm.zzc(zzd.zzc());
        ((zzefd) zzedp.zzc).zzc(zzd.zzo());
        return zzd.zzi();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        try {
            zzbrp zzbrp = (zzbrp) zzedp.zzb;
            zzbrp.zzq(zzfca.zzZ);
            zzfcw zzfcw = zzfcn.zza.zza;
            if (zzfcw.zzo.zza == 3) {
                zzbrp.zzo(zzfca.zzU, zzfca.zzv.toString(), zzfcw.zzd, ObjectWrapper.wrap(this.zza), new zzehq(this, zzedp, (zzehr) null), (zzbpw) zzedp.zzc);
                return;
            }
            zzbrp.zzp(zzfca.zzU, zzfca.zzv.toString(), zzfcw.zzd, ObjectWrapper.wrap(this.zza), new zzehq(this, zzedp, (zzehr) null), (zzbpw) zzedp.zzc);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
