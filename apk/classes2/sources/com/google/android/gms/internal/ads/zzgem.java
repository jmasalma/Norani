package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgem extends zzgdv {
    final /* synthetic */ zzgeo zza;
    private final zzgct zzb;

    zzgem(zzgeo zzgeo, zzgct zzgct) {
        Objects.requireNonNull(zzgeo);
        this.zza = zzgeo;
        zzgct zzgct2 = zzgct;
        this.zzb = zzgct;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgct zzgct = this.zzb;
        ListenableFuture zza2 = zzgct.zza();
        zzfvp.zzd(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgct);
        ListenableFuture listenableFuture = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzn((ListenableFuture) obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
