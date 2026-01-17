package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeho implements zzeds {
    private final Context zza;
    private final Executor zzb;
    private final zzdos zzc;

    public zzeho(Context context, Executor executor, zzdos zzdos) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdos;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzdoo zzd = this.zzc.zzd(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdop(new zzehn(this, zzedp, zzfca)));
        zzd.zzd().zzo(new zzcmg((zzfdu) zzedp.zzb), this.zzb);
        ((zzefd) zzedp.zzc).zzc(zzd.zzn());
        return zzd.zzi();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        try {
            zzfcw zzfcw = zzfcn.zza.zza;
            if (zzfcw.zzo.zza == 3) {
                ((zzfdu) zzedp.zzb).zzr(this.zza, zzfcw.zzd, zzfca.zzv.toString(), (zzbpw) zzedp.zzc);
            } else {
                ((zzfdu) zzedp.zzb).zzq(this.zza, zzfcw.zzd, zzfca.zzv.toString(), (zzbpw) zzedp.zzc);
            }
        } catch (Exception e) {
            String str = zzedp.zza;
            int i = zze.zza;
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }
}
