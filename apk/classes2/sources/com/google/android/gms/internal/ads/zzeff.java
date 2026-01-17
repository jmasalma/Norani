package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeff implements zzgcu {
    public final /* synthetic */ zzefk zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfcn zzc;
    public final /* synthetic */ zzdpn zzd;

    public /* synthetic */ zzeff(zzefk zzefk, zzfca zzfca, zzfcn zzfcn, zzdpn zzdpn) {
        this.zza = zzefk;
        this.zzb = zzfca;
        this.zzc = zzfcn;
        this.zzd = zzdpn;
    }

    public final ListenableFuture zza(Object obj) {
        return zzefk.zzc(this.zza, this.zzb, this.zzc, this.zzd, obj);
    }
}
