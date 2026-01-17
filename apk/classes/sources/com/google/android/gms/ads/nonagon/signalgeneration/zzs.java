package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdsd;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ zzv zza;
    public final /* synthetic */ zzdsd zzb;
    public final /* synthetic */ ArrayDeque zzc;
    public final /* synthetic */ ArrayDeque zzd;

    public /* synthetic */ zzs(zzv zzv, zzdsd zzdsd, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.zza = zzv;
        this.zzb = zzdsd;
        this.zzc = arrayDeque;
        this.zzd = arrayDeque2;
    }

    public final void run() {
        zzv.zzd(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
