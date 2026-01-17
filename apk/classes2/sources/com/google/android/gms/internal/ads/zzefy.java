package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzefy implements zzgcu {
    public final /* synthetic */ zzegb zza;
    public final /* synthetic */ zzfca zzb;

    public /* synthetic */ zzefy(zzegb zzegb, zzfca zzfca) {
        this.zza = zzegb;
        this.zzb = zzfca;
    }

    public final ListenableFuture zza(Object obj) {
        return zzegb.zze(this.zza, this.zzb, (zzdny) obj);
    }
}
