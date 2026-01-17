package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepa implements zzeuc {
    private final zzgdy zza;
    private final zzdqe zzb;
    private final String zzc;
    private final zzfcw zzd;

    public zzepa(zzgdy zzgdy, zzdqe zzdqe, zzfcw zzfcw, String str) {
        this.zza = zzgdy;
        this.zzb = zzdqe;
        this.zzd = zzfcw;
        this.zzc = str;
    }

    public static /* synthetic */ zzepb zzc(zzepa zzepa) {
        zzfcw zzfcw = zzepa.zzd;
        zzdqe zzdqe = zzepa.zzb;
        return new zzepb(zzdqe.zzb(zzfcw.zzf, zzepa.zzc), zzdqe.zza());
    }

    public final int zza() {
        return 17;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeoz(this));
    }
}
