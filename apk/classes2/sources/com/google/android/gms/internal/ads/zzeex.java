package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeex implements zzeds {
    private final Context zza;
    private final zzcpx zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbpz zzd;

    public zzeex(Context context, zzcpx zzcpx) {
        this.zza = context;
        this.zzb = zzcpx;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        View view;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfca.zzag) {
            view = this.zzc;
        } else {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfdd(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzgdn.zzn(zzgdn.zzh((Object) null), new zzeeu(this, view, zzfca), zzcaf.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfdd(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfdd(e2);
            }
        }
        zzcot zza2 = this.zzb.zza(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzcoz(view, (zzcfg) null, new zzeet(zzedp), (zzfcb) zzfca.zzu.get(0)));
        zza2.zzh().zza(view);
        ((zzefd) zzedp.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        try {
            zzbrp zzbrp = (zzbrp) zzedp.zzb;
            zzbrp.zzq(zzfca.zzZ);
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfca.zzag) {
                String str = zzfca.zzU;
                String jSONObject = zzfca.zzv.toString();
                zzfcw zzfcw = zzfcn.zza.zza;
                zzbrp.zzj(str, jSONObject, zzfcw.zzd, ObjectWrapper.wrap(this.zza), new zzeev(this, zzedp, (zzeew) null), (zzbpw) zzedp.zzc, zzfcw.zze);
                return;
            }
            String str2 = zzfca.zzU;
            String jSONObject2 = zzfca.zzv.toString();
            zzfcw zzfcw2 = zzfcn.zza.zza;
            zzbrp.zzk(str2, jSONObject2, zzfcw2.zzd, ObjectWrapper.wrap(this.zza), new zzeev(this, zzedp, (zzeew) null), (zzbpw) zzedp.zzc, zzfcw2.zze);
        } catch (RemoteException e) {
            throw new zzfdd(e);
        }
    }
}
