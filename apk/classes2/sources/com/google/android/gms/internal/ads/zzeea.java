package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeea implements zzdgn {
    final /* synthetic */ zzedp zza;
    final /* synthetic */ zzfca zzb;

    zzeea(zzeeb zzeeb, zzedp zzedp, zzfca zzfca) {
        this.zza = zzedp;
        this.zzb = zzfca;
        Objects.requireNonNull(zzeeb);
    }

    public final zzfca zza() {
        return this.zzb;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) throws zzdgm {
        try {
            zzfdu zzfdu = (zzfdu) this.zza.zzb;
            zzfdu.zzv(z);
            zzfdu.zzw(context);
        } catch (zzfdd e) {
            throw new zzdgm(e.getCause());
        }
    }
}
