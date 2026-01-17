package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenj implements zzeuc {
    private final zzgdy zza;
    private final zzfcw zzb;
    private final zzbzw zzc;

    public zzenj(zzgdy zzgdy, zzfcw zzfcw, zzbzw zzbzw) {
        this.zza = zzgdy;
        this.zzb = zzfcw;
        this.zzc = zzbzw;
    }

    public static /* synthetic */ zzenk zzc(zzenj zzenj) {
        return new zzenk(zzenj.zzb.zzj, zzenj.zzc.zzm());
    }

    public final int zza() {
        return 9;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeni(this));
    }
}
