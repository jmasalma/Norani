package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemv implements zzeuc {
    private final Set zza;

    zzemv(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final ListenableFuture zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zza) {
            arrayList.add(add);
        }
        return zzgdn.zzh(new zzemt(arrayList, (zzemu) null));
    }
}
