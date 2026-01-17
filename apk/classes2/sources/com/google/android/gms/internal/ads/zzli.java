package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzli implements Runnable {
    public final /* synthetic */ zzln zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzuy zzc;
    public final /* synthetic */ zzvd zzd;
    public final /* synthetic */ int zze;

    public /* synthetic */ zzli(zzln zzln, Pair pair, zzuy zzuy, zzvd zzvd, int i) {
        this.zza = zzln;
        this.zzb = pair;
        this.zzc = zzuy;
        this.zzd = zzvd;
        this.zze = i;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzak(((Integer) pair.first).intValue(), (zzvh) pair.second, this.zzc, this.zzd, this.zze);
    }
}
