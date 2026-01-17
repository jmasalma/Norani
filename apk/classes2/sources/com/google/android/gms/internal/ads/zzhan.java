package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhan {
    zzhan() {
    }

    public static final boolean zza(Object obj) {
        return !((zzham) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzham zzham = (zzham) obj;
        zzham zzham2 = (zzham) obj2;
        if (!zzham2.isEmpty()) {
            if (!zzham.zze()) {
                zzham = zzham.zzb();
            }
            zzham.zzd(zzham2);
        }
        return zzham;
    }
}
