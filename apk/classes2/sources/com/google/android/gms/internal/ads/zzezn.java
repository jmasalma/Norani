package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzezn {
    private final zzfej zza;
    private final zzcve zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzezl zzd;

    public zzezn(zzfej zzfej, zzcve zzcve, Executor executor) {
        this.zza = zzfej;
        this.zzb = zzcve;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzfet zze() {
        zzfcw zzf = this.zzb.zzf();
        return this.zza.zzc(zzf.zzd, zzf.zzf, zzf.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture listenableFuture;
        zzezl zzezl = this.zzd;
        if (zzezl != null) {
            return zzgdn.zzh(zzezl);
        }
        if (!((Boolean) zzbfl.zza.zze()).booleanValue()) {
            zzezl zzezl2 = new zzezl((zzbvq) null, zze(), (zzezm) null);
            this.zzd = zzezl2;
            listenableFuture = zzgdn.zzh(zzezl2);
        } else {
            zzgde zzw = zzgde.zzw(this.zzb.zzb().zzf(this.zza.zza()));
            zzezk zzezk = new zzezk(this);
            Executor executor = this.zzc;
            listenableFuture = (zzgde) zzgdn.zze((zzgde) zzgdn.zzm(zzw, zzezk, executor), zzdyx.class, new zzezj(this), executor);
        }
        return zzgdn.zzm(listenableFuture, new zzezi(), this.zzc);
    }
}
