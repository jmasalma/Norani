package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxq implements zzgcu {
    public final /* synthetic */ zzdxt zza;

    public /* synthetic */ zzdxq(zzdxt zzdxt) {
        this.zza = zzdxt;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzh(new zzfcn(new zzfck(this.zza.zzd), zzfcm.zza(new InputStreamReader(((zzdyy) obj).zzb()), ((zzdyy) obj).zza().zzm)));
    }
}
