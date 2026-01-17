package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzefn implements zzdgn {
    final /* synthetic */ zzedp zza;
    final /* synthetic */ zzfca zzb;
    final /* synthetic */ zzefo zzc;

    zzefn(zzefo zzefo, zzedp zzedp, zzfca zzfca) {
        this.zza = zzedp;
        this.zzb = zzfca;
        Objects.requireNonNull(zzefo);
        this.zzc = zzefo;
    }

    public final zzfca zza() {
        return this.zzb;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) throws zzdgm {
        try {
            zzfdu zzfdu = (zzfdu) this.zza.zzb;
            zzfdu.zzv(z);
            if (this.zzc.zzc.clientJarVersion < ((Integer) zzbd.zzc().zzb(zzbde.zzaW)).intValue()) {
                zzfdu.zzx();
            } else {
                zzfdu.zzy(context);
            }
        } catch (zzfdd e) {
            int i = zze.zza;
            zzo.zzi("Cannot show interstitial.");
            throw new zzdgm(e.getCause());
        }
    }
}
