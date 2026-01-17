package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbne implements Predicate {
    public final /* synthetic */ zzbkf zza;

    public /* synthetic */ zzbne(zzbkf zzbkf) {
        this.zza = zzbkf;
    }

    public final boolean apply(Object obj) {
        zzbkf zzbkf = (zzbkf) obj;
        if (!(zzbkf instanceof zzbnk)) {
            return false;
        }
        return ((zzbnk) zzbkf).zzb.equals(this.zza);
    }
}
