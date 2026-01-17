package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzess implements zzeuc {
    private final Bundle zza;

    zzess(Bundle bundle) {
        this.zza = bundle;
    }

    public final int zza() {
        return 30;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzh(new zzest(this.zza));
    }
}
