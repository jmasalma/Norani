package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzffj implements zzgcu {
    public final /* synthetic */ zzffl zza;
    public final /* synthetic */ zzffd zzb;
    public final /* synthetic */ zzfej zzc;
    public final /* synthetic */ zzffe zzd;

    public /* synthetic */ zzffj(zzffl zzffl, zzffd zzffd, zzfej zzfej, zzffe zzffe) {
        this.zza = zzffl;
        this.zzb = zzffd;
        this.zzc = zzfej;
        this.zzd = zzffe;
    }

    public final ListenableFuture zza(Object obj) {
        return zzffl.zzb(this.zza, this.zzb, this.zzc, this.zzd, (zzfes) obj);
    }
}
