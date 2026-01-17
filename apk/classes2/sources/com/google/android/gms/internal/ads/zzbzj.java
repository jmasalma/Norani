package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbzj {
    public final ListenableFuture zza(Context context, int i) {
        zzcak zzcak = new zzcak();
        zzbb.zzb();
        if (zzf.zzy(context)) {
            zzcaf.zza.execute(new zzbzi(this, context, zzcak));
        }
        return zzcak;
    }
}
