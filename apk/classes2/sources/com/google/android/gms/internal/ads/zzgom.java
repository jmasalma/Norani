package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgom {
    private static final zzgxe zza = zzgxe.zzb(new byte[0]);
    private final Map zzb;

    /* synthetic */ zzgom(Map map, zzgol zzgol) {
        this.zzb = map;
    }

    public final Iterable zza(byte[] bArr) {
        Map map = this.zzb;
        List list = (List) map.get(zza);
        List list2 = bArr.length >= 5 ? (List) map.get(zzgxe.zzc(bArr, 0, 5)) : null;
        if (list == null && list2 == null) {
            return new ArrayList();
        }
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        return new zzgoi(this, list2, list);
    }
}
