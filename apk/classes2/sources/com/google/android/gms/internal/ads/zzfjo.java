package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfjo implements zzgcu {
    public final /* synthetic */ zzfjp zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzfjo(zzfjp zzfjp, int i, long j, String str) {
        this.zza = zzfjp;
        this.zzb = i;
        this.zzc = j;
        this.zzd = str;
    }

    public final ListenableFuture zza(Object obj) {
        return zzfjp.zzc(this.zza, this.zzb, this.zzc, this.zzd, (zzt) obj);
    }
}
