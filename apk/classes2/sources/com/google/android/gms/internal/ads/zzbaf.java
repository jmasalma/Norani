package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbaf implements Comparator {
    zzbaf(zzbah zzbah) {
        Objects.requireNonNull(zzbah);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbal zzbal = (zzbal) obj;
        zzbal zzbal2 = (zzbal) obj2;
        int i = zzbal.zzc - zzbal2.zzc;
        if (i != 0) {
            return i;
        }
        return Long.compare(zzbal.zza, zzbal2.zza);
    }
}
