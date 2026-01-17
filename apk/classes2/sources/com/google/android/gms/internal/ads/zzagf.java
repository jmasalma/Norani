package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzagf {
    protected final zzafb zza;

    protected zzagf(zzafb zzafb) {
        this.zza = zzafb;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzen zzen) throws zzaz;

    /* access modifiers changed from: protected */
    public abstract boolean zzb(zzen zzen, long j) throws zzaz;

    public final boolean zzf(zzen zzen, long j) throws zzaz {
        return zza(zzen) && zzb(zzen, j);
    }
}
