package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcuw implements zzcxm, zzcwt {
    private final zzfca zza;

    public zzcuw(Context context, zzfca zzfca, zzbtv zzbtv) {
        this.zza = zzfca;
    }

    public final void zzdj(Context context) {
    }

    public final void zzdl(Context context) {
    }

    public final void zzdm(Context context) {
    }

    public final void zzu() {
        zzbtw zzbtw = this.zza.zzad;
        if (zzbtw != null && zzbtw.zza) {
            ArrayList arrayList = new ArrayList();
            String str = zzbtw.zzb;
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
    }
}
