package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfh implements Runnable {
    public final /* synthetic */ zzcfo zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzbya zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzcfh(zzcfo zzcfo, View view, zzbya zzbya, int i) {
        this.zza = zzcfo;
        this.zzb = view;
        this.zzc = zzbya;
        this.zzd = i;
    }

    public final void run() {
        this.zza.zzac(this.zzb, this.zzc, this.zzd - 1);
    }
}
