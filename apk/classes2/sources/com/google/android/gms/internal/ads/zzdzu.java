package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzu implements zzgcu {
    public final /* synthetic */ zzeuf zza;
    public final /* synthetic */ zzbvq zzb;

    public /* synthetic */ zzdzu(zzeuf zzeuf, zzbvq zzbvq) {
        this.zza = zzeuf;
        this.zzb = zzbvq;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zza(zzbb.zzb().zzn((Bundle) obj), this.zzb.zzm, false);
    }
}
