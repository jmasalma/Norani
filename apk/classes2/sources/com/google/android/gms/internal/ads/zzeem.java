package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeem implements zzgcu {
    public final /* synthetic */ zzeen zza;
    public final /* synthetic */ zzfcn zzb;
    public final /* synthetic */ zzfca zzc;

    public /* synthetic */ zzeem(zzeen zzeen, zzfcn zzfcn, zzfca zzfca) {
        this.zza = zzeen;
        this.zzb = zzfcn;
        this.zzc = zzfca;
    }

    public final ListenableFuture zza(Object obj) {
        return zzeen.zzc(this.zza, this.zzb, this.zzc, obj);
    }
}
