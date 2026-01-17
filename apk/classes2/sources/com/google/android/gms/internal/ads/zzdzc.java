package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzc implements zzgcu {
    public final /* synthetic */ zzbvq zza;

    public /* synthetic */ zzdzc(zzbvq zzbvq) {
        this.zza = zzbvq;
    }

    public final ListenableFuture zza(Object obj) {
        String str = new String(zzgbg.zzb((InputStream) obj), StandardCharsets.UTF_8);
        zzbvq zzbvq = this.zza;
        zzbvq.zzj = str;
        return zzgdn.zzh(zzbvq);
    }
}
