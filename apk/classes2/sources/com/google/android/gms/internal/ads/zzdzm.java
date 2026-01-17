package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzm implements zzgcu {
    public final /* synthetic */ zzevf zza;
    public final /* synthetic */ zzbvq zzb;

    public /* synthetic */ zzdzm(zzevf zzevf, zzbvq zzbvq) {
        this.zza = zzevf;
        this.zzb = zzbvq;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzb().zza(zzbb.zzb().zzn((Bundle) obj), this.zzb.zzm, false);
    }
}
