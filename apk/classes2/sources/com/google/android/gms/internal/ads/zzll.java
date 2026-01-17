package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzll implements Runnable {
    public final /* synthetic */ zzln zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzvd zzc;

    public /* synthetic */ zzll(zzln zzln, Pair pair, zzvd zzvd) {
        this.zza = zzln;
        this.zzb = pair;
        this.zzc = zzvd;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzvh) pair.second, this.zzc);
    }
}
