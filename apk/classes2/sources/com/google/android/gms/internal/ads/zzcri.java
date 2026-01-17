package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcri implements zzehc {
    public final List zza;

    public zzcri(zzcra zzcra) {
        this.zza = Collections.singletonList(zzgdn.zzh(zzcra));
    }

    public zzcri(List list) {
        this.zza = list;
    }

    public final void zzr() {
        for (ListenableFuture zzr : this.zza) {
            zzgdn.zzr(zzr, new zzcrh(this), zzgef.zzc());
        }
    }
}
