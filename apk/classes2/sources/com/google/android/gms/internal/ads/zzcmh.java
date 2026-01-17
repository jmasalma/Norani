package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmh implements zzgcu {
    public final /* synthetic */ zzcmq zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcmh(zzcmq zzcmq, String str) {
        this.zza = zzcmq;
        this.zzb = str;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzg.zza(new zzcmj(this.zza, (Throwable) obj));
    }
}
