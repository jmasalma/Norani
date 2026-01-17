package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzefm implements zzdgn {
    private final zzfca zza;
    private final zzbrp zzb;
    private final AdFormat zzc;
    private zzcwq zzd = null;

    zzefm(zzfca zzfca, zzbrp zzbrp, AdFormat adFormat) {
        this.zza = zzfca;
        this.zzb = zzbrp;
        this.zzc = adFormat;
    }

    public final zzfca zza() {
        return this.zza;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) throws zzdgm {
        boolean z2;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                z2 = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal != 2) {
                if (ordinal == 5) {
                    z2 = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzdgm("Adapter failed to show.");
            } else {
                z2 = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (z2) {
                zzcwq zzcwq = this.zzd;
                if (zzcwq != null) {
                    if (!((Boolean) zzbd.zzc().zzb(zzbde.zzbI)).booleanValue() && this.zza.zzY == 2) {
                        zzcwq.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdgm("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgm(th);
        }
    }

    public final void zzc(zzcwq zzcwq) {
        this.zzd = zzcwq;
    }
}
