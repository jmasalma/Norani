package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzlk implements Runnable {
    public final /* synthetic */ zzln zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzuy zzc;
    public final /* synthetic */ zzvd zzd;

    public /* synthetic */ zzlk(zzln zzln, Pair pair, zzuy zzuy, zzvd zzvd) {
        this.zza = zzln;
        this.zzb = pair;
        this.zzc = zzuy;
        this.zzd = zzvd;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzvh) pair.second, this.zzc, this.zzd);
    }
}
