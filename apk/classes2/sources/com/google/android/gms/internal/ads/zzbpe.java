package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbpe implements zzgcu {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbkf zzb;

    public /* synthetic */ zzbpe(String str, zzbkf zzbkf) {
        this.zza = str;
        this.zzb = zzbkf;
    }

    public final ListenableFuture zza(Object obj) {
        zzboj zzboj = (zzboj) obj;
        zzboj.zzq(this.zza, this.zzb);
        return zzgdn.zzh(zzboj);
    }
}
