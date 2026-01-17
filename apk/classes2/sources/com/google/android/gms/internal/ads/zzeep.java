package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeep implements zzgcu {
    public final /* synthetic */ zzeer zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzfca zzc;

    public /* synthetic */ zzeep(zzeer zzeer, View view, zzfca zzfca) {
        this.zza = zzeer;
        this.zzb = view;
        this.zzc = zzfca;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzh(zzcqm.zza(this.zza.zza, this.zzb, this.zzc));
    }
}
