package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhaf {
    zzhaf() {
    }

    public static final List zza(Object obj, long j) {
        zzgzt zzgzt = (zzgzt) zzhce.zzh(obj, j);
        if (zzgzt.zzc()) {
            return zzgzt;
        }
        int size = zzgzt.size();
        zzgzt zzf = zzgzt.zzf(size == 0 ? 10 : size + size);
        zzhce.zzv(obj, j, zzf);
        return zzf;
    }
}
