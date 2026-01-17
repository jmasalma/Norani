package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgcv extends zzgcx {
    zzgcv(zzfyl zzfyl, boolean z) {
        super(zzfyl, z);
        zzz();
    }

    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList zzb = zzfzg.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgcw zzgcw = (zzgcw) it.next();
            zzb.add(zzgcw != null ? zzgcw.zza : null);
        }
        return Collections.unmodifiableList(zzb);
    }
}
