package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbci {
    zzayy zza;
    boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc;

    public zzbci() {
        this.zzc = zzb.zzb;
    }

    public zzbci(Context context) {
        ExecutorService executorService = zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new zzbcd(this, context));
    }
}
