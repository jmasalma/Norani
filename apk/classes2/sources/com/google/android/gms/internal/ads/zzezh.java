package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzezh implements zzezr {
    private final zzezr zza;
    private zzcve zzb;

    public zzezh(zzezr zzezr) {
        this.zza = zzezr;
    }

    /* renamed from: zza */
    public final synchronized zzcve zzd() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezs zzezs, zzezq zzezq, Object obj) {
        zzcve zzcve = null;
        return zzb(zzezs, zzezq, (zzcve) null);
    }

    public final synchronized ListenableFuture zzb(zzezs zzezs, zzezq zzezq, zzcve zzcve) {
        zzbvq zzbvq;
        this.zzb = zzcve;
        if (zzcve == null || (zzbvq = zzezs.zza) == null) {
            zzcve zzcve2 = zzcve;
            return ((zzezg) this.zza).zzb(zzezs, zzezq, zzcve);
        }
        zzcse zzb2 = zzcve.zzb();
        return zzb2.zzh(zzb2.zzj(zzgdn.zzh(zzbvq)));
    }
}
