package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzlj implements Runnable {
    public final /* synthetic */ zzln zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzuy zzc;
    public final /* synthetic */ zzvd zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzlj(zzln zzln, Pair pair, zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
        this.zza = zzln;
        this.zzb = pair;
        this.zzc = zzuy;
        this.zzd = zzvd;
        this.zze = iOException;
        this.zzf = z;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzaj(((Integer) pair.first).intValue(), (zzvh) pair.second, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
