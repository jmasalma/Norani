package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedn implements zzedm {
    public final zzedm zza;
    private final zzfve zzb;

    public zzedn(zzedm zzedm, zzfve zzfve) {
        this.zza = zzedm;
        this.zzb = zzfve;
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        return zzgdn.zzm(this.zza.zza(zzfcn, zzfca), this.zzb, zzcaf.zza);
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        return this.zza.zzb(zzfcn, zzfca);
    }
}
