package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzezd implements zzezr {
    private final zzfej zza;
    private final Executor zzb;
    private final zzgdj zzc = new zzezb(this);

    public zzezd(zzfej zzfej, Executor executor) {
        this.zza = zzfej;
        this.zzb = executor;
    }

    public static /* synthetic */ ListenableFuture zza(zzezd zzezd, zzcve zzcve, zzezl zzezl) {
        zzfej zzfej = zzezd.zza;
        zzfet zzfet = zzezl.zzb;
        zzbvq zzbvq = zzezl.zza;
        zzfes zzb2 = zzfej.zzb(zzfet);
        if (!(zzb2 == null || zzbvq == null)) {
            zzgdn.zzr(zzcve.zzb().zzg(zzbvq), zzezd.zzc, zzezd.zzb);
        }
        return zzgdn.zzh(new zzezc(zzfet, zzbvq, zzb2));
    }

    public final ListenableFuture zzb(zzezs zzezs, zzezq zzezq, zzcve zzcve) {
        zzfej zzfej = this.zza;
        Executor executor = this.zzb;
        return (zzgde) zzgdn.zze((zzgde) zzgdn.zzn(zzgde.zzw(new zzezn(zzfej, zzcve, executor).zzc()), new zzeyz(this, zzcve), executor), Exception.class, new zzeza(this), executor);
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezs zzezs, zzezq zzezq, Object obj) {
        zzcve zzcve = null;
        return zzb(zzezs, zzezq, (zzcve) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
