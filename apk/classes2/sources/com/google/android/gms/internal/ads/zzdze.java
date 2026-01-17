package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdze implements zzdzi {
    public final /* synthetic */ zzdzj zza;

    public /* synthetic */ zzdze(zzdzj zzdzj) {
        this.zza = zzdzj;
    }

    public final ListenableFuture zza(zzbvq zzbvq) {
        return ((zzeab) this.zza.zzc.zzb()).zzb(zzbvq, Binder.getCallingUid());
    }
}
