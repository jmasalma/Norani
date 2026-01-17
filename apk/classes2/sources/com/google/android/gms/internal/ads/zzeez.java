package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeez implements zzgcu {
    public final /* synthetic */ zzefb zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ zzfcn zzc;
    public final /* synthetic */ zzfca zzd;
    public final /* synthetic */ zzfcd zze;

    public /* synthetic */ zzeez(zzefb zzefb, Uri uri, zzfcn zzfcn, zzfca zzfca, zzfcd zzfcd) {
        this.zza = zzefb;
        this.zzb = uri;
        this.zzc = zzfcn;
        this.zzd = zzfca;
        this.zze = zzfcd;
    }

    public final ListenableFuture zza(Object obj) {
        return zzefb.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, obj);
    }
}
