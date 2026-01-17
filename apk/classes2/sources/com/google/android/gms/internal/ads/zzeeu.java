package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeeu implements zzgcu {
    public final /* synthetic */ zzeex zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzfca zzc;

    public /* synthetic */ zzeeu(zzeex zzeex, View view, zzfca zzfca) {
        this.zza = zzeex;
        this.zzb = view;
        this.zzc = zzfca;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzh(zzcqm.zza(this.zza.zza, this.zzb, this.zzc));
    }
}
