package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzehn implements zzdgn {
    final /* synthetic */ zzedp zza;
    final /* synthetic */ zzfca zzb;

    zzehn(zzeho zzeho, zzedp zzedp, zzfca zzfca) {
        this.zza = zzedp;
        this.zzb = zzfca;
        Objects.requireNonNull(zzeho);
    }

    public final zzfca zza() {
        return this.zzb;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) throws zzdgm {
        try {
            zzfdu zzfdu = (zzfdu) this.zza.zzb;
            zzfdu.zzv(z);
            zzfdu.zzz(context);
        } catch (zzfdd e) {
            throw new zzdgm(e.getCause());
        }
    }
}
