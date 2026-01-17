package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzelw implements zzeuc {
    private final Context zza;

    zzelw(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzh(new zzelx(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
