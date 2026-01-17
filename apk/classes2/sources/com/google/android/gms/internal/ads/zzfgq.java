package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfgq {
    final /* synthetic */ zzfgs zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfgq(zzfgs zzfgs, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfgs);
        this.zza = zzfgs;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    /* synthetic */ zzfgq(zzfgs zzfgs, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, zzfgr zzfgr) {
        this(zzfgs, obj, (String) null, listenableFuture, list, listenableFuture2);
    }

    public final zzfgg zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzfgg zzfgg = new zzfgg(obj, str, this.zzf);
        this.zza.zzd.zza(zzfgg);
        ListenableFuture listenableFuture = this.zzd;
        zzfgo zzfgo = new zzfgo(this, zzfgg);
        zzgdy zzgdy = zzcaf.zzg;
        listenableFuture.addListener(zzfgo, zzgdy);
        zzgdn.zzr(zzfgg, new zzfgp(this, zzfgg), zzgdy);
        return zzfgg;
    }

    public final zzfgq zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfgq zzc(Class cls, zzgcu zzgcu) {
        zzfgs zzfgs = this.zza;
        return new zzfgq(zzfgs, this.zzb, this.zzc, this.zzd, this.zze, zzgdn.zzf(this.zzf, cls, zzgcu, zzfgs.zzb));
    }

    public final zzfgq zzd(ListenableFuture listenableFuture) {
        return zzg(new zzfgn(listenableFuture), zzcaf.zzg);
    }

    public final zzfgq zze(zzfge zzfge) {
        return zzf(new zzfgm(zzfge));
    }

    public final zzfgq zzf(zzgcu zzgcu) {
        return zzg(zzgcu, this.zza.zzb);
    }

    public final zzfgq zzg(zzgcu zzgcu, Executor executor) {
        return new zzfgq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgdn.zzn(this.zzf, zzgcu, executor));
    }

    public final zzfgq zzh(String str) {
        return new zzfgq(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgq zzi(long j, TimeUnit timeUnit) {
        zzfgs zzfgs = this.zza;
        return new zzfgq(zzfgs, this.zzb, this.zzc, this.zzd, this.zze, zzgdn.zzo(this.zzf, j, timeUnit, zzfgs.zzc));
    }
}
